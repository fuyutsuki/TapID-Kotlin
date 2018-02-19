# TapID-Kotlin
TapID plugin written by Kotlin + Gradle. for NukkitX #59`s build.

### Known Bug
サーバーに入室するとき及びサーバーから退出するときに以下の例外が発生します。  
The following exception occurs when entering the server and when leaving the server:
> 18:33:24 [ALERT] java.lang.RuntimeException: java.io.EOFException
        at cn.nukkit.level.format.generic.BaseRegionLoader.<init>(BaseRegionLoader.java:57)
        at cn.nukkit.level.format.anvil.RegionLoader.<init>(RegionLoader.java:21)
        at cn.nukkit.level.format.anvil.Anvil.loadRegion(Anvil.java:284)
        at cn.nukkit.level.format.anvil.Anvil.loadChunk(Anvil.java:219)
        at cn.nukkit.level.format.generic.BaseLevelProvider.getChunk(BaseLevelProvider.java:372)
        at cn.nukkit.level.Level.forceLoadChunk(Level.java:2612)
        at cn.nukkit.level.Level.getChunk(Level.java:2304)
        at cn.nukkit.level.generator.task.PopulationTask.<init>(PopulationTask.java:34)
        at cn.nukkit.level.Level.populateChunk(Level.java:2875)
        at cn.nukkit.level.Level.populateChunk(Level.java:2842)
        at cn.nukkit.Player.sendNextChunk(Player.java:815)
        at cn.nukkit.Player.checkNetwork(Player.java:1814)
        at cn.nukkit.Server.tick(Server.java:1082)
        at cn.nukkit.Server.tickProcessor(Server.java:842)
        at cn.nukkit.Server.start(Server.java:819)
        at cn.nukkit.Server.<init>(Server.java:502)
        at cn.nukkit.Nukkit.main(Nukkit.java:102)
Caused by: java.io.EOFException
        at java.io.RandomAccessFile.readInt(Unknown Source)
        at cn.nukkit.level.format.anvil.RegionLoader.loadLocationTable(RegionLoader.java:218)
        at cn.nukkit.level.format.generic.BaseRegionLoader.<init>(BaseRegionLoader.java:52)
        ... 16 more
