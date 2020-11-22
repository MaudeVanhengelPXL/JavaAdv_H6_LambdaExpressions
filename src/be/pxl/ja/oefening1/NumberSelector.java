package be.pxl.ja.oefening1;

public class NumberSelector {
	private NumberMachine numberMachine;
	public NumberSelector(NumberMachine numberMachine) {
		this.numberMachine = numberMachine;
	}

	public String showEvenNumbers() {
		/*numberMachine.processNumbers(new NumberFilter() {
			@Override
			public boolean check(int number) {
				return number % 2;
			}
			//TODO haakjes corrigeren
		}*/
		return null;
	}

	public String printHexNumbers() {
		throw new UnsupportedOperationException("Implement this method");
	}

	public String showNumbersAbove(int number) {
		throw new UnsupportedOperationException("Implement this method");
	}
}
