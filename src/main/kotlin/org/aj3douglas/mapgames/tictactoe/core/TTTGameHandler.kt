package org.aj3douglas.mapgames.tictactoe.core

import org.aj3douglas.mapgames.common.utils.extensions.debug
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.entity.Player
import kotlin.math.abs

class TTTGameHandler {

    val playerHandler = TTTPlayerHandler()

    fun startNewGame(playerOne: Player, playerTwo: Player): TTTGame {
        "Starting new tic tac toe game".debug()
        val game = TTTGame(playerOne, playerTwo)
        prepareGame(game)
        return game
    }

    fun prepareGame(game: TTTGame) {
        "Preparing new game".debug()
        prepareArena(game.playerOne.location.clone().add(0.0, 10.0, 0.0))
    }


    private fun prepareArena(standingLocation: Location) {
        "Preparing new game arena".debug()
        val firstLocation = standingLocation.clone()
        for (x in -2..2) {
            for (y in -2..2) {
                for (z in -2..2) {
                    if (abs(x) != 2 && abs(y) != 2 && abs(z) != 2) continue
                    val loc = firstLocation.add(x.toDouble(), y.toDouble(), z.toDouble())
                    loc.block.type = Material.SEA_LANTERN
                    loc.subtract(x.toDouble(), y.toDouble(), z.toDouble())
                }
            }
        }
    }
}