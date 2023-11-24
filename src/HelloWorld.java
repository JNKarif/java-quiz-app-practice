import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        // Set up a Scanner for user input
        Scanner userInputScanner = new Scanner(System.in);

        // Initialize counters for correct answers and total questions
        int correctAnswersCounter = 0;
        int totalQuestions = 5;

        // First Question
        System.out.println("\nQuestion 1: In what year did the COVID-19 pandemic begin?");
        System.out.println("A) 2018\nB) 2019\nC) 2020\nD) 2021");
        char userAnswer1 = getUserAnswer(userInputScanner);

        // Check the answer for Question 1 using switch-case
        switch (userAnswer1) {
            case 'C':
                correctAnswersCounter++;
                break;
            // We can add more cases if needed
        }

        // Second Question
        System.out.println("\nQuestion 2: Which year did the Summer Olympics take place in Tokyo?");
        System.out.println("A) 2016\nB) 2018\nC) 2020\nD) 2022");
        char userAnswer2 = getUserAnswer(userInputScanner);

        // Check the answer for Question 2 using if-else
        if (userAnswer2 == 'D') {
            correctAnswersCounter++;
        }

        // Third Question
        System.out.println("\nQuestion 3: In what year did the Perseverance rover land on Mars?");
        System.out.println("A) 2018\nB) 2019\nC) 2020\nD) 2021");
        char userAnswer3 = getUserAnswer(userInputScanner);

        // Check the answer for Question 3 using if-else
        if (userAnswer3 == 'D') {
            correctAnswersCounter++;
        }

        // Fourth Question
        System.out.println("\nQuestion 4: When was the first version of GPT-3 released?");
        System.out.println("A) 2018\nB) 2019\nC) 2020\nD) 2021");
        char userAnswer4 = getUserAnswer(userInputScanner);

        // Check the answer for Question 4 using switch-case
        switch (userAnswer4) {
            case 'D':
                correctAnswersCounter++;
                break;
            // we can add more cases if needed
        }

        // Fifth Question
        System.out.println("\nQuestion 5: What year did the COVID-19 vaccine distribution start?");
        System.out.println("A) 2019\nB) 2020\nC) 2021\nD) 2022");
        char userAnswer5 = getUserAnswer(userInputScanner);

        // Check the answer for Question 5 using switch-case
        switch (userAnswer5) {
            case 'C':
                correctAnswersCounter++;
                break;
            // we can add more cases if needed
        }

        // Calculate and display the final score
        double correctPercentage = ((double) correctAnswersCounter / totalQuestions) * 100;
        System.out.println("\nYour Final Score: " + correctAnswersCounter + " out of " + totalQuestions);
        System.out.printf("Percentage: %.2f%%\n", correctPercentage);

        // Close the Scanner
        userInputScanner.close();
    }

    // Helper method to collect user answer and ensure validity
    private static char getUserAnswer(Scanner scanner) {
        char userAnswer;
        do {
            System.out.print("Your answer (A, B, C, or D): ");
            userAnswer = Character.toUpperCase(scanner.next().charAt(0));
        } while (userAnswer != 'A' && userAnswer != 'B' && userAnswer != 'C' && userAnswer != 'D');
        return userAnswer;
    }
}
