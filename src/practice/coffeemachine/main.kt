package practice.coffeemachine

fun main() {
    println("Write how many ml of water the coffee machine has:")
    val water = Integer.valueOf(readLine())
    println("Write how many ml of milk the coffee machine has:")
    val milk = Integer.valueOf(readLine())
    println("Write how many grams of coffee beans the coffee machine has:")
    val coffeeBeans = Integer.valueOf(readLine())
    println("Write how many cups of coffee you will need:")
    val cups = Integer.valueOf(readLine())

    if (200 * cups <= water && 50 * cups <= milk && 15 * cups <= coffeeBeans) {
        println("Yes, I can make that amount of coffee")
    } else {println("No, I can make only N cups of coffee")}
}