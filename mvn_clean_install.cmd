@ECHO OFF

set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_91
set M2_HOME=C:\_PELAYO\Software\Maven\apache-maven-3.3.9
PATH=%JAVA_HOME%\bin;%M2_HOME%\bin

set ROOT_FOLDER=C:\_PELAYO\Software\Eclipse Neon\workspace\microservices_POC
set MVN_MODULO=mvn clean install

echo _______________________________________________________________________________
echo.
echo Compilando y empaquetando modulos
echo Directorio root [%ROOT_FOLDER%]
echo Ejecutando comando [%MVN_MODULO%]
echo Timestamp [%DATE% %TIME%]
echo _______________________________________________________________________________
echo.

cd %ROOT_FOLDER%\BootAdmin
call %MVN_MODULO%

cd %ROOT_FOLDER%\NetflixEureka
call %MVN_MODULO%

cd %ROOT_FOLDER%\NetflixZuul
call %MVN_MODULO%

cd %ROOT_FOLDER%\PersonaAPIBoot
call %MVN_MODULO%

cd %ROOT_FOLDER%\ZipkinServer
call %MVN_MODULO%

echo _______________________________________________________________________________
echo.
echo Finalizado
echo Timestamp [%DATE% %TIME%]
echo _______________________________________________________________________________
echo.
