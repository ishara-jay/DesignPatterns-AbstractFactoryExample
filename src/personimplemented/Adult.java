package personimplemented;

import interfaces.Person;

public class Adult implements Person {

    private static String ageRange = "18 onwards";

    @Override
    public String getAgeRange() {
        return ageRange;
    }
}
