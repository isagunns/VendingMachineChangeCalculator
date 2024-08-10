import java.util.Scanner;

public class VendingMachineChangeCalculator {
    public static void main(String[] args) {
        int costOfItem, changeForMoney, quarters, dimes, nickels, sents;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter price of item(from 25 cents to a dollar,in 5-cent increments): ");
        costOfItem = scanner.nextInt();

        changeForMoney = 100 - costOfItem;// 100 cents-price of item
        quarters = changeForMoney / 25;// obtaining integer number
        dimes = (changeForMoney - (quarters * 25)) / 10;
        nickels = (changeForMoney - (quarters * 25 + dimes * 10)) / 5;
        sents = (changeForMoney - (quarters * 25 + dimes * 10 + nickels * 5));

        System.out.println("You bought an item for " + costOfItem + " cents and gave me a dollar,so your change is:\n"
                + quarters + " quarters\n" + dimes + " dimes\n" + nickels + " nickels\n" + sents + " sents.");
        scanner.close();

    }
}
