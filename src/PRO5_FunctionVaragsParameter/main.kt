package PRO5_FunctionVaragsParameter

fun main() {
    // FUNCTION VARAGS PARAMETER
//    Bisa disebut juga variable arguments
//    Paramater diposisi terakhir dapat dijadikan varargs, artinya datanya bisa menerima lebih dari 1
//    input atau seperti array. ini merupakan kemampuan turunan dari java.
//    Perbedaan parameter varargs dan paramaeter tipe array:
//    - parameter tipe array, wajib membuat array terlebih dahulu sebelum dikirimkan ke function
//    - parameter varargs, bisa langsung mengirimkan datanya, jika lebih dari satu cukup gunakan tanda
//    koma (,)
//    parameter varargs harus berada diposisi akhir
//    untuk membuat parameter varargs cukup gunakan kata kunci 'varargs' didepan parameternya..


//    Memanggil fungsi array
    val arr = arrayOf(10,10,10) // jika mengggunakan param array, maka harus membuat array terlebih dahulu
    val result = hitungtotal(arr)
    println(result)

//    Memanggil fungsi vararg
    val result2 = hitTotal(10, 10, 10)
    println(result2)

//    Memanggilk fungsi vararg 2 param
    val result3 = perhitungan("tambah", 10,10,10)
}

// contoh fungsi dengan param array
fun hitungtotal(values: Array<Int>):Int{
    var total = 0
    for (value in values){
        total += value
    }
    return total
}

// contoh fungsi dengan varags param
fun hitTotal(vararg values: Int):Int{
    var total = 0
    for(value in values){
        total += value
    }

    return total
}

// contoh fungsi vararg 2 param
fun perhitungan(label: String, vararg values: Int){
    var hasil = 0
    when (label){
        "tambah" ->{
            println("Ditambahkan")
            for(value in values){
                hasil += value
            }
            println("hasil = $hasil")
        }

        "kurang" ->{
            println("Dikurangi")
            for(value in values){
                hasil = value - hasil
            }
            println("hasil = $hasil")
        }
    }
}

// By Venonymous