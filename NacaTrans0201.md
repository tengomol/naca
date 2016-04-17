# What is Naca? -->[click here](Naca0201.md) #

# NacaTrans - Package and Paths #

## Transcoding ##

> This document states that naca-x.y.z.zip has been unzipped in `D:\Dev\naca` directory.
> All configuration paths are set on this directory by default.
> It can be changed, but with more efforts.

> To transcode Naca sample Cobol files, you need to launch NacaTrans with the following parameters:

> Project: NacaTrans
> Main class: NacaTrans
> Command line argument: `D:\Dev\naca\NacaSamples\trans\NacaTransSamples.cfg`
> The details of this configuration file is explained in NacaSampleTranscodingUsage.pdf file.

> After transcoding, the following directories are created:

> `D:\Dev\naca\NacaSamples\src`: containing genenrated java files
> `D:\Dev\naca\NacaSamples\trans\info\ItemCount.html`: file giving statistics on various verbs, constructions, ...
> `D:\Dev\naca\NacaSamples\trans\stat`: Contains temporary files used during transcoding