import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Trial_2 {
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);
    int choice;
    char Continue;

    public static void clearScreen() {
        try
        {
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }catch(Exception E)
        {
            System.out.println(E);
        }
    }

    public void playCoinChaser() throws IOException{
        int choice,position_of_coin;
        System.out.println("\t\t\t\t***** WELCOME TO COIN CHASER ! *****\n\n");
        final int Max=3;
        Random rand =new Random();
        choice=rand.nextInt(Max)+1;
        do{
            clearScreen();
        System.out.println("       ------------------FIND THE CORRECT HAT-------------------   ");
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("  ###############           ###############           ###############");
        System.out.println("   #############             #############             #############");
        System.out.println("    ###########               ###########               ###########");
        System.out.println("     #########                 #########                 #########");
        System.out.println("     #########                 #########                 #########");
        System.out.println("  ###############           ###############           ###############");
        System.out.println("  ###############           ###############           ###############");
        System.out.println(" ");
        System.out.println("       * 1 *                     * 2 *                      * 3 *");
        System.out.println("CHOOSE THE  PERFECT HAT ");
        position_of_coin=Integer.parseInt(buf.readLine());
        if(position_of_coin==choice){
            System.out.println("          *     *     **     *     *            *            *      **        **      *   ");
            System.out.println("          *     *    *  *    *     *            *            *    *    *      * *     *   ");
            System.out.println("           *   *    *    *   *     *            *            *   *      *     *  *    *   ");
            System.out.println("            * *     *    *   *     *            *     *      *   *      *     *   *   *   ");
            System.out.println("             *      *    *   *     *            *   *   *   *     *    *      *    *  *   ");
            System.out.println("             *       *  *     *   *              * *     * *       *  *       *     * *   ");
            System.out.println("             *        **       * *                **      **        **        *      **   ");
        }
        else{
            System.out.println("SORRY, YOU ARE WRONG.YOUR BAD LUCK !!!!!");
        }
        System.out.println("Press Y for one more round ! and N to exit :(");
        Continue = sc.next().charAt(0);
    }while(Continue=='y' || Continue=='Y');
    main(null);
    }

    public void playMovieGuessing() throws IOException{
        System.out.println("\t\t\t\t**** WELCOME TO MOVIE GUESSING ! ****\n\n");
        String Hint=null,MovieName = null;

        System.out.println("Press 0 to play with computer and 1 to play with friends.");
        int choice;
        choice = Integer.parseInt(buf.readLine());

        do {
            clearScreen();
            if (choice == 0) {
                int question;
                Random r = new Random();
                question = r.nextInt(10);

                switch (question) {
                    case 0: {
                        Hint = "Blind but not blind but blind at the end....It's a bollywood movie.";
                        MovieName = "Andhadhun";
                        break;
                    }
                    case 1: {
                        Hint = "Living in a dream but literally!";
                        MovieName = "Inception";
                        break;
                    }
                    case 2: {
                        Hint = "Ayo ! Does your fashion also have some defects in it?";
                        MovieName = "PK";
                        break;
                    }
                    case 3: {
                        Hint = "Cyborg of Bollywood";
                        MovieName = "Robot";
                        break;
                    }
                    case 4: {
                        Hint = "Academy awards of the best movie 2020";
                        MovieName = "Parasite";
                        break;
                    }
                    case 5: {
                        Hint = "Player (5+2)(10-2)(4+2)";
                        MovieName = "Khiladi 786";
                        break;
                    }
                    case 6: {
                        Hint = "A silent funny guy";
                        MovieName = "Barfi";
                        break;
                    }
                    case 7: {
                        Hint = "Father of Mechanics trying to conduct elections";
                        MovieName = "Newton";
                        break;
                    }
                    case 8: {
                        Hint = "Set Max";
                        MovieName = "Sooryavansham";
                        break;
                    }
                    case 9: {
                        Hint = "A movie which you should never watch with your parents";
                        MovieName = "Baghban";
                        break;
                    }
                }
                System.out.println("Hey there guess the movie ;)");
                System.out.println("HINT : " + Hint);
                String guessedMovie = buf.readLine();
                if (guessedMovie.equalsIgnoreCase(MovieName)) {
                    System.out.println("Correct ! You really are a sharp one ! ");
                } else {
                    System.out.println("Nice try mate !! but the answer is : " + MovieName);
                }
            } else {
                System.out.println("Enter the Movie name for your friend -> ");
                MovieName = buf.readLine();
                System.out.println("Leave a hint for your friend to guess -> ");
                Hint = buf.readLine();
                clearScreen();
                System.out.println("Hey there guess the movie ;)");
                System.out.println("HINT : " + Hint);
                String guessedValue = buf.readLine();
                if (guessedValue.equalsIgnoreCase(MovieName)) {
                    System.out.println("You really are a sharp one ! ");
                } else {
                    System.out.println("Nice try mate !! but the answer is : " + MovieName);
                }
            }
            System.out.println("Press Y for one more round ! and N to exit :(");
            Continue = sc.next().charAt(0);
        }while(Continue=='y' || Continue=='Y');
        main(null);
    }

    public void playGuessingNumber() throws IOException
    {
        
        do {
            clearScreen();
            int answer, guess, chances = 5;
            Random r = new Random();
            answer = r.nextInt(31);
            System.out.println("\t\t\t\t***** WELCOME TO NUMBER GUESSING ! *****\n\n");
            System.out.println("Guess a number between 0 and 30:");
            do {
                guess = Integer.parseInt(buf.readLine());
                if (guess == answer) {
                    System.out.println("Good job Champion !!!");
                    break;
                } else if (guess - answer > 5) {
                    System.out.println("Entered number is too large !");
                    chances--;
                } else if (guess - answer < -5) {
                    System.out.println("Entered number is too less !");
                    chances--;
                } else if (guess > answer) {
                    System.out.println("Entered number is larger but too close !");
                    chances--;
                } else if (guess < answer) {
                    System.out.println("Entered number is smaller but too close !");
                    chances--;
                }
            } while (chances != 0);
            if (chances == 0) {
                System.out.println("You ran out of chances ! :( ");
                System.out.println("Correct answer was : " + answer);
            }
            System.out.println("Press Y for one more round ! and N to exit :(");
            Continue = sc.next().charAt(0);
        }while(Continue=='y' || Continue=='Y');
        main(null);
    }

    public void playRockPaper() throws IOException {
        

        char Continue='y';
        int computerChoice,yourchoice=0;

        do {
            clearScreen();
            
            String compChoiceStr = null;
            Random rand = new Random();
            computerChoice = rand.nextInt(3);
            System.out.println("\t\t\t\t***** WELCOME TO ROCK PAPER AND SCISSORS ! *****\n\n Enter your choice as 'rock','paper' or 'scissors'.");

            String myChoice = buf.readLine();

            if (myChoice.equalsIgnoreCase("rock")) yourchoice = 0;
            else if (myChoice.equalsIgnoreCase("paper")) yourchoice = 1;
            else if (myChoice.equalsIgnoreCase("scissors")) yourchoice = 2;
            else System.out.println("Please spell check and enter again");

            if (computerChoice == 0) compChoiceStr = "Rock";
            else if (computerChoice == 1) compChoiceStr = "Paper";
            else if (computerChoice == 2) compChoiceStr = "Scissors";

            System.out.println(myChoice + "  -------------------------- " + compChoiceStr);

            if (computerChoice == yourchoice) {
                System.out.println("match tie");
            } else if (computerChoice == 0 && yourchoice == 1) {
                System.out.println(" you won!! and computer loss");
            } else if (computerChoice == 0 && yourchoice == 2) {
                System.out.println("computer won");
            } else if (computerChoice == 1 && yourchoice == 0) {
                System.out.println("computer won!!!");
            } else if (computerChoice == 1 && yourchoice == 2) {
                System.out.println("you won!!");
            } else if (computerChoice == 2 && yourchoice == 0) {
                System.out.println("you won!!");
            } else if (computerChoice == 2 && yourchoice == 1) {
                System.out.println("computer won!!");
            }
            System.out.println("Press 'Y' to play again :) and 'N' to quit :(");
            Continue = sc.next().charAt(0);
        }while(Continue=='y' || Continue=='Y');
        main(null);
    }
      
    public void playJavaQuiz() throws IOException
    {
        do{
            clearScreen();
    
        int numcorrect=0;
        System.out.println("\t\t\t\t***** WELCOME TO JAVA QUIZ ! *****\n\n");

        System.out.println("1. What is the size of long variable?");
        System.out.println("a.8 bits");
        System.out.println("b.16 bits");
        System.out.println("c.32 bits");
        System.out.println("d.64 bits");

        String response=(buf.readLine());

        if(response.equals("d")){
            System.out.println("correct!");
            numcorrect+=1;
        }
        else{
            System.out.println("Nope.Good try");
        }
        System.out.println("2. What is correct syntax to output'Hello world' i java?");
        System.out.println("a.System.out.println('Hello world');");
        System.out.println("b.Console.WriteLine('hello world');");
        System.out.println("c.echo('helloo world')");
        System.out.println("d.Print('Hello world')");

        response=(buf.readLine());

        if(response.equals("a")){
            System.out.println("correct!");
            numcorrect+=1;
        }
        else{
            System.out.println("Nope.Good try");
        }
        System.out.println("3. Who is known as father of java programming language?");
        System.out.println("a.James Gosling");
        System.out.println("b.M.P Java");
        System.out.println("c.Charles Babbage");
        System.out.println("d.Blais Pascal");

        response=(buf.readLine());

        if(response.equals("a")){
            System.out.println("correct!");
            numcorrect+=1;
        }
        else{
            System.out.println("Nope.Good try");
        }


        System.out.println("4. Which provide runtime environment for java byte code to be executed?");
        System.out.println("a.JDK");
        System.out.println("b.JVM");
        System.out.println("c.JRE");
        System.out.println("d.JAVAC");

        response=(buf.readLine());

        if(response.equals("b")){
            System.out.println("correct!");
            numcorrect+=1;
        }
        else{
            System.out.println("Nope.Good try");
        }


        System.out.println("5. Which of the following are not java keywords?");
        System.out.println("a.double");
        System.out.println("b.switch");
        System.out.println("c.then");
        System.out.println("d.instanceof");

        response=(buf.readLine());

        if(response.equals("c")){
            System.out.println("correct!");
            numcorrect+=1;
        }
        else{
            System.out.println("Nope.Good try");
        }
        System.out.println("5. Java language was initailly called as?");
        System.out.println("a.Sumatra");
        System.out.println("b.j++");
        System.out.println("c.Oak");
        System.out.println("d.Pine");

        response=(buf.readLine());

        if(response.equals("c")){
            System.out.println("correct!");
            numcorrect+=1;
        }
        else{
            System.out.println("Nope.Good try");
        }
        int totalquestion=6;
        float score= (float) ((100.0*numcorrect)/totalquestion);
        System.out.println("you scored"+score+" %");
    


     Continue = sc.next().charAt(0);
    }
while(Continue=='y' || Continue=='Y');
main(null);
}
    public void mainMenu()throws IOException {
        System.out.println("\n\nEnter the serial number of the game you want to play : ");
        choice = Integer.parseInt(buf.readLine());
        clearScreen();
        switch (choice) {
            case 1 : {
                clearScreen();
                playCoinChaser();
                break;
            }
            case 2 : {
                clearScreen();
                playMovieGuessing();
                break;
            }
            case 3 : {
                clearScreen();
                playRockPaper();
                break;
            }
            case 4 : {
                clearScreen();
                playGuessingNumber();
                break;
            }
            case 5 : {
                clearScreen();
                playJavaQuiz();
                break;
            }
        }
    }
    public static void main(String[] args)throws IOException{

        clearScreen();
        Trial_2 RG = new Trial_2();

        System.out.println("\t\t\t\t\t**** WELCOME TO RETRO GAMES ****");
        System.out.println("\n\n1. Coin Chaser");
        System.out.println("2. Guess the Movie");
        System.out.println("3. Rock, Paper and Scissors");
        System.out.println("4. Number Guessing");
        System.out.println("5. Java Quiz");

        RG.mainMenu();
    }
}
