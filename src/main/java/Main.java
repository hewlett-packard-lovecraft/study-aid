import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface(new ArrayList<>());
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            ui.help();
            ui.listQuizzes();

            String input = scanner.nextLine();
            String[] command = input.split(" ");

            try {
                switch (command[0]) {
                    case "help":
                        ui.help();
                        break;
                    case "exit":
                        running = false;
                        break;
                    case "new":
                        ui.newQuiz(command[1]);
                        break;
                    case "run":
                        ui.runQuiz(command[1]);
                        break;
                    case "rm":
                        ui.removeQuiz(command[1]);
                    default:
                        System.err.println("invalid command");
                }
            } catch (IndexOutOfBoundsException e) {
                System.err.println("invalid quiz name");
            }

        }
    }
}
