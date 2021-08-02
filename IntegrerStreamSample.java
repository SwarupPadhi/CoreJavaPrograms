package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegrerStreamSample {

	public static void main(String[] args) {
		List<Integer> listOfNum = new ArrayList<Integer>();
		listOfNum.add(1988);
		listOfNum.add(1998);
		listOfNum.add(1978);
		listOfNum.add(1968);
		listOfNum.add(1958);
		listOfNum.add(1948);
		listOfNum.add(1938);
		listOfNum.add(1938);

		System.out.println("List of Years: " + listOfNum);
		System.out.println("Start of Stream with Map and Filter");
		List<Integer> list = listOfNum.stream().filter(year -> year < 1958).map(year -> year + 1).sorted()
				.collect(Collectors.toList());
		System.out.println("List of Years After Stream: " + list);
		System.out.println("End of Stream with Map and Filter");

		System.out.println("Start of Default Sorting");
		List<Integer> defaultSortingList = listOfNum.stream().sorted().collect(Collectors.toList());
		System.out.println("List of Years After Stream Default Sorting: " + defaultSortingList);
		System.out.println("End of Default Sorting");

		System.out.println("Start of Custom Sorting");
		List<Integer> sortedList = listOfNum.stream()
											 .sorted((l1, l2) -> l2.compareTo(l1))// can be used for any member
																							// variable of an object (l1
																							// and l2)
											 .collect(Collectors.toList());
		System.out.println("List of Years After Stream Sorted: " + sortedList);
		System.out.println("End of Custom Sorting");

		System.out.println("Start of MIN");
		int minYear = listOfNum.stream().min((l1, l2) -> l1.compareTo(l2)).get();
		System.out.println("MIN Year: "+minYear);
		int minYearCount = listOfNum.stream().min((l1, l2) -> l1.compareTo(l2)).map(x->x+2).get();
		System.out.println("MIN Year With Operation: "+minYearCount);
		System.out.println("End of MIN");
		
		System.out.println("Start of MAX");
		int maxYear = listOfNum.stream().max((l1, l2) -> l1.compareTo(l2)).get();
		System.out.println("MAX Year: "+maxYear);
		int maxYearCount = listOfNum.stream().max((l1, l2) -> l1.compareTo(l2)).map(x->x+2).get();
		System.out.println("MAX Year With Operation: "+maxYearCount);
		System.out.println("End of MAX");
		
		System.out.println("Start of FOR-EACH");
		listOfNum.stream().forEach(s->System.out.print(s+ "  "));
		System.out.print("\n");
		System.out.println("End of FOR-EACH");
		
		System.out.println("Start of TO-ARRAY");
		Object[] x = listOfNum.stream().toArray();
		System.out.println("Array:: "+ Arrays.toString(x));
		
		//IN the above example its returning and Object[], if we wan to restrict then using the following
		Integer[] str = listOfNum.stream().toArray(Integer[] :: new);
		System.out.println("Array with Method Reference ::> "+ Arrays.toString(str));
		
		
		System.out.println("USING CLASSICAL FOR LOOP");
		for(int i=0; i<x.length;i++) {
			System.out.println(x[i]);
		}
		System.out.println("USING ARRAYS>STREAM");
		Arrays.stream(x).forEach(s->System.out.println(s));
		System.out.println("End of TO-ARRAY");
		
		System.out.println("Start COUNT");
		
		System.out.println("listOfNum.stream().count():::"+ listOfNum.stream().count());
		System.out.println("listOfNum.stream().count():::"+ listOfNum.stream().filter(s->s<1950).count());
		System.out.println("End of COUNT");
		
		//HASH CODE
		
		System.out.println("Raw HashCode"+listOfNum.hashCode());
		System.out.println("Stream HashCode"+listOfNum.stream().hashCode());
		System.out.println("Stream HashCode"+listOfNum.stream().hashCode());
	}

}
