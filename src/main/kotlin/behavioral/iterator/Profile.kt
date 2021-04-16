package behavioral.iterator


class Profile(
    val email: String,
    val name: String,
    vararg contacts: String,
) {
    private val typeToContacts: MutableMap<String, List<String>> = contacts.map {
        val (contactType, contactEmail) = it.split(":")
        contactType to contactEmail
    }.groupBy {
        it.first
    }.mapValues {
        it.value.map { p -> p.second }.toMutableList()
    }.toMutableMap()


    fun getContacts(contactType: String): List<String> = typeToContacts.getOrPut(contactType) { listOf() }
}
