package structural.flyweight

import java.awt.Color
import kotlin.math.floor

fun demoFlyweightPattern() {
    println("Demo Flyweight pattern:\n")

    val canvasSize = 500
    val treesToDraw = 1000000
    val treeTypes = 2

    val forest = Forest()

    var i = 0
    while (i < floor((treesToDraw / treeTypes).toDouble())) {
        forest.plantTree(random(0, canvasSize), random(0, canvasSize),
            "Summer Oak", Color.GREEN, "Oak texture stub")
        forest.plantTree(random(0, canvasSize), random(0, canvasSize),
            "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub")
        i++
    }

    forest.setSize(canvasSize, canvasSize)
    forest.isVisible = true

    println("$treesToDraw trees drawn")
    println("---------------------")
    println("Memory usage:")
    println("Tree size (8 bytes) * $treesToDraw")
    println("+ TreeTypes size (~30 bytes) * $treeTypes")
    println("---------------------")
    println("Total: " + (treesToDraw * 8 + treeTypes * 30) / 1024 / 1024 +
            "MB (instead of " + treesToDraw * 38 / 1024 / 1024 + "MB)")

    println("-----END-----")
}

private fun random(min: Int, max: Int): Int {
    return min + (Math.random() * (max - min + 1)).toInt()
}
