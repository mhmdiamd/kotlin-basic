// Salah satu kegunaan label adalah, bisa diintegrasikan dengan break, continue dan return
//Biasanya break, continue dan return hanya bisa menghentikan proses di blok kode tempat mereka berada, namun dengan menggunakan label, kita bisa menentukan ke label mana kode akan berhenti

fun test(name: String, callback: (String) -> Unit): Unit = callback(name)

fun main() {
//    loopI@ for(i in 0..10){
//        loopJ@ for(j in 0..10){
//            println("$i x $j = ${i * j}")
//            if(j === 10) {
//                break@loopI
//            }
//        }
//    }

//    Continue
    loopI@ for(i in 0..10){
        loopJ@ for(j in 0..10){
            println("$i x $j = ${i * j}")
            if(j === 5) {
                continue@loopI
            }
        }
    }

//    Label Return
    test("Hello") testLabel@{
//        Variable it adalah representasi parameter "Ilham"
        if(it === "ilham"){
            return@testLabel
        }else {
            println(it)
        }
    }
}