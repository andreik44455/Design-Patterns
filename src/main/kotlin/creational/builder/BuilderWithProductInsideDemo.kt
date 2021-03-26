package creational.builder

import creational.builder.withproductinstanceinside.Shop
import creational.builder.withproductinstanceinside.Vehicle

fun demoBuilderWithProductInstance() {
    println("Demo builder pattern with product instance inside:")

    val shop = Shop()

    var builder: Vehicle.VehicleBuilder = Vehicle.CarBuilder()
    shop.construct(builder)
    val car = builder.getProduct()
    print(car)

    builder = Vehicle.MotorbikeBuilder()
    shop.construct(builder)
    val motorbike = builder.getProduct()
    print(motorbike)

    println("-----END-----\n")
}
