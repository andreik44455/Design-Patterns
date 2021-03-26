package creational.prototype.serializable

import creational.prototype.Point
import creational.prototype.serializable.shape.Rectangle
import creational.prototype.serializable.shape.Triangle
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import kotlinx.serialization.modules.subclass

@Serializable
abstract class Shape(
    @SerialName("shapeType")
    val type: String,
    var point: Point,
) {
    /**
     * Have to make id abstract as subclasses can't be serialized otherwise, because IDE give the following error:
     * "This class is not serializable automatically because it has primary constructor parameters
     * that are not properties"
     */
    abstract val id: Int

    fun clone(): Shape {
        val json = Json { serializersModule = module }
        val jsonStr = json.encodeToString(this)
        return json.decodeFromString(jsonStr)
    }
}

private val module = SerializersModule {
    polymorphic(Shape::class) {
       subclass(Rectangle::class)
       subclass(Triangle::class)
    }
}
