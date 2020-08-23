package org.aj3douglas.mapgames.common.utils

import com.google.common.collect.ArrayListMultimap
import org.aj3douglas.mapgames.Mapgames
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.scheduler.BukkitRunnable

fun async(function: BukkitRunnable.() -> Unit) {
    object: BukkitRunnable() {
        override fun run() {
            function()
        }
    }.runTaskAsynchronously(JavaPlugin.getPlugin(Mapgames::class.java))
}

operator fun <K, V> ArrayListMultimap<K, V>.get(key:K) = this.get(key)