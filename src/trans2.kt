import java.util.Scanner
import kotlin.math.pow


fun main() {
    val reader = Scanner(System.`in`)
    println("Enter source number:")
    var number: String? = reader.nextLine()
    println("Enter source base:")
    val system = Integer.valueOf(readLine())
    var result = 0.0
    var degree = 0

    when (system) {
        2 ->
            if (number != null) {
                for (i in number.reversed()) {
                    if (i.toString() != "0") {
                        result += 2.0.pow(degree)
                    }
                    degree += 1
                }
            }

        8 -> if (number != null) {
            for (i in number.reversed()) {
                result += 8.0.pow(degree) * i.toString().toInt()
                degree += 1
            }
        }

        16 -> if (number != null) {
            for (i in number.reversed()) {
                result += when(i.toString()) {
                    "a" -> 10.0 * 16.0.pow(degree)
                    "b" -> 11.0 * 16.0.pow(degree)
                    "c" -> 12.0 * 16.0.pow(degree)
                    "d" -> 13.0 * 16.0.pow(degree)
                    "e" -> 14.0 * 16.0.pow(degree)
                    "f" -> 15.0 * 16.0.pow(degree)
                    else -> {
                        i.toString().toDouble() * 16.0.pow(degree)
                    }
                }
                degree += 1
            }
        }
    }


    println("Conversion to decimal result: ${result.toInt()}")
}
