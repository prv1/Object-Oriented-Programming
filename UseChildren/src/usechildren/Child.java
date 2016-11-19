/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usechildren;

/**
 *
 * @author phillip389
 */
public abstract class Child {
    private String name, gender;
    private int age;
    public abstract void setAge();
    public abstract void display();
    
    public Child(String name, String gender){
        this.name = name;
        this.age = age;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String toString(){
        return "Name: " + name + " Gender: " + gender + " Age: " + age;
    }
    
    public void ask(String text){
        System.out.print(text);
    }
}
