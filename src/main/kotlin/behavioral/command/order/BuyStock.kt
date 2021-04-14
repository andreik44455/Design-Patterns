package behavioral.command.order

import behavioral.command.Order
import behavioral.command.Stock

/**
 * Concrete command
 */
class BuyStock(private val abcStock: Stock) : Order {
    override fun execute() {
        abcStock.buy()
    }
}
