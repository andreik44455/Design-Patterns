package behavioral.iterator

import behavioral.iterator.socialnetwork.Facebook

fun demoIteratorPattern() {
    println("Demo Iterator pattern:\n")

    val network: SocialNetwork = Facebook(createTestProfiles())
    val spammer = SocialSpammer(network)
    spammer.sendSpamToFriends("and.kor@bing.com",
        "Hey! This is Anna's friend Josh. Can you do me a favor and like this post [link]?")
    spammer.sendSpamToCoworkers("and.kor@bing.com",
        "Hey! This is Anna's boss Jason. Anna told me you would be interested in [link].")

    println("-----END-----")
}

private fun createTestProfiles(): List<Profile> {
    val data: MutableList<Profile> = mutableListOf()
    data.add(Profile("and.kor@bing.com",
        "Anna Smith",
        "friends:dm@gmail.com",
        "friends:catwoman@yahoo.com",
        "coworkers:sam@amazon.com"))
    data.add(Profile("dm@gmail.com", "Maximilian", "friends:and.kor@bing.com", "coworkers:sam@amazon.com"))
    data.add(Profile("bill@microsoft.eu", "Billie", "coworkers:avanger@ukr.net"))
    data.add(Profile("avanger@ukr.net", "John Day", "coworkers:bill@microsoft.eu"))
    data.add(Profile("sam@amazon.com",
        "Sam Kitting",
        "coworkers:and.kor@bing.com",
        "coworkers:dm@gmail.com",
        "friends:catwoman@yahoo.com"))
    data.add(Profile("catwoman@yahoo.com", "Liza", "friends:and.kor@bing.com", "friends:sam@amazon.com"))
    return data
}
