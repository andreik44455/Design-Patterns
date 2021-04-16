package behavioral.mediator


fun demoMediatorPattern() {
    println("Demo Mediator pattern:\n")

    val user1 = User("Chuck")
    val user2 = User("David")

    user1.sendMessage("Hi! David!")
    user2.sendMessage("Hello! Chuck!")

    println("-----END-----")
}
