package tokyo.pmmp.nukkitx

// nukkit
import cn.nukkit.plugin.PluginBase
import cn.nukkit.event.Listener
import cn.nukkit.event.EventHandler
import cn.nukkit.event.player.PlayerInteractEvent
import cn.nukkit.utils.TextFormat

class Core : PluginBase(), Listener{

  companion object {
      const val PREFIX = "[TapID] "
  }

  override fun onEnable() {
    server.pluginManager.registerEvents(this, this)
    logger.info(TextFormat.GREEN.toString() + description.fullName + "が有効になりました")
  }

  @EventHandler
  fun onInteract(event: PlayerInteractEvent) {
    if (event.action == PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK) {
      val player = event.player
      if (player.inventory.itemInHand.id == 347) {// Clock
        val block = event.block
        val id = block.id
        val damage = block.damage
        player.sendMessage(TextFormat.AQUA.toString() + PREFIX + "ID: " +  id.toString() + " Damage: " + damage.toString())
      }
    }
  }

  override fun onDisable() {
    logger.info(TextFormat.RED.toString() + description.fullName + "が無効になりました")
  }
}