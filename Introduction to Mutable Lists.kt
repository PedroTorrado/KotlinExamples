fun main() {
	//defining a MutableList and giving it the entrees value
	val entrees: MutableList<String> = mutableListOf() 
	
    println("Entrees: $entrees")
    
    //add String to the list
    println("Add noodles: ${entrees.add("noodles")}")
    println("Entrees: $entrees")
    println("Add spaghetti: ${entrees.add("spaghetti")}")
    println("Entrees: $entrees")
	//defining a list to sum the string variables to the MutableList
	val moreItems = listOf("ravioli", "lasagna", "fettuccine")
    
    //Adding all the variables from a list to a MutableList
    println("Add list: ${entrees.addAll(moreItems)}")
    println("Entrees: $entrees")
	
    // entrees.add(10) 
    // trying to add an Int like the example above will return the Error message
    // "The integer literal does not conform to the expected type String"
	
    //Removing elements from the list
    println("Remove spaghetti: ${entrees.remove("spaghetti")}")
    println("Entrees: $entrees")
    
	//Trying to remove an unexistent item from a list results on a Boolean result of False
	println("Removing an item that doesn't exist: ${entrees.remove("rice")}")
    println("Entrees: $entrees")
	
	//It's possible to remove the items from a list using it's element instead of only it's content
    println("Remove first element: ${entrees.removeAt(0)}")
    println("Entrees: $entrees")
	
	//It's possible to verify if a list is empty or not using the .isEmpty() function
    println("Empty? ${entrees.isEmpty()}")
    
	//It's possible to completely clear the items from a list using only .clear() function
   	entrees.clear()
    println("Entrees: $entrees")
    
    println("Empty? ${entrees.isEmpty()}")
}

    /* --- Output ---
	Entrees: []
    Add noodles: true
    Entrees: [noodles]
    Add spaghetti: true
    Entrees: [noodles, spaghetti]
    Add list: true
    Entrees: [noodles, spaghetti, ravioli, lasagna, fettuccine]
    Remove spaghetti: true
    Entrees: [noodles, ravioli, lasagna, fettuccine]
    Removing an item that doesn't exist: false
    Entrees: [noodles, ravioli, lasagna, fettuccine]
    Remove first element: noodles
    Entrees: [ravioli, lasagna, fettuccine]
    Empty? false
    Entrees: []
    Empty? true
    */
    
    //https://developer.android.com/codelabs/basic-android-kotlin-training-lists?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-2-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-lists#2
