set container-tag=account-number-exercise/validator

copy ..\norwegian-account-numbers\*.txt src\main\resources\static\.
mvn clean install
heroku container:release web %container-tag%