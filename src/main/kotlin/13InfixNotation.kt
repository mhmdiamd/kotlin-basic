infix fun String.to(type: String) : String{
    if(type == "Up"){
        return this.toUpperCase()
    }else {
        return this
    }
}

fun main() {
    val name: String = "Muhamad Ilham Darmawan"
    val ilhamUpper = name to "Up"
    println(ilhamUpper)
}