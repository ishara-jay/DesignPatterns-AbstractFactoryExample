package personimplemented;

import interfaces.Person;

public class Teen implements Person {

    private static String ageRange= "12 to 18";

    @Override
    public String getAgeRange() {
        return ageRange;
    }

}
