package structural.flyweight

import java.awt.Graphics

/**
 * The contextual object contains the extrinsic part of the tree
 * state. An application can create billions of these since they
 * are pretty small: just two integer coordinates and one
 * reference field.
 */
class Tree(
    private val x: Int,
    private val y: Int,
    private val type: TreeType
) {
    fun draw(g: Graphics) {
        type.draw(g, x, y)
    }

}
