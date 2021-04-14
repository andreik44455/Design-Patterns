package behavioral

import behavioral.chainofresp.demoChainOfRespPattern
import behavioral.command.demoCommandPattern

fun demoBehavioralPatterns() {
    println("Demo of all creational patterns:\n")

    demoChainOfRespPattern()
    demoCommandPattern()

    println("-----END PATTERNS-----\n")
}
