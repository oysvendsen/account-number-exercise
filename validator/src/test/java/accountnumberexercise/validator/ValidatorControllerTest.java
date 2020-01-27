package accountnumberexercise.validator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidatorControllerTest {

    public static final ValidatorController VALIDATOR_CONTROLLER = new ValidatorController();

    @ParameterizedTest
    @CsvSource(value = {"20959500062","20959500127","20959500313","20959500380"})
    void validate_givenValidBban_returnsTrue(String validBban) {
        assertTrue(VALIDATOR_CONTROLLER.validate(validBban));
    }

    @ParameterizedTest
    @CsvSource(value = {"2095950065","20959500122","20955900313","20959510380"})
    void validate_givenInvalidControlDigits_returnsFalse(String invalidBban) {
        assertFalse(VALIDATOR_CONTROLLER.validate(invalidBban));
    }

    @ParameterizedTest
    @CsvSource(value = {"209595000620","2095950012007","209595313"})
    void validate_givenInvalidLength_returnsFalse(String invalidBban) {
        assertFalse(VALIDATOR_CONTROLLER.validate(invalidBban));
    }

    @Test
    void validate_givenEmptyString_returnsFalse() {
        assertFalse(VALIDATOR_CONTROLLER.validate(""));
    }

    @Test
    void validate_givenNull_returnsFalse() {
        assertFalse(VALIDATOR_CONTROLLER.validate(null));
    }
}