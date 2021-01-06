package firstTask;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Adult
{
    public boolean is18Age(String inputDate){
        boolean result = false;
        final List<String> dateFormats = Arrays.asList("yyyy-MM-dd", "dd-MM-yyyy", "MM-dd-yyyy", "MM/dd/yyyy", "dd/MM/yyyy");
        SimpleDateFormat sdf;

        for (String format : dateFormats)
        {
            sdf = new SimpleDateFormat(format, new Locale("ru"));
            //дата не совпадают с форматом
            sdf.setLenient(false);
            try
            {
                if (sdf.parse(inputDate) != null)
                {
                    LocalDate dateOfBirth = LocalDate.parse(inputDate,
                                                            DateTimeFormatter.ofPattern(format));
                    LocalDate currentDate = LocalDate.now();
                    Period period = Period.between(dateOfBirth, currentDate);

                    if (period.getYears() >= 18){
                        result =  true;
                    }
                }
            }
            catch (ParseException e)

            {
            }
        }
        return result;
    }
}
