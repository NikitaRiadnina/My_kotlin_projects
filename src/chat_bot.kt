fun main() {
    println("Hello! My name is DICT_Bot.\nPlease, remind me your name.")
    val name = readLine()
    println("What a great name you have, $name!\n\nLet me guess your age.\nEnter remainders of dividing your age by 3, 5 and 7.")

    val rem3 = Integer.valueOf(readLine())
    val rem5 = Integer.valueOf(readLine())
    val rem7 = Integer.valueOf(readLine())

    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is $age!")

    println("\nNow I will prove to you that I can count to any number you want.")
    val number = Integer.valueOf(readLine())
    for(i in 0..number){
        println("$i!")
    }

    println("\nLet's test your programming knowledge.")
    println("Why do we use methods?\n" +
            "    1. To repeat a statement multiple times.\n" +
            "    2. To decompose a program into several small subroutines.\n" +
            "    3. To determine the execution time of a program.\n" +
            "    4. To interrupt the execution of a program.")

    while(true) {
        val answer = readLine()
        if (answer != "2") {
            println("Please, try again.")
        } else {
            println("Completed, have a nice day!\n\nCongratulations, have a nice day!\"")
            break}
    }
}