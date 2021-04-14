package behavioral.chainofresp

import behavioral.chainofresp.logger.ConsoleLogger
import behavioral.chainofresp.logger.ErrorLogger
import behavioral.chainofresp.logger.FileLogger


fun demoChainOfRespPattern() {
    val loggerChain = getChainOfLoggers()

    // DEBUG printed in console
    loggerChain.logMessage(AbstractLogger.DEBUG,
        "This is an debug level information.")

    // INFO is printed in console and file
    loggerChain.logMessage(AbstractLogger.INFO,
        "This is an information.")

    // ERROR is printed in console, file and error
    loggerChain.logMessage(AbstractLogger.ERROR,
        "This is an error information.")
}

private fun getChainOfLoggers(): AbstractLogger {
    val errorLogger: AbstractLogger = ErrorLogger(AbstractLogger.ERROR)
    val consoleLogger: AbstractLogger = ConsoleLogger(AbstractLogger.DEBUG)
    val fileLogger: AbstractLogger = FileLogger(AbstractLogger.INFO)

    errorLogger.nextLogger = consoleLogger
    consoleLogger.nextLogger = fileLogger
    return errorLogger
}
