package structural.composite

abstract class Employee(
    val id: Int,
    val name: String,
    val salary: Double,
) {

    val subordinates: MutableList<Employee> = mutableListOf()


    fun add(employee: Employee) {
        subordinates.add(employee)
    }

    fun remove(employee: Employee) {
        subordinates.remove(employee)
    }

    override fun toString(): String = "${javaClass.canonicalName.toLowerCase()}(Id = $id, Name = $name, Salary = $salary)"
}
