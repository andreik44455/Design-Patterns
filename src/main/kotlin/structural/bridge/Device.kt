package structural.bridge

/**
 * The "implementation" (from GoF book) interface declares methods common to all
 * concrete implementation classes. It doesn't have to match the
 * abstraction's interface. In fact, the two interfaces can be
 * entirely different. Typically the implementation interface
 * provides only primitive operations, while the abstraction
 * defines higher-level operations based on those primitives.
 */
interface Device {
    val isEnabled: Boolean

    fun enable()
    fun disable()

    var volume: Int

    var channel: Int
}
