import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        int i= 0, count = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        for (i=0; i<count; i++) {
            int num1 = in2.nextInt(), num2 = in2.nextInt();
            if(num1 > num2) System.out.println(">");
            else if (num1 < num2)  System.out.println("<");
            else System.out.println("=");
        }
    }
}
