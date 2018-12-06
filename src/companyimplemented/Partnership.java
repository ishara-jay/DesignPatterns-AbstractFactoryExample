package companyimplemented;

import interfaces.Company;

public class Partnership implements Company {

    private static String maxNumberOfOwners = "10 only";

    @Override
    public String getMaxNumberOfOwners() {
        return maxNumberOfOwners;
    }
}
