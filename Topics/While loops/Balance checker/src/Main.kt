import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    var purchase = 0
    var cost = 0
    var N = 0
    var M = 0
    while (scanner.hasNextInt()) {
        // TODO
        cost = scanner.nextInt()
        purchase = balance - cost
        balance -= cost

        if (purchase in 0..balance){
            N = purchase
        }else
            N = purchase + cost
            M = cost
    }
    // TODO
    if (purchase < 0) {
        print("Error, insufficient funds for the purchase. Your balance is $N, but you need $M.")
    }else
        print("Thank you for choosing us to manage your account! Your balance is $N.")
}