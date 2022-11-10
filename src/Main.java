import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        logger.log("Launching the program");
        logger.log("Suggest the user to enter the input data for the list");

        Scanner input = new Scanner(System.in);
        int n = 0;
        while (n <= 0) {
            System.out.print("Enter the size of the list (number): ");
            n = input.nextInt();
            if (n < 0)
                System.out.println("The list size cannot be less than 0");
        }
        System.out.printf("Enter the maximum list item (number): ");
        int m = input.nextInt();

        logger.log("Creating and filling the list");
        List<Integer> list = fillInList(n, m);
        System.out.println("Random list: " + list);

        logger.log("Suggest the user to enter the input data for filtering");
        System.out.print("Enter the threshold for the filter: ");
        int f = input.nextInt();
        Filter filter = new Filter(f);
        System.out.printf("Filtered list: %s", filter.filterOut(list));

        logger.log("Completing the program");
    }

    public static List<Integer> fillInList(int n, int m) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Random random = new Random();
            list.add(random.nextInt(m));
        }
        return list;
    }
}
