package be.pxl.ja.oefening1;

public class NumberSelector {
	private NumberMachine numberMachine;
	public NumberSelector(NumberMachine numberMachine) {
		this.numberMachine = numberMachine;
	}

	public String showEvenNumbers() {
		return numberMachine.processNumbers(new NumberFilter() {
			@Override
			public boolean check(int number) {
				return number % 2 == 0;
			}
		});
	}

	public String printHexNumbers() {
		return numberMachine.convertNumbers(number -> Integer.toHexString(number));
	}

	public String showNumbersAbove(int givenNumber) {
		return numberMachine.processNumbers(number -> number > givenNumber);
	}
}
