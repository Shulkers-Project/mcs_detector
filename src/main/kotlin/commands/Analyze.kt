package dev.crystaworld.commands

import kotlin.system.exitProcess

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.Context
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.types.file
import com.github.ajalt.clikt.parameters.types.path

import dev.crystaworld.cc

class Analyze : CliktCommand(name = "analyze") {
    override fun help(context: Context) = "Analyze Minecraft jar files"

    val folderPath by option("--dir", "-d", help = "Folder containing the JAR file")
        .path(mustExist = true, canBeDir = true, canBeFile = false)
    val filePath by option("--file", "-f", help = "Path to a specific Minecraft jar file")
        .file(mustExist = true, canBeDir = false, canBeFile = true)

    override fun run() {
        if (folderPath != null && filePath != null) {
            println(cc.red("Error: ") + cc.white("Both directory and file specified. Please choose one."))
            exitProcess(1)
        }
    }
}