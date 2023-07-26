fun sayName(firstName: String, middleName: String, lastName: String): String{
    return "$firstName $middleName $lastName"
}


fun main() {
    val myName = sayName(
        lastName = "Darmawan",
        firstName = "ILham",
        middleName = "Darmawan"
    )

    println(myName)
}