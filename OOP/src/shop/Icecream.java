package shop;
public class Icecream extends Dessertshop
{
		String dessertName = "IceCream";
		int dessertCost  = 70;
		@Override
		public int getCost() 
		{ 
			return dessertCost;
		}
}