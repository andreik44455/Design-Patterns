package creational.builder.buildingproductonbuild


/**
 * Builder using data class and build() creates Car directly
 */
class CarWithDataBuilder private constructor(
    val vehicleType: String?,
    val frame: String,
    val engine: String,
    val wheels: String,
) {

    data class Builder(
        var vehicleType: String? = null,
        var frame: String,
        var engine: String,
        var wheels: String,
    ) {

        fun vehicleType(type: String) = apply { vehicleType = type }
        fun frame(frame: String) = apply { this.frame = frame }
        fun engine(engine: String) = apply { this.engine = engine }
        fun wheels(wheels: String) = apply { this.wheels = wheels }

        fun build() = CarWithDataBuilder(
            vehicleType,
            frame,
            engine,
            wheels,
        )
    }

    override fun toString(): String =
        "--------------------------\n" +
                "Vehicle type: $vehicleType\n" +
                " Frame: $frame\n" +
                " Engine: $engine\n" +
                " Wheels: $wheels\n"
}

/**
 * Use a secondary constructor that takes a builder and delegates to the primary constructor.
 */
class CarWithSecondaryConstructor private constructor(
    val vehicleType: String?,
    val frame: String?,
    val engine: String?,
    val wheels: String?,
) {

    private constructor(builder: Builder) : this(
        builder.vehicleType,
        builder.frame,
        builder.engine,
        builder.wheels,
    )

    /**
     * Note that in contrary to example with data class, there are no required fields for Builder
     */
    class Builder {
        var vehicleType: String? = null
            private set
        var frame: String? = null
            private set
        var engine: String? = null
            private set
        var wheels: String? = null
            private set

        fun vehicleType(type: String) = apply { this.vehicleType = type }
        fun frame(frame: String) = apply { this.frame = frame }
        fun engine(engine: String) = apply { this.engine = engine }
        fun wheels(wheels: String) = apply { this.wheels = wheels }

        fun build() = CarWithSecondaryConstructor(this)
    }

    override fun toString(): String =
        "--------------------------\n" +
                "Vehicle type: $vehicleType\n" +
                " Frame: $frame\n" +
                " Engine: $engine\n" +
                " Wheels: $wheels\n"
}

/**
 * Shortened example of the [CarWithSecondaryConstructor] using Type-safe builder
 */
class CarUsingDsl private constructor(
    val vehicleType: String?,
    val frame: String?,
    val engine: String?,
    val wheels: String?,
) {

    private constructor(builder: Builder) : this(
        builder.vehicleType,
        builder.frame,
        builder.engine,
        builder.wheels,
    )

    companion object {
        /**
         * This allows to remove build functions inside Builder and build object inside the block
         */
        inline fun build(block: Builder.() -> Unit) = Builder().apply(block).build()
    }

    class Builder {
        var vehicleType: String? = null
        var frame: String? = null
        var engine: String? = null
        var wheels: String? = null

        fun build() = CarUsingDsl(this)
    }

    override fun toString(): String =
        "--------------------------\n" +
                "Vehicle type: $vehicleType\n" +
                " Frame: $frame\n" +
                " Engine: $engine\n" +
                " Wheels: $wheels\n"
}

class CarUsingDslWithRequiredField(
    val vehicleType: String,
    val frame: String?,
    val engine: String?,
    val wheels: String?,
) {

    private constructor(builder: Builder) : this(
        builder.vehicleType,
        builder.frame,
        builder.engine,
        builder.wheels,
    )

    companion object {
        inline fun build(
            vehicleType: String, // Add required field as argument
            block: Builder.() -> Unit,
        ) = Builder(vehicleType).apply(block).build()
    }

    class Builder(
        val vehicleType: String, // required field
    ) {
        var frame: String? = null
        var engine: String? = null
        var wheels: String? = null

        fun build() = CarUsingDslWithRequiredField(this)
    }

    override fun toString(): String =
        "--------------------------\n" +
                "Vehicle type: $vehicleType\n" +
                " Frame: $frame\n" +
                " Engine: $engine\n" +
                " Wheels: $wheels\n"
}
