var deck: MutableList<String> = mutableListOf()
var blackSuits: MutableList<String> = mutableListOf()
var redSuits: MutableList<String> = mutableListOf()
var clubs = listOf("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K")
var spades = listOf("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K")
var diamonds = listOf("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K")
var hearts = listOf("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K")
var jacks = listOf("Joker", "Joker")

fun main() {
    
    blackSuits.addAll(spades)
    blackSuits.addAll(clubs)
    
    redSuits.addAll(hearts)
    redSuits.addAll(diamonds)
    
    deck.addAll(blackSuits)
    deck.addAll(redSuits)
    
    while(0 == 0){ take_a_card() }
}

public fun take_a_card(){

    val card = deck.random()
    val empty = deck.isEmpty()
    
    if (empty == false){
        println(card)
        println(deck)
        deck.remove(card)
    } else {
        println("All cards have been pulled")
    }
}
