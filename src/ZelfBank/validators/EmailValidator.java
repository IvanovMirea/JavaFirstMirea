package ZelfBank.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TASK-23
//23 - создаем класс для проверки на корректность введенного email адреса
public class EmailValidator {

    private Pattern pattern;
    private Matcher matcher;

    //задаем регулярное выражение для дальнейшей проверки
    private static final String EMAIL_PATTERN = "^[A-Za-z0-9+_.-]+@(.+)$";

    //компиляция регулярного выражения
    public EmailValidator() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    //выполнение проверки
    public boolean validate(final String hex) {
        matcher = pattern.matcher(hex);
        return matcher.matches();
    }
}
