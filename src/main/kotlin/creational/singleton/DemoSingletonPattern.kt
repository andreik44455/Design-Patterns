package creational.singleton

fun demoSingletonPattern() {
    println("Demo singleton pattern:")

    JavaSingleton.getInstance()
    KotlinSingleton
    ParameterizedSingleton.getInstance("Static")
    GenericSingleton.getInstance("Generic")

    println("-----END-----\n")
}
