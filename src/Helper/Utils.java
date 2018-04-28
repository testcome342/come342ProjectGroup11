package Helper;
import java.util.Scanner;


public class Utils {
	public static void print(String message) {
		System.out.println(message);
	}
	public static void print(String message,boolean newLine ) {
		if(newLine) {
			System.out.print(message);
		} else {
			System.out.println(message);
		}
	}
	
	public static void printLineNumber(int number) {
		if(number != 0) {
			for(int i = 0;i < number;i++) {
				System.out.print("-");
			}
			System.out.println("");
		}
	}
}
