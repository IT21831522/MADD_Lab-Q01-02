abstract class Person(val name: String, val age: Int) {
    abstract fun display()
}

open class Employee(name: String, age: Int, val department: String) : Person(name, age) {
    override fun display() {
        println("$name ($age) - Dept: $department")
    }
}

class TemporaryStaff(name: String, age: Int, department: String, val contractMonths: Int)
    : Employee(name, age, department) {
    override fun display() {
        println("$name ($age) - Dept: $department, Contract: $contractMonths months")
    }
}

interface Shape {
    fun setup()
    fun draw()
}

class Circle : Shape {
    override fun setup() = println("Circle setup done.")
    override fun draw() = println("Drawing Circle.")
}

class Square : Shape {
    override fun setup() = println("Square setup done.")
    override fun draw() = println("Drawing Square.")
}

fun main() {
    val emp = Employee("Ravi", 40, "HR")
    val temp = TemporaryStaff("Kamal", 28, "IT", 6)
    emp.display()
    temp.display()

    val circle: Shape = Circle()
    circle.setup()
    circle.draw()

    val square: Shape = Square()
    square.setup()
    square.draw()
}