//TO CHECK WHETHER THE GIVEN STRING IS POLINDROME OR NOT
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
	    String str1=sc.next();
	    String temp="";
	    //reversing the string
	    for(int i=str1.length()-1;i>=0;i--) {
	    	temp=temp+str1.charAt(i);
	    }
	    System.out.println("The reversed String="+temp);
	    System.out.println("----------------------------");
	    if(str1.equals(temp)==true) {
	    	System.out.println("String is a palindrome");
	    }
	    else {
	    	System.out.println("String is not a palindrome");
	    }
	}

}
