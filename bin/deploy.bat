set CATALINA_HOME=F:\tomcat\
set PATH="%PATH%;%CATALINA_HOME%\bin"

Del F:\tomcat\webapps\.\ROOT.war

mv "F:/old C drive/Ranna_Ghar_Web/target/rannaghar-web-1.0.0.war" "F:/tomcat/webapps/ROOT.war"
F:\tomcat\bin\shutdown.bat
F:\tomcat\bin\startup.bat

::echo "Successfully completed"