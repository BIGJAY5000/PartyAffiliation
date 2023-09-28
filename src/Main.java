import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String party;
        System.out.println("Please enter a letter for your party. R for Republican. D for Democrat. I for Independent");
        party = scan.nextLine();
        if (party.equals("R")) {
            System.out.println("You get a Republican Elephant");
        }
        else if (party.equals("D")) {
            System.out.println("you get a Democrat Donkey");
        } else if (party.equals("I")) {
            System.out.println("You get Independent Person");
        }
        else {
            System.out.println("You have entered an invalid string");
            System.exit(0);
        }


    }
}