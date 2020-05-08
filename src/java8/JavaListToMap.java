package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaListToMap {

	public static void main(String[] args) {
		
		String input ="I love to write code in java 8";
		List<String> listChars = Arrays.asList(input.split(" "));
		System.out.println(listChars);
		Map<String, Integer> output = listChars.stream()
				.distinct()
				.sorted()
				.collect(Collectors.toMap(Function.identity(), e -> e.length()));
		System.out.println(output);
	}

}
