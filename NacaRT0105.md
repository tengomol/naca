# What is Naca? -->[click here](Naca0201.md) #

## NacaRT - JMX Console - Screen ressources ##

### Presentation screen ressources (_XSLTResources) ###_

> To be used in transactional mode only.

> Displays the number of transformation files loaded in specialized compiled objects for XSLT transformations.
> We can request to unload them from the memory.
> The next HTML screen production will reload the transformation files.
> The request will be handled asynchronously, depending on the system load.
> This is allowing the modification of one or more ressources files and to see the effect on the presentation screens without restarting Tomcat.

> The update procedure is:
    * Put the new transformation file identified by the variable `XSLFilePath` or `HelpXSLFilePath` or `PSXSLFilePath` in the configuration file.
    * Request the unload of the pooled ressources.