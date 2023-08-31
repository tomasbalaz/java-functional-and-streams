package sk.balaz.combinatornpattern;

import java.util.function.Function;

import static sk.balaz.combinatornpattern.PersonRegistrationValidator.*;
import static sk.balaz.combinatornpattern.PersonRegistrationValidator.ValidationResult.*;
import static sk.balaz.combinatornpattern.PersonRegistrationValidator.ValidationResult.EMAIL_NOT_VALID;

public interface PersonRegistrationValidator extends Function<Person, ValidationResult> {

    static PersonRegistrationValidator isEmailValid() {
        return person -> person.email().contains("@") ?
                SUCCESS : EMAIL_NOT_VALID;
    }

    static PersonRegistrationValidator isPhoneNumberValid() {
        return person -> person.phoneNumber().contains("07") ?
                SUCCESS : PHONE_NUMBER_NOT_VALID;
    }

    static PersonRegistrationValidator isEmailTaken() {
        return person -> SUCCESS;
    }

    default PersonRegistrationValidator and (PersonRegistrationValidator other) {
        return person -> {
            ValidationResult result = this.apply(person);
            return result.equals(SUCCESS) ? other.apply(person) : result;
        };
    }

    enum ValidationResult {
        SUCCESS,
        PHONE_NUMBER_NOT_VALID,
        EMAIL_NOT_VALID,
        IS_NOT_AN_ADULT
    }
}
