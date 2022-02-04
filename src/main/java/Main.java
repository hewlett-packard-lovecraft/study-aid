import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface(new ArrayList<Quiz>());
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            ui.help();
            ui.listQuizzes();

            String input = scanner.nextLine();
            String command = input.split(" ")[0];

            try {
                switch (command) {
                    case "help":
                        ui.help();
                        break;
                    case "exit":
                        running = false;
                        break;
                    case "new":
                        String optionNew = input.split(" ")[1];
                        ui.newQuiz(optionNew);
                        break;
                    case "run":
                        String optionRun = input.split(" ")[1];
                        ui.runQuiz(optionRun);
                        break;
                    default:
                        System.err.println("invalid command");
                }
            } catch (IndexOutOfBoundsException e) {
                System.err.println("invalid quiz name");
            }

        }
    }
}
