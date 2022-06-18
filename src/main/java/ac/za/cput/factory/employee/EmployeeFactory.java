package ac.za.cput.factory.employee;

import ac.za.cput.domain.employee.Employee;
import ac.za.cput.domain.name.Name;
import ac.za.cput.helper.StringHelper;

public class EmployeeFactory {
    public static Employee createEmployee(String staffId, String email, Name name) {
        StringHelper.checkStringParam("staffId", staffId);
        StringHelper.checkStringParam("email", email);
        StringHelper.checkStringParam("firstname", name.firstName);
        StringHelper.checkStringParam("lastname", name.lastName);
        StringHelper.checkStringParam("middle name", name.middleName);


        return new Employee.Builder().setStaffId(staffId).setEmail(email).setName(name).build();
    }
}