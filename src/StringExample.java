/**
 * @author bvanchuhov
 */
public class StringExample {

    public static void main(String[] args) {
        String s = "Java is a general-purpose computer programming language that is concurrent, class-based, object-oriented,[14] and specifically designed to have as few implementation dependencies as possible. It is intended to let application developers \"write once, run anywhere\" (WORA),[15] meaning that compiled Java code can run on all platforms that support Java without the need for recompilation.[16] Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of computer architecture. As of 2016, Java is one of the most popular programming languages in use,[17][18][19][20] particularly for client-server web applications, with a reported 9 million developers.[21] Java was originally developed by James Gosling at Sun Microsystems (which has since been acquired by Oracle Corporation) and released in 1995 as a core component of Sun Microsystems' Java platform. The language derives much of its syntax from C and C++, but it has fewer low-level facilities than either of them.";

        int length = s.length();
        System.out.println("length = " + length);

        int indexOfComputer = s.indexOf("computer");
        System.out.println("indexOfComputer = " + indexOfComputer);

        char charAt10 = s.charAt(10);
        System.out.println("charAt10 = " + charAt10);

        String upperCase = s.toUpperCase();
        System.out.println("upperCase = " + upperCase);

        String lowerCase = s.toLowerCase();
        System.out.println("lowerCase = " + lowerCase);

        boolean containsComputer = s.contains("computer");
        System.out.println("containsComputer = " + containsComputer);

        boolean startsWithJava = s.startsWith("Java");
        System.out.println("startsWithJava = " + startsWithJava);

        boolean equals = s.equals("Java");
        System.out.println("equals = " + equals);
    }
}
