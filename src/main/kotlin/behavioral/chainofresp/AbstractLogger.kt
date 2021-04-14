package behavioral.chainofresp

/**
 * Handler
 */
abstract class AbstractLogger {
    protected var level = 0

    //next element in chain or responsibility
    var nextLogger: AbstractLogger? = null

    fun logMessage(level: Int, message: String?) {
        if (this.level <= level) {
            write(message)
        }
        if (nextLogger != null) {
            nextLogger!!.logMessage(level, message)
        }
    }

    protected abstract fun write(message: String?)

    companion object {
        var DEBUG = 1
        var INFO = 2
        var ERROR = 3
    }
}
