// Declare a constant variable
const val PI = 3.14159

// Declare a variable
var radius: Double = 5.0

// Calculate the area of a circle
val area = PI * radius * radius

// Print the result to the console
println("The area of the circle is $area")

// Create a class
class Person(val name: String, var age: Int)

// Create an instance of the class
val person = Person("John", 30)

// Access properties of the instance
println("Name: ${person.name}")
println("Age: ${person.age}")

// Create a function with a return value
fun addNumbers(a: Int, b: Int): Int {
    return a + b
}

// Call the function and print the result
val sum = addNumbers(5, 10)
println("Sum: $sum")

// Use a conditional statement
val x = 5
if (x < 10) {
    println("x is less than 10")
} else {
    println("x is greater than or equal to 10")
}

// Use a loop to iterate through a range of numbers
for (i in 1..10) {
    println(i)
}
