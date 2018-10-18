```bash
keytool -genkey -alias tomcat -keyalg RSA -keystore keystore.jks
```
```bash
Enter keystore password:  
Keystore password is too short - must be at least 6 characters
Enter keystore password:  
Re-enter new password: 
What is your first and last name?
  [Unknown]:  localhost
What is the name of your organizational unit?
  [Unknown]:  tomitribe
What is the name of your organization?
  [Unknown]:  tomitribe
What is the name of your City or Locality?
  [Unknown]:  coimbra
What is the name of your State or Province?
  [Unknown]:  coimbra
What is the two-letter country code for this unit?
  [Unknown]:  pt
Is CN=localhost, OU=tomitribe, O=tomitribe, L=coimbra, ST=coimbra, C=pt correct?
  [no]:  yes

Enter key password for <tomcat>
	(RETURN if same as keystore password):  
```