package structural.adapter

class RectangleAPIAdapter : QuadrilateralShape {
    val rectangleAPI = RectangleAPI()

    /**
     * Adapt RectangleAPI to be displayed as clients wants by passing arguments in the right order
     */
    override fun display(x1: Point, y1: Point, x2: Point, y2: Point) {
        rectangleAPI.display(x1, x2, y1, y2)
    }
}
