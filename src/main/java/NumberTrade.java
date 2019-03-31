import java.util.Scanner;

public class NumberTrade {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        number = scanner.nextInt();
        String[] count = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] count1 = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        int a = number % 10; // don vi
        int b = ((number - a) % 100) / 10; // hang chuc
        int c = (number - a - b * 10) / 100;// tram
        String result = "";
        if (a == 0 && b == 0 && c >= 1) {
            result += count[c - 1] + " hundred ";
        }
        if (c >= 1 && a != 0 && b != 0 || c >= 1 && a == 0 && b != 0 ||c >=1 && a!=0 && b==0) {
            result += count[c - 1] + " hundred and ";
        }
        if (c < 1 && a == 0 && b == 0) {
            result += "Zero";
        }
        switch (b) {
            case 0:
                if (a != 0 && c >= 1) {
                    result += count[a - 1];
                }
                if (a != 0 && c < 1) {
                    result += count[a - 1];
                }
                break;
            case 1:
                if (a == 0 && c >= 1) {
                    result += " Ten";
                }
                if (a != 0 && c >= 1) {
                    result += " Ten " + count[a - 1];
                }
                if (a != 0 && c < 1) {
                    result += count1[a - 1];
                }
                if (a == 0 && c < 1) {
                    result += "Ten";
                }
                break;
            case 2:
                if (a == 0 && c >= 1) {
                    result += " Twenty ";
                }
                if (a != 0 && c >= 1) {
                    result += " Twenty " + count[a - 1];
                }
                if (a != 0 && c < 1) {
                    result += " Twenty " + count[a - 1];
                }
                if (a == 0 && c < 1) {
                    result += " Twenty ";
                }
                break;
            case 3:
                if (a == 0 && c >= 1) {
                    result += " Thirty ";
                }
                if (a != 0 && c >= 1) {
                    result += " Thirty " + count[a - 1];
                }
                if (a != 0 && c < 1) {
                    result += " Thirty " + count[a - 1];
                }
                if (a == 0 && c < 1) {
                    result += " Thirty ";
                }
                break;
            case 4:
                if (a == 0 && c >= 1) {
                    result += " Forty ";
                }
                if (a != 0 && c >= 1) {
                    result += " Forty " + count[a - 1];
                }
                if (a != 0 && c < 1) {
                    result += " Forty " + count[a - 1];
                }
                if (a == 0 && c < 1) {
                    result += " Forty ";
                }
                break;
            case 5:
                if (a == 0 && c >= 1) {
                    result += " Fifty ";
                }
                if (a != 0 && c >= 1) {
                    result += " Fifty " + count[a - 1];
                }
                if (a != 0 && c < 1) {
                    result += " Fifty " + count[a - 1];
                }
                if (a == 0 && c < 1) {
                    result += " Fifty ";
                }
                break;
            case 6:

            case 7:

            case 8:

            case 9:
                if (a == 0 && c >= 1) {
                    result += count[b-1] +"ty";
                }
                if (a != 0 && c >= 1) {
                    result += count[b-1] + "ty " + count[a - 1];
                }
                if (a != 0 && c < 1) {
                    result += count[b-1] + "ty " + count[a - 1];
                }
                if (a == 0 && c < 1) {
                    result += count[b-1] +"ty" ;
                }
        }
        System.out.println(result);
    }
}

