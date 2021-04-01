package structural.composite

import structural.composite.employee.BankManager

import structural.composite.employee.Accountant




fun demoCompositePattern() {
    println("Demo Composite pattern:\n")

    val emp1 = Accountant(103, "Andrei K", 30000.0)
    val emp2 = Accountant(101, "Arnold S", 35000.0)
    val headAccountant1 = Accountant(105, "Sophia L", 55000.0)
    val headAccountant2 = Accountant(106, "Luke W", 45000.0)
    val manager = BankManager(100, "John Smith", 100000.0)

    headAccountant1.add(emp1)
    headAccountant1.add(emp2)
    manager.add(headAccountant1)
    manager.add(headAccountant2)

    println(manager)
    manager.subordinates.forEach {
        println("  Head $it")
        println("    ${it.subordinates}")
    }

    println("-----END-----\n")
}
