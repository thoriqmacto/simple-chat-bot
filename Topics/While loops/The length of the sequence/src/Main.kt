fun main() {
    // put your code here
    var sum = 0
//    var inp = Int.MAX_VALUE
//
//    while (inp != 0){
//        inp = readln().toInt()
//        println(inp)
//        sum++
//    }

    do {
        var inp = readln().toInt()
//        println(inp)

        if (inp != 0){
            sum++
        }

    }while (inp != 0)

    print(sum)
}