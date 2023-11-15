fun main() {
    // write your code here
    val Nmax = readln().toInt()

    var minNum = Int.MAX_VALUE
    for (i in 1..Nmax){
        var inp = readln().toInt()
        if (inp < minNum){
            minNum = inp
        }
    }
    print(minNum)
}