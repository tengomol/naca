# What is Naca? -->[click here](Naca0201.md) #

# NacaTrans - Configuration - Tomcat Naca.xml #

The file `C:\Program Files\Apache Software Foundation\Tomcat 5.5\conf\Naca.xml` must contain:

```
 <Context path="/Naca" reloadable="true" docBase="D:\Dev\naca\nacaRT\idea\web" workDir="D:\Dev\naca\nacaRT\work" >
	<Logger className="org.apache.catalina.logger.SystemOutLogger" verbosity="4" timestamp="true"/>
 </Context>
```