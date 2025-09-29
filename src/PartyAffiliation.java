import java.sql.SQLOutput;
import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String party = "";
        int trash = 0;
        System.out.println("Enter your party affiliation (D, R, or I): ");

        if(in.hasNext()){
            party = in.nextLine().toUpperCase();
            if (party.equals("D")){
                System.out.println("You are a Democratic Donkey.");
            }
            else if (party.equals("R")){
                System.out.println("You are a Republican Elephant.");
            }
            else if (party.equals("I")){
                System.out.println("You are an Independent Person.");
            }
            else{
                System.out.println(" Party unidentified: " + party);
                System.exit(0);
            }
        }
        else
        {
            trash = in.nextInt();
            System.out.println("Invalid input for party affiliation. \nPlease enter a valid character: D, R, or I.");
            System.out.println("you entered: "+ trash);
            System.exit(0);
        }

    }
}
