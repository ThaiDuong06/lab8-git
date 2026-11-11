public class Main {
    private static final int BONUS = 30;

    public static void main(String[] args) {
        System.out.println("Software Engineering - Git");
        printSummary();
        System.out.println("Feature bonus enabled");
    }

    private static void printSummary() {
        System.out.println("Bonus = " + BONUS);
        System.out.println("Version: collaborative");
    }
}
