package mx.tec.kata;

public class StringCalculator {
	public int add(String numbers) {
		if(numbers.isBlank()) {
			return 0;
		}else if(numbers.length() == 1){
			return Integer.parseInt(numbers);
		}else {
			String[] separatedNumbers = numbers.split(",");
			
			int addition = Integer.parseInt(separatedNumbers[0]) + Integer.parseInt(separatedNumbers[1]);
			
			return addition;
		}
	}
}
