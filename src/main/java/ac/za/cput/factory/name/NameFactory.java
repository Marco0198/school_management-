package ac.za.cput.factory.name;
/*
NameFactory.java
Factory for domain Name
@author: Anicka Schouw 217284183
June 2022
 */
import ac.za.cput.domain.name.Name;
import ac.za.cput.helper.StringHelper;

public class NameFactory {

    public static Name build(String firstName, String middleName, String lastName) {
        StringHelper.checkStringParam("firstName", firstName);
        StringHelper.checkStringParam("lastName", lastName);
        middleName = StringHelper.setEmptyIfNull(middleName);

        return new Name.Builder()
                .setFirstName(firstName)
                .setMiddleName(middleName)
                .setLastName(lastName)
                .build();

    }
}
