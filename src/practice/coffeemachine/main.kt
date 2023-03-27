package practice.coffeemachine


val coffeeMachine = CoffeeMachine()

fun main() {
    println("\nWrite action (buy, fill, take, remaining, exit):")
    when(readLine()) {
        "remaining" -> coffeeMachine.remaining()

        "buy" -> {
            println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back – to main menu:")

            when (readLine()) {
                "1" -> coffeeMachine.checkIngredients(250, 0, 16, 5)
                "2" -> coffeeMachine.checkIngredients(350, 75, 20, 7)
                "3" -> coffeeMachine.checkIngredients(200, 100, 12, 6)
                else -> main()
            }
        }

        "fill" -> {
            println("Write how many ml of water you want to add:")
            val water = intCheck()
            println("Write how many ml of milk you want to add:")
            val milk = intCheck()
            println("Write how many grams of coffee beans you want to add:")
            val coffeeBeans = intCheck()
            println("Write how many disposable coffee cups you want to add:")
            val cups = intCheck()
            coffeeMachine.fill(water, milk, coffeeBeans, cups)
        }

        "take" -> coffeeMachine.take()

        "exit" -> println("Buy buy")

        else -> {
            println("Error")
            return main()
        }
    }
}


fun intCheck(): Int {
    return try {
        Integer.valueOf(readLine())
    } catch (e: NumberFormatException) {
        println("error")
        Integer.valueOf(readLine())
    }
}



class CoffeeMachine(private var water: Int = 400,
                    private var milk: Int = 540,
                    private var coffeeBeans: Int = 120,
                    private var cups: Int = 9,
                    private var money: Int = 550){


    fun remaining() {
        println("""The coffee machine has:
    $water of water
    $milk of milk
    $coffeeBeans of coffee beans
    $cups of disposable cups
    $money of money 
    """)
        return main()
    }


    fun checkIngredients(waterNeed: Int, milkNeed: Int, coffeeBeansNeed: Int, moneyCost: Int) {
            if (water >= waterNeed && milk >= milkNeed && coffeeBeans >= coffeeBeansNeed && cups >= 1) {
                println("I have enough resources, making you a coffee!")
                buy(waterNeed, milkNeed, coffeeBeansNeed, moneyCost)
            }
            else {
                if (water - waterNeed < 0) {notEnoughIngredients("water")}
                if (milk - milkNeed < 0) {notEnoughIngredients("milk")}
                if (coffeeBeans - coffeeBeansNeed < 0) {notEnoughIngredients("coffee Beans")}
                if (cups - 1 < 0) {notEnoughIngredients("cups")}
                return main()
        }
    }


    private fun notEnoughIngredients(ingredient: String) = println("Sorry, not enough $ingredient!")


    private fun buy(waterNeed: Int, milkNeed: Int, coffeeBeansNeed: Int, moneyCost: Int) {
        water -= waterNeed
        milk -= milkNeed
        coffeeBeans -= coffeeBeansNeed
        cups -= 1
        money += moneyCost
        return main()
    }


    fun fill(waterAdd: Int, milkAdd: Int, coffeeBeansAdd: Int, cupsAdd: Int) {
        water += waterAdd
        milk += milkAdd
        coffeeBeans += coffeeBeansAdd
        cups += cupsAdd
        return main()
    }


    fun take() {
        println("I gave you $money")
        money -= money
        return main()
    }
}