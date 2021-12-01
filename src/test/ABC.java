package test;

import java.util.HashMap;

//Find the first N words with the highest frequency in an array of strings.
//The result needs to be sorted by frequency.
//For example:
//An array of String:
//Inputs:
//{"Believe", "for", "good", "Believe", "for", "trust", "Believe", "forsake", "Believe",
//"Believe", "in", "you", "youtube", "Google", "for", "learning", "virtual", "data"};
//and the first 2 words with the highest frequency.
public class ABC {

	public static void main(String[] args) {

		String s[]={"Believe", "for", "good", "Believe", "for", "trust", "Believe", "forsake", "Believe",
				"Believe", "in", "you", "youtube", "Google", "for", "learning", "virtual", "data"};
		
		HashMap<String,Integer> hm = new HashMap<>();
		
		int len = s.length;
		int c=0;
		for(int i=0;i<len;i++) {
			
			String key = s[i];
			
			if(hm.containsKey(key))
				hm.put(key, c+1);
			else
				hm.put(key, 1);
		}
		
		
		
		
		
		
		

	}

}
