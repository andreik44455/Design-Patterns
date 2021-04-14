package behavioral.chainofresp.logger

import behavioral.chainofresp.AbstractLogger

/**
 * Concrete handler
 */
class ConsoleLogger(level: Int) : AbstractLogger() {
    init {
        this.level = level
    }

    override fun write(message: String?) {
        println("Standard Console::Logger: $message")
    }
}
