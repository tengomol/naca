# What is Naca? -->[click here](Naca0201.md) #


# NacaTrans - Configuration #

## Configuration ##

> Convention used here: Naca trans can be installed anywhere.
> However, for example reason it's supposed to be installed in a Windows development computer at D:\Dev\Naca\NacaTrans directory.
> All the paths provided in this document will refer to this directory.

### File location ###

> The configuration of the NacaTrans is done through the NacaTrans.cfg file. It must be located at the projet's root.
> For example, if the standard path is used (D:\Dev\Naca\NacaTrans), then the configuration file is then D:\Dev\Naca\NacaTrans\NacaTrans.cfg.
> It's an XML file.

### NacaTrans execution command line ###

> NacaTrans doesn't need any command line argument.

> The easiest way to run it is to launch Eclispe, and import the NacaTrans projet in the workspace.
> You will also need to import the JLib projet. They are both in the zip file of the Naca Open Source package.
> JLib is a library used internally by the transcoder.

> Then, create a new Debug/Run configuration with Projet set to "NacaTrans" and Main class set to "NacaTrans".
> That's it !

> However, before running it, the configuration file NacaTrans.cfg must be filled in.