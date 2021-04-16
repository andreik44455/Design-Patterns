package behavioral.mediator

import java.time.Instant
import java.time.ZoneOffset

/**
 * Mediator
 */
object ChatRoom {
    fun showMessage(user: User, message: String) {
        println("${Instant.now().atOffset(ZoneOffset.UTC)} [${user.name}]: $message")
    }
}
