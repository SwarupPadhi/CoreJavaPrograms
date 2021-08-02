package stream;

import java.util.ArrayList;
import java.util.List;

public class SampleTest {

	public static void main(String[] args) {
		String str = "Hello World";
		char[] ch = str.toCharArray();
		List list = new ArrayList<>();
		for(int i=0; i<ch.length;i++) {
			System.out.print(ch[i]+"  ");
		}
		
		//ch.forEach(p -> System.out.println(p+"  "));		
		

	}

}
