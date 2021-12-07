fun main(){
	
	//list and variables defined to use with loops
    val guestsPerFamily = listOf(2, 4, 1, 3)
    var totalGuests = 0
    var index = 0
	
	//while loop used to count the guests 
	//while function is true, repeat
    while (index < guestsPerFamily.size){
        totalGuests += guestsPerFamily[index]
        index++
    }
    println("TotalGuest Count: $totalGuests")
    
	println()
	
    val names = listOf("Jessica", "Henry", "Alicia", "Jose")
	//for loop to print all the names and using .lenght it also displays the number of characters each name has
    for (name in names){
        println("$name - Number of characters: ${name.length}")
    }
}

/* --- Output ---
  fun main(){
    val guestsPerFamily = listOf(2, 4, 1, 3)
    var totalGuests = 0
    var index = 0
    while (index < guestsPerFamily.size){
        totalGuests += guestsPerFamily[index]
        index++
    }
    println("TotalGuest Count: $totalGuests")
    
	println()

    val names = listOf("Jessica", "Henry", "Alicia", "Jose")
    for (name in names){
        println("$name - Number of characters: ${name.length}")
    }
}
*/
