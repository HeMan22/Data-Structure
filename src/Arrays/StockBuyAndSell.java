package Arrays;

import java.util.ArrayList;

public class StockBuyAndSell {

	public static void main(String[] args) {

		StockBuyAndSell stock = new StockBuyAndSell();

		// stock prices on consecutive days
		int price[] = { 100, 180, 260, 310, 40, 535, 695 };
		int n = price.length;

		// function call
		stock.stockBuySell(price, n);
	}

	class Interval {
		int buy, sell;
	}

	// This function finds the buy sell schedule for maximum profit
	private void stockBuySell(int[] price, int n) {

		// Prices needs to be given for atleast 2 days
		if (n == 1)
			return;

		int count = 0;

		ArrayList<Interval> sol = new ArrayList<>();

		// Traverse through given price array
		int i = 0;
		while (i < n - 1) {
			// Find Local Minima. Note that the limit is (n-2) as we are
			// comparing present element to the next element.
			while ((i < n - 1) && (price[i + 1] < price[i]))
				i++;

			// If we reach the end, we break loop as no further
			// solution is possible
			if (i == n - 1)
				break;

			Interval e = new Interval();

			// Storing the index of minima which gives the day of buying stock.
			e.buy = i++;

			// Finding Local Maxima. Note that the limit of loop is (n-1)
			// as we are comparing present element to previous element.
			while ((i < n) && (price[i] >= price[i - 1]))
				i++;

			// Storing the index of maxima which gives the day of selling stock.
			e.sell = i - 1;

			sol.add(e);

			// Incrementing count of buy/sell pairs.
			count++;
		}
		// Print result
		if (count == 0)
			System.out.println("There is no day when buying the stock " + "will make profit");
		else
			for (int j = 0; j < count; j++)
				System.out.println("Buy on day: " + sol.get(j).buy + " " + "Sell on day: " + sol.get(j).sell);

		return;
	}
}
