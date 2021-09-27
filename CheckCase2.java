
import java.util.*;
public class CheckCase2 {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(c>='A'&& c<='Z'){
            System.out.println("1");
        }else if(c>='a'&&c<='z'){
            System.out.println("0");
        }else{
            System.out.println("-1");
        }
    }
	

}
