fun main() {
    // Create an instance of the Inventory class
    val inventory = Inventory()

    // Add items to the inventory
    inventory.addItem(Item("Apple", 5))
    inventory.addItem(Item("Banana", 3))
    inventory.addItem(Item("Orange", 7))
    inventory.addItem(Item("Mango", 2))
    inventory.addItem(Item("Grapes", 4))
    inventory.addItem(Item("Pineapple", 1))
    inventory.addItem(Item("Strawberry", 6))
    inventory.addItem(Item("Watermelon", 8))
    inventory.addItem(Item("Kiwi", 3))
    inventory.addItem(Item("Peach", 4))

    // Print the original inventory
    inventory.printInventory()

    // Modify the inventory
    inventory.modifyInventory()

    // Print the modified inventory
    println("\nAfter modification:")
    inventory.printInventory()

    // Remove 3 items from the inventory
    inventory.removeItems(3)

    // Print the final inventory
    println("\nAfter removing 3 items:")
    inventory.printInventory()
}
