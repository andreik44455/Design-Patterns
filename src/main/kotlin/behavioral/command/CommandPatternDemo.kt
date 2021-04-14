package behavioral.command

import behavioral.command.order.BuyStock
import behavioral.command.order.SellStock


fun demoCommandPattern() {
    println("Demo Command pattern:\n")

    val abcStock = Stock()

    val buyStockOrder = BuyStock(abcStock)
    val sellStockOrder = SellStock(abcStock)

    val broker = Broker()
    broker.takeOrder(buyStockOrder)
    broker.takeOrder(sellStockOrder)

    broker.placeOrders()

    println("-----END-----\n")
}
