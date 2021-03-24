package creational.abstractfactory.factory

import creational.abstractfactory.AbstractFactory
import creational.abstractfactory.button.IosButton
import creational.abstractfactory.checkbox.IosCheckbox

class IosFactory : AbstractFactory {
    override fun createButton() = IosButton()
    override fun createCheckbox() = IosCheckbox()
}
