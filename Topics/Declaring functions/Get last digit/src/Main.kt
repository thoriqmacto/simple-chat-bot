// write your code here
fun getLastDigit(num:Int):Int {
    var absNum = 0
    absNum = if (num < 0){
        -1 * num
    }else num
    return absNum % 10
}

/* Do not change code below */
fun main() {
    val a = readln().toInt()
    println(getLastDigit(a))
}