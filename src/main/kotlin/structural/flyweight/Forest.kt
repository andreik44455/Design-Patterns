package structural.flyweight

import structural.flyweight.TreeFactory.getTreeType
import java.awt.Color
import java.awt.Graphics
import java.util.ArrayList

import javax.swing.JFrame

/**
 * Uses flyweight class to get reference to common part of trees
 */
class Forest : JFrame() {
    private val trees: MutableList<Tree> = ArrayList()

    fun plantTree(x: Int, y: Int, name: String?, color: Color, otherTreeData: String?) {
        val type = getTreeType(name!!, color, otherTreeData)
        val tree = Tree(x, y, type)
        trees.add(tree)
    }

    override fun paint(graphics: Graphics) {
        for (tree in trees) {
            tree.draw(graphics)
        }
    }
}
