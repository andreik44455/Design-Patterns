package structural.bridge

import structural.bridge.device.Radio
import structural.bridge.device.Tv

fun demoBridgePattern() {
    println("Demo Bridge pattern:\n")

    val tv = Tv()
    var remote = RemoteControl(tv)
    remote.togglePower()

    val radio = Radio()
    remote = AdvancedRemoteControl(radio)
    remote.mute()

    println("-----END-----\n")
}
