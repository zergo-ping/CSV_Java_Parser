public class Person {

    private String name;

    private int points;



    public int getPoints(){
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getName(){

        return name;
    }

    public void setName( String name){
        this.name = name;
    }

    public String inString(){
         return String.format("%s %d", name, points);
    }
}
