import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your party affiliation (D, R, or I): ");

        String party = in.nextLine().toUpperCase(); // read input directly

        if (party.equals("D")) {
            System.out.println("You are a Democratic Donkey.");
        }
        else if (party.equals("R")) {
            System.out.println("You are a Republican Elephant.");
        }
        else if (party.equals("I")) {
            System.out.println("You are an Independent Person.");
        }
        else {
            System.out.println("Party unidentified: " + party);
        }
    }
}
