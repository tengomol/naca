# What is Naca? -->[click here](Naca0201.md) #

# NacaTrans - Sample #

## Sample ##

### Sample configuration file ###

> Sample Cobol source project to transcode: NacaSample

> A sample Cobol project is provided by the NacaSample projet.
> In this document, the projet is supposed to be installed in the D:\Dev\Naca\NacaSample directory.
> This project contains some sample source Cobol and BMS files.

> The cobol directory contains source Cobol files:
    * Batch: D:\Dev\naca\NacaSamples\cobol\BATCH1.CBL
    * Online: D:\Dev\naca\NacaSamples\cobol\ONLINE1.CBL
    * Copy files in D:\Dev\naca\NacaSamples\cobol\include
    * Call program is in D:\Dev\naca\NacaSamples\cobol\CALLMSG.CBL

> The trans directory contains tempororay files generated during transcode pahses, and the NacaTransRules.xml.
> This is a special configuration file for online programs.
> The src directory will be created during transcode. It will contain generated java files.

### NacaTrans.cfg details ###

> There is a custom NacaTrans.cfg for a given source projet to transcode.
> Thus, there is a special NacaTrans.cfg for the NacaSample projet.
> It's main purpose is to describe the source data to transcode.
> It's content is given below:

```
  <?xml version="1.0" encoding="ISO-8859-1"?>
  <NacaTrans Log4jConf="d:\dev\naca\NacaSamples\trans\Log4JConfiguration.txt">
  	<SingleFile Name="ONLINE1" Application="online" Group="Online"/>
  	<SingleFile Name="BATCH1" Application="batch" Group="Batch"/>
  	<SingleFile Name="CALLMSG" Application="commons" Group="Commons"/>
  	<Engines>
  		<Transcoder
  			Name="CobolTranscoder" Class="utils.CobolTranscoder.CobolTranscoderEngine"
  			ReferenceGroupName="Commons"
  			ResourceGroupName="Resources"
  			IncludeGroupName="Includes"
  		>
  			<CSD File="d:\dev\naca\NacaSamples\cobol\CICSCSD.txt" Output="d:\dev\naca\NacaSamples\src\online\TransIDMapping.xml"/>
  		</Transcoder>
  		<Transcoder Name="BMSTranscoder" Class="utils.CobolTranscoder.BMSTranscoderEngine" ResourceGroupName="Resources"
		>
  			<BMSSpec
  				FormTransformPath="d:\dev\naca\NacaSamples\trans\transforms\"
  				GlobalFormTransform="d:\dev\naca\NacaSamples\trans\transforms\global.fet"
  			/>
  		</Transcoder>
  		<Transcoder
  			Name="IncludeTranscoder" Class="utils.CobolTranscoder.CobolIncludeTranscoderEngine"
  			ReferenceGroupName="Commons"
  		/>
  	</Engines>
  	<Groups>
  		<Group
  			Name="Online"
  			InputPath="d:\dev\naca\NacaSamples\cobol\"
  			OutputPath="d:\dev\naca\NacaSamples\src\"
  			InterPath="d:\dev\naca\NacaSamples\trans\stat\"
  			Type="Online"
  			Engine="CobolTranscoder"
  		/>
  		<Group
  			Name="Batch"
  			InputPath="d:\dev\naca\NacaSamples\cobol\"
  			OutputPath="d:\dev\naca\NacaSamples\src\"
  			InterPath="d:\dev\naca\NacaSamples\trans\stat\"
  			Type="Batch"
  			Engine="CobolTranscoder"
  		/>
  		<Group
  			Name="Commons"
  			InputPath="d:\dev\naca\NacaSamples\cobol\"
  			OutputPath="d:\dev\naca\NacaSamples\src\"
  			InterPath="d:\dev\naca\NacaSamples\trans\stat\"
  			Type="Called"
  			Engine="CobolTranscoder"
  		/>
  		<Group
  			Name="Includes"
  			InputPath="d:\dev\naca\NacaSamples\cobol\include\"
  			OutputPath="d:\dev\naca\NacaSamples\src\commons\include\"
  			InterPath="d:\dev\naca\NacaSamples\trans\stat\"
  			Type="Included"
  			Engine="IncludeTranscoder"
  		/>
  		<Group
  			Name="Resources"
  			InputPath="d:\dev\naca\NacaSamples\cobol\"
  			OutputPath="d:\dev\naca\NacaSamples\src\online\resources\"
  			InterPath="d:\dev\naca\NacaSamples\trans\stat\"
  			Type="Map"
  			Engine="BMSTranscoder"
  		/>
  	</Groups>
  	<GlobalPaths
  		RuleFilePath="d:\dev\naca\NacaSamples\trans\NacaTransRules.xml"
  		InfoPath="d:\dev\naca\NacaSamples\trans\info\"
  	/>
  </NacaTrans>
```

### Tags description ###

> `NacaTrans`: Root tag

