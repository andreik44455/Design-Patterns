package creational.factory

fun demoFactoryPattern() {
    println("Demo factory pattern:")

    val cat = AnimalFactory.getAnimal("cat")!!
    cat.makeSound()

    val dog = AnimalFactory.getAnimal("Dog")!!
    dog.makeSound()

    val pig = AnimalFactory.getAnimal("Pig")!!
    pig.makeSound()

    println("-----END-----\n")
}
