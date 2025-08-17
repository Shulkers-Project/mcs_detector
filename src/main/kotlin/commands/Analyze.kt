package dev.crystaworld.commands

import kotlin.system.exitProcess

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.Context
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.types.file
import com.github.ajalt.clikt.parameters.types.path
import com.github.ajalt.mordant.terminal.Terminal
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.rendering.TextStyles.*
import java.nio.charset.Charset

class Analyze : CliktCommand(name = "analyze") {
    override fun help(context: Context) = "Analyze Minecraft jar files"

    val t = Terminal()

    val folderPath by option("--dir", "-d", help = "Folder containing the JAR file")
        .path(canBeDir = true, canBeFile = false)
    val filePath by option("--file", "-f", help = "Path to a specific Minecraft jar file")
        .file(canBeDir = false, canBeFile = true)

    override fun run() {
        if (folderPath != null && filePath != null) {
            t.println(red("Error: ") + reset("Both directory and file specified. Please choose one."))
            exitProcess(1)
        }
        if (folderPath != null) {
            t.println(green("Directory: ") + reset(folderPath.toString()))
        }
        if (filePath != null) {
            t.println(green("File: ") + reset(filePath.toString()))
        }
    }
}