import java.util.*;

class Player {
    String name;
    String choice;
}

public class RockPaperScissor {

    public static void rockPaperScissors(String ch1, String ch2) {
        String res = "";
        boolean isInvalid1 = false;
        boolean isInvalid2 = false;
        System.out.println(isInvalid1);
        System.out.println(isInvalid2);
        
        
        if(ch1!="" && ch2!="") {

            switch (ch1) {
                case "rock":
                    switch (ch2) {
                        case "paper":
                            res = "Player 2";
                            break;
                        case "scissors":
                            res = "Player 1";
                            break;
                        case "rock":
                            res = "Tie!";
                            break;
                        default:
                            isInvalid2 = true;
                            break;
                    }
                    break;

                case "paper":
                    switch (ch2) {
                        case "rock":
                            res = "Player 1";
                            break;
                        case "scissors":
                            res = "Player 2";
                            break;
                        case "paper":
                            res = "Tie!";
                            break;
                        default:
                            isInvalid2 = true;
                            break;
                    }
                    break;

                case "scissors":
                    switch (ch2) {
                        case "rock":
                            res = "Player 2";
                            break;
                        case "paper":
                            res = "Player 1";
                            break;
                        case "scissors":
                            res = "Tie!";
                            break;
                        default:
                            isInvalid2 = true;
                            break;
                    }
                    break;
                default:
                    isInvalid1 = true;
                    break;
            }
        }
        // if(Boolean.compare(isInvalid1,isInvalid2)){
        //     System.out.println("Invalid Move "+ch1+" and "+ch2+"!");
        // }
        
        
        if(res=="Player 1" || res=="Player 2"){
            System.out.println("\n-----\n"+res+" wins!\n-----\n");
        }
        else{
            System.out.println(res);
        }
    }

    public static void clear() {
        for (int i = 0; i < 20; i++) {
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n----------Welcome to RockPaperScissors Game----------\n");
        System.out.println("\nChoose : Rock / Paper / Scissors \n");
        Player p1 = new Player();
        System.out.print("Player 1 : ");
        p1.choice = sc.next().toLowerCase();
        clear();
        Player p2 = new Player();
        System.out.print("Player 2 : ");
        p2.choice = sc.next().toLowerCase();
        clear();
        rockPaperScissors(p1.choice, p2.choice);
        sc.close();
    }
}