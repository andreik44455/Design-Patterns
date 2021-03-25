package creational.abstractfactory

import creational.abstractfactory.factory.AndroidFactory

fun demoAbstractFactoryPattern() {
    println("Demo abstract factory pattern:")

    val androidFactory = FactoryProvider.getFactory("Android")
    val androidButton = androidFactory.createButton()
    androidButton.draw()

    val iosFactory = FactoryProvider.getFactory("IOS")
    val iosCheckbox = iosFactory.createCheckbox()
    iosCheckbox.draw()

    val androidFactoryTwo = FactoryProvider.getFactoryByType<AndroidFactory>()
    val androidCheckboxTwo = androidFactoryTwo.createCheckbox()
    androidCheckboxTwo.draw()

    println("-----END-----\n")
}
