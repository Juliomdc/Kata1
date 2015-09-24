/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Person {
   private final Date birth;
   private String name;
   private String surname;

    public Person(Date birth, String name, String surname) {
        this.birth = birth;
        this.name = name;
        this.surname = surname;
    }

    public Date getBirth() {
        return birth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFullName() {
        return name+" "+surname;
                
    }

    public int getAge() {
        Date today = new Date();
        return (int)((today.getTime()-birth.getTime())/(1000*60*60*24*365.25));
    }  
    
    
      
}
