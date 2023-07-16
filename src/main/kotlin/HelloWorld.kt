
/*
Functions that are not inside a class are called top-level functions, it's also a way to declare a static method as it was Java
For example: this main function is a top-level function
 */
fun main(args: Array<String>) {
    println("Hello World")
    var myName = "Joe"
    myName = "Carlos"
    myName = "Paul"
    println("My name is $myName")

    val myList = mutableListOf<Int>()
    myList.add(0)
    myList.add(1)
    myList.add(2)
    myList.add(3)
    println("My val list is : $myList")

    val employee1 = Employee("Paul", 123)
    employee1.name = "Paulo"
    println("My val employee1 is : $employee1")

    val employee2 = Employee("Joe", 124)
    val employee3 = Employee("Joe", 124)
    println("Structural equality : ${employee2 == employee3}")     // structural equality
    println("Referential equality : ${employee2 === employee3}")    // referential equality

    println("Structural diff : ${employee1 != employee2}")     // structural diff
    println("Referential diff : ${employee2 !== employee3}")    // referential diff
    println("Structural diff : ${employee2 != employee3}")     // structural diff

}

data class Employee(var name: String, val id: Int)