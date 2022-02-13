import java.text.DecimalFormat;
import java.util.Scanner;

public class StringFormatting {

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("================================");
    for(int i=0;i<3;i++)
    {
        String s1=sc.next();
        int x=sc.nextInt();
        //Complete this line
        DecimalFormat ft = new DecimalFormat("000");
        System.out.printf("%-13s %s\n",s1,ft.format(x));
    }
    System.out.println("================================");

}
}