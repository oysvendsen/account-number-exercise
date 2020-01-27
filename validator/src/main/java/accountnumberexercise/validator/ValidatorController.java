package accountnumberexercise.validator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.regex.Pattern;

@RestController
public class ValidatorController {

    public static final Pattern BBAN_PATTERN = Pattern.compile("[0-9]{11}");
    public static final int[] WEIGHTS = new int[] { 5, 4, 3, 2, 7, 6, 5, 4, 3, 2, 1 };

    @GetMapping("/ping")
    public void ping(){}

    @GetMapping("/")
    public void root(){}

    @GetMapping("/validate")
    public boolean validate(String bban) {
        if (bban == null || bban.isEmpty() || bban.length() != WEIGHTS.length) {
            return false;
        } else {
            return validateControlDigits(bban);
        }
    }

    private boolean validateControlDigits(final String bban) {
        int sum = 0;
        for (int index = 0; index < bban.length(); index++) {
            sum += Character.getNumericValue(bban.charAt(index)) * WEIGHTS[index];
        }
        int modEleven = sum % 11;
        return modEleven == 0;
    }
}
