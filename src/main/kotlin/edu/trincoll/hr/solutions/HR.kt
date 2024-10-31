package edu.trincoll.hr.solutions

class HR(
    private val employees: List<Employee> = emptyList()
) {

    fun hire(employee: Employee): HR {
        return HR(employees + employee)
    }

    fun fire(id: Int): HR {
        return HR(employees.filter { it.id != id })
    }

    fun payEmployees(): Double = employees.sumOf { it.pay() }

    fun findEmployee(id: Int): Employee? = employees.find { it.id == id }

    fun listEmployees(): List<Employee> = employees.toList()

    fun countEmployees(): Int = employees.size

    fun totalSalaryExpense(): Double = employees.sumOf { it.pay() }

    fun averageSalary(): Double {
        return if (employees.isNotEmpty()) totalSalaryExpense() / employees.size else 0.0
    }

    fun employeesByType(): Map<String, List<Employee>> {
        return employees.groupBy { it::class.simpleName ?: "Unknown" }
    }

    fun highestPaidEmployee(): Employee? = employees.maxByOrNull { it.pay() }
}