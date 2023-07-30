// Saat menandai bahwa function adalah inline, maka secara otomatis semua parameter akan menjadi inline
//Jika kita ingin memberi tahu bahwa jangan melakukan inline terhadap parameter, kita bisa menandai parameter tersebut dengan kata kunci noinline

inline fun hello(
    firstName : () -> String,
    noinline lastName: () -> String
): String {

    return "Hello ${firstName()} ${lastName()}"
}

fun main() {
    println(hello({"Muhamad"}, {"Ilham"}))
}