/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int digits = 0;
		int digit=0;
		double sum =0;
		int temp = num;
		while(temp!=0){
		    digits++;
		    temp=temp/10;
		}
		temp = num;
		while(temp!=0){
		    digit = temp%10;
		    sum = sum + Math.pow(digit,digits);
		    temp = temp/10;
		}
		if(sum==num){
		    System.out.println("Armstroong number");
		}else{
		    System.out.println("not armstrong number");
		}
	}
}
