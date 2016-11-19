/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee02;

/**
 *
 * @author phillip389
 */
public class Employee02 extends EmployeeClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee02 receptionist = new Employee02();// TODO code application logic here
        Employee03 deliveryPerson = new Employee03();
        
        receptionist.setEmpNum(47908);
        receptionist.setSalary(35.00);

        deliveryPerson.setEmpNum(59643);
        deliveryPerson.setSalary(25.00);
        System.out.println("Employee Number " + receptionist.getEmpNum() + " makes $" + receptionist.getSalary() + " per hour");
        System.out.println("Employee Number " + deliveryPerson.getEmpNum() + " makes $" + deliveryPerson.getSalary() + " per hour");
    }
   
    
    
    
}
