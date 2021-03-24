package creational.singleton

/**
 * Singleton pattern implemented with Double-Checked Locking using Volatile.
 *
 * JDK5 and later extends the semantics for volatile so that the system will not allow a write of a volatile
 * to be reordered with respect to any previous read or write, and a read of a volatile cannot be reordered
 * with respect to any following read or write.
 */
class ParameterizedSingleton private constructor(name: String) {

    init {
        println("Parameterized singleton instantiated with $name")
    }


    companion object {
        @Volatile
        private var instance: ParameterizedSingleton? = null

        fun getInstance(name: String): ParameterizedSingleton =
            instance ?: synchronized(this) {
                instance ?: ParameterizedSingleton(name)
            }
    }
}
