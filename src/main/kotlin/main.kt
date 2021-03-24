import creational.abstractfactory.FactoryProvider
import creational.abstractfactory.factory.AndroidFactory
import creational.factory.AnimalFactory
import creational.singleton.GenericSingleton
import creational.singleton.JavaSingleton
import creational.singleton.KotlinSingleton
import creational.singleton.ParameterizedSingleton

fun main(args: Array<String>) {
    // factoryPatternDemo()
    // abstractFactoryPatternDemo()
    // singletonPatternDemo()
}

fun factoryPatternDemo() {
    val cat = AnimalFactory.getAnimal("cat")!!
    cat.makeSound()

    val dog = AnimalFactory.getAnimal("Dog")!!
    dog.makeSound()

    val pig = AnimalFactory.getAnimal("Pig")!!
    pig.makeSound()
}

fun abstractFactoryPatternDemo() {
    val androidFactory = FactoryProvider.getFactory("Android")
    val androidButton = androidFactory.createButton()
    androidButton.draw()

    val iosFactory = FactoryProvider.getFactory("IOS")
    val iosCheckbox = iosFactory.createCheckbox()
    iosCheckbox.draw()

    val androidFactoryTwo = FactoryProvider.getFactoryByType<AndroidFactory>()
    val androidCheckboxTwo = androidFactoryTwo.createCheckbox()
    androidCheckboxTwo.draw()
}

fun singletonPatternDemo() {
    JavaSingleton.getInstance()
    KotlinSingleton
    ParameterizedSingleton.getInstance("Static")
    GenericSingleton.getInstance("Generic")
}
