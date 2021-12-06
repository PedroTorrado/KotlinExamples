open class Item(val name: String, val price: Int)

class Noodles : Item("Noodles", 10) {
    override fun toString(): String {
        return name
    }
}

class Vegetables(vararg val toppings: String) : Item("Vegetables", 5) {
    override fun toString(): String {
        if (toppings.isEmpty()) {
            return "$name Chef's Choice"
        } else {
            return name + " " + toppings.joinToString()
        }
    }
}

class Order(val orderNumber: Int) {
    private val itemList = mutableListOf<Item>()

    fun addItem(newItem: Item): Order {
        itemList.add(newItem)
        return this
    }

    fun addAll(newItems: List<Item>): Order {
        itemList.addAll(newItems)
        return this
    }

    fun print() {
        println("Order #${orderNumber}")
        var total = 0
        for (item in itemList) {
            println("${item}: $${item.price}")
            total += item.price
        }
        println("Total: $${total}")
    }
}

fun main() {
    val ordersList = mutableListOf<Order>()

    // Add an item to an order
    val order1 = Order(1)
    order1.addItem(Noodles())
    ordersList.add(order1)

    // Add multiple items individually
    val order2 = Order(2)
    order2.addItem(Noodles())
    order2.addItem(Vegetables())
    ordersList.add(order2)

    // Add a list of items at one time
    val order3 = Order(3)
    val items = listOf(Noodles(), Vegetables("Carrots", "Beans", "Celery"))
    order3.addAll(items)
    ordersList.add(order3)

    // Use builder pattern
    val order4 = Order(4)
        .addItem(Noodles())
        .addItem(Vegetables("Cabbage", "Onion"))
    ordersList.add(order4)

    // Create and add order directly
    ordersList.add(
        Order(5)
            .addItem(Noodles())
            .addItem(Noodles())
            .addItem(Vegetables("Spinach"))
    )

    // Print out each order
    for (order in ordersList) {
        order.print()
        println()
    }
}

/* --- Output --- 
    Order #1
    Noodles: $10
    Total: $10

    Order #2
    Noodles: $10
    Vegetables Chef's Choice: $5
    Total: $15

    Order #3
    Noodles: $10
    Vegetables Carrots, Beans, Celery: $5
    Total: $15

    Order #4
    Noodles: $10
    Vegetables Cabbage, Onion: $5
    Total: $15

    Order #5
    Noodles: $10
    Noodles: $10
    Vegetables Spinach: $5
    Total: $25
*/
