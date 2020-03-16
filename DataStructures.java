import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		next = null;
	}
}

class LinkedList{
	Node head;
}



public class DataStructures {

	public static void reverse(String str){
	    
	    
	    int n = str.length();
			
			Stack<Character> stack = new Stack<>();
			
			for (int i = 0; i < n; i++) {
				stack.push(str.charAt(i));
			}
			
			str = "";
			
			for (int i = 0; i < n; i++) {
				char c = stack.pop();	
				str += c;
			}
	    
	 }
	
	static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] arrA = new char[a.length()];
        char[] arrB = new char[b.length()];




        if(a.length() != b.length()){
            System.out.println("Not Anagrams");
            return false;
        }

        for(int i = 0; i < a.length(); i++ ){
            arrA[i] = a.charAt(i);
            arrB[i] = b.charAt(i);
        }
            
            Arrays.sort(arrA);
            Arrays.sort(arrB);


            for(int i = 0; i < arrA.length; i++ ){

                if(arrA[i] != arrB[i]){
                    System.out.println("Not Anagrams");
                    return false;
                }

            }
            System.out.println("Anagrams");
            return true;
    }
	
	static boolean isAnagramTwo(String a, String b) {
		
		if(a.length() != b.length())
			return false;
		
		a.toLowerCase();
		b.toLowerCase();
		
		Map<Character , Integer> firstWord = new HashMap<>();
			
		for(int i = 0 ; i < a.length() ; i++) {
			
			if(!firstWord.containsKey(a.charAt(i)))
				firstWord.put(a.charAt(i), 1);
			
			Integer number = firstWord.get(a.charAt(i));
			firstWord.put(a.charAt(i), ++number);
		}
		
		
		
		for(int i = 0; i < b.length(); i++) {
			
			if(!firstWord.containsKey(b.charAt(i))){
				return false;
			}
			
			if(firstWord.containsKey(b.charAt(i))) {
				Integer number = firstWord.get(b.charAt(i));
				firstWord.put(b.charAt(i), --number);
				
				if(number < 0)
					return false;		
			}
		}
		
		
		return true;
	}
	
	
	public static void main(String[] args) {
		
		boolean cos = isAnagramTwo("", "");
		
		System.out.println(cos ? "Anagram" : "No Anagram");
		

	}

}
