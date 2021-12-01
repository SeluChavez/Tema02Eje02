package ejercicio2;

public class Card {
// Crea la clase carta
	public String suit;
	public String value;
	//Declara las cadenas "suit" y "value"
	
	public Card (String suit, String value) {
		this.suit = suit;
		this.value = value;
		//
	}
	
	public String toString () {
		return (this.suit+"-"+this.value);
		//Devuelve el valor de suit y value 
	}
}
