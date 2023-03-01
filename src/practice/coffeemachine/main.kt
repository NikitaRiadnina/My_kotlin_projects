package practice.coffeemachine


fun main() {
    println("Write how many cups of coffee you will need:")
    val cups = Integer.valueOf(readLine())
    println("For $cups cups of coffee you will need:\n" +
            "${cups * 200} ml of water\n" +
            "${cups * 50} ml of milk\n" +
            "${cups * 15} g of coffee beans")
}