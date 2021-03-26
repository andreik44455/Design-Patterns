package creational

import creational.abstractfactory.demoAbstractFactoryPattern
import creational.builder.demoAllOnBuildBuilders
import creational.builder.demoBuilderWithProductInstance
import creational.factory.demoFactoryPattern
import creational.prototype.demoPrototypePattern
import creational.singleton.demoSingletonPattern

fun demoCreationalPatterns() {
    println("Demo of all creational patterns:\n")

    demoFactoryPattern()
    demoAbstractFactoryPattern()
    demoSingletonPattern()
    demoBuilderWithProductInstance()
    demoAllOnBuildBuilders()
    demoPrototypePattern()

    println("-----END PATTERNS-----\n")
}
