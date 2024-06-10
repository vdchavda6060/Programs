
package employeedata;

public class Employee extends member {
    private String specialization;
    
    public Employee(String name, String Address, int phone_no, int salary, int age,String specialization) {
        super(name,Address,phone_no,salary,age);
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Employee{" +"name="+ getName()+ "  Address="+ getAddress()+"  phone_no=" +getPhone_no()+ "  salary="+ getSalary()+ " age=" + getAge()+ "    specialization=" + specialization + '}';
    }
    
    
}
