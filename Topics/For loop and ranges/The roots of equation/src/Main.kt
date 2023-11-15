import kotlin.math.pow

fun main() {
    // put your code here
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()

    for (i in 0..1000){
        var roots = a * i.toDouble().pow(3.0) + b * i.toDouble().pow(2.0) + c * i + d
        if(roots.toInt() == 0){
            println(i)
        }
    }
}