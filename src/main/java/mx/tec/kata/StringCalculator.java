package mx.tec.kata;

import java.util.ArrayList;
import java.util.List;

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
			List<Integer> negativeNumbers = new ArrayList<>();
			int result = 0;
			for(String stringNumbers : separatedNumbers ) {
				int number = Integer.parseInt(stringNumbers);
				if (number < 0) {
					negativeNumbers.add(number);				
				}
				result += number;
			}
			
			if(!negativeNumbers.isEmpty()) {
				String negativeNumbersList = negativeNumbers.toString();
				String noBracketsNegativeNumbersList = negativeNumbersList.substring(1,negativeNumbers.toString().length()-1);
				throw new UnsupportedOperationException("negatives not allowed " + noBracketsNegativeNumbersList);
			}
			
			return result;
		}
	}
}
