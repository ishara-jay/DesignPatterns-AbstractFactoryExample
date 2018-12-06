package factories;

import companyimplemented.Partnership;
import companyimplemented.PrivateLimited;
import exceptions.CompanyMatchNotFoundException;
import interfaces.Company;
import interfaces.Person;

public class CompanyFactory extends OwnerFactory {

    public Company getCompany(int numberOfOwners) throws CompanyMatchNotFoundException {
        if(numberOfOwners<11){
            return new Partnership();
        }
        else if(numberOfOwners<26){
            return new PrivateLimited();
        }
        throw new CompanyMatchNotFoundException();
    }

    @Override
    public Person getPerson(int age) {
        return null;
    }

}
