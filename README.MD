
This is PAL's forked thingie with Gradle.

# Usage (Eclipse)

* `File` > `Import ...` (not open)
* `Gradle` > `Gradle Project`
* Select the folder containing `build.gradle` as "Project root directory" and accept all other defaults
* Right click and run `uon.sam.HelloWorld` as a Java Application

# Usage (Command Line)

* run `gradlew run` and you'll see java build and a "Hello World"
 * Java builds because;
		```
			plugins {
				...
				id 'java'
				...
			}
		```
 * uon.sam.HelloWorld runs on `run` because of;
		```
			plugins {
				...
				id 'application'
			}

			mainClassName = 'uon.sam.HelloWorld'
		```
* run `gradlew assemble` and `build/libs/gradle-sonar-example.jar` will exist with all of your stuff in it.

* download, unzip and launch Sonar
  * you'll want `bin/` Win64 (or whatever) and it'll take a moment to start
  * when it's ready http://localhost:9000 should be a working page with an empty dashboard
    * you'll know it when you see it
	* there will be an example tutorial thing. follow it.
* you'll be told to run something like `gradlew sonarqube -Dsonar.host.url=http://localhost:9000 -Dsonar.login=12c9d1b865703e66e112315a2e3b62dcc9a26d6e`
* when it's done, look at the project
  * SonarQube runs because;
		```
			plugins {
				...
				id "org.sonarqube" version "2.6.2"
				...
			}
		```
  * it should have a 1-hour technical debt, 4 bad code smells and 6 lines of code
