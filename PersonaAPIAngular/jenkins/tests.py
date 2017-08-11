import subprocess

print("*********************************************")
print("*                                           *")
print("*  WARNING: Es necesario ejecutar los tests *")
print("*           unitarios de angular            *")
print("*                                           *")
print("*********************************************")

print("Versiones de software:")

subprocess.call(["java", "-version"])
subprocess.call(["python", "-V"])
subprocess.call(["python3", "-V"])
subprocess.call(["mvn", "-version"])
subprocess.call(["docker", "-v"])
subprocess.call(["node", "-v"])
subprocess.call(["npm", "-v"])
subprocess.call(["ng", "-v"])
