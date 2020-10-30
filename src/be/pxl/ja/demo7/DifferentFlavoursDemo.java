package be.pxl.ja.demo7;

import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntUnaryOperator;
import java.util.function.Supplier;

public class DifferentFlavoursDemo {

	public static void main(String[] args) {

		Supplier<Integer> always5 = () -> 5;
		IntUnaryOperator pow = (int x) -> x * x;
		IntUnaryOperator plus5 = x -> x + 5;
		IntBinaryOperator sumSqrt = (x, y) -> pow.applyAsInt(x) + pow.applyAsInt(y);
		IntConsumer printInBox = x -> {
			int length = String.valueOf(x).length();
			System.out.println("*".repeat(length + 2));
			System.out.println("*"+ x + "*");
			System.out.println("*".repeat(length + 2));
		};

		System.out.println(always5.get());
		System.out.println(pow.applyAsInt(5));
		System.out.println(plus5.applyAsInt(10));
		System.out.println(sumSqrt.applyAsInt(7, 5));
		printInBox.accept(1234567);
	}
}
