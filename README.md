# MyPC Automation Tests

Selenium end-to-end tests written in Java and executed with Maven and TestNG.

## Prerequisites

- Java installed
- Maven installed
- Google Chrome installed
- Valid non-secret test values in `src/test/resources/config.properties`
- The QA password, supplied at runtime with `-Dpassword=...`

Check the Java and Maven installations with:

```bash
java -version
mvn -version
```

## Build the project

Normal builds do not run browser tests:

```bash
mvn clean install
```

## Run all tests

Enable the `tests` Maven profile:

```bash
mvn clean test -Ptests -Dpassword='<password>'
```

Each test creates a browser before the test and closes it afterward.

## Run one test class

Use the fully qualified class name:

```bash
mvn test -Ptests -Dtest=com.mypc.automation.tests.LoginTestCase -Dpassword='<password>'
```

For example, to run the admin test:

```bash
mvn test -Ptests -Dtest=com.mypc.automation.tests.AdminTest -Dpassword='<password>'
```

## Run one test method

Use `ClassName#methodName`:

```bash
mvn test -Ptests -Dtest='com.mypc.automation.tests.LoginTestCase#verifyValidLogin' -Dpassword='<password>'
```

## Run the TestNG suite

To run the classes listed in `testng.xml`:

```bash
mvn test -Ptests -Dsurefire.suiteXmlFiles=testng.xml -Dpassword='<password>'
```

Replace `<password>` with the QA password. Quoting it prevents the shell from
interpreting special characters. Be aware that command-line arguments may be
saved in shell history; use a dedicated non-production test account.

Test reports are generated under `target/surefire-reports`.
