@echo off

set MODULE=oom
set TARGET_MAIN=test.performance.StackOverflowErrorTest
rem save heap dump file in this directory
set MAVEN_OPTS=-Xms50m -Xmx50m -Xss128k -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=%~dp0

call %~dp0..\run_base.bat

rem -Xss128K -> run counter: 22712
rem -Xss256k -> run counter: 24668
rem -Xss512k -> run counter: 22559

echo on