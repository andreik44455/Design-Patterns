package behavioral.chainofresp.logger

import behavioral.chainofresp.AbstractLogger

/**
 * Concrete handler
 */
class ErrorLogger(level: Int) : AbstractLogger() {

    init {
        this.level = level
    }

    override fun write(message: String?) {
        println("Error Console::Logger: $message")
    }
}