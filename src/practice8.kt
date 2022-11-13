fun main() {
    val str0 = "qwerty"                                     // strings for part 1
    val str1 = "qwerty12"
    val str2 = "qwerty999999999"

    val list1 = listOf("arp", "live", "strong")             // lists for part 2
    val list2 = listOf("tarp", "mice", "bull")

//    println(part1(str2))
    println(part2(list2, listOf("lively", "alive", "harp", "sharp", "armstrong")))
}


fun part1 (str: String): String {
    val distributionHat = listOf(str.filter { it.isLetter() }, str.filter { it.isDigit() })
    return if (distributionHat[1].isEmpty()) { distributionHat[0] + 1
    } else distributionHat[0] + (distributionHat[1].toInt() + 1)
}


fun part2(list1: List<String>, list2: List<String>): List<String> {
    val resultList = mutableListOf<String>()

    for (i in list1) {
        for (ii in list2) {
            if (ii.contains(i)) { resultList.add(i) }
        }
    }
    return resultList.distinct()
}