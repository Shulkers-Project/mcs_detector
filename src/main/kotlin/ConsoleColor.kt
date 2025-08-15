package dev.crystaworld

class ConsoleColor {
    companion object {
        const val RESET = "\u001B[0m"
        const val BLACK = "\u001B[30m"
        const val RED = "\u001B[31m"
        const val GREEN = "\u001B[32m"
        const val YELLOW = "\u001B[33m"
        const val BLUE = "\u001B[34m"
        const val PURPLE = "\u001B[35m"
        const val CYAN = "\u001B[36m"
        const val WHITE = "\u001B[37m"

        fun red(text: String) = "$RED$text$RESET"
        fun green(text: String) = "$GREEN$text$RESET"
        fun yellow(text: String) = "$YELLOW$text$RESET"
        fun blue(text: String) = "$BLUE$text$RESET"
        fun purple(text: String) = "$PURPLE$text$RESET"
        fun cyan(text: String) = "$CYAN$text$RESET"
        fun white(text: String) = "$WHITE$text$RESET"
        fun black(text: String) = "$BLACK$text$RESET"
    }
}

val cc = ConsoleColor