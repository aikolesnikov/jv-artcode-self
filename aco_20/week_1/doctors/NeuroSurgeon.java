package doctors;

import java.util.Scanner;

/**
 * second one
 */
public class NeuroSurgeon extends Surgeon {

    @Override
    String performOperaion(String opKind) {
        switch (opKind) {
            case "First":
                return "Some results from First.";
            case "Second":
                return "Some results from First.";
            default:
                return "Report os required.";
        }
    }


    @Override
    public String specialization() {
        Scanner sc = new Scanner(System.in);
        String inputrequst = sc.next();

        if (!(inputrequst == null)) return inputrequst;
        else return "undefined";
    }
}
