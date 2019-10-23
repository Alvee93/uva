import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        short count = in.nextShort();
        short[] dd = new short[count];
        short[] mm = new short[count];
        short[] yyyy = new short[count];
        short[] total_days = new short[count];
        String[] names = new String[count];
        short younger_year=Short.MIN_VALUE, older_year=Short.MAX_VALUE;
        String younger_name = "", older_name="";

        for (short i=0; i<count; i++) {
            names[i] = in.next();
            dd[i] = in.nextShort();
            mm[i] = in.nextShort();
            yyyy[i] = in.nextShort();
            //younger_year = Math.max(younger_year, yyyy[i]);
            if(ageToDays(dd[i], mm[i], yyyy[i]) > younger_year) {
                younger_year = ageToDays(dd[i], mm[i], yyyy[i]);
                younger_name = names[i];
            }
            if (ageToDays(dd[i], mm[i], yyyy[i]) < older_year) {
                older_year = ageToDays(dd[i], mm[i], yyyy[i]);
                older_name = names[i];
            }
        }
        System.out.println( younger_name);
        System.out.println( older_name);
    }

    private static short ageToDays(short dd, short mm, short yyyy) {
        return (short) (dd+(mm*30)+(yyyy*365)); //cast the return value to short type
    }
}
