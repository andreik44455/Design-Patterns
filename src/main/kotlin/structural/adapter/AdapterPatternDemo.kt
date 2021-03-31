package structural.adapter

fun demoAdapterPattern() {
    println("Demo Adapter pattern:")

    // RectangleAPI isn't of type QuadrilateralShape. Hence, we need to use its adapter
    val shapes = listOf(Rectangle(), RectangleAPIAdapter())

    shapes.forEach {
        it.display(
            Point(1, 1),
            Point(1, 2),
            Point(4, 1),
            Point(4, 2),
        )
    }

    println("-----END-----\n")
}
