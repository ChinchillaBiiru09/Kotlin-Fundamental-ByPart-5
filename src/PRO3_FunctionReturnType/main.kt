package PRO3_FunctionReturnType

fun main() {
    // RETURNING FUNCTION
//    Function yang mengembalikan nilai/data. Baik berupa String, Integer, float atau Boolean

    println(jumlah(10,10))
    val sum = jumlah(1,2)
    println(sum)
    jumlah(10,1)

    println(bagi(1.0, 0.0))
    val bagi = bagi(6.0, 2.0)
    println(bagi)
}

fun jumlah(a: Int, b: Int): Int{
    val total = a + b
    return total
}

fun bagi(a:Double,b:Double): Double{
    if (a.equals(0.0) || b.equals(0.0)){
        return 0.0
    } else {
        // gabisa kalo variable bagi nya diluar if. kek japa
        val bagi = a / b
        return bagi
    }
}

// By Venonymous