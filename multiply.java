
import java.util.*;
public class multiply {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        
        int d=a*b*c;
        int e=a+b+c;
        System.out.println(d/e);
        
        s.close();
    }

    
}
