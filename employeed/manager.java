
package employeedata;


public class manager extends member{
    private String dpt;
   
    public manager(String name, String Address, int phone_no, int salary, int age,String dpt) {
        super(name, Address, phone_no, salary, age);
        this.dpt = dpt;
    }

    

    @Override
     public String toString() {
        return "Employee{" +"name="+ getName()+ "  Address="+ getAddress()+"  phone_no=" +getPhone_no()+ "  salary="+ getSalary()+ " age=" + getAge()+ "    dpt=" + dpt + '}';
    }
    
    
}
