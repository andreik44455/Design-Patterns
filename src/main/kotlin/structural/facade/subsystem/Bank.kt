package structural.facade.subsystem

import structural.facade.Customer


/**
 * Subsystem ClassA
 */
class Bank {
    fun hasSufficientSavings(c: Customer, amount: Int): Boolean {
        println("Check bank for " + c.name)
        return true
    }
}
