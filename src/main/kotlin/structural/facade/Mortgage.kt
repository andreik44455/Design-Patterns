package structural.facade

import structural.facade.subsystem.Bank
import structural.facade.subsystem.Credit
import structural.facade.subsystem.Loan

/**
 * Facade class
 */
class Mortgage {
    private val bank = Bank()
    private val loan = Loan()
    private val credit = Credit()

    fun isEligible(customer: Customer, amount: Int): Boolean {
        println("${customer.name} applies for $amount loan")

        val eligible = when {
            !bank.hasSufficientSavings(customer, amount)
                    || !loan.hasNoBadLoans(customer)
                    || !credit.hasGoodCredit(customer) -> false
            else -> true
        }

        return eligible
    }
}
