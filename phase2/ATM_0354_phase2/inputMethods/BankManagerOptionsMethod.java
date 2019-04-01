package ATM_0354_phase2.inputMethods;

import ATM_0354_phase2.InputMethod;
import ATM_0354_phase2.Main;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BankManagerOptionsMethod implements InputMethod {
    /**
     * Display the BankManager Options Screen.
     *
     * @param in The Scanner Object
     * @return The state that should be moved to next
     */
    @Override
    public String run(Scanner in) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println("Today's date is: "+ Main.atm.getDateTime().format(formatter) + "\n");
        System.out.println("======= Bank Manager Panel =======");
        System.out.println("Options:\nA. 'create users'\nB. 'approve account creation requests'\nC. 'refill cash'" +
                "\nD. 'undo recent transactions'\nE. 'process email cheques'" +
                "\nF. 'view admin panel'\nG. 'shutdown'\nX. 'logout'");
        System.out.println("What would you like to do?");
        System.out.print(">");
        String input = in.nextLine();
        while (true) {
            switch (input.toLowerCase()) {
                case "create users":
                case "a":
                    return "UserCreationScreen";
                case "approve account creation requests":
                case "b":
                    return "IndividualAccountApprove";
                case "refill cash":
                case "c":
                    return "RefillCash";
                case "undo recent transactions":
                case "d":
                    return "UndoTransaction";
                case "process email cheques":
                case "e":
                    return "ProcessEmailCheques";
                case "logout":
                case "x":
                    return "Logout";
                case "view admin panel":
                case "f":
                    return "AdminPanel";
                case "shutdown":
                case "g":
                    return "Shutdown";
                default:
                    System.out.println("Invalid option, please try again.");
                    System.out.print(">");
                    input = in.nextLine();
            }
        }
    }
}
