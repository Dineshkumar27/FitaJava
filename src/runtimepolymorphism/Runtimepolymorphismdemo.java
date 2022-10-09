package runtimepolymorphism;

public class Runtimepolymorphismdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Decidedrink dd = new Decidedrink();

		Drink drink = dd.decideDrink();
		drink.getDrink();

	}

}
