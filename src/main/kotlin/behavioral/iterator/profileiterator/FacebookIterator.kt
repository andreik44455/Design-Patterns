package behavioral.iterator.profileiterator

import behavioral.iterator.Profile
import behavioral.iterator.ProfileIterator
import behavioral.iterator.socialnetwork.Facebook

/**
 * Concrete Iterator
 */
class FacebookIterator(
    private val facebook: Facebook,
    private val type: String,
    private val email: String,
) : ProfileIterator {
    private var currentPosition = 0
    private val emails: List<String> by lazy {
        val profiles = facebook.requestProfileFriendsFromFacebook(email, type)
        val _emails = mutableListOf<String>()
        for (profile in profiles!!) {
            _emails.add(profile)
            this.profiles.add(null)
        }
        _emails
    }

    private val profiles: MutableList<Profile?> = ArrayList()


    override fun hasNext(): Boolean = currentPosition < emails.size

    override fun getNext(): Profile? {
        if (!hasNext()) {
            return null
        }

        val friendEmail = emails[currentPosition]
        var friendProfile = profiles[currentPosition]

        if (friendProfile == null) {
            friendProfile = facebook.requestProfileFromFacebook(friendEmail)
            profiles[currentPosition] = friendProfile
        }
        currentPosition++

        return friendProfile!!
    }

    override fun reset() {
        currentPosition = 0
    }
}
