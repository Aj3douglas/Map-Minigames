package org.aj3douglas.mapgames.common.utils.extensions

import org.aj3douglas.mapgames.Mapgames

fun Any?.print(){
    println("[Map games] $this")
}

fun Any?.debug(){
    if(Mapgames.debug) println("[Map games debug] $this")
}

fun Any?.error(){
    println("[Map games !! ERROR !!] $this")
}