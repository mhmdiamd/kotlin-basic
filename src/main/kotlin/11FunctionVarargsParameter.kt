// Varagrs mirip seperti spreade parameter di javascript, yang mana mencerminkan bahwa parameter itu bisa lebih dari 1
fun finalValue(firstValue: Int, vararg values: Int) {
    var newValue = firstValue
    for(value in values) {
        newValue += value
    }

    newValue /= values.size
    println("Final value $newValue")
}

fun main() {

    finalValue(10, 1)
    finalValue(10, 10,10,10,10,10)

}