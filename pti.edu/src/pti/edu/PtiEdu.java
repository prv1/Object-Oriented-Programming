/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pti.edu;

/**
 *
 * @author phillip389
 */
public class PtiEdu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person per1;// TODO code application logic here
        per1 = new Person("Phillip", "Viau", "111 main", 12223, "7609842923");
        CollegeEmployee col1 = new CollegeEmployee("David", "Rapp", "123 oakedale", 51123, "4123452232", 999330201, "Office", 5.22f);
        Faculty fac1 = new Faculty("Mel", "Tomeo", "111 mckee rd", 15071, "4127695900", 999111000, "Teacher", 44.54f, true);
        Student stu1 = new Student("Zach", "Ree", "788 ten st", 15723, "4128875456", "Computer Programming", 4.0f);
        
        System.out.println(per1.toString());
        System.out.println(col1.toString());
        System.out.println(fac1.toString());
        System.out.println(stu1.toString());
        
        
        
    }
    
}
