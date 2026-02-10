import java.util.Scanner;

public class RockPaperScissorsGame {


    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3); // 0,1,2
        switch (choice) {
            case 0: return "rock";
            case 1: return "paper";
            default: return "scissors";
        }
    }


    public static String findWinner(String userChoice, String compChoice) {
        if (userChoice.equals(compChoice)) {
            return "draw";
        }
        if (userChoice.equals("rock")) {
            return (compChoice.equals("scissors")) ? "user" : "computer";
        } else if (userChoice.equals("paper")) {
            return (compChoice.equals("rock")) ? "user" : "computer";
        } else if (userChoice.equals("scissors")) {
            return (compChoice.equals("paper")) ? "user" : "computer";
        }
        return "invalid";
    }

    public static String[][] calculateStats(int userWins, int compWins, int totalGames) {
        String[][] stats = new String[2][3];

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf((userWins * 100.0) / totalGames) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.valueOf((compWins * 100.0) / totalGames) + "%";

        return stats;
    }


    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("\nGame\tUser Choice\tComputer Choice\tWinner");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i+1) + "\t" + gameResults[i][0] + "\t\t" +
                    gameResults[i][1] + "\t\t" + gameResults[i][2]);
        }

        System.out.println("\nFinal Stats:");
        System.out.println("Player\tWins\tWin %");
        System.out.println("---------------------------");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of games: ");
        int totalGames = sc.nextInt();
        sc.nextLine(); // consume newline

        String[][] gameResults = new String[totalGames][3];
        int userWins = 0, compWins = 0;

        for (int i = 0; i < totalGames; i++) {
            System.out.print("\nGame " + (i+1) + " - Enter your choice (rock/paper/scissors): ");
            String userChoice = sc.nextLine().toLowerCase();

            String compChoice = getComputerChoice();
            String winner = findWinner(userChoice, compChoice);

            if (winner.equals("user")) userWins++;
            else if (winner.equals("computer")) compWins++;

            gameResults[i][0] = userChoice;
            gameResults[i][1] = compChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, compWins, totalGames);


        displayResults(gameResults, stats);

        sc.close();
    }
}