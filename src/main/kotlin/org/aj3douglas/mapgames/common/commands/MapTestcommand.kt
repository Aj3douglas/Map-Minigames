package org.aj3douglas.mapgames.common.commands

import com.github.johnnyjayjay.spigotmaps.MapBuilder
import com.github.johnnyjayjay.spigotmaps.rendering.SimpleTextRenderer
import com.github.johnnyjayjay.spigotmaps.util.ImageTools
import javafx.beans.binding.MapBinding
import me.mattstudios.mf.annotations.Command
import me.mattstudios.mf.annotations.Default
import me.mattstudios.mf.base.CommandBase
import org.bukkit.entity.Player
import org.bukkit.map.MapFont
import java.awt.Point

@Command("map")
class MapTestcommand:CommandBase() {
    @Default
    fun test(player:Player, letter:String){
        val renderer = SimpleTextRenderer.builder()
                .addLines(letter)
                .startingPoint(Point(ImageTools.MINECRAFT_MAP_SIZE .width/2, ImageTools.MINECRAFT_MAP_SIZE.height /2))
                .build()
        val map = MapBuilder.create()
                .world(player.world)
                .addRenderers(renderer)
                .build()
        player.inventory.addItem(map.createItemStack())
    }
}