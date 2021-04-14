package behavioral.chainofresp.logger

import behavioral.chainofresp.AbstractLogger

/**
 * Concrete handler
 */
class FileLogger(level: Int) : AbstractLogger() {

    init {
        this.level = level
    }

    override fun write(message: String?) {
        println("File::Logger: $message")
    }

}
