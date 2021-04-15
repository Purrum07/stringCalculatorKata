package mx.tec.kata;

public class StringCalculator {
	public int add(String numbers) {
		String delimeter = ",";
		if(numbers.isBlank()) {
			return 0;
		}else {
			String sanitizedNumbers = numbers;
			
			if (numbers.startsWith("//")) {
				delimeter = numbers.substring(2,3);
				sanitizedNumbers = numbers.substring(4);
			}
			String[] separatedNumbers = sanitizedNumbers.split("\\n|" + delimeter);
			int result = 0;
			for(String stringNumbers : separatedNumbers ) {
				result += Integer.parseInt(stringNumbers);
			}
			
			return result;
		}
	}
}
