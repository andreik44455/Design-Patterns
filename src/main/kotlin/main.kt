import creational.factory.AnimalFactory

fun main(args: Array<String>) {
    // factoryPatternDemo()
}

fun factoryPatternDemo() {
    val cat = AnimalFactory.getAnimal("cat")!!
    cat.makeSound()

    val dog = AnimalFactory.getAnimal("Dog")!!
    dog.makeSound()

    val pig = AnimalFactory.getAnimal("Pig")!!
    pig.makeSound()
}