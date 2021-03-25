package creational.builder.withproductinstanceinside

class Vehicle private constructor(
    val vehicleType: String,
) {

    private val parts: MutableMap<String, String> = mutableMapOf()

    // Implementation of C#'s Indexer
    operator fun get(key: String): String? = parts[key]
    operator fun set(key: String, value: String) = parts.set(key, value)

    override fun toString(): String =
        "--------------------------\n" +
                "Vehicle type: $vehicleType\n" +
                " Frame: ${this["frame"]}\n" +
                " Engine: ${get("engine")}\n" +
                " Wheels: ${get("wheels")}\n"

    abstract class VehicleBuilder {
        protected abstract var vehicle: Vehicle

        fun getProduct(): Vehicle {
            val product = vehicle
            reset()
            return product
        }

        /**
         * Usually, after returning the end result to the client, a
         * builder instance is expected to be ready to start
         * producing another product. That's why it's a usual
         * practice to call the reset method at the end of the
         * `getProduct` method body. However, this behavior isn't
         * mandatory, and you can make your builder wait for an
         * explicit reset call from the client code before disposing
         * of the previous result.
         */
        protected abstract fun reset()
        abstract fun buildFrame()
        abstract fun buildEngine()
        abstract fun buildWheels()
    }

    class CarBuilder : VehicleBuilder() {
        override var vehicle: Vehicle = Vehicle("Car")

        override fun reset() { vehicle = Vehicle("Car") }

        override fun buildFrame() = vehicle.set("frame", "Car frame")

        override fun buildEngine() { vehicle["engine"] = "500 cc" }

        override fun buildWheels() = vehicle.set("wheels", "4")

    }

    class MotorbikeBuilder : VehicleBuilder() {
        override var vehicle: Vehicle = Vehicle("Motorbike")

        override fun reset() { vehicle = Vehicle("Motorbike") }

        override fun buildFrame() = vehicle.set("frame", "Motorbike frame")

        override fun buildEngine() = run { vehicle["engine"] = "150 cc" }

        override fun buildWheels() = vehicle.set("wheels", "2")

    }
}

/**
 * Director
 */
class Shop {
    fun construct(vehicleBuilder: Vehicle.VehicleBuilder) {
        vehicleBuilder.buildFrame()
        vehicleBuilder.buildEngine()
        vehicleBuilder.buildWheels()
    }
}
