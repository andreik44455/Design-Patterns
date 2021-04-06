package structural.adapter

/**
 * Rectangle class from some API
 */
class RectangleAPI {

    /**
     * x1 is lower left, x2 is lower right, y1 is upper left, y2 is upper right
     */
    fun display(x1: Point, x2: Point, y1: Point, y2: Point) {
        println("Displaying rectangle API with points at: \n" +
                "x1: $x1, " +
                "y1: $y1, " +
                "x2: $x2, " +
                "y2: $y2")
    }
}
