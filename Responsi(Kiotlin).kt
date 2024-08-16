import java.util.*
//Extention
fun Int.keliling(p:Float, l:Float): Float =this * (p+l)

fun main() {
//Lambda
    val Lambda: (Float, Float) ->  Float ={p: Float, l: Float -> var luas = p*l
        luas}
    val read = Scanner(System.`in`)

    println("\n_____________________")
    print("Masukkan Panjang : ")
    var panjang: Float = read.nextFloat()
    print("Masukkan Lebar : ")
    var lebar: Float = read.nextFloat()
    var luas = Lambda(panjang, lebar)
    print("Keliling : ")
    println(2.keliling(lebar, panjang))
    println("Luas : $luas")
}
