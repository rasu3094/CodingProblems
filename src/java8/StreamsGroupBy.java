package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsGroupBy {

	public static void main(String[] args) {
		
		String input ="I love to write code in java 8";
		List<String> listChars = Arrays.asList(input.split(""));
		System.out.println(listChars);
		Map<String, Long> output = listChars.stream()
				.filter(i -> i.equals("e"))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(output);
	}

}
