package structural.composite

/**
 * Acts as composite pattern actor class.
 * Used to add build hierarchy of employees.
 */
abstract class Employee(
    val id: Int,
    val name: String,
    val salary: Double,
) {
    // ----- composite methods -----

    val subordinates: MutableList<Employee> = mutableListOf()

    fun add(employee: Employee) {
        subordinates.add(employee)
    }

    fun remove(employee: Employee) {
        subordinates.remove(employee)
    }

    // operation
    override fun toString(): String = "${javaClass.canonicalName.toLowerCase()}(Id = $id, Name = $name, Salary = $salary)"
}
