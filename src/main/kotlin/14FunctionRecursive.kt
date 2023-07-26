fun recursiveFuctionLoop(value : Int): Int {
    return when(value) {
        1 -> 1
        else -> value * recursiveFuctionLoop(value - 1)
    }
}

fun main() {
    println(recursiveFuctionLoop(5))
}