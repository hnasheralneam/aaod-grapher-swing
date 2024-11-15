import java.util.Scanner;

public class GrapherTesterTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a GrapherTester to graph (1, 2, 3): ");
        int choice = scanner.nextInt();
        scanner.close();

        switch (choice) {
            case 1:
                GrapherTester1 xyg1 = new GrapherTester1();
                xyg1.drawGraph(0, 0, 500, 500);
                break;
            case 2:
                GrapherTester2 xyg2 = new GrapherTester2();
                xyg2.drawGraph(0, 0, 500, 500);
                break;
            case 3:
                GrapherTester3 xyg3 = new GrapherTester3();
                xyg3.drawGraph(0, 0, 500, 500);
                break;
            default:
                System.out.println("Choose 1, 2, or 3!!!!");
                break;
        }
    }
}