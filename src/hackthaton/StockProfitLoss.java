package hackthaton;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StockProfitLoss {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(6,0,-1,10);
		List<Integer> sortedList = list.stream().filter(Objects::nonNull).sorted().collect(Collectors.toList());
		System.out.println("Profit " + (sortedList.isEmpty() ? 0 :(sortedList.get(sortedList.size()-1)-sortedList.get(0))));
	}

}
