package personimplemented;

import interfaces.Person;

public class Child implements Person {

    private static String ageRange = "5 to 11";

    @Override
    public String getAgeRange() {
        return ageRange;
    }
}
