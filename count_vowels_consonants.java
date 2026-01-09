import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toLowerCase();
		int vowels = 0;
		int consonants = 0;
		
		for(int itr=0;itr<str.length();itr++){
		    char ch = str.charAt(itr);
		    if(ch >='a' && ch<='z'){
		        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
		            vowels++;
		        }
		        else{
		            consonants++;
		        }
		    }
		}
		System.out.println("vowels" + " " + vowels);
		System.out.println("consonants" + " " + consonants);
	}
}
