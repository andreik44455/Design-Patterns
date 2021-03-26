package creational.prototype.copyconstructor

import creational.prototype.copyconstructor.shape.Rectangle
import creational.prototype.copyconstructor.shape.Triangle


object ShapeCache {
    private val shapeMap: MutableMap<Int, Shape> = mutableMapOf()

    fun getShape(shapeId: Int): Shape? {
        val cachedShape = shapeMap[shapeId]
        return cachedShape?.copy()
    }

    fun loadCache() {
        val rectangle = Rectangle(1)
        shapeMap[rectangle.id] = rectangle

        val triangle = Triangle(2)
        shapeMap[triangle.id] = triangle
    }
}
