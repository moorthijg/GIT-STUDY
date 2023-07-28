package Interview_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Removing_Duplicate_ArrayList_16 {
	

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,8,9,7,4,3,7,4, 1, 5, 3, 4));
		
		System.out.println("Arraylist with duplicate = " + list);
		
		Set<Integer> set = new LinkedHashSet<>();
		
		set.addAll(list);
		list.clear();
		
		list.addAll(set);
		System.out.println("ArrayList without duplicate elements: " + list);

	    // Using STREAM CLASS from arraylist
		
		List<Integer> lst = new ArrayList<>(Arrays.asList(10,20,30,40,50,60,70,80,90,10,11,20,30,40,70));
		
		System.out.println("Arraylist with duplicate value: " + lst);
	    Stream<Integer> stream = lst.stream();

	    // call the distinct() of Stream to remove duplicate elements
	    
	    stream = stream.distinct();

	    // convert the stream to arraylist
	    lst = (ArrayList<Integer>)stream.collect(Collectors.toList());
	    System.out.println("without duplicate elements: " + lst);
	}

}
