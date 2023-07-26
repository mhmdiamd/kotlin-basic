fun main() {
//    Biasanya when expression digunakan untuk melakukan pengecekan ke kondisi dalam satu variable

    val finalExam: String = "A"
    val pasValue: Array<String> = arrayOf("A","B","C")

    when(finalExam) {
        "A" -> println("Amazing")
        "B" -> println("that's Normal")
        "C" -> println("Bad")
        else -> println("Verry bad")
    }

//    Multiple condition using when
    when(finalExam) {
        "A","B","C" -> println("Amazing")
        else -> {
            println("Sorry your exam is not registred")
        }
    }

//    When using "in"
    when(finalExam) {
//        melakukan pengeCheckan apkah data exam terdapat di dalam array pasValue
        in pasValue -> println("Exam Registred in array")
        !in pasValue -> println("Exam is not registred in array pas value")
    }

//    When using "is"
    when(finalExam){
//        Melakukan pengecekan type data dari varible finalExam
        is String -> println("This is string")
        !is String -> println("This is not string")
    }

}