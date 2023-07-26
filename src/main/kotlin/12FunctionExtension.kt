//Extension function adalah kemampuan menambahkan function pada tipe data yang sudah ada

fun String.hello(): String{
    return "Hello $this"
//    "This" berfungsi untuk memanggil value yang di assign pada function ini
}

fun main() {
    val name:String = "Ilham"
    val helloName = name.hello()
    println(helloName)
}