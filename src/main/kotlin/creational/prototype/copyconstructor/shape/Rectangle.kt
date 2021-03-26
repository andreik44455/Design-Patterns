package creational.prototype.copyconstructor.shape

import creational.prototype.Point
import creational.prototype.copyconstructor.Shape


class Rectangle : Shape {

    constructor(id: Int) : super(id, "Triangle", Point(1,1))

    constructor(rectangle: Rectangle) : super(rectangle)

    override fun copy() = Rectangle(this)

}
