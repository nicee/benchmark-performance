@echo off

set APM_JAR=%~dp0..\..\apm\target\apm-test-1.0-SNAPSHOT.jar

java -javaagent:%APM_JAR% -jar %APM_JAR%

echo on