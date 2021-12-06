fun main() {
	val entrees: MutableList<String> = mutableListOf() 
    println("Entrees: $entrees")
    
    println("Add noodles: ${entrees.add("noodles")}")
    println("Entrees: $entrees")
    println("Add spaghetti: ${entrees.add("spaghetti")}")
    println("Entrees: $entrees")

	val moreItems = listOf("ravioli", "lasagna", "fettuccine")
    
    println("Add list: ${entrees.addAll(moreItems)}")
    println("Entrees: $entrees")
	
    // entrees.add(10) 
    // trying to add an Int like the example above will return the Error message
    // "The integer literal does not conform to the expected type String"
	
    //Removing elements from the list
    println("Remove spaghetti: ${entrees.remove("spaghetti")}")
    println("Entrees: $entrees")
    
	println("Removing an item that doesn't exist: ${entrees.remove("rice")}")
    println("Entrees: $entrees")
	
    println("Remove first element: ${entrees.removeAt(0)}")
    println("Entrees: $entrees")

    println("Empty? ${entrees.isEmpty()}")
    
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
