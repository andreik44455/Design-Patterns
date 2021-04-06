package structural

import structural.adapter.demoAdapterPattern
import structural.bridge.demoBridgePattern
import structural.composite.demoCompositePattern
import structural.decorator.demoDecoratorPattern
import structural.facade.demoFacadePattern
import structural.flyweight.demoFlyweightPattern
import structural.proxy.demoProxyPattern

fun demoStructuralPatterns() {
    println("Demo of all structural patterns:\n")

    demoAdapterPattern()
    demoBridgePattern()
    demoCompositePattern()
    demoDecoratorPattern()
    demoFacadePattern()
    demoFlyweightPattern()
    demoProxyPattern()

    println("-----END PATTERNS-----")
}
