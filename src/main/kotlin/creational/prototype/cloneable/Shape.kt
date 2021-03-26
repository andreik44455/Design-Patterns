package creational.prototype.cloneable

import creational.prototype.Point


/**
 * Cloneable is a marker interface and doesn't have any methods in it,
 * and we still need to implement it just to tell the JVM that we can perform clone() on our object.
 * Note, you cannot cast something to Cloneable and call the clone method,
 * because Cloneable doesn't have a public clone method and neither does Object.
 */
abstract class Shape(
    val id: Int,
    val type: String,
    var point: Point,
) : Cloneable {

    /**
     * Returns clone of an object (deep copy)
     */
    @Throws(CloneNotSupportedException::class)
    public override fun clone(): Shape {
        val clonedObj: Shape = super.clone() as Shape
        clonedObj.point = point.copy()
        return clonedObj
    }
}
