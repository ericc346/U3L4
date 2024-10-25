import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your lottery pick: ");
        int pick = Integer.parseInt(userInput.nextLine());
        Lottery number = new Lottery();
        number.displayLottery();
        int pot = number.determineWinnings(pick);
        number.displayWinnings(pot);
    }
}
