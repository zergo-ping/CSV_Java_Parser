package SQL;


import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "MalesStudents")
public class MalesStudents {

    public static final String name = "personName";

    @DatabaseField
    private String personID;

    @DatabaseField
    private String personName;

    @DatabaseField
    private String personGender;

    @DatabaseField
    private int personExersise;

    @DatabaseField
    private int personHomeWork;

    @DatabaseField
    private int personQuastions;

    public MalesStudents() { }

    public MalesStudents(String personID, String personName,String personGender, int personExersise,int personHomeWork,int personQuastions){
        this.personID = personID;
        this.personName = personName;
        this.personGender = personGender;
        this.personExersise = personExersise;
        this.personHomeWork = personHomeWork;
        this.personQuastions = personQuastions;
    }

    @Override
    public String toString(){
        return personID + personName + personGender + personExersise + personHomeWork + personQuastions;
    }

}
