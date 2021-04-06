package structural.adapter

interface QuadrilateralShape {

    /**
     * x1 is lower left, y1 is upper left, x2 is lower right and y2 is upper right point
     */
    fun display(x1: Point, y1: Point, x2: Point, y2: Point)
}
