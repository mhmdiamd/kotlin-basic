fun hello(value: String, transformer: (String) -> String) : String {
    return "Hello ${transformer(value)}"
}

fun main() {
    val upperTransformer = { value: String -> value.toUpperCase() }
    val lowerTransformer = { value: String -> value.toLowerCase() }
    println(hello("Ilham", upperTransformer))
    println(hello("DARMAWAN", lowerTransformer))

//    Trailing Lamda
    val result1 = hello("Ilham trailing lambda") { value: String ->
        value.toUpperCase()
    }

    println(result1)
}