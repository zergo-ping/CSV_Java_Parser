
package Models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Person {

    private String name;
    private String gender;
    private  String id;
    private String exersise;
    private String homeWork;
    private String quastions;
    private Map<String,String> Themes;





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
    public void setExersise( String exersise){
        this.exersise = exersise;
    }
    public void setHomeWork( String homeWork){
        this.homeWork = homeWork;
    }
    public void setQuastions( String quastions){
        this.quastions = quastions;
    }

    public String getName(){

        return name;
    }

    public String getID(){

        return id;
    }


    public String getExersise(){
        return exersise;
    }

    public String getHomeWork(){
        return homeWork;
    }

    public String getQuastions(){
        return quastions;
    }


    public String getGender(){
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setThemes(String key, String value){
        Themes.put(key,value);
    }



    public String getThemes(){
        return Themes.toString();
    }

    public String inString(){
         return String.format("%s %s %s", name,id);
    }

}
