package structural.adapter

class Rectangle : QuadrilateralShape {

    override fun display(x1: Point, y1: Point, x2: Point, y2: Point) {
        println("Displaying rectangle with points at: \n" +
                "x1: $x1, " +
                "y1: $y1, " +
                "x2: $x2, " +
                "y2: $y2")
    }
}
