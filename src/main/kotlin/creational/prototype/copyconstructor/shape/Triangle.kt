package creational.prototype.copyconstructor.shape

import creational.prototype.Point
import creational.prototype.copyconstructor.Shape


class Triangle : Shape {

    constructor(id: Int) : super(id, "Triangle", Point(1,1))

    constructor(triangle: Triangle) : super(triangle)

    override fun copy() = Triangle(this)

}
