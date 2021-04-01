package structural.decorator

import structural.decorator.clothes.Jacket
import structural.decorator.clothes.Pants

fun demoDecoratorPattern() {
    println("Demo Decorator pattern:")

    val person1: Person = Pants(Human("Andrei"))
    println(person1.dressUp())

    val person2: Person = Pants(Jacket(Human("John")))
    println(person2.dressUp())

    println("-----END-----\n")
}
