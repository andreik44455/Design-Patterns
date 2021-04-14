package behavioral.command.order

import behavioral.command.Order
import behavioral.command.Stock

/**
 * Concrete command
 */
class SellStock(private val abcStock: Stock) : Order {
    override fun execute() {
        abcStock.sell()
    }
}
