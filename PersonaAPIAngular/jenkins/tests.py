import subprocess
print("*********************************************")
print("*                                           *")
print("*  WARNING: Es necesario ejecutar los tests *")
print("*           unitarios de angular            *")
print("*                                           *")
print("*********************************************")
print("Versiones de software:")
version = subprocess.getoutput("java -version")
print("JAVA:" + version)
version = subprocess.getoutput("python -V")
print("PYTHON2:" + version)
version = subprocess.getoutput("python3 -V")
print("PYTHON3:" + version)
version = subprocess.getoutput("mvn -version")
print("MAVEN:" + version)
version = subprocess.getoutput("docker -v")
print("DOCKER:" + version)
version = subprocess.getoutput("node -v")
print("NODE:" + version)
version = subprocess.getoutput("npm -v")
print("NPM:" + version)
version = subprocess.getoutput("ng -v")
print("ANGULAR CLI:" + version)
