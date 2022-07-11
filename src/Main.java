import java.util.Scanner;

public class Main extends Main2{
    public static void main(String[] args) {
        System.out.println("Choose B for binary , H for hexadecimal,D for Decimal, O for octaldecimal");
        Scanner choice = new Scanner(System.in);
        String choice1 = choice.nextLine().toUpperCase();
        switch (choice1){

            case "B":
               binToDec();
               binToHex();
               binToOct();
               break;

            case "H":

                hexToDec();

                break;
            case "D":

                decToBin();
                break;
            case "O":
                octToDec();

                break;

            default:
                System.out.println("Wrong Choice");



        }


    }
}
