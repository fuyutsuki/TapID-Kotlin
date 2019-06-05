package tokyo.pmmp.nukkitx

import cn.nukkit.event.EventHandler
import cn.nukkit.event.Listener
import cn.nukkit.event.player.PlayerInteractEvent
import cn.nukkit.item.ItemID
import cn.nukkit.utils.TextFormat

object EventListener: Listener {

    @EventHandler
    fun onInteract(event: PlayerInteractEvent) {
        if (event.action == PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK) {
            val player = event.player
            if (player.inventory.itemInHand.id == ItemID.CLOCK) {
                val block = event.block
                val id = block.id
                val damage = block.damage
                player.sendTip(TextFormat.AQUA.toString() + Core.PREFIX + "ID: " +  id + " Damage: " + damage)
            }
        }
    }

}