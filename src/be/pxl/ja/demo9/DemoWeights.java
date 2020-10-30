package be.pxl.ja.demo9;

public class DemoWeights {

	public static void main(String[] args) {
		Weights weights = new Weights();
		System.out.println("Rounding down");
		//weights.roundWeights(d -> Double.valueOf(Math.floor(d)).intValue());
		weights.roundWeights(d -> (int) Math.floor(d));

		System.out.println("Rounding up");
		//weights.roundWeights(d -> Double.valueOf(Math.ceil(d)).intValue());
		weights.roundWeights(d -> (int) Math.ceil(d));

		System.out.println("Displaying");
		weights.consumeWeights(d -> System.out.printf("%.2f%n", d));
	}
}
