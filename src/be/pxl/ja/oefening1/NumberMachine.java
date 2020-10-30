package be.pxl.ja.oefening1;

import java.util.ArrayList;

public class NumberMachine {

	private ArrayList<Integer> numbers = new ArrayList<>();

	public NumberMachine(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			this.numbers.add(numbers[i]);
		}
	}


	public String processNumbers(NumberFilter filter) {
		StringBuilder result = new StringBuilder();
		for(int i=0;i<numbers.size();i++) {
			if(filter.check(numbers.get(i))) {
				if(!result.toString().equals("")) {
					result.append("-");
				}
				result.append(numbers.get(i));
			}
		}
		return result.toString();
	}

}
