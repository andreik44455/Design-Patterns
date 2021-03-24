package creational.abstractfactory.checkbox

import creational.abstractfactory.Checkbox

class AndroidCheckbox : Checkbox {
    override fun draw() = println("Draw checkbox in Android style")
}
