package Models;

import java.util.ArrayList;
import java.util.List;

public class Students {


    List<Person> males_list = new ArrayList<>();
    List<Person> females_list = new ArrayList<>();

    public void add_to_List(Person person){
        if(person.getGender().contains("female")){
            females_list.add(person);
        }else{
            males_list.add(person);
        }

    }

    public List<Person> getMales_list(){
        return males_list;
    }

    public List<Person> getFemales_list(){
        return females_list;
    }


}
