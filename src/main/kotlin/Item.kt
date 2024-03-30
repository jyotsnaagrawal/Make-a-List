// Item class representing an individual item
class Item(val name: String, var quantity: Int) {
    // Function to increase quantity by 1
    fun increaseQuantity() {
        quantity++
    }
}
