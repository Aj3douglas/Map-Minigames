package org.aj3douglas.mapgames.common.handlers

import me.mattstudios.mf.base.CommandManager
import org.aj3douglas.mapgames.common.GameManager
import org.aj3douglas.mapgames.common.commands.ChallengeCommand
import org.aj3douglas.mapgames.common.commands.MapTestcommand
import org.aj3douglas.mapgames.tictactoe.core.TTTGameHandler
import org.bukkit.plugin.java.JavaPlugin

class CommandHandler {

    fun registerCommands(javaPlugin: JavaPlugin){
        println("Registering commands!")
        val manager = GameManager(TTTGameHandler())
        val cmdManager = CommandManager(javaPlugin)
        listOf(
                ChallengeCommand(manager),
                MapTestcommand()

        ).forEach {
            cmdManager.register(it)
            println("Registered ${it::class.simpleName}")
        }
    }
}