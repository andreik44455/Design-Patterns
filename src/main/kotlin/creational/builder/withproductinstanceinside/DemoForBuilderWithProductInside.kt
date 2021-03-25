package creational.builder.withproductinstanceinside

fun demoBuilderWithProductInstance() {
    val shop = Shop()

    var builder: Vehicle.VehicleBuilder = Vehicle.CarBuilder()
    shop.construct(builder)
    val car = builder.getProduct()
    print(car)

    builder = Vehicle.MotorbikeBuilder()
    shop.construct(builder)
    val motorbike = builder.getProduct()
    print(motorbike)
}
