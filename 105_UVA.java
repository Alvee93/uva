import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        short[] general_height = new short[10005];

        //user input
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            short left = in.nextShort(), height = in.nextShort(), right = in.nextShort();

            //go left to right of input building
            for (short i=left; i<right; i++) {
                general_height[i] = (short) Math.max(general_height[i], height);
            }
        }
        short y=0, a=-1, b=-1;
        for (short i=0; i<10000; i++) {
            if(y!= general_height[i]) {
                //print a b when a>0
                if (a>0) {
                    System.out.print(a + " " + b + " ");
                }
                y = general_height[i];
                a = i;
                b = y;
            }
        }
        //print the last a b
        System.out.println(a + " " + b);
    }
}
