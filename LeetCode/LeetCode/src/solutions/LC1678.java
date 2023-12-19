package solutions;

import java.util.ArrayList;
import java.util.List;

public class LC1678 {

    public String interpret(String command) {

        command = command.replace("()", "o");
        command = command.replace("(al)", "al");

        return command;

    }

}
