package behavioral.mediator

import behavioral.mediator.ChatRoom.showMessage

/**
 * Component
 */
class User(var name: String) {

    fun sendMessage(message: String) = showMessage(this, message)
}
