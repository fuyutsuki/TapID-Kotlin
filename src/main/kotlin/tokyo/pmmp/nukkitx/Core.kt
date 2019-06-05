package tokyo.pmmp.nukkitx

import cn.nukkit.plugin.PluginBase
import cn.nukkit.event.Listener
import cn.nukkit.utils.TextFormat

class Core : PluginBase(), Listener{

    companion object {
        const val PREFIX = "[TapID] "
    }

    override fun onEnable() {
        server.pluginManager.registerEvents(EventListener, this)
        logger.info(TextFormat.GREEN.toString() + description.fullName + "が有効になりました")
    }

    override fun onDisable() {
        logger.info(TextFormat.RED.toString() + description.fullName + "が無効になりました")
    }
}