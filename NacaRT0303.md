# What is Naca? -->[click here](Naca0201.md) #

# NacaRT - Configuration - Online specific parameters #

## Specific parameters ##

> These parameters are used only for online programs.

### User interface element configuration ###

#### Parameters ####

> `conf/XSLFilePath`
> String parameter giving the full file name of the xslt file that transforms the XML data into HTML file sent to the browser.
> Mandatory field.

> `conf/HelpXSLFilePath`
> String parameter that gives the full file name of a xslt file used to produce the help screen.
> Mandatory field.

> `conf/resourcePath`
> String parameter that gives the full directory path where screen resource files are stored.
> These are the **.res files that describes all screen graphical layout.
> Mandatory field.**

> `conf/XMLFrameFilePath`
> String that gives the full file name of the xml file that describes the HTML frame layout.
> This page is defining the title position, the menus, the icons, the surface reserved for application screens.
> Typically, this is 

&lt;path&gt;

/xmlPage.xml
> Mandatory field.

> `conf/EmulWebRootPath`
> String that gives the full path and file name for EmulWeb mode.
> This mode is not used in production environment, and is reserved for development process.
> It must be set as `EmulWebRootPath=""`.
> Optional field.

> `conf/httpSessionMaxInactiveInterval_s`
> Number of seconds that a http session is holded within tomcat container.
> This parameter is automatically closing an open session after a timeout of user inactivity.
> It must not be too long in order for the user not to loose their work.
> On the opposite, it must not be too long, as each open session has a cost in terms of resource in a server.
> It can be setup with a large value, as a session doesn't use too much resources.
> The typical value is `"10800"` (3 hours).

> `conf/CacheResourceFiles`
> Boolean value
> Set this flag to "true" to enable caching of .res files.
> These files are then loaded and cached during server startup.
> Resource file cache can be updated by clicking a button in the JMX console.
> If it's set to false, then .res files are loaded at every user request.
> This is discouraged.

#### LDap configuration ####

> nacaRT uses an initial LDAP login for users authentication.
> There can be maximum 3 differents LDAP servers, which are queried simultaneously.

> `conf/LDAPServer`
> Identifies the DNS name of the first LDAP autentication server. Must be filled.
> Mandatory field.

> `conf/LDAPServer2`
> Identifies the DNS name of the second LDAP autentication server. Can be an empty, if only one authentication serveris used.

> `conf/LDAPServer3`
> Identifies the DNS name of the third and last LDAP autentication server. Can be an empty, if only one or two authentication servers are used.

> `conf/LDAPRootOU`
> Root OU; example is `DAPRootOU="OU=FUTUR_PUBLIGROUPE,DC=Publigroupe,DC=net"`.
> Mandatory field.

> `conf/LDAPGenericUser`
> Generic LDap user

> `conf/LDAPGenericPassword`
> Generic LDap password

### Transaction definition and translation support ###

> These resources are defined in the tag conf/SequencerConfig.

> `conf/SequencerConfig/TransIDMappingFilePath`
> Gives the full path and file name of an XML file that contains mappings between transaction name and 1st program running this transaction.
> This file is then used by nacaRT to identify which program must be run when a transaction has been launched.
> NacaRT is using the notion of CICS transaction, as original applications, but can load only programs. Therefore, this file is making the link between the 2 notions.
> The XML file structure is:
```
  <?xml version="1.0" encoding="ISO-8859-1"?>
  <root>
  	[<transid id="cics_transaction_name" program="program_name"/>] *
  </root>
```
> This field is mandatory.

> `conf/SequencerConfig/TranslationFilePath`
> Gives the full path and file name of an XML file that contains multilingual texts used by the custom help system.
> This field is mandatory.

> ### Asynchronously launched programs ###

> An optionnal list of program to launch asynchronously can be setup.
> These programs will be launched after the application server is started.
> They are described by a list of tag `<Program>` within tag `<StartPrograms>` within tag `<SequencerConfig>`, itself with tag `<conf>`.
> Each program is run in it's own thread.
> The thread is created immediatly after server startup, but the program may wait a given number of second before being actually executed.

> It is possible to have several 

&lt;Program&gt;

 tags, but only one couple of tags 

&lt;name&gt;

 and 

&lt;delaySeconds&gt;

 per tag 

&lt;Program&gt;

.

> `conf/SequencerConfig/StartPrograms/Program/name`
> String value.
> Gives the name of a program to launch asynchronously after server startup.
> A custom thread is allocated for each program.
> Only 1 instance of the program is created.
> Mandatory field.

> `conf/SequencerConfig/StartPrograms/Program/delaySeconds`
> Integer value.
> Number of seconds to wait after having created and launched the custom thread before actually executing the program's code.
> Mandatory field.

### User login and help ###

> When a user first connect to the nacaRT, a login screen is displayed on it's browser.
> This screen is a custom one, as well as the help screen.
> These elements are configured in tag `<CESMConfig>` of tag `<SequencerConfig>`, itself within `<conf>`.

> `conf/SequencerConfig/CESMConfig/StartProgramId`
> Gives the name of the first program to launch when a new http session is started by a new user.
> Mandatory field.

> `conf/SequencerConfig/CESMConfig/StartCommandCode`
> Identifies how this program is executed. It must be set to `"XCTL"`.
> Mandatory field.

> `conf/SequencerConfig/CESMConfig/HelpCenterClassName`
> Gives the full class name of the help program.
> Mandatory field.