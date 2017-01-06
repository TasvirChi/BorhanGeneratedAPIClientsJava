#!/bin/bash - 
#===============================================================================
#          FILE: test.sh
#         USAGE: ./test.sh 
#   DESCRIPTION: 
#       OPTIONS: ---
#  REQUIREMENTS: ---
#          BUGS: ---
#         NOTES: ---
#        AUTHOR: Jess Portnoy (), <jess.portnoy@borhan.com>
#  ORGANIZATION: Borhan, inc.
#       CREATED: 01/18/2015 04:11:49 PM IST
#      REVISION:  ---
#===============================================================================

#set -o nounset     # Treat unset variables as an error
cd java
mkdir -p bin
cd bin
cp ../src/DemoImage.jpg ../src/DemoVideo.flv .
javac -d . -sourcepath ../src -cp ../lib/commons-codec-1.4.jar:../lib/commons-httpclient-3.1.jar:../lib/commons-logging-1.1.1.jar:../lib/junit-4.7.jar:../lib/log4j-1.2.15.jar ../src/com/borhan/client/test/BorhanTestSuite.java
jar cvf  borhanClient.jar .
cd ../
java -Dlog4j.configuration=file:src/log4j/log4j.properties -cp lib/commons-codec-1.4.jar:lib/commons-httpclient-3.1.jar:lib/commons-logging-1.1.1.jar:lib/junit-4.7.jar:lib/log4j-1.2.15.jar:bin/borhanClient.jar org.junit.runner.JUnitCore   com.borhan.client.test.BorhanTestSuite

