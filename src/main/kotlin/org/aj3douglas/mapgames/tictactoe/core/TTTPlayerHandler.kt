package org.aj3douglas.mapgames.tictactoe.core

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.SetMultimap
import org.bukkit.entity.Player


class TTTPlayerHandler {
    private val waiting = ArrayListMultimap.create<Player, Player>()

    fun request(requester:Player, challenged:Player):Boolean {
        waiting.put(challenged, requester)
        if(waiting[challenged].contains(requester)){
            return false
        }
        return true
    }



}
