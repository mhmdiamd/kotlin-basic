fun helloNew(value: String, transformer : (String) -> String) : String {
    val newName = transformer(value)
    return "Hello $newName"
}

fun main() {
    val anonymousUpper = fun(value: String): String {
        if(value.isBlank()){
            return "Ups.., data is blank"
        }

        return value.toUpperCase()
    }

    val result1 = helloNew("Ilham", anonymousUpper)

//    anonymous as parameter
    val result2 = helloNew("Darmawan", fun(value:String): String {
        if(value.isBlank()) {
            return "Ups, data is blank"
        }

        return value.toLowerCase()
    })

    println(result2)
}