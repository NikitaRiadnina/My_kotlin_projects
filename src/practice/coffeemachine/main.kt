package practice.coffeemachine


fun main() {
    println("Write how many ml of water the coffee machine has:")
    var cupsCan = Integer.valueOf(readLine()) / 200
    println("Write how many ml of milk the coffee machine has:")
    cupsCan = find_min(cupsCan, Integer.valueOf(readLine()) / 50)
    println("Write how many grams of coffee beans the coffee machine has:")
    cupsCan = find_min(cupsCan, Integer.valueOf(readLine()) / 15)
    println("Write how many cups of coffee you will need:")
    val cupsNeed = Integer.valueOf(readLine())

    if (cupsNeed == cupsCan) { println("Yes, I can make that amount of coffee")}
    else if (cupsNeed > cupsCan) { println("No, I can make only $cupsCan cups of coffee")}
    else { println("Yes, I can make that amount of coffee (and even ${cupsCan - 1} more than that")}
}


fun find_min(a: Int, b: Int): Int {
    return if (a > b) { b } else { a }
}