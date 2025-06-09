import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        boolean endIt = false;
        do
        {
            String playerA = "";
            String playerB = "";
            String input = "";
            String trash = "";
            boolean aDone = false;
            boolean bDone = false;
            boolean againDone = false;

            do
            {
                System.out.print("Player A, enter your move - rock, paper, or scissors [RPS]: ");
                Scanner in = new Scanner(System.in);
                input = in.nextLine();
                input = input.toUpperCase();

                if(input.equals("R") || input.equals("P") || input.equals("S"))
                {
                    playerA = input;
                    aDone = true;
                }
                else
                {
                    // Not a double so use nextLine() instead to read a String
                    trash = input;
                    System.out.println("Player A, you said your move was: " + trash);
                    System.out.println("You have to enter a valid move [RPS]!");
                }
            }while(!aDone);

            do
            {
                System.out.print("Player B, enter your move - rock, paper, or scissors [RPS]: ");
                Scanner in = new Scanner(System.in);
                input = in.nextLine();
                input = input.toUpperCase();

                if(input.equals("R") || input.equals("P") || input.equals("S"))
                {
                    playerB = input;
                    bDone = true;
                }
                else
                {
                    // Not a double so use nextLine() instead to read a String
                    trash = input;
                    System.out.println("Player B, you said your move was: " + trash);
                    System.out.println("You have to enter a valid move [RPS]!");
                }
            }while(!bDone);

            System.out.println("Player A, your move was: " + playerA);
            System.out.println("Player B, your move was: " + playerB);

            switch (playerA)
            {
                case "R":
                    switch (playerB)
                    {
                        case "R":
                            System.out.println("Rock vs Rock. It’s a TIE!");
                            break;
                        case "P":
                            System.out.println("Paper covers Rock. Player B WINS!");
                            break;
                        default:
                            System.out.println("Rock breaks Scissors. Player A WINS!");
                    }
                    break;
                case "P":
                    switch (playerB)
                    {
                        case "R":
                            System.out.println("Paper covers Rock. Player A WINS!");
                            break;
                        case "P":
                            System.out.println("Paper vs. Paper. It's a TIE!");
                            break;
                        default:
                            System.out.println("Scissors cut Paper. Player B WINS!");
                    }
                    break;
                default:
                    switch (playerB)
                    {
                        case "R":
                            System.out.println("Rock breaks Scissors. Player B WINS!");
                            break;
                        case "P":
                            System.out.println("Scissors cut Paper. Player A WINS!");
                            break;
                        default:
                            System.out.println("Scissors vs. Scissors. It's a TIE!");
                    }
                    break;
            }

            do {
                System.out.print("Would you like to play again? [Y/N]: ");
                Scanner in = new Scanner(System.in);
                input = in.nextLine();
                input = input.toUpperCase();

                if (input.equals("Y"))
                {
                    againDone = true;
                } else if (input.equals("N"))
                {
                    endIt = true;
                    againDone = true;
                } else {
                    trash = input;
                    System.out.println("You have to enter Y or N!");
                }
            }while(!againDone);
        }while(!endIt);
    };
};