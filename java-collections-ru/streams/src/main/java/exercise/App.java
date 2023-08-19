package exercise;

import java.util.List;
import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;



// BEGIN
class App {
    public static int getCountOfFreeEmails(List<String> emails) {

    if (emails != null) {


           long result = emails.stream()
                    .filter(email -> StringUtils.isNotBlank(email))
                    .map(email -> email.split("@")[1])
                    .filter(email -> email.equals("yandex.ru") || email.equals("hotmail.com") || email.equals("gmail.com"))
                    .count();
            return Math.toIntExact(result);
            }
        else{return 0;}



    }
}
// END
