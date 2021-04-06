package structural.bridge

/**
 * The "abstraction" (from GoF book) defines the interface for the "control"
 * part of the two class hierarchies. It maintains a reference
 * to an object of the "implementation" hierarchy and delegates
 * all of the real work to this object.
 */
open class RemoteControl(
    protected val device: Device // implementor
) {

    fun togglePower() {
        if (device.isEnabled)
            device.disable()
        else
            device.enable()
    }

    fun volumeDown() = run { device.volume -= 10 }
    fun volumeUp() = run {device.volume += 10 }
    fun channelDown() = run { device.channel -= 1 }
    fun channelUp() = run { device.channel += 1 }
}

// You can extend classes from the abstraction hierarchy
// independently from device classes.
class AdvancedRemoteControl(device: Device) : RemoteControl(device) {
    fun mute() = run { device.volume = 0 }
}
