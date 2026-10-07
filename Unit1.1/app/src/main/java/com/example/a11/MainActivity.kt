fun main() {
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")
}

fun main() {
    println("New chat message from a friend")
}

fun main() {
    val discountPercentage = 20
    val item = "Google Chromecast"
    val offer = "Sale  - Up to $discountPercentage% discount off $item! Hurry Up!"

    println(offer)
}
fun main() {
    val numberOfAdults = "20"
    val numberOfKids = "30"
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total") 2030
}
fun main() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}
Congratulations for your bonus! You will receive a total of 5000 + 1000 (additional bonus).
fun main() {
    val firstNumber = 10
    val secondNumber = 5

    val result = firstNumber + secondNumber
    println("$firstNumber + $secondNumber = $result")
}
fun add(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}
fun subtract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")
}

fun add(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

fun subtract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}
fun displayAlertMessage(operatingSystem: String, emailId: String): String {
    return "There is a new sign-in request on $operatingSystem for your Google Account $emailId."
}
fun displayAlertMessage(
    operatingSystem: String = "Unknown OS",
    emailId: String
): String {
    return "There is a new sign-in request on $operatingSystem for your Google Account $emailId."
}
