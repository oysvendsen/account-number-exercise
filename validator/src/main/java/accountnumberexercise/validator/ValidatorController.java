package accountnumberexercise.validator;

import com.evry.fs.enterprise.converter.accountnumber.CountryCode;
import com.evry.fs.enterprise.core.validation.accountnumber.ValidateBban;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidatorController {

    @GetMapping("/ping")
    public void ping(){}

    @GetMapping("/")
    public void root(){}

    @GetMapping("/validate")
    public boolean validate(String bban) {
        if (ValidateBban.validatePattern(bban, CountryCode.NORWAY)) {
            return ValidateBban.validateControlDigits(bban, CountryCode.NORWAY);
        } else {
            return false;
        }
    }
}
