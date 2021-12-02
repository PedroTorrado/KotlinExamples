import kotlin.math.PI
import kotlin.math.sqrt

fun main() {
	val squareCabin = SquareCabin(5, 50.0)
    val roundHut = RoundHut(3, 10.0)
    val roundTower = RoundTower(4, 15.5)

    // by using the "with()" function it makes it easier to read and less error prone 
    with(squareCabin){
    	println("\nSquare Cabin \n===========") 
    	println("Capacity: ${capacity}") // same as println("Capacity: ${squareCabin.capacity}"
    	println("Material: ${buildingMaterial}") //same as println("Material: ${squareCabin.buildingMaterial}")
    	println("Has Room? ${hasRoom()}") // same as println("Has Room? ${squareCabin.hasRoom()}")
        println("Floor Area: %.2f".format(floorArea())) // %.2f".format(floorArea()), formats the string to 2 decimal characters
        println("Has room? ${hasRoom()}") // same as println("Has Room? ${squareCabin.hasRoom()}")
        getRoom() //same as squareCabin.getRoom()
        println("Has room? ${hasRoom()}") // same as println("Has room? ${squareCabin.hasRoom()}")
		getRoom()
    }
        
    with(roundHut){
        println("\nRound Hut \n===========")
    	println("Capacity: ${capacity}")
    	println("Material: ${buildingMaterial}")
    	println("Has Room? ${hasRoom()}")
        println("Floor Area: %.2f".format(floorArea()))
        println("Carpet size: %.2f".format(calculateMaxCarpetSize()))

    }
        
    with(roundTower){
        println("\nRound Tower \n===========")
    	println("Capacity: ${capacity}")
    	println("Material: ${buildingMaterial}")
    	println("Has Room? ${hasRoom()}")
        println("Floor Area: %.2f".format(floorArea()))
        println("Carpet size: %.2f".format(calculateMaxCarpetSize()))
    }
}

// the class and most of it's variables need to be defined as abstract so it can have undefined variables and used as a parent class 
abstract class Dwelling(private var residents: Int){
	
    abstract val buildingMaterial: String
    abstract val capacity: Int
    
	fun hasRoom(): Boolean{
        return residents < capacity
    }
    
    abstract fun floorArea(): Double
    
    fun getRoom(){
        if (capacity > residents) {
            residents++
            println("You got a room!")
        } else {
            println("Sorry, at the capacity and no rooms left.")
        }
    }
}

class SquareCabin(residents: Int,
    val length: Double) : Dwelling(residents){
    // the variables need to be defined as override so they can change the values defined in the parent class
    override val buildingMaterial = "Wood"
    override val capacity = 6
    
    override fun floorArea(): Double{
        return length * length
    }
    
}

// set as open class so it can be used as a parent class to the RoundTower class defined after this one
open class RoundHut(residents: Int, 
    val radius: Double) : Dwelling(residents) {
    
    override val buildingMaterial = "Straw"
    override val capacity = 4
    
    override fun floorArea(): Double{
        return PI * radius * radius
    }
    
    fun calculateMaxCarpetSize(): Double{
        val diameter = 2 * radius
        return sqrt(diameter * diameter / 2)
    }
}

class RoundTower(residents: Int, radius: Double,
    val floors: Int = 2) : RoundHut(residents, radius){
    
    override val buildingMaterial = "Stone"
    override val capacity = 4 * floors
    
    override fun floorArea(): Double{
        return super.floorArea() * floors // could be used the same function used in the RoundHut class, however it's easier to call the function used in that class and change it to a superclass using super.function()
    }
}

//https://developer.android.com/codelabs/basic-android-kotlin-training-classes-and-inheritance?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-2-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-classes-and-inheritance#2
