# What is Naca? -->[click here](Naca0201.md) #

# NacaTrans - Configuration - Tomcat manager.xml #

The file `C:\Program Files\Apache Software Foundation\Tomcat 5.5\conf\Catalina\localhost\manager.xml` must contain:

```
 <!
     Context configuration file for the Tomcat Manager Web App
 
     $Id: manager.xml 303123 2004-08-26 17:03:35Z remm $
 
 -->
 
 
 <Context docBase="${catalina.home}/server/webapps/manager"
          privileged="true" antiResourceLocking="false" antiJARLocking="false">
 
   <!-- Link to the user database we will get roles from -->
   <ResourceLink name="users" global="UserDatabase"
                 type="org.apache.catalina.UserDatabase"/>
 
 </Context>
```