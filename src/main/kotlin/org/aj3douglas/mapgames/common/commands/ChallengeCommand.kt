package org.aj3douglas.mapgames.common.commands

import me.mattstudios.mf.annotations.Command
import me.mattstudios.mf.annotations.Permission
import me.mattstudios.mf.annotations.SubCommand
import me.mattstudios.mf.base.CommandBase
import org.aj3douglas.mapgames.common.GameManager
import org.bukkit.entity.Player

@Command("challenge")
class ChallengeCommand(
        private val gameManager: GameManager
):CommandBase() {

    @Permission("game.tictactoe")
    @SubCommand("tictactoe")
    fun ticTacToe(commandSender:Player, player:Player){
        gameManager.TTTGameHandler.playerHandler.request(commandSender, player)
        gameManager.TTTGameHandler.startNewGame(commandSender, player)
    }
}