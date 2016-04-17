# What is Naca? -->[click here](Naca0201.md) #

## NacaRT - JMX Console - Loaded programs (Prog.xxx) ##

### Details of the loaded programs (Prog.xxx) ###

> Each program loaded in memory has an entry in the left column. There can be several entries.
> Each program loaded in memory has an entry as a MBean and is visible in the left column.
> There can be several programs loaded in the same time.
> The following production informations can be displayed:
    * the number of created instances
    * the number of running instances
    * the number of available instances in the pool of programs (that means already executed, and that will have a short execution preparation time)
    * the total number of executions
    * the size in character (16 bits) and the working storage section (Cobol)
    * minimum, maximum and mean execution duration
    * date/hour of the first and the last execution

> The tab "Operation" is giving access to a command to dynamically unload a program:

> We can therefore enforce the unload of a program using `unloadProgram`.
> This will results in preventing a new execution of program till all the running instances are closed and returned back to the pool.
> All the instances of the program are destroyed and the code program is unloaded from the memory.
> All the execution requests are then allowed again, and the new version will be loaded when necessary.
> The update procedure at runtime is:
    * Update the new `.class` and its associated paragraphs in the folder identified by the variable `ApplicationClassPath` in the configuration file.
> > > Beware, a program `xxx` is built of a `xxx.class` and as many files `xxx$nnn.class` as there are paragraphs in the program (nnn is a number).
> > > All those files have to be updating at the same time.
    * Request an `unloadProgram` using the JMX interface.