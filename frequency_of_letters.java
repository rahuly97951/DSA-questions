import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toLowerCase();
		Map<Character,Integer> map = new HashMap<>();
		for(char ch:str.toCharArray()){
		    if(map.containsKey(ch)){
		        map.put(ch, map.get(ch) + 1);
		    }
		    else{
		        map.put(ch,1);
		    }
		}
		for(Map.Entry<Character , Integer>entry : map.entrySet()){
		    System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}
