# What is Naca? -->[click here](Naca0201.md) #

# NacaRT - Configuration - Execution environment #

## Execution environment ##

> NacaRT is a runtime that will execute the Cobol to Java transcoded applications.

> NacaRT can be executed in the context of a Tomcat application server, or independantly, without any application server.

> The different execution modes are detailled below.

### Transactional ###

#### Description ####

> The execution in the transactional mode is the normal execution mode for the transactional transcoded programs.

> NacaRT is using several Tomcat servlets:
    * InitServlet: this servlet is used to initialize the Naca system.
    * XSLTServlet: this servlet is used to pass the screens to the browsers and to collect the values filled in by the users.
    * PrintScreenServlet: this servlet is used to provide the Print Screen feature.
    * PopupServlet: this servlet is used to display the semantic context menus.

#### JVM parameters ####

> `-Xms800m`
> This parameter is defining the memory heap that has to be reserved into the JVM.
> Its value is set to 800 Mo.
> This parameter must be choosen accordingly with the type of application.

> `-Dcom.sun.management.jmxremote`
> This parameter is defining the usage of the JMX administration interface.

> `-Dcom.sun.management.jmxremote.port=8999`
> This parameter is defining the JMX administration listening interface port.
> This is the default value.
> Beware: only one process can use this port. This port is therefore not shareable for a defined IP address by several JVM or webapp within the same JVN.

> `-Dcom.sun.management.jmxremote.authenticate=false`
> This parameter is defining the usage of the authentication feature.
> Authentication is not required.
> Parameter value is set to `false`.

> `-Dcom.sun.management.jmxremote.ssl=false`
> This parameter is defining the usage of the SSL protocol feature.
> SSL protocol is not required.
> Parameter value is set to `false`.

> -XX:MaxPermSize=200m
> This parameter is defining the memory non-heap that has to be reserved into the JVM.
> Its value is set to 200 Mo.
> This memory space is used to store the binary code of the transcoded programs.
> This parameter must be choosen accordingly with the type of application.

### Batch ###

#### Description ####

> The execution in batch mode is launched via a command line interface, outside any application server.

> All the parameters have to start by the character `"-"`.

> The program is started by launching the `"Java"` executable. The main class containing the method `main` is `"nacaLib.base.CJMap"`.

#### Command line arguments ####

##### Mandatory command line parameters #####

> The following command line parameters are mandatory:
> (All the parameters have to start with the character `"-"`).

> `-Path=String`
> This parameter is defining the path where the binaries can be found.

> `-ConfigFile=String`
> This parameter is defining the path and the filename of the NacaRT configuration file (this file is referred to as `nacaRT.cfg`).

> `-Program=String`
> This parameter is defining the file that will be executed.

> `-log=String`
> This parameter is defining the path and the filename of the NacaRT configuration log file.

> `-batch`
> This parameter is defining the execution mode that will be set to batch execution mode.

##### Optional parameters #####

> Some optional parameters can be specified.

> They are used to associate:
  * a logical file name to a physical file name and path
> and/or
  * a software functional behaviour to an option name

> They can defined using:
  * the command line
> and/or
  * system environment variables

##### Using the command line #####

> The parameters are added to the command line after the mandatory parameters.

> The syntax is the following:

> `-File.<logical_name>=<path>[,ext][,ascii*|,ebcdic]`

> All the parameters have to start with the character `"-"`.

> `<logical_name>`
> This parameter is defining the `logical name` used into the application associated to the physical file that is considered.
> This parameter is mandatory.
> This parameter is a case sensitive `string`.

> `<path>`
> This parameter is defining the `path` to the physical file that is considered.
> This parameter is mandatory.
> This parameter is a case sensitive `string` under Unix, is not a case sensitive `String` under Windows.

> `[,ext]`
> This parameter is indicating that the `ext` open mode is forced when opening a filem indicating from outside the program that this file is expendable, even if it is not open explicitely in this mode inside the program.
> This parameter is optional.

> `[,ascii*|,ebcdic]`
> This parameter is indicating the file encoding format.
> This parameter is optional.
> The two values `,ascii*|,ebcdic` are exclusives.
> This parameter is set by default to `ascii`.

> Sample:
    * the `ebcdic` encoded file `Customers` located in `/opt/file/APPLICATIONCustomers.txt`
    * Command line argument: `-File.Customers=/opt/file/APPLICATIONCustomers.txt,ebcdic`

##### Using system environment variables #####

> The parameters are defined as system environment variables.

> The syntax is the following:

> `File.<logical_name>=<path>[,ext][,ascii*|,ebcdic]`

> All the parameters must NOT start with the character `"-"`.

> Refer to the previous section for an explanation of all the parameters.

> Sample:
    * the `ebcdic` encoded file `Customers` located in `/opt/file/APPLICATIONCustomers.txt`
    * Environment variable: `File.Customers`
    * Value: `/opt/file/APPLICATIONCustomers.txt,ebcdic`

#### JVM parameters ####

### Emulweb ###

#### Description ####

> The execution in Emulweb mode is used only in test and debug mode.

> This mode is allowing the execution of testing scenarii from outside the context of an application server.

> The program is started by launching the `"Java"` executable. The main class containing the method `main` is `"idea.emulweb.IDEAEmulWeb"`.

#### Command line arguments ####

> The following command line parameters are optional but the first one.
> (All the parameters have to start with the character `"-"`) but the first one that have to be defined as the first one.

> `String`
> This parameter is defining the path and the filename of the NacaRT configuration file (this file is referred to as `nacaRT.cfg`).
> This parameter must be the 1st parameter to be specified.
> This parameter must not start with the character `"-"`).
> This parameter is a `string`.

> `-cacheStruct`
> This parameter is indicating if the pool structures is going to be used.
> This parameter is a `boolean`.
> The recommanded value is `true`.

> `-loop=number`
> This parameter is defining the number of times a scenario will be played per thread.
> This parameter is allowing to perform load tests.
> This parameter is a `number`.
> The default value is 1.

> `-nbThreads=number`
> This parameter is defining the number of concurrent execution threads.
> All the threads will execute the same scenario, as many times as specified by the parameter `-loop`
> This parameter is a `number`.
> The default value is 1.

> `-noOutputExport`
> This parameter is indicating if the produced HTML screens will be saved onto the hard disks at runtime.
> If this parameter is indicated, the HTML screens will be stored as files in the folder defined by the parameter {{{}}}.
> This parameter is a `boolean`.