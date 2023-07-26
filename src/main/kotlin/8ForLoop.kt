fun main(){
    val arrayNumber : Array<Int> = arrayOf(1,2,3,4,5)

    for(data in arrayNumber) {
        println(data)
    }

    val rangeNumber = 1..1000
    val rangeNumberInverse = 1000 downTo 0
    val rangeNumberInverseWithStep = 1000 downTo 0 step 5

    for(data in rangeNumber){
        println(data)
    }

    for(data in rangeNumberInverse){
        println(data)
    }

    for(data in rangeNumberInverseWithStep){
        println(data)
    }
}