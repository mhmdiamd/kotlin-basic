// Label adalah penanda
//Semua expression di Kotlin bisa ditandai dengan label
//Untuk membuat label di Kotlin, cukup menggunakan nama label lalu diikuti dengan karakter @

fun main() {
    loopI@ for(i in 0..10){
        loopJ@ for(j in 0..10){
            println("$i x $j = ${i * j}")
        }
    }
}