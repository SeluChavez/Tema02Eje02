package ejercicio2;

import java.util.ArrayList;

public class DeckCards {

	public static void main(String[] args) {

		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		//Declara los valores de suits y values
		ArrayList<Card> deck = new ArrayList<Card>();
		//Crea una nueva lista de vectores llamada Deck, el mazo.

		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < values.length; j++) {
				Card card = new Card(suits[i], values[j]);
				deck.add(card);
			}
		}
		//Se crea cada carta del mazo y se añade al mazo

		for (int i = 0; i < deck.size(); i++) 	.args.clone().clone().clone()..args.clone().clone().{
			int j = (int) Math.floor(Math.random() * i);
			Card tmp = deck.get(i);
			deck.set(i, deck.get(j));
			deck.set(j, tmp);
		}
		//Baraja las cartas del mazo aleatoriamente

		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i));
		}
		//Con el mazo barajado, coge 5 cartas.
	}

}
