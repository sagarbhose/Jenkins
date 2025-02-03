package entity;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Class1 extends Class3 {

	public static void main(String[] args) {
//		char charValue = '5';
//		int intValue = (charValue)-'0'; // Conversion from char to int
//		double a=Double.parseDouble("20.077777d");
//        //System.out.println(a);
//        Queue q=new PriorityQueue<>();
//        List<Integer> arr=new ArrayList(Arrays.asList(1,2,3,4,5,6,6,7,8,9));
//        arr.stream().sorted((i,j)->(j-i)).forEach(System.out::println);
//       //Integer ap=arr.parallelStream().reduce(1,(i,j)->(i+j));
//        Integer a1=arr.stream().min((i,j)->Integer.compare(i, j)).get();
        List<Integer> app=Arrays.asList(112,2,1113,4,51,5,6,17,8,19,8);
        
//        app.stream().filter(i->Integer.toString(i).startsWith("1")).forEach(System.out::println);
//        System.out.println(r1);
		Set<Integer>s=new LinkedHashSet<>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.removeIf(i->i%2==0);
		System.out.println(s);
		//map sorting based on values
//        Map<String, Integer> map = new HashMap<>();
//       
//            map.put("apple", 10);
//            map.put("banana", 5);
//            map.put("cherry", 15);
//            map.put("date", 10);
////printing           map.entrySet().stream().sorted((i,j)->{return j.getValue()-i.getValue();}).forEach(System.out::println);
//            Map<String, Integer> map1=map.entrySet().stream().sorted((i,j)->{return i.getValue()-j.getValue();}).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
//            System.out.println(map1);
//        for(Map.Entry<String, Integer> mp:map1.entrySet()) {
//        	System.out.println(mp.getKey()+" "+mp.getValue());
//		PriorityQueue<Integer> pq = new PriorityQueue<>((i,j)->(j-i));
//        }
       
	}
}
