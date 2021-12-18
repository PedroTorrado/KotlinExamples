fun main() {
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    println("list:   ${numbers}")
    println("sorted: ${numbers.sorted()}")
    val setOfNumbers = numbers.toSet()
    println("set:    ${setOfNumbers}")
    val set1 = setOf(1,2,3)
    val set2 = mutableSetOf(3,2,1)
    println("$set1 == $set2: ${set1 == set2}")
    println("contains 7: ${setOfNumbers.contains(7)}")
    println()
    // Maps 
    println("-- Maps --")
    val peopleAges = mutableMapOf<String, Int>(
        "Fred" to 30,
        "Ann" to 23
    )
    println(peopleAges)
    peopleAges.put("Barbara", 42)
    peopleAges["Joe"] = 51
    println(peopleAges)
    peopleAges["Fred"] = 31
    println(peopleAges)
    
    println()
    peopleAges.forEach { print("${it.key} is ${it.value}, ") }; println()
    println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", ") )
	
    val filteredNames = peopleAges.filter {it.key.length < 4}
    println(filteredNames)
}

/*
Output:
list:   [0, 3, 8, 4, 0, 5, 5, 8, 9, 2]
sorted: [0, 0, 2, 3, 4, 5, 5, 8, 8, 9]
set:    [0, 3, 8, 4, 5, 9, 2]
[1, 2, 3] == [3, 2, 1]: true
contains 7: false

-- Maps --
{Fred=30, Ann=23}
{Fred=30, Ann=23, Barbara=42, Joe=51}
{Fred=31, Ann=23, Barbara=42, Joe=51}

Fred is 31, Ann is 23, Barbara is 42, Joe is 51, 
Fred is 31, Ann is 23, Barbara is 42, Joe is 51
{Ann=23, Joe=51}
*/
