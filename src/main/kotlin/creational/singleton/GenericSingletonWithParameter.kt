package creational.singleton

/**
 * Generic solution for Singleton pattern that can be used with a companion object extending this class.
 *
 * Look at [ParameterizedSingleton] which has a static (non generic) implementation.
 */
open class SingletonHolderExplicit<out T : Any, in A>(creator: (A) -> T) {

    /** Reference to the constructor of target class which is used for instantiating an instance. */
    private var creator: ((A) -> T)? = creator

    @Volatile
    private var instance: T? = null

    fun getInstance(arg: A): T {
        val checkInstance = instance

        if (checkInstance != null) {
            return checkInstance
        }

        // synchronized block to eliminate possibility of race condition in multi-threaded environments.
        return synchronized(this) {
            val checkInstanceAgain = instance
            if (checkInstanceAgain != null) {
                checkInstanceAgain
            } else {
                val created = creator!!(arg)
                instance = created
                creator = null
                created
            }
        }
    }
}

/**
 * Implicit way to write generic solution for SingletonPattern
 */
open class SingletonHolder<out T, in A>(private val constructor: (A) -> T) {

    @Volatile
    private var instance: T? = null

    fun getInstance(arg: A): T =
        instance ?: synchronized(this) {
           instance ?: constructor(arg)
        }
}

class GenericSingleton private constructor(name: String) {

    init {
        println("Instantiated generic singleton with $name")
    }

    companion object : SingletonHolder<GenericSingleton, String>(::GenericSingleton)
}
