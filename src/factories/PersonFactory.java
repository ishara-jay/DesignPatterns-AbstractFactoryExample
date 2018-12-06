package factories;

import exceptions.CompanyMatchNotFoundException;
import interfaces.Company;
import interfaces.Person;
import personimplemented.Adult;
import personimplemented.Child;
import personimplemented.Teen;

public class PersonFactory extends OwnerFactory{

    public Person getPerson(int age){
        if(age<13){
            return new Child();
        }else if(age<19){
            return new Teen();
        }else{
            return new Adult();
        }
    }

    @Override
    public Company getCompany(int numberOfOwners) throws CompanyMatchNotFoundException {
        return null;
    }

}
