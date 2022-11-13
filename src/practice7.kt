fun main() {
    val list1 = listOf(1, 2, 3, 4, 3, 2, 1)         // lists for part 1
    val list2 = listOf(1, 100, 50, -51, 1, 1)
    val list3 = listOf(1, 7, 2, 20, 6, 20, 2, 6, 2)
    val list4 = listOf(3, 50, 100, 25, 25, -25, 25, 2, 1)

    val list5 = listOf(1, 2, 5, 6, 5, 2)            // lists for part 2
    val list6 = listOf(1, 2, 2, 20, 6, 20, 2, 6, 2)
    val list7 = listOf(0, 0, 0, 0, 0, 0, 0)
    val list8 = listOf(1, 2, 3, 4, 0, 0, 0, 0, 0, 0)

    println(part1(list4))
    println(part2(list6))
}


fun part1(list: List<Int>): Int {
    var sum1 = 0
    var indexForSum1 = -1
    var sum2 = 0
    var indexForSum2 = list.lastIndex + 1

    while(true) {
        if (indexForSum1 + 1 == indexForSum2 || indexForSum2 - 1 == indexForSum1) { break }

        else if (sum1 > sum2) {
            indexForSum2 -= 1
            sum2 += list[indexForSum2]
        }
        else if (sum2 > sum1) {
            indexForSum1 += 1
            sum1 += list[indexForSum1]
        }
        else if (sum1 == sum2){

            if (indexForSum2 - indexForSum1 == 2) {                     // Якщо список непарний наприклад[0, 1, 2, 1, 0]
                indexForSum1 += 1
                sum1 += list[indexForSum1]
                break
            }

            indexForSum1 += 1
            sum1 += list[indexForSum1]

            indexForSum2 -= 1
            sum2 += list[indexForSum2]
        }
    }

    return if (sum1 - list[indexForSum1] == sum2) { indexForSum1
    } else if (sum2 - list[indexForSum2] == sum1) { indexForSum2
    } else { -1 }
}


fun part2(list: List<Int>): Int {
    val result = mutableListOf<Int>()

    for (i in list.distinct().sorted()) {
        var forResult = 0
        for (ii in list) {
            if (i == ii) {forResult+=1}
        }
        result.add(forResult)
    }
    return (result.sumOf { it / 2 })
}