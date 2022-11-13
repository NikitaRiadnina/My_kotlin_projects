import kotlin.math.pow


fun main() {
    println("Enter number in decimal system:")
    val system = Integer.valueOf(readLine())
    println("Enter target base:")
    var number = Integer.valueOf(readLine())
    var result: String = ""

    var degree = 0
    var degree16 = 1
    val items = mutableListOf<String>()

    when (system) {
        2 -> while (number > 0) {
            result = (number % 2).toString() + result
            number /= 2
        }

        8 ->
            while (true) {
                if (number >= 8.0.pow(degree.toDouble())) {
                    degree += 1
                } else {
                    degree -= 1;
                    for (i in degree downTo 0) {
                        result += (number / 8.0.pow(i.toDouble()).toInt()).toString()
                        number %= 8.0.pow(i.toDouble()).toInt()
                    }; break }
            }

        16 -> while(number > 16) {
            while(true) {
                if (number >= 16.0.pow(degree16.toDouble())) {
                    degree16 += 1 } else{degree16-=1; break}
            }

            val maxDegree = (16.0.pow(degree16.toDouble())).toInt()
            val maxDegreeMinus = (16.0.pow(degree16.toDouble() - 1)).toInt()

            val amount16MaxPowInNumber = number / maxDegree
            val firstRemainder = number - maxDegree * amount16MaxPowInNumber
            val amount16MaxPowMinusInNumber = firstRemainder / maxDegreeMinus
            val secondRemainder = firstRemainder - amount16MaxPowMinusInNumber * maxDegreeMinus

            items.add(amount16MaxPowInNumber.toString())
            items.add(amount16MaxPowMinusInNumber.toString())
            if (secondRemainder < 16) {items.add(secondRemainder.toString())}

            if (secondRemainder > 16 || number > 16) { number = secondRemainder; degree16 = 1 }
        }


        else -> {
            println("Nope")
        }

    }

    if (system == 16){
        for (i in items) {
            result += when(i) {
                "10" -> "A"
                "11" -> "B"
                "12" -> "C"
                "13" -> "D"
                "14" -> "E"
                "15" -> "F"
                else -> i

            }
        }
    }

    println("Conversion result: $result")
}