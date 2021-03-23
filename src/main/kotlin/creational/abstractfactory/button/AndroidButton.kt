package creational.abstractfactory.button

import creational.abstractfactory.Button

class AndroidButton : Button {
    override fun draw() = println("Draw button in Android style")
}
