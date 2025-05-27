
package Models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Person {

    private  String id;
    private String name;
    private String gender;
    private int exersise;
    private int homeWork;
    private int quastions;





    //public  Person(String name, String id,String group,String exersise,String homeWork,String quastions){
    //    this.name = name;
    //    this.id = id;
    //    this.group = group;
    //    this.exersise = exersise;
    //    this.homeWork = homeWork;
    //    this.quastions = quastions;
//
    //}



    public void setName( String name){
        this.name = name;
    }
    public void setID( String id){
        this.id = id;
    }
    public void setExersise( int exersise){
        this.exersise = exersise;
    }
    public void setHomeWork( int homeWork){
        this.homeWork = homeWork;
    }
    public void setQuastions( int quastions){
        this.quastions = quastions;
    }

    public String getName(){

        return name;
    }

    public String getID(){

        return id;
    }


    public int getExersise(){
        return exersise;
    }

    public int getHomeWork(){
        return homeWork;
    }

    public int getQuastions(){
        return quastions;
    }


    public String getGender(){
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public String inString(){
         return String.format("%s %s %s", name,id);
    }

}
