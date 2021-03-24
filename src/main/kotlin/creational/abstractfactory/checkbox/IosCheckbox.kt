package creational.abstractfactory.checkbox

import creational.abstractfactory.Checkbox

class IosCheckbox : Checkbox {
    override fun draw() = println("Draw checkbox in IOS style")
}
