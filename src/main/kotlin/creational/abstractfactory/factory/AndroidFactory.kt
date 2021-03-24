package creational.abstractfactory.factory

import creational.abstractfactory.AbstractFactory
import creational.abstractfactory.button.AndroidButton
import creational.abstractfactory.checkbox.AndroidCheckbox

class AndroidFactory : AbstractFactory {
    override fun createButton() = AndroidButton()
    override fun createCheckbox() = AndroidCheckbox()
}
