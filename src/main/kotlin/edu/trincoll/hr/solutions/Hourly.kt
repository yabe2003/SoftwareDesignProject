package edu.trincoll.hr.solutions

class Hourly(
    name: String,
    id: Int,
    val rate: Double,
    val hours: Double = 80.0
) : Employee(name, id) {

    override fun pay(): Double = rate * hours

    override fun toString(): String {
        return "Hourly(name=$name, id=$id, rate=$rate, hours=$hours)"
    }
}