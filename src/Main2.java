import java.util.*;

public class Main2  {


    static void binToDec() {
        System.out.println("Type a binary number");
        Scanner choice2 = new Scanner(System.in);
        String binary = choice2.nextLine();
        int i;
        double sum = 0;
        int f = 0;

        for (i = 0; i < binary.length(); i = i + 1) {

            char d = binary.charAt(binary.length() - (i + 1));
            int a = Character.getNumericValue(d);

            double b = (Math.pow(2, i));

            double c = a * b;
            sum = sum + c;
            f = (int) sum;

        }

        System.out.println(f);



    }

    static void decToBin() {
        System.out.println("Type a decimal number");
        Scanner choice2 = new Scanner(System.in);
        int int1 = choice2.nextInt();
        List<String> binary22 = new ArrayList<>();
        List<String> binary21 = new ArrayList<>();


        while (int1 > 0) {
            int i = int1 % 2;
            int1 = int1 / 2;
            String s = String.valueOf(i);
             binary22.add(s);
        }

        int l=binary22.size();

        for (int a =0; a<l;a=a++){
            String d=binary22.get(l-1);
            binary21.add(d);
            l=l-1;
        }
        System.out.println(binary21);

        }

    static void hexToDec(){
        System.out.println("Type a hexadecimal number");
        Scanner choice2 = new Scanner(System.in);
        String binary = choice2.nextLine();
        int i;
        double sum = 0;
        int f = 0;
        for (i = 0; i < binary.length(); i = i + 1) {
            int a;
            char d = binary.charAt(binary.length() - (i + 1));
            switch (d){
                case 'A':
                    a=10;
                    break;
                case 'B':
                    a=11;
                    break;
                case 'C':
                    a=12;
                    break;
                case 'D':
                    a=13;
                    break;
                case 'E':
                    a=14;
                    break;
                case 'F':
                    a=15;
                    break;

                default :
                    a = Character.getNumericValue(d);
            }

            double b = (Math.pow(16, i));

            double c = a * b;
            sum = sum + c;
            f = (int) sum;

        }
        System.out.println(f);
    }

    static void octToDec(){
        System.out.println("Type a Octaldecimal number");
        Scanner choice2 = new Scanner(System.in);
        String binary = choice2.nextLine();
        int i;
        double sum = 0;
        int f = 0;
        for (i = 0; i < binary.length(); i = i + 1) {
            int a;
            char d = binary.charAt(binary.length() - (i + 1));
            a = Character.getNumericValue(d);


            double b = (Math.pow(8, i));

            double c = a * b;
            sum = sum + c;
            f = (int) sum;

        }
        System.out.println(f);

    }

    static void binToHex(){
        System.out.println("Type a binary number");
        Scanner choice2 = new Scanner(System.in);
        String binary = choice2.nextLine();
        int k= binary.length()%4;
        if (k !=0){
            if(k==1){
            binary = "000" + binary;}

            else if (k==2) {
                binary = "00" +  binary;
            }
            else if (k==3) {
                binary = "0" +  binary;
            }
        } else {
            binary = binary;
        }
        String a="",d="";
        int i;

        for (i = 0; i < binary.length(); i = i + 4) {
            d = binary.substring(i,i+4);
            switch (d){
                case "0000":
                    a="0";
                    break;
                case "0001":
                    a="1";
                    break;
                case "0010":
                    a="2";
                    break;
                case "0011":
                    a="3";
                    break;
                case "0100":
                    a="4";
                    break;
                case "0101":
                    a="5";
                    break;
                case "0110":
                    a="6";
                    break;
                case "0111":
                    a="7";
                    break;
                case "1000":
                    a="8";
                    break;
                case "1001":
                    a="9";
                    break;
                case "1010":
                    a="A";
                    break;
                case "1011":
                    a="B";
                    break;
                case "1100":
                    a="C";
                    break;
                case "1101":
                    a="D";
                    break;
                case "1110":
                    a="E";
                    break;
                case "1111":
                    a="F";
                    break;
                default:
                    System.out.println("Wrong input");


            }

            System.out.print(a);


        }

    }

    static void binToOct(){

            System.out.println("Type a binary number");
            Scanner choice2 = new Scanner(System.in);
            String binary = choice2.nextLine();
            int k= binary.length()%3;
            if (k !=0){
                if(k==1){
                    binary = "00" + binary;}

                else if (k==2) {
                    binary = "0" +  binary;
                }
            } else {
                binary = binary;
            }
            String a="",d="";
            int i;

            for (i = 0; i < binary.length(); i = i + 3) {
                d = binary.substring(i,i+3);
                switch (d){
                    case "000":
                        a="0";
                        break;
                    case "001":
                        a="1";
                        break;
                    case "010":
                        a="2";
                        break;
                    case "011":
                        a="3";
                        break;
                    case "100":
                        a="4";
                        break;
                    case "101":
                        a="5";
                        break;
                    case "110":
                        a="6";
                        break;
                    case "111":
                        a="7";
                        break;
                    default:
                        System.out.println("Wrong input");


                }

                System.out.print(a);


        }

    }



    }

