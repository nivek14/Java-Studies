package solutions.Java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HrTimeConversion {

    public String timeConversion(String s) throws ParseException {
        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
        Date date = parseFormat.parse(s);
        return displayFormat.format(date);
    }

}
