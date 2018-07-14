import java.util.*;
public class Main {
public static void main(String[] args) {
	double total=0;
	Scanner sc = new Scanner(System.in);
	int tests, charCount, chAmount,lines;
	char ch;
	tests = sc.nextInt();
	for(int i=0; i<tests; i++) {
		charCount = sc.nextInt();
		Hashtable<Character,Integer> amount = new Hashtable<Character,Integer>();
		for(int j=0; j<charCount; j++) {
			ch=sc.next().charAt(0);
			chAmount= sc.nextInt();
			amount.put(ch, chAmount);
		}
		lines = sc.nextInt();
		for(int k=0; k<lines; k++) {
			for(char c: sc.nextLine().toCharArray()) {
				if(amount.get(c)!=null) {
					double plus = (double) amount.get(c);
					total += plus;
				}
			}
		}
		total/=100.0;
		System.out.println(total+"$");
	}
}
}
