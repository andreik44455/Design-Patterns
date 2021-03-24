package creational.singleton

class JavaSingleton private constructor() {

    init {
        println("Java singleton is instantiated")
    }

    companion object {
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
