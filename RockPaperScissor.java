import java.util.*;

class Player {
    String name;
    String choice;
}

public class RockPaperScissor {

    public static void rockPaperScissors(String ch1, String ch2) {
        String res = "-";
        boolean isInvalid1 = false;
        boolean isInvalid2 = false;

        if (ch1 != "" && ch2 != "") {

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
                    System.out.println(ch2);
                    isInvalid1 = true;
                    break;

            }

        }

        if (isInvalid1) {
            res = "\nInvalid Move for " + ch1 + "!\n";
        }
        if (isInvalid2) {
            res = "\nInvalid Move for " + ch2 + "!\n";
        }
        if (res == "Player 1" || res == "Player 2") {
            System.out.println("\n-----\n" + res + " wins!\n-----\n");
        } else {
            System.out.println("\n" + res + "\n");
        }
    }

    public static void clear() {
        for (int i = 0; i < 20; i++) {
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch1, ch2;
        System.out.println("\n----------Welcome to RockPaperScissors Game----------\n");
        System.out.println("\nChoose : Rock / Paper / Scissors \n");
        Player p1 = new Player();
        System.out.print("Player 1 : ");
        ch1 = sc.next().toLowerCase();
        p1.choice = ch1;
        // clear();
        System.out.println("\nChoose : Rock / Paper / Scissors \n");
        Player p2 = new Player();
        System.out.print("Player 2 : ");
        ch2 = sc.next().toLowerCase();
        p2.choice = ch2;
        // clear();
        rockPaperScissors(p1.choice, p2.choice);
        // checkError(p1.choice,p2.choice);
        sc.close();
    }
}