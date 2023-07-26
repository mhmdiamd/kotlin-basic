fun main() {
    val members : Array<String> = arrayOf("Ilham", "darmawan", "Daramwan 3")
    val ilham: String = members[0]
    val darmawan : String = members.get(1)
    val darmawan3 :String = members.get(2)

//    Edit data array
    members.set(2, "udin")
    val udin : String = members.get(2)

    println("${ilham}, ${darmawan}, ${darmawan3}, ${udin}")

//    Nullable
    val persons : Array<String?> = arrayOfNulls(5)
    persons.set(0, "Ilham")
    persons.set(1, null)

    println("${persons[0]} ${persons[1]}")
}