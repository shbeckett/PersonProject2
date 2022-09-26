package com.qa.personproject2.entities;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;


import org.springframework.stereotype.Indexed;

@Entity(name = "skypeople")
public class Person implements java.io.Serializable{ //serailizable technically not necessary

    @Id
    private int id;
    @size(min = 2, max = 30)
    @NotNull
    private String firstName;
    @size(min=2, max=30)
    private String lastName;
    @min(18)
    @max(75)
    private int age; 

    public Person()
    {
    }

    public Person(int id, String firstName, String lastName, int age){
        this.id = id
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
