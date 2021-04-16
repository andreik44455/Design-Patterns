package behavioral.iterator

/**
 * Iterator
 */
interface ProfileIterator {
    fun hasNext(): Boolean

    fun getNext(): Profile?

    fun reset()

}
