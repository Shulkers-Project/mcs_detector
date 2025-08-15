package dev.crystaworld

// Clikt CLI Lib
import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.main
import com.github.ajalt.clikt.core.subcommands

// Clikt SubCommands
import dev.crystaworld.Commands.Analyze

// CLI main Class
class MCDetector : CliktCommand(name = "mcdetector") {
    override fun run() = Unit
}

// Main function
fun main(args: Array<String>) = MCDetector()
    .subcommands(Analyze())
    .main(args)