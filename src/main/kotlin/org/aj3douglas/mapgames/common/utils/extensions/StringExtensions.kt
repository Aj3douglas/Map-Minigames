package org.aj3douglas.mapgames.common.utils.extensions

import net.md_5.bungee.api.ChatColor
import java.util.regex.Pattern

val HEX_PATTERN: Pattern = Pattern.compile("#<([A-Fa-f0-9]){6}>")
fun String.colourize():String{
    var translation = this
    var matcher = HEX_PATTERN.matcher(translation)
    while(matcher.find()){
        var hexString = matcher.group()
        hexString = "#" + hexString.substring(2, hexString.length -1)
        val hex = ChatColor.of(hexString)
        val before = translation.substring(0, matcher.start())
        val after = translation.substring(matcher.end())
        translation = before + hex + after
        matcher = HEX_PATTERN.matcher(translation)
    }
    return ChatColor.translateAlternateColorCodes('&', translation)
}