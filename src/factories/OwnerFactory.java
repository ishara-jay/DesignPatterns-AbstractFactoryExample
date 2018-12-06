package factories;

import exceptions.CompanyMatchNotFoundException;
import interfaces.Company;
import interfaces.Person;

public abstract class OwnerFactory {
    public abstract Person getPerson(int age);
    public abstract Company getCompany(int numberOfOwners) throws CompanyMatchNotFoundException;
}
