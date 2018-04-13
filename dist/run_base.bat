
set POM_DIR=%~dp0/../%MODULE%
set TARGET_DIR=%~dp0/../%MODULE%/target

setlocal

if not exist %TARGET_JAR% (
    rem clean files in target directory, then do mvn:package
    mvn clean package -f %POM_DIR%/pom.xml
)

mvn exec:java -Dexec.mainClass="%TARGET_MAIN%" -f %POM_DIR%/pom.xml

endlocal