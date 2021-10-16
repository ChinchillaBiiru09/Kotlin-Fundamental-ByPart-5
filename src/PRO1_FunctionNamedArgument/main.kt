package PRO1_FunctionNamedArgument

fun main() {
    // NAMED ARGUMENT
//    Digunakan untuk mengabaikan urutan parameter dari sebuah function
//    Dikotlin terdapat fitur named argument. named argument adalah fitur dimana kita bisa
//    menyebutkan nama parameter saat memanggil function, sehingga kita tidak wajib tau posisi/
//    urutan parameternya.

    biodata(name = "Hase", ttl = "Luxemberg, 09 March 2020", age = 1, color = "Gray")
//    ketika kita menggunakan named argument, maka seluruh parameter harus menggunakan named
//    argument. kita tidak bisa menggabungkan named argument, dengan argument biasa. misal:
//    biodata("Hase", age = 1, color = "Gray", "Luxemberg, 09 March 2020") -> gak iso!!

}

fun biodata(name:String, age:Int, ttl:String, color:String){
//    fitur ini hanya ada dikotlin, dijava tidak ada. kita bisa mention parameternya satu2, mengabaikan urutan nya..
    println("====== BIODATA ======\n" +
            "~Name \t\t\t= $name\n" +
            "~Age \t\t\t= $age\n" +
            "~Born Date \t\t= $ttl\n" +
            "~Favorite Color = $color")
}

// By Venonymous