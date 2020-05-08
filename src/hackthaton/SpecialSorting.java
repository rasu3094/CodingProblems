package hackthaton;

import java.io.IOException;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpecialSorting {

    public static void main(String[] args) throws IOException {
       	String input = "4,3,25,1;-1,7,6";
       	List<Integer> list = Stream.of(input.split(";")[0].split(","),input.split(";")[1].split(",")).flatMap(Stream::of).mapToInt(Integer::valueOf).boxed()
                .collect(Collectors.toList());
       	List<Integer> finalOutput = Stream.of(list.stream().filter(i -> i%2 !=0).sorted().collect(Collectors.toList()),
       			list.stream().filter(i -> i%2 ==0).sorted(Comparator.reverseOrder()).collect(Collectors.toList()))
       						.flatMap(Collection::stream)
       						.collect(Collectors.toList());
       	System.out.println(finalOutput);
    }
}


