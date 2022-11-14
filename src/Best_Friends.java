import java.util.Scanner;

public class Best_Friends {
    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        String girlName;
        int diamond_size = 0;
        double diamond_value = 0.0;
        System.out.println("Enter the name of the girl: ");
        girlName = keyboard.nextLine();
        Girl ourGirl = new Girl(girlName);
        System.out.println(ourGirl.printCurrentDiamond());
        do {
            System.out.println("Enter carats and value: ");
            diamond_size = keyboard.nextInt();
            diamond_value = keyboard.nextDouble();
            ourGirl.CompareDiamondOffer(diamond_size, diamond_value);
            if (ourGirl.CompareDiamondOffer(diamond_size, diamond_value)) {
                System.out.println("The girl took the diamond");
                ourGirl.AcceptDiamondOffer(diamond_size, diamond_value);
                System.out.println(ourGirl.printCurrentDiamond());
                System.out.println();
            } else {
                System.out.println("The diamond was rejected");
                System.out.println(ourGirl.printCurrentDiamond());
                System.out.println();
            }
        } while (diamond_size != 0);
    }
}
