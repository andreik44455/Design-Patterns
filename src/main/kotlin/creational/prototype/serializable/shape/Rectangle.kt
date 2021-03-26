package creational.prototype.serializable.shape

import creational.prototype.Point
import creational.prototype.serializable.Shape
import kotlinx.serialization.Serializable

@Serializable
class Rectangle(override val id: Int) : Shape("Rectangle", Point(1,1))
