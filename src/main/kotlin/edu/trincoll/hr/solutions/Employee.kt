package edu.trincoll.hr.solutions

abstract class Employee(
    val name: String,
    val id: Int
) : Comparable<Employee> {

    abstract fun pay(): Double

    override fun compareTo(other: Employee) = 
        compareValuesBy(this, other, { it.pay() }, { it.name }, { it.id })

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }
}