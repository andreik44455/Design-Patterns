package structural.facade.subsystem

import structural.facade.Customer

/**
 * Subsystem ClassB
 */
class Loan {
    fun hasNoBadLoans(c: Customer): Boolean {
        println("Check loans for " + c.name)
        return true
    }
}
