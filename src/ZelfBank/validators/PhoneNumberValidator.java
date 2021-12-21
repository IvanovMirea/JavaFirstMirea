package ZelfBank.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TASK-23
//23 - создаем класс для проверки на корректность введенного номера телефона
public class PhoneNumberValidator {

    private Pattern pattern;
    private Matcher matcher;

    //задаем регулярное выражение для дальнейшей проверки
    private static final String PHONE_PATTERN = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$";

    //компиляция регулярного выражения
    public PhoneNumberValidator() {
        pattern = Pattern.compile(PHONE_PATTERN);
    }

    //выполнение проверки
    public boolean validate(final String hex) {
        matcher = pattern.matcher(hex);
        return matcher.matches();
    }
}
