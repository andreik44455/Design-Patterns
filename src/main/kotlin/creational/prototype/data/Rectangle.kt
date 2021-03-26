package creational.prototype.data

import creational.prototype.Point


data class Rectangle(
    val id: Int,
    val type: String = "Rectangle",
    var point: Point = Point(1, 1),
)
