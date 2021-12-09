var deck: MutableList<String> = mutableListOf()
var blackSuits: MutableList<String> = mutableListOf()
var redSuits: MutableList<String> = mutableListOf()

var clubs = listOf("Ace of clubs", "2 of clubs", "3 of clubs", "4 of clubs", "5 of clubs", "6 of clubs", "7 of clubs", "8 of clubs", "9 of clubs", "10 of clubs", "Jack of clubs", "Queen of clubs", "King of clubs")
var spades = listOf("Ace of spades", "2 of spades", "3 of spades", "4 of spades", "5 of spades", "6 of spades", "7 of spades", "8 of spades", "9 of spades", "10 of spades", "Jack of spades", "Queen of spades", "King of spades")
var diamonds = listOf("Ace of diamonds", "2 of diamonds", "3 of diamonds", "4 of diamonds", "5 of diamonds", "6 of diamonds", "7 of diamonds", "8 of diamonds", "9 of diamonds", "10 of diamonds", "Jack of diamonds", "Queen of diamonds", "King of diamonds")
var hearts = listOf("A of hearts", "2 of hearts", "3 of hearts", "4 of hearts", "5 of hearts", "6 of hearts", "7 of hearts", "8 of hearts", "9 of hearts", "10 of hearts", "Jack of hearts", "Queen of hearts", "King of hearts")
var jacks = listOf("Joker", "Joker")

var empty = false

fun main() {
    
    blackSuits.addAll(spades)
    blackSuits.addAll(clubs)
    
    redSuits.addAll(hearts)
    redSuits.addAll(diamonds)

    deck.addAll(blackSuits)
    deck.addAll(redSuits)
    
    println("Clubs: $clubs")
    println("Spades: $spades")
    println("Diamonds: $diamonds")
    println("Hearts: $hearts")
    println()
    println("Black Suits : $blackSuits")
    println("Red Suits : $redSuits")
    println("Full Deck: $deck")

    println()
          
     while(empty == false){ 
        empty = deck.isEmpty()
        take_a_card() 
    }
    
    if(empty == true){
        println("All the cards have been pulled")
    } 
    else {
        println("Welp")
    }
} 

public fun take_a_card(){

    val card = deck.random()
    if (empty == false) {
    println(card)
    deck.remove(card)        
    println(deck)
    println()
    }
}
