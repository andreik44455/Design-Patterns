package structural.facade

fun demoFacadePattern() {
    println("Demo Facade pattern:\n")

    // Facade
    val mortgage = Mortgage()

    // Evaluate mortgage eligibility for customer
    val customer = Customer("Andrei K")
    val eligible = mortgage.isEligible(customer, 125000)

    println("${customer.name} has been ${if (eligible) "Approved" else "Rejected"}")

    println("-----END-----")
}
