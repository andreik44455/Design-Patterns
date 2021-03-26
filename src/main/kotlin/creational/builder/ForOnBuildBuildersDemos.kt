package creational.builder

import creational.builder.buildingproductonbuild.CarUsingDsl
import creational.builder.buildingproductonbuild.CarUsingDslWithRequiredField
import creational.builder.buildingproductonbuild.CarWithDataBuilder
import creational.builder.buildingproductonbuild.CarWithSecondaryConstructor

fun demoAllOnBuildBuilders() {
    println("Demo all builders with build() method:")

    demoCarWithDataBuilder()
    demoCarWithSecondaryConstructor()
    demoCarUsingDsl()
    demoCarWithDataBuilder()
    demoCarUsingDslWithRequiredField()

    println("-----END-----\n")
}

fun demoCarWithDataBuilder() {
    println("Builder pattern with Builder using Data class:")

    val minivan = CarWithDataBuilder.Builder(
        frame = "Minivan",
        engine = "350 cc",
        wheels = "6",
    ).build()

    println(minivan)
}

fun demoCarWithSecondaryConstructor() {
    println("Builder pattern with secondary constructor:")

    val supercar = CarWithSecondaryConstructor.Builder()
        .vehicleType("Ferrari")
        .frame("supercar")
        .engine("1500 cc")
        .wheels("4")
        .build()

    println(supercar)
}

fun demoCarUsingDsl() {
    println("Builder pattern using DSL")

    val car = CarUsingDsl.build {
        frame = "Car frame"
        engine = "500 cc"
        wheels = "4"
    }

    println(car)
}

fun demoCarUsingDslWithRequiredField() {
    println("Builder pattern using DSL with required field")

    val car = CarUsingDslWithRequiredField.build(vehicleType = "Car") {
        frame = "Car frame"
        engine = "500 cc"
        wheels = "4"
    }

    println(car)
}
