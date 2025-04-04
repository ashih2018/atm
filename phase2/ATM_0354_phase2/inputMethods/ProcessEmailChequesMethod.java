package ATM_0354_phase2.inputMethods;

import ATM_0354_phase2.InputMethod;
import ATM_0354_phase2.Main;

import java.util.Scanner;

public class ProcessEmailChequesMethod implements InputMethod {
    @Override
    public String run(Scanner in) {
        System.out.print("Would you like to process the cheques that have been sent electronically (yes/no)?\n>");
        if (VerifyInputs.verifyConfirmation(in)) Main.atm.processEmailCheques();
        return "BankManagerOptions";
    }
}
