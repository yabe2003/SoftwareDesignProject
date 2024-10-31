package edu.trincoll.hr.solutions

class Salaried(
    name: String,
    id: Int,
    val salary: Double
) : Employee(name, id) {

    override fun pay(): Double {
        return salary / 26.0
    }

    override fun toString(): String = "Salaried(name=$name, id=$id, salary=$salary)"
}