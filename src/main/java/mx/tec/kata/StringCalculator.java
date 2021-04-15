package mx.tec.kata;

public class StringCalculator {
	public int add(String numbers) {
		if(numbers.isBlank()) {
			return 0;
		}else {
			String[] separatedNumbers = numbers.split("\\n|,");
			int result = 0;
			
			for(String s : separatedNumbers ) {
				result += Integer.parseInt(s);
			}
		
			return result;
		}
	}
}
