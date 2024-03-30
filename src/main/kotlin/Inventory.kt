/* Inventory class to manage the list of items */
class Inventory {
    private val itemList = mutableListOf<Item>()

    // Function to add an item to the inventory
    fun addItem(item: Item) {
        itemList.add(item)
    }

    // Function to print the inventory
    fun printInventory() {
        println("Inventory:")
        itemList.forEach { println("${it.name}: ${it.quantity}") }
    }

    // Function to modify the inventory (increase quantity by 1 for each item)
    fun modifyInventory() {
        itemList.forEach { it.increaseQuantity() }
    }

    // Function to remove items from the inventory
    fun removeItems(count: Int) {
        if (count > itemList.size) {
            println("Error: Not enough items to remove.")
            return
        }
        itemList.subList(0, count).clear()
    }
}
