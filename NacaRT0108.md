# What is Naca? -->[click here](Naca0201.md) #

## NacaRT - JMX Console - Loaded copy (Copy.xxx) ##

### Details of the loaded copy (Copy.xxx) ###

> Each Copy file has a MBean JMX definition.
> We are displaying the number of programs that are dependant on the Copy.
> We can unload a Copy.
> This will result in unloading all the programs that are using the Copy.
> This must not be done for Copy that are massively used (type ERRZONE), because the system will be locked when all the programs using ERRZONE will be unloaded.
> The performances will suffer a lot.
> However, if a Copy is used only by a few programs, and if they are not or nearly not running at this time, then the time response time will not or will not so much be impacted.
> The update procedure at runtime is:
    * Put the new Copy file in the folder identified by the variable `ApplicationClassPath` in the configuration file.
    * Request an `unloadProgram` using the JMX interface.