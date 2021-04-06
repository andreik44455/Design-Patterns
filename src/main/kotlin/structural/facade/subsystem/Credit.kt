package structural.facade.subsystem

import structural.facade.Customer

/**
 * Subsystem ClassB
 */
class Credit {
    fun hasGoodCredit(c: Customer): Boolean {
        println("Check credit for " + c.name)
        return true
    }
}
