# What is Naca? -->[click here](Naca0201.md) #

# NacaTrans - Configuration - Tomcat host-manager.xml #

The file `C:\Program Files\Apache Software Foundation\Tomcat 5.5\conf\Catalina\localhost\host-manager.xml` must contain:

```
 <!--
 
     Context configuration file for the Tomcat Host Manager Web App
 
     $Id: host-manager.xml 303743 2005-03-11 22:39:26Z remm $
 
 -->
 
 
 <Context docBase="${catalina.home}/server/webapps/host-manager"
          privileged="true" antiResourceLocking="false" antiJARLocking="false">
 
 </Context>
```