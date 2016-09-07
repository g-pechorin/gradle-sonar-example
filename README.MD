This is PAL's forked thingie with Gradle.

# Usage

* run `gradlew run` and you'll see java build and a "Hello World"
 * Java builds because;
    ```
    apply plugin: 'java'
    ```

 * uon.sam.HelloWorld runs on `run` because of;
     ```
     apply plugin: 'application'
     mainClassName = 'uon.sam.HelloWorld'
     ```
* run `gradlew assemble` and `build/libs/gradle-sonar-example.jar` will exist with all of your stuff in it.

* download, unzip and launch Sonar
  * you'll want `bin/` Win64 (or whatever) and it'll take a moment to start
  * when it's ready http://localhost:9000 should be a working page with an empty dashboard
    * you'll know it when you see it

* now run `gradlew sonarqube` and look at the project
  * SonarQube runs because;

    ```
    buildscript {
      repositories {
        maven {
          url "https://plugins.gradle.org/m2/"
        }
      }
      dependencies {
        classpath "org.sonarsource.scanner.gradle:sonarqube-gradle-plugin:2.1-rc3"
      }
    }

    apply plugin: "org.sonarqube"
    ```
  * it should have a 1-hour technical debt, 4 bad code smells and 6 lines of code
