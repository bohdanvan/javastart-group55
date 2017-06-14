/**
 * @author bvanchuhov
 */
public class StrangeSumDouble {

    public static void main(String[] args) {
        double d1 = 0.1 + 0.2;
        System.out.println("d1 = " + d1);

        String s1 = String.format("%.2f", d1);
        System.out.println("s1 = " + s1);

        double d2 = 0.3 - 0.1;
        System.out.println("d2 = " + d2);

        String s2 = String.format("%.2f", d2);
        System.out.println("s2 = " + s2);
    }
}
