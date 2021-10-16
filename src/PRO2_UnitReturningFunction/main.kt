package PRO2_UnitReturningFunction

//     UNIT RETURNING FUNCTION
fun main() {
    // UNIT RETURNING FUNCTION
//    Function dibagi menjadi 2 jenis:
//    -> function yang tidak mengembalikan nilai/data
//    -> function yang mengembalikan nilai/data
//    Pada part 18 - 21, merupakan contoh function yang tidak mengembalikan nilai
//    Function2 yang tidak mengembalikan data, sebenarnya mengembalikan tipe data unit, dimana
//    Unit adalah tanda bahwa funtion tersebut tidak mengembalikan data apapun
//    Penulisan unit, tidak wajib. Namun jika tidak menuliskan tipedata pengembalian pada sebuah
//    function, maka secara otomatis dia adalah unit.
//    Dalam bahasa java disebut void, namun di kotlin disebut unit

    hello()
    hello("Bii")
}

fun hello(name: String? = null): Unit {
//    biasanya dalan IDE, unit akan berwarna abu2, artinya tidak wajib dituliskan
    if (name == null) println("Hello guys :)")
    else println("Hello $name :)")
}

// By Venonymous