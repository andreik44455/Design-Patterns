package creational.prototype.serializable.shape

import creational.prototype.Point
import creational.prototype.serializable.Shape
import kotlinx.serialization.Serializable

@Serializable
class Triangle(override val id: Int) : Shape("Triangle", Point(1, 1))
