@echo off

setlocal

set POM_DIR=%~dp0/../../dubbo
set TARGET_DIR=%~dp0/../../dubbo/target
set TARGET_FILENAME=dubbo-test-1.0-SNAPSHOT.jar

if not exist %TARGET_DIR%/%TARGET_FILENAME% (
    rem clean files in target directory, then do mvn:package
    mvn clean package -f %POM_DIR%/pom.xml
)

endlocal