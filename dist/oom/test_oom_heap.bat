@echo off

set MODULE=oom
set TARGET_MAIN=test.performance.OutOfMemInSpaceTest
rem save heap dump file in this directory
set MAVEN_OPTS=-Xms50m -Xmx50m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=%~dp0

call %~dp0..\run_base.bat

echo on