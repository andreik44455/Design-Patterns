package behavioral.iterator

/**
 * Client
 */
class SocialSpammer(
    val network: SocialNetwork,
) {
    var iterator: ProfileIterator? = null

    fun sendSpamToFriends(profileEmail: String, message: String) {
        println("\nIterating over friends...\n")
        iterator = network.createFriendsIterator(profileEmail)
        while (iterator!!.hasNext()) {
            val profile = iterator!!.getNext()
            sendMessage(profile!!.email, message)
        }
    }

    fun sendSpamToCoworkers(profileEmail: String, message: String) {
        println("\nIterating over coworkers...\n")
        iterator = network.createCoworkersIterator(profileEmail)
        while (iterator!!.hasNext()) {
            val profile = iterator!!.getNext()
            sendMessage(profile!!.email, message)
        }
    }

    private fun sendMessage(email: String, message: String) {
        println("Sent message to: '$email'. Message body: '$message'")
    }

}
