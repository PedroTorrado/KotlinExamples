fun main() {
	val Numbers: List<Int> = listOf (1, 2 , 3, 4, 5, 6)
    println("List: " + Numbers)
    println("Size: ${Numbers.size}")
    
    println("First element: ${Numbers[0]}")
    println("Second element: ${Numbers[1]}")
    //The index is actually an offset from the first element. 
    //For example, when you say list[2] you are not asking for the second element of the list, 
    //but for the element that is 2 positions offset from the first element. 
    //Hence list[0] is the first element (zero offset), 
    //list[1] is the second element (offset of 1), 
    //list[2] is the third element (offset of 2), and so on.
    println("Last index: ${Numbers.size - 1}")
    println("Last element: ${Numbers[Numbers.size-1]}")
    
    //You can also print the last element by using the .last() function
    println("Last element: " + Numbers.last())
    //Same logic applies to .first()
    println("First element: " + Numbers.first())
	
    //.constains() is used to check if a list contains or not the defined variable resulting in a boolian 
    println("Contains 4? ${Numbers.contains(4)}")
    println("Contains 7? ${Numbers.contains(7)}")
    
    //It's not possible to edit a list like this one without changing the code
    //However there are certain functions that result in new lists
    println("Reversed list: ${Numbers.reversed()}")
    println("Sorted list: ${Numbers.sorted()}")
}

//https://developer.android.com/codelabs/basic-android-kotlin-training-lists?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-2-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-lists#1
