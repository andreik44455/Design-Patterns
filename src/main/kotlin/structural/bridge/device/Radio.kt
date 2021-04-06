package structural.bridge.device

import structural.bridge.Device

class Radio : Device {

    override var volume: Int = 10
        set(value) {
            field = value
            println("Radio's volume is set to $field")
        }

    override var channel: Int = 1

    override var isEnabled = false
        private set

    override fun enable() {
        isEnabled = true
        println("Radio is switched on")
    }

    override fun disable() {
        isEnabled = false
        println("TV is switched off")
    }

}
