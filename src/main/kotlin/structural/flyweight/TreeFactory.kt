package structural.flyweight

import java.awt.Color
import java.util.HashMap

/**
 * Flyweight factory decides whether to re-use existing
 * flyweight or to create a new object.
 */
object TreeFactory {
    var treeTypes: MutableMap<String, TreeType> = HashMap()

    fun getTreeType(name: String, color: Color, otherTreeData: String?): TreeType {
        var result = treeTypes[name]
        if (result == null) {
            result = TreeType(name, color, otherTreeData!!)
            treeTypes[name] = result
        }
        return result
    }

}
