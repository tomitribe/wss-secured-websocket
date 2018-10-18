refs: https://gist.github.com/Soarez/9688998
All passwords are 123456.

# Create CA and a domain certificate

Before you start, tell your /etc/hosts that your computer is www.example.org:
```bash
127.0.0.1   www.example.org
```
Will start by creating a CA authority that will issue a willcard cert domain for *.example.org

### Generate Keys and Certificate Signing Request (CSR)

Private:
```bash
openssl genrsa -out example.org.key 2048
```
Public:
```bash
openssl rsa -in example.org.key -pubout -out example.org.pubkey
```
The CSR

```bash
openssl req -new -key example.org.key -out example.org.csr
```
This is sent to the issuer.

### Creating the CA... The issuer

The CA private key
```bash
openssl genrsa -out ca.key 2048
```
Generate a self signed certificate for the CA
```bash
openssl req -new -x509 -key ca.key -out ca.crt
```

### Signing the final certificate

```bash
openssl x509 -req -in example.org.csr -CA ca.crt -CAkey ca.key -CAcreateserial -out example.org.crt
```

### Verify

```bash
openssl verify -CAfile ca.crt example.org.crt
```

### Usage

Take the ca.crt, the example.org.crt and the example.org.key to create a pkcs12 keystore with them.
Then we convert the pkcs12 to a jks one.
```bash
openssl pkcs12 -export -in example.org.crt -inkey example.org.key -out keystore.p12 -name tomcat -CAfile  ca.crt -caname root -chain
keytool -importkeystore -destkeystore keystore.jks -srckeystore keystore.p12 -srcstoretype PKCS12 -srcalias tomcat -destalias tomcat
```