> `NacaTrans/codeNacaTrans/Log4jConf`: arguement that gives the path of the Log4J configuration file.

> `NacaTrans/SingleFile`: Tag that give a source file to transcode, with properties.
> Multiple tags `NacaTrans/SingleFile` can be specified.

> `NacaTrans/SingleFile/Name`: Argument that gives the name of the program to transcode

> `NacaTrans/SingleFile/Application`: Argument that gives the application whose program Name belongs to.
> The Application notion is defined below.

> `NacaTrans/SingleFile/Group`: Argument that gives the group whose program Name belongs to.
> The Group notion is defined below.

> `NacaTrans/Engine`: Tag that describes the various transcoder engines to use.
> NacaTrans is made of multiple engines.

> `NacaTrans/Engine/Transcoder`: Tag that describe a transcoder engine. Multiple tags can be specified.

> `NacaTrans/Engine/Transcoder/Name`: Argument name of the transcoder engine to use.
> It can be either:
    * CobolTranscoder
    * BMSTranscoder
    * IncludeTranscoder
    * FPacTranscoder
    * ResTranscoder
> The two last engines are special cases.

> `NacaTrans/Engine/Transcoder/Class`: Argument that gives the class path of the selected transcoder engine.
> Use the provide values.

> `NacaTrans/Engine/Transcoder/ReferenceGroupName`: Argument that defines the Reference group that this engine will process.
> A Reference group defines all path settings of the source files to transcode.

> `NacaTrans/Engine/Transcoder/ResourceGroupName`: Argument that defines the Resource group that this engine will process.
> A Resource group defines the BMS source file to transcode.

> `NacaTrans/Engine/Transcoder/IncludeGroupName`: Argument that defines the Resource group that this engine will process.
> An IncludeGroup defines the Copy files to transcode.

> `NacaTrans/Engine/Transcoder/CSD`: This tag is optional. It's used to define CICS transaction settings.

> `NacaTrans/Engine/Transcoder/CSD/File`: Gives the path of a CICS transaction definition file.

> `NacaTrans/Engine/Transcoder/CSD/Output`: Gives the path of a XML file that maps transcoded programs into CICS transaction name.

> `NacaTrans/Groups`: This tag defines the various groups.

> `NacaTrans/Groups/Group`: This tag define a group. A Group gives the various paths.
> Multiple paths can be defined.

> `NacaTrans/Groups/Group/Name`: Name of the group.
> It refers to the group name defined:
> > `NacaTrans/Engine/Transcoder/ReferenceGroupName`

> or
> > `NacaTrans/Engine/Transcoder/ResourceGroupName`

> or
> > `NacaTrans/Engine/Transcoder/IncludeGroupName`


> `NacaTrans/Engine/Transcoder/InputPath`: Path where input files are located

> `NacaTrans/Engine/Transcoder/OutputPath`: Path where generated files will be written

> `NacaTrans/Engine/Transcoder/InterPath`: Path where temporyry files will bw stored

> `NacaTrans/Engine/Transcoder/Type`: Group's type.
> It can be either:
    * "Online": the group contains online programs
    * "Batch": the group contains online programs
    * "Called": the group contains call programs
    * "Map": the group contains BMS maps
    * "Included": the group contains copy programs

> `NacaTrans/Engine/Transcoder/Engine`: Name of the engine to use.
> It can be either:
    * "CobolTranscoder": identifies the transcoder used to convert source online and batch Cobol to Java output
    * "IncludeTranscoder": identifies the transcoder used to convert source copy Cobol to Java output
    * "BMSTranscoder": identifies the transcoder used to convert BMS maps to java and XML description

> `NacaTrans/GlobalPaths`: This tag gives contains reference to definitions.
> It won't be described here.

### Trancoding the Cobol sources ###

> In Eclispe, run the NacaTrans project.

> The ouptuts are:

  * Generated files:
    * The batch source files in D:\Dev\naca\NacaSamples\src\batch
    * The online source files in D:\Dev\naca\NacaSamples\src\online
    * The call source files in D:\Dev\naca\NacaSamples\src\commons
    * The copy source files in D:\Dev\naca\NacaSamples\src\commons\include
    * Resource file generated from BMS file in D:\Dev\naca\NacaSamples\src\online\resources

  * A log file in
    * D:\Dev\naca\NacaSamples\trans\log\LogJava.Log

  * Statistics file in:
    * D:\Dev\naca\NacaSamples\trans\info\ItemCount.html
> > produced from D:\Dev\naca\NacaSamples\trans\info\ItemCount.xml

  * Intermediate files:
    * Lexer outputs files in D:\Dev\naca\NacaSamples\trans\stat**.lex
    * XML description of the source file in D:\Dev\naca\NacaSamples\trans\stat**.xml

### Compiling the transcoded Java sources ###


> The project can then be compiled.

### Executing the transcoded Java programs ###

> The project can then be exectuted.