fun main() {
    val cityStack = arrayListOf("Milan", "Monaco", "Kharkov", "Riga")
    while (true) {
        println("\nStack is $cityStack \n\nIf you want to push an element, enter push. If pop - enter pop. If you want to exit - exit")
        when (readLine()) {
            "push" -> justPush(cityStack)
            "pop" -> justPop(cityStack)
            "exit" -> break
        }
    }
}


fun justPush(stack: ArrayList<String>): Boolean? { return readLine()?.let { stack.add(it) } }


fun justPop(stack: ArrayList<String>): String? { return stack.removeLastOrNull() }