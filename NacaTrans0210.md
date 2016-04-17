# What is Naca? -->[click here](Naca0201.md) #

# NacaTrans - Configuration - Execution #

## Start Tomcat ##

> Launch "Start tomcat" form sysdeo menu or tooltip.
> The following output should by displayed in Eclipse console:

> `NacaRT/Log4J:09:12:58` The Apache Tomcat Native library which allows optimal performance in production environments was not found on the java.library.path: `C:\Program Files\Java\jre1.5.0_05\bin`; ...
> `NacaRT/Log4J:09:12:58` Initialisation de Coyote HTTP/1.1 sur http-8080
> `NacaRT/Log4J:09:12:58` Initialization processed in 1044 ms
> `NacaRT/Log4J:09:12:59` D�marrage du service Catalina
> `NacaRT/Log4J:09:12:59` Starting Servlet Engine: Apache Tomcat/5.5.20
> `NacaRT/Log4J:09:12:59` XML validation disabled
> `Naca>2009/03/02 09:21:38` (main): ImportantEvent:Beginning to cache 2 resources files from `D:/dev/naca/CobolAppOnline/Resources/`
> `Naca>2009/03/02 09:21:39` (main): ImportantEvent:Beginning to cache 1 resources files from `D:/Dev/naca/NacaSamples/src/online/resources/`
> `Naca>2009/03/02 09:21:39` (main): NormalEvent:LoadResourceCache Unique XML files loaded=3; XML from jar resource=0; Total load Time (ms)=156
> `NacaRT/Log4J:09:21:39` org.apache.webapp.balancer.BalancerFilter: init(): ruleChain: [org.apache.webapp.balancer.RuleChain: [org.apache.webapp.balancer.rules.URLStringMatchRule: Target string: News / Redirect URL: http://www.cnn.com], [org.apache.webapp.balancer.rules.RequestParameterRule: Target param name: paramName / Target param value: paramValue / Redirect URL: http://www.yahoo.com], [org.apache.webapp.balancer.rules.AcceptEverythingRule: Redirect URL: http://jakarta.apache.org]]
> `NacaRT/Log4J:09:21:39` ContextListener: contextInitialized()
> `NacaRT/Log4J:09:21:39` SessionListener: contextInitialized()
> `NacaRT/Log4J:09:21:39` ContextListener: contextInitialized()
> `NacaRT/Log4J:09:21:39` SessionListener: contextInitialized()
> `NacaRT/Log4J:09:21:39` D�marrage de Coyote HTTP/1.1 sur http-8080
> `NacaRT/Log4J:09:21:40` JK: ajp13 listening on /0.0.0.0:8009
> `NacaRT/Log4J:09:21:40` Jk running ID=0 time=0/62  config=null
> `NacaRT/Log4J:09:21:40` Find registry server-registry.xml at classpath resource
> `NacaRT/Log4J:09:21:40` Server startup in 521480 ms
> `NacaRT/Log4J:09:21:52` No FormBeanConfig found under 'null'

> Launch an Internet Explorer browser with URL: `http://127.0.0.1:8080/Naca/naca`

> The following screen is produced:

> ![http://lh5.ggpht.com/_lKK1B4BvREU/SltIqN_d-hI/AAAAAAAAAFY/ZySnq8fJMo0/s800/NacaTrans0204image01.png.jpg](http://lh5.ggpht.com/_lKK1B4BvREU/SltIqN_d-hI/AAAAAAAAAFY/ZySnq8fJMo0/s800/NacaTrans0204image01.png.jpg)

> This screen is the standard login screen provided by NacaRT.
> It's not part of your application.
> Changing this default screen currently requires an update of NacaRT idea package.
> This will be improved in future release.
> However, the company and application images are defined in `D:\Dev\naca\NacaRT\idea\web\images` as `logoCompany.gif` and `logoApplication.gif`.
> You can change it at will.

> Log in the system, using a default login:

> ![http://lh6.ggpht.com/_lKK1B4BvREU/SltIqreUxAI/AAAAAAAAAFc/2ow9m9AuIB0/s800/NacaTrans0204image02.png.jpg](http://lh6.ggpht.com/_lKK1B4BvREU/SltIqreUxAI/AAAAAAAAAFc/2ow9m9AuIB0/s800/NacaTrans0204image02.png.jpg)

> Fill-in user name with "test", and let password blank.
> LDAP authentication is disabled because the NacaRT.cfg's "SimulateRealEnvironment" is set to true.
> This disables configuration of database and LDAP.

> Validate screen with Enter button or key.

> If you had setup a breakpoint in Online1.java file, at line 113, you would hit this breakpoint:


![http://lh5.ggpht.com/_lKK1B4BvREU/SltIrklTMMI/AAAAAAAAAFg/YiSgT2RB5G8/s800/NacaTrans0204image03.png.jpg](http://lh5.ggpht.com/_lKK1B4BvREU/SltIrklTMMI/AAAAAAAAAFg/YiSgT2RB5G8/s800/NacaTrans0204image03.png.jpg)

> You can then execute step by step the program code.
> After resuming execution, the following screen is displayed in the browser:


![http://lh4.ggpht.com/_lKK1B4BvREU/SltIsAlwfCI/AAAAAAAAAFk/hRlwLXKS71c/s800/NacaTrans0204image04.png.jpg](http://lh4.ggpht.com/_lKK1B4BvREU/SltIsAlwfCI/AAAAAAAAAFk/hRlwLXKS71c/s800/NacaTrans0204image04.png.jpg)

> This screen is managed by the transcoded ONLINE1 program.

> A sample SQL access is performed on ONLINE1 paragraph "test\_Sql" (line 215).
> It's triggered by hitting function key "F7".
> In the sample, it won't work, as DB has been disabled.

> If you wanted to test the DB access, you would need to remove SimulateRealEnvironment from NacaRT.cfg (or set it to false).
> Then, the 

&lt;SQLConfig&gt;

 section must be filled with your DB specific parameters (in that case, it's configured for DB2 or UDB):

```
 <SQLConfig
	dburl="jdbc:db2://IpAddress:0/Name:"
	dbuser="DbUser"
	dbpassword="DbPassword"
	dbConnectionUrlOptionalParams="currentPackageSet=NACA;keepDynamic=yes;clientProgramName=$FoundPoolName;"
	dbenvironment="TEST"
	driverClass="com.ibm.db2.jcc.DB2Driver"
	CloseCursorOnCommit="true"
	AutoCommit="false"
	validationQuery="select * from SYSIBM.SYSDUMMY1"
 >
```

> What's more, LDAP configuration must also be filled:

```
 LDAPServer="xxx1.domain.net"
 LDAPServer2="xxx2.domain.net"
 LDAPServer3="xxx3.domain.net"
 LDAPRootOU="OU=DOMAIN_OU,DC=Domain,DC=net"
 LDAPGenericUser="LDapUser"
 LDAPGenericPassword="LDapPassword"
```