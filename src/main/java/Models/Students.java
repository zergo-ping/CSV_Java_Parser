package Models;

import java.util.ArrayList;
import java.util.List;

public class Students {

    private List<Person> students = new ArrayList<>();
    private List<Person> males_list = new ArrayList<>();
    private List<Person> females_list = new ArrayList<>();

    public void add_to_List(Person person){
        students.add(person);
        if(person.getGender() == "Male"){
            males_list.add(person);
        }else{
            females_list.add(person);
        }

    }

    public List<Person> getStudents(){
        return students;
    }

}
