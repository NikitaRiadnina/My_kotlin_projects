import kotlin.math.max

fun main() {
    first()
    second()
}


fun first() {
    val a = "xyaabbbccccdefww"
    val b = "xxxxyyyyabklmopq"

    println(((a.split("").union(b.split(""))).sorted()).joinToString(""))
}


fun second() {
    val array1 = arrayOf("hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz")
    val array2 = arrayOf("cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww")

    println(max(maxSearch(array1) - minSearch(array2), maxSearch(array2) - minSearch(array1)))
}


fun maxSearch(array: Array<String>): Int {
    var maxWord = 0
    for (i in array) { if (i.length > maxWord) {maxWord = i.length} }
    return maxWord
}


fun minSearch(array: Array<String>): Int {
    var minWord = array[0].length
    for (i in array) { if (i.length < minWord) {minWord = i.length} }
    return minWord
}