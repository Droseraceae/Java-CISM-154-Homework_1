
/**
 * Create a program that calculates the number of acres a farm has based on a
 * value in square feet.
 * 
 * 
 * @author Josh Alcoba
 */
public class FarmlandCalculator {

	public static void main(String[] args) {

		final double acreToSquareFeet = 43560;

		// Farm 1 is 389,767 square feet of land. Determine and print the acreage of
		// Farm 1.
		// Farm 2 is 243,323 square feet of land. Determine and print the acreage of
		// Farm 2.
		// Farm 3 is 413,453 square feet of land. Determine and print the acreage of
		// Farm 3.

		double[] farm = new double[] { 389767, 243323, 413453 };
		for (int i = 0; i < farm.length; i++) {
			System.out.println(
					"The number of acres on Farm " + (i + 1) + " is " + (farm[i] / acreToSquareFeet) + " acres.");
			System.out.println();
		}

		// ***HINT***
		// To determine acreage, divide the farm's land size by acreToSquareFeet.

	}

}
