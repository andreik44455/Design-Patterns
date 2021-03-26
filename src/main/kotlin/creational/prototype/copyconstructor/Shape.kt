package creational.prototype.copyconstructor

import creational.prototype.Point


abstract class Shape(
    val id: Int,
    val type: String,
    var point: Point,
) {

    /**
     * If the Java class has mutable fields, then we can instead make a deep copy inside its copy constructor.
     * With a deep copy, the newly created object is independent of the original one
     * because we create a distinct copy of each mutable object:
     */
    constructor(
        shape: Shape,
        isShallowCopy: Boolean = false, // DON'T use it like this in production, choose either shallow or deep copy
    ) : this(
        shape.id,
        shape.type,
        if (isShallowCopy) shape.point else Point(shape.point.x, shape.point.y)
    )

    abstract fun copy(): Shape
}
