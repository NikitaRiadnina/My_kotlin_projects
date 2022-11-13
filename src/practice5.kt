fun main () {
    val gameList = listOf("rock", "paper", "scissors")
    val randomInput = gameList.random()
    var userInput: String

    while (true) {
        userInput = readLine()!!
        if (userInput in gameList){ break
        } else { println("Not correct input, this is not problem, all good, but please try again)")}
    }

    val result: String = when (userInput) {
        "rock" -> if (randomInput == "paper") {"Lose"} else if (randomInput == "scissors") {"Win"} else {"Draw"}
        "paper" -> if (randomInput == "scissors") {"Lose"} else if (randomInput == "rock") {"Win"} else {"Draw"}
        "scissors" -> if (randomInput == "rock") {"Lose"} else if (randomInput == "paper") {"Win"} else {"Draw"}
        else -> "really?"
    }


    println("$result: Computer is $randomInput, You is $userInput")
}
