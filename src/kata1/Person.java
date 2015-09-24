/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author usuario
 */
public class Person {
   private final Calendar birth;
   private String name;
   private String surname;
   private final long MILLISECOND_PER_YEAR = (long) (1000*60*60*24*365.25);

    public Person(Calendar birth, String name, String surname) {
        this.birth = birth;
        this.name = name;
        this.surname = surname;
    }

    public Calendar getBirth() {
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
        Calendar today;
        today= GregorianCalendar.getInstance();
        return (int)(mimetodo(today.getTimeInMillis()-birth.getTimeInMillis()));
    }  
    
    private long mimetodo(long millis){
        return millis / MILLISECOND_PER_YEAR;
    }
    
    
    
      
}
