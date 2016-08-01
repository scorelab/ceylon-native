from os import  *
from subprocess import call

#call(["ls", "-l"])

files=listdir(curdir)

for i in files:
	if (i[-4:]=="java"):
		call(["gcj","--main="+i[:-5],i,"-o"+i[:-5]+".out"])

