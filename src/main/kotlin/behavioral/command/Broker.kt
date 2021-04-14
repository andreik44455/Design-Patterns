package behavioral.command

/**
 * Invoker (sender)
 */
class Broker {
    private val orderList: MutableList<Order> = mutableListOf()

    fun takeOrder(order: Order) {
        orderList.add(order)
    }

    fun placeOrders() {
        for (order in orderList) {
            order.execute()
        }
        orderList.clear()
    }
}
