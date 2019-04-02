
import java.util.Random;
import java.util.Scanner;

class main {
    String rock = "r";
    String paper = "p";
    String scissors = "s";
    static String player;
    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();
    static String comp;
    static String player_choice;
    public static void main(String[] args) {
        while(true){
            System.out.println("************************************");
            System.out.println("Chose Rock(r) , Paper(p), Scissors(s)");
            int computer = rand.nextInt(3) + 1;
            if (computer == 1){
                comp = "Rock";
            }
            else if(computer == 2){
                comp = "Paper";
            }
            else if(computer == 3) {
                comp = "Scissors";
            }
            player = input.next();
            if (player.equalsIgnoreCase("r")){
                player_choice = "Rock";}
            else if (player.equalsIgnoreCase("p")){
                player_choice = "Paper";}
            else if (player.equalsIgnoreCase("s")){
                player_choice = "Scissors";}
            else{break;}
            System.out.println("Player             Computer");
            System.out.println(player_choice +"     vs     "+ comp);
            if (player_choice == comp){
                System.out.println("Draw");
            }
            else if (player_choice =="Rock" && comp=="Paper"){
                System.out.println("Computer Wins");
            }
            else if (player_choice =="Rock" && comp=="Scissors"){
                System.out.println("Player Wins");
            }
            else if (player_choice =="Paper" && comp=="Scissors"){
                System.out.println("Computer Wins");
            }
            else if (player_choice =="Paper" && comp=="Rock"){
                System.out.println("Player Wins");
            }
            else if (player_choice =="Scissors" && comp=="Paper"){
                System.out.println("Player Wins");
            }
            else if (player_choice =="Scissors" && comp=="Rock"){
                System.out.println("Computer Wins");
            }
        }
    }
}
