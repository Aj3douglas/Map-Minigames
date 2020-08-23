package org.aj3douglas.mapgames;

import me.bristermitten.pdm.PDMBuilder
import org.aj3douglas.mapgames.common.handlers.CommandHandler
import org.aj3douglas.mapgames.common.utils.extensions.print
import org.bukkit.plugin.java.JavaPlugin


class Mapgames : JavaPlugin() {
    companion object{
        var debug:Boolean = true
    }


    override fun onEnable() {
        "Loading dependencies".print()
        PDMBuilder(this).build().loadAllDependencies().join()
        "Loaded all dependencies".print()
        val commandHandler = CommandHandler()
        commandHandler.registerCommands(this)
        "Plugin fully loaded".print()
    }


}
