package creational.prototype.data


object RectangleCache {
    private val rectangleMap: MutableMap<Int, Rectangle> = mutableMapOf()

    fun getRectangle(rectangleId: Int): Rectangle? {
        val cachedRectangle = rectangleMap[rectangleId]
        return cachedRectangle?.copy()
    }

    fun loadCache() {
        val rectangle = Rectangle(1)
        rectangleMap[rectangle.id] = rectangle

        val rectangleTwo = Rectangle(2)
        rectangleMap[rectangleTwo.id] = rectangleTwo
    }
}
