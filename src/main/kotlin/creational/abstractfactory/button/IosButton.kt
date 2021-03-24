package creational.abstractfactory.button

import creational.abstractfactory.Button

class IosButton : Button {
    override fun draw() = println("Draw button in IOS style")
}
