# What is Naca? -->[click here](Naca0201.md) #

# NacaRT - Configuration - Batch specific parameters #

## Specific parameters ##

> These settings are used only by batch programs.

> `conf/TempDir`
> Full path on the directory where sort temporary files are stored. The directory must exists prior to execution.

> `conf/DynamicAllocationPath`
> Full path name of the directory where dynamically created files are stored.

## Batch transfer configuration ##

> `conf/SequencerConfig/CESMConfig/Config`

```
 <Config
       StartBatchPrefix="N"
       StartBatchHostTest="false"
       StartBatchHostFtpUrl="mvs.consultas.ch"
       StartBatchHostFtpUser="CICAS"
       StartBatchHostFtpPassword="CICAS"
       StartBatchHostFtpSiteCommand="xlate=iso8859;FILETYPE=JES"
       StartBatchLinuxFtpUrl="???"
       StartBatchLinuxFtpUser="???"
       StartBatchLinuxFtpPassword="???"
       StartBatchLinuxFtpDirectory="???"
       StartBatchLinuxSshCommand="???"
       StartBatchLinuxSshPath="???"
       StartBatchLinuxSshUser="???"
       />
```