fun main() {
//    1, 2
    println("\t_.1 and 2._")
    val numberFor1And2 = Integer.valueOf(readLine())
    if (numberFor1And2 % 2 == 0) {
        println("1: Even, 2: ${numberFor1And2 * 4}")
    } else {println("1: Odd, 2: ${numberFor1And2 * 5}")}

    println("\n\t_.3._")

//    3
    val numberFor3 = Integer.valueOf(readLine())
    println(if (numberFor3 <= 0) numberFor3 else numberFor3 * -1)

//   4
    println("\n\t_.4._")
    val numberFor4 = Integer.valueOf(readLine())
    var divide = numberFor4 / 100
    if ((divide * 100) < numberFor4) {divide += 1}
    println("$divide century")

//    5, 6, 7
    println("\n\t_.5 and 6 and 7._")
    val listFor5And6And7 = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15)

    val listPositiveNumbers = mutableListOf<Int>()
    val listNegativeNumbers = mutableListOf<Int>()
    listPositiveNumbers += listFor5And6And7
    listNegativeNumbers += listFor5And6And7
    listPositiveNumbers.removeIf{x-> x<0}
    listNegativeNumbers.removeIf{x-> x>=0}
    val listFor7 = mutableListOf(listPositiveNumbers.size, listNegativeNumbers.sum())

    var listFor6 = mutableListOf<Int>()
    for (i in 1..2) {
        val maxNumber = listFor5And6And7.maxOrNull()
        listFor5And6And7.removeAt(listFor5And6And7.indexOf(maxNumber))
        if (maxNumber != null) {listFor6.add(maxNumber)}
    }

    println("5: min: ${listFor5And6And7.minOrNull()}\n" +
            "6: 2 max number: $listFor6\n" +
            "7: amount positive numbers and sum negative numbers: $listFor7")

//    8, 9
    println("\n\t_.8 and 9._")

    val wordListFor8And9 = listOf("apocalypse", "hospitals")
    var index = 0

    for (i in wordListFor8And9) {
        var countVowel = 0
        for (ii in i) {
            when (ii.toString()) {
                "a", "e", "y", "u", "i", "o" -> countVowel += 1
            }
        }
        println("8: in the word ${wordListFor8And9[index]} $countVowel vowel")
        index += 1

        val middleIndex = i.length / 2
        println("9: middle letter(s)")
        if (middleIndex % 2 != 0) {
            println("${i[middleIndex-1]}${i[middleIndex]}")
        } else { println(i[middleIndex]) }
    }

//    10

    println("\n\t_.10._")

    var tableSize = 5
    val listFor10 = MutableList(tableSize+1){number -> MutableList(tableSize) {x -> (number * (x + 1)).toString()}}
    listFor10.removeAt(0)

    for (i in listFor10) {
        val separated = i.joinToString(separator = " ") { it -> it}
        println(separated)
    }
    println("\n $listFor10")
}