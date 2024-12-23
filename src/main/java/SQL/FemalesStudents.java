package SQL;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "FemalesStudents")
public class FemalesStudents {

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

    public FemalesStudents() { }

    public FemalesStudents(String personID, String personName,String personGender, int personExersise,int personHomeWork,int personQuastions){
        this.personID = personID;
        this.personName = personName;
        this.personGender = personGender;
        this.personExersise = personExersise;
        this.personHomeWork = personHomeWork;
        this.personQuastions = personQuastions;
    }
}
