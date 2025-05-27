import Models.Students;
import SQL.DbOrm;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Students students = new Students();
        ParserCSV.CSVParser(students);
        var db = new DbOrm();
        db.connect();
        db.createMalesTable();
        db.saveMales(students.getMales_list());
        db.createFemalesTable();
        db.saveFemales(students.getFemales_list());
        db.close();




    }

}
