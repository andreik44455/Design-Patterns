package behavioral.iterator.socialnetwork

import behavioral.iterator.Profile
import behavioral.iterator.ProfileIterator
import behavioral.iterator.SocialNetwork
import behavioral.iterator.profileiterator.FacebookIterator

/**
 * Concrete aggregator
 */
class Facebook(
    cache: List<Profile>?,
) : SocialNetwork {

    val profiles: List<Profile> = cache ?: listOf()

    fun requestProfileFromFacebook(profileEmail: String): Profile? {
        // Here would be a POST request to one of the Facebook API endpoints.
        // Instead, we emulates long network connection, which you would expect
        // in the real life...
        simulateNetworkLatency()
        println("Facebook: Loading profile '$profileEmail' over the network...")

        // ...and return test data.
        return findProfile(profileEmail)
    }

    fun requestProfileFriendsFromFacebook(profileEmail: String, contactType: String): List<String>? {
        // Here would be a POST request to one of the Facebook API endpoints.
        // Instead, we emulates long network connection, which you would expect
        // in the real life...
        simulateNetworkLatency()
        println("Facebook: Loading '$contactType' list of '$profileEmail' over the network...")

        // ...and return test data.
        val profile = findProfile(profileEmail)
        return profile?.getContacts(contactType)
    }

    private fun findProfile(profileEmail: String): Profile? = profiles.firstOrNull { it.email == profileEmail }

    private fun simulateNetworkLatency() = try {
        Thread.sleep(2500)
    } catch (ex: InterruptedException) {
        ex.printStackTrace()
    }

    override fun createFriendsIterator(profileEmail: String): ProfileIterator =
        FacebookIterator(this, "friends", profileEmail)

    override fun createCoworkersIterator(profileEmail: String): ProfileIterator =
        FacebookIterator(this, "coworkers", profileEmail)
}
