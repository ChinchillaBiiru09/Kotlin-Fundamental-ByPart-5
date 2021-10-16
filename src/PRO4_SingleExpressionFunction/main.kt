package PRO4_SingleExpressionFunction

fun main() {
    //SINGLE EXPRESSION
//    apabila terdapat sebuah function yang sangat sederhana maka kita bisa menuliskannnya menggunakan metode single expression
//    single expression adalah deklarasi function hanya dengan 1 baris
//    Untuk membuat single expression cukup dengan tanda =

    println(kali(1,1))
    nama("Hase")
}

fun kali(a:Int,b:Int):Int = a * b
fun nama(name:String):Unit = println(name)

// By Venonymous