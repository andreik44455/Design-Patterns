package creational.prototype

import creational.prototype.cloneable.ShapeCache.getShape
import creational.prototype.cloneable.ShapeCache.loadCache
import creational.prototype.data.RectangleCache.getRectangle
import creational.prototype.data.RectangleCache.loadCache as loadRectangleCache
import creational.prototype.serializable.ShapeCache.loadCache as loadSerializableCache
import creational.prototype.copyconstructor.ShapeCache.loadCache as loadCopyConstructorCache
import creational.prototype.serializable.ShapeCache.getShape as getSerializableShape
import creational.prototype.copyconstructor.ShapeCache.getShape as getCopyConstructorShape


fun demoPrototypePattern() {
    println("Demo all prototype pattern examples:")

    demoPrototypePatternWithCloneable()
    demoPrototypePatternWithCopyConstructor()
    demoPrototypePatternWithKotlinDataClass()
    demoPrototypePatternWithSerialization()

    println("-----END-----\n")
}

fun demoPrototypePatternWithCloneable() {
    println("\nDemo prototype pattern implemented using Cloneable:")

    loadCache()

    val rectangle = getShape(1)!!
    println("1st shape: " + rectangle.type)
    println("1st point: " + rectangle.point)

    rectangle.point.x = 2
    rectangle.point.y = 2
    println("1st point after update: " + rectangle.point)

    val theSameRectangle = getShape(1)
    println("1st rectangle stays the same after update on copy: ${theSameRectangle!!.point}")

    println("2nd Shape: " + getShape(2)!!.type)
}

fun demoPrototypePatternWithCopyConstructor() {
    println("\nDemo prototype pattern implemented using copy constructor:")

    loadCopyConstructorCache()

    val rectangle = getCopyConstructorShape(1)!!
    println("1st shape: " + rectangle.type)
    println("1st point: " + rectangle.point)

    rectangle.point.x = 2
    rectangle.point.y = 2
    println("1st point after update: " + rectangle.point)

    val theSameRectangle = getCopyConstructorShape(1)
    println("1st rectangle stays the same after update on copy: ${theSameRectangle!!.point}")

    println("2nd Shape: " + getCopyConstructorShape(2)!!.type)
}

fun demoPrototypePatternWithKotlinDataClass() {
    println("\nDemo prototype pattern implemented using Kotlin's data class:")

    loadRectangleCache()

    val rectangle = getRectangle(1)!!
    println("1st rectangle: " + rectangle.type)
    println("1st point: " + rectangle.point)

    rectangle.point.x = 2
    rectangle.point.y = 2
    println("1st point after update: " + rectangle.point)

    val theSameRectangle = getRectangle(1)
    println("1st rectangle DOES NOT stay the same after update on copy: ${theSameRectangle!!.point}")


    println("2nd rectangle: " + getRectangle(2)!!.type)
}


fun demoPrototypePatternWithSerialization() {
    println("\nDemo prototype pattern implemented using serialization:")

    loadSerializableCache()

    val rectangle = getSerializableShape(1)!!
    println("1st shape: " + rectangle.type)
    println("1st point: " + rectangle.point)

    rectangle.point.x = 2
    rectangle.point.y = 2
    println("1st point after update: " + rectangle.point)

    val theSameRectangle = getSerializableShape(1)
    println("1st rectangle stays the same after update on copy: ${theSameRectangle!!.point}")

    println("2nd Shape: " + getSerializableShape(2)!!.type)
}
