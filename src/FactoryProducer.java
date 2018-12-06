import exceptions.OwnerMatchNotFoundException;
import factories.CompanyFactory;
import factories.OwnerFactory;
import factories.PersonFactory;

public class FactoryProducer {

    private static String COMPANY = "company";
    private static String PERSON = "person";

    public static OwnerFactory getFactory(String type) throws OwnerMatchNotFoundException {
        if(type.equals(COMPANY)){
            return new CompanyFactory();
        }else if(type.equals(PERSON)){
            return new PersonFactory();
        }
        throw new OwnerMatchNotFoundException();
    }
}
