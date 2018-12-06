package companyimplemented;

import interfaces.Company;

public class PrivateLimited implements Company {

    private static String maxNumberOfOwners = "25 only";

    @Override
    public String getMaxNumberOfOwners() {
        return maxNumberOfOwners;
    }
}
