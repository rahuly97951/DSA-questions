import java.util.*;
public class Main
{
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       String str = sc.nextLine();
	       String nstr = "";
	       str = str.toLowerCase();
	       for(int itr=0; itr<str.length();itr++){
	           char ch = str.charAt(itr);
	           if(nstr.indexOf(ch) == -1){
	               nstr = nstr+ch;
	           }
	       }
	       System.out.println("original string after removing duplicate characters is " + ":-" + " " +nstr);
	}
}
