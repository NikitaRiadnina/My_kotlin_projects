package practice.coffeemachine


val coffeeMachine = CoffeeMachine()

fun main() {
    println(coffeeMachine.showIngredients())

    println("Write action (buy, fill, take):")
    when(readLine()) {
        "buy" -> {
            println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:")
            val coffee = Integer.valueOf(readLine())

            when (coffee) {
                1 -> coffeeMachine.checkIngredients(250, 0, 16, 5)
                2 -> coffeeMachine.checkIngredients(350, 75, 20, 7)
                3 -> coffeeMachine.checkIngredients(200, 100, 12, 6)
            }
        }

        "fill" -> {
            println("Write how many ml of water you want to add:")
            val water = Integer.valueOf(readLine())
            println("Write how many ml of milk you want to add:")
            val milk = Integer.valueOf(readLine())
            println("Write how many grams of coffee beans you want to add:")
            val coffeeBeans = Integer.valueOf(readLine())
            println("Write how many disposable coffee cups you want to add:")
            val cups = Integer.valueOf(readLine())
            coffeeMachine.fill(water, milk, coffeeBeans, cups)
        }
        "take" -> coffeeMachine.take()
                else -> println("-__-")
    }
}


class CoffeeMachine(private var water: Int = 400,
                    private var milk: Int = 540,
                    private var coffeeBeans: Int = 120,
                    private var cups: Int = 9,
                    private var money: Int = 550){


    fun showIngredients() =
    """The coffee machine has:
    $water of water
    $milk of milk
    $coffeeBeans of coffee beans
    $cups of disposable cups
    $money of money 
    """


    fun checkIngredients(waterNeed: Int, milkNeed: Int, coffeeBeansNeed: Int, moneyCost: Int) {
            if (water >= waterNeed && milk >= milkNeed && coffeeBeans >= coffeeBeansNeed && cups >= 1) {
                buy(waterNeed, milkNeed, coffeeBeansNeed, moneyCost)
            }
            else {
                println("Not enough ingredients")
                return main()
        }

    }


    fun buy(waterNeed: Int, milkNeed: Int, coffeeBeansNeed: Int, moneyCost: Int) {
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