package creational.singleton

/**
 * Implements Singleton pattern as in Java
 */
class JavaSingleton private constructor() {

    init {
        println("Java singleton is instantiated")
    }

    companion object {
        @Volatile
        private var instance: JavaSingleton? = null

        fun getInstance(): JavaSingleton? {
            if (instance == null) {
                synchronized(JavaSingleton::class) {
                    if (instance == null) {
                        instance = JavaSingleton()
                    }
                }
            }
            return instance
        }
    }
}
