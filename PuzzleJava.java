import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.security.SecureRandom;
import java.nio.charset.*;

public class PuzzleJava {

//	sum of values
//	public static void main(String[] args) {
//			int sum = 0;
//			int[] arr = {3,5,1,2,7,9,8,13,25,32};
//			for (int i = 0; i < arr.length; i++) {
//				if (i < arr.length) {
//					sum = sum + arr[i];
//				}
//			}
//			System.out.println(sum);

//	values greater than 10
//			public static void main(String[] args) {
//				int[] arr = {3,5,1,2,7,9,8,13,25,32};
//				ArrayList<Integer> numbers = new ArrayList<Integer>();
//				for (int i = 0; i < arr.length; i++) {
//					if (arr[i] > 10) {
//						Collections.addAll(numbers, arr[i]);
//					}
//				}
//				System.out.print(numbers);
//			}
	
//	Shuffle name values
//	public static void main(String[] args) {
//		List<String> list = Arrays.asList("Nancy", "Jinichi", "Fujibayashi", "Momochi","Ishikawa"); 
//
//		Collections.shuffle(list);
//			System.out.print(list);
//	}
	
//	names greater than 5
//	public static void main(String[] args) {
//		String[] list = {"Nancy", "Jinichi", "Fujibayashi", "Momochi","Ishikawa"};
//		ArrayList<String> newList = new ArrayList();
//			for () 
//		**don't know how to finish this one**
//		}
	
//	alphabet
////	public static void main(String[] args) {
//		List<String> list = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"); 
////		Collections.shuffle(list);
////		System.out.print(list);
//
//	if (list() == "a" || list() == "e" || list() == "i" || list() == "o" || list() == "u") {
//		System.out.println("It's a vowel.");
//	} **I know it's not correct, but this is basically what I think it is supposed to look like.**
//	**i know it's an "if" statement to get a vowel, but i 
////		can't find that information. All I'm thinking is what we learned
////		in JS: arr.length % 2 == 0; then print** 
//		
//		System.out.println(list.get(25)); //last letter
//		System.out.println(list.get(0)); //first letter
//}

	
//	10 random numbers between 55-100
//	public static void main(String[] args) {
//		Random r = new Random();
//		int[] arr = new int[10];
//	
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = r.nextInt((100-55) + 1) + 55;
//			System.out.println(arr[i]);
//		}
//	}

//10 random numbers between 55-100 and sorted (haven't figured out yet)
//	public static void main(String[] args) {
//		Random r = new Random();
//		int[] arr = new int[10];
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = r.nextInt((100-55) + 1) + 55;
//			System.out.println(arr[i]);
//			}		
//		
//	}

//	random string - 5 characters long
//	public static void main(String[] args) {
//		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
//                + "0123456789"
//                + "abcdefghijklmnopqrstuvxyz"; 
//
//		// create StringBuffer size of AlphaNumericString 
//		StringBuilder sb = new StringBuilder(); 
//
//		for (int i = 0; i < 5; i++) { 
//
//// generate a random number between 0 to AlphaNumericString variable length 
//			int index = (int)(AlphaNumericString.length() * Math.random()); 
//
//// add Character one by one in end of sb 
//			sb.append(AlphaNumericString.charAt(index)); 
//		} 
//		System.out.println(sb.toString()); 
//	    	}
	
	
//	array with 10 random strings
//	public static void main(String[] args) {
//		StringBuilder building = new StringBuilder(10);
//		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
//              + "0123456789"
//              + "abcdefghijklmnopqrstuvxyz";
//		StringBuffer r = new StringBuffer();
////		static final String SOURCE = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
//		for (int i = 0; i < building.length(); i++)
//			building.append(AlphaNumericString.charAt(i));  
////			building.append(SOURCE.charAt(secureRnd.nextInt(SOURCE.length())));
//		    System.out.println(building.toString());
//		
//				}
	
	
	//**I know I need to make an array with the previous code...**
	// I know this doesn't work, but I can't figure it out
//	public static void main(String[] args) {
//	int [] tenArray;
//	tenArray = new int[10];
//		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
//                + "0123456789"
//                + "abcdefghijklmnopqrstuvxyz"; 
//
//		// create StringBuffer size of AlphaNumericString 
//		StringBuilder sb = new StringBuilder(); 
//
//		for (int i = 0; i < 5; i++) { 
//
//// generate a random number between 0 to AlphaNumericString variable length 
//		int index = (int)(AlphaNumericString.length() * Math.random()); 
//
//// add Character one by one in end of sb 
//			sb.append(AlphaNumericString.charAt(index)); 
//		} 
//		System.out.println(sb.toString()); 
//	    	}

	
}
