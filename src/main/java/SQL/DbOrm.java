package SQL;

import Models.Person;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class DbOrm {

    private ConnectionSource connectionSource = null;

    private final String URL = "jdbc:sqlite:D:\\BD\\test1.s3db";




    private Dao<MalesStudents, String> MalesDao = null;

    private Dao<FemalesStudents, String> FemalesDao = null;

    public  void connect() throws SQLException {
        connectionSource = new JdbcConnectionSource(URL);

        FemalesDao = DaoManager.createDao(connectionSource, FemalesStudents.class);

        MalesDao = DaoManager.createDao(connectionSource, MalesStudents.class);
    }

    public void createMalesTable() throws SQLException{
        TableUtils.createTable(connectionSource, MalesStudents.class);
    }

    public void createFemalesTable() throws SQLException{
        TableUtils.createTable(connectionSource, FemalesStudents.class);
    }

    public void saveMales(List<Person> persons) throws SQLException{
        for(var person : persons){
            MalesDao.create(new MalesStudents(
                    person.getID(),
                    person.getName(),
                    person.getGender(),
                    person.getExersise(),
                    person.getHomeWork(),
                    person.getQuastions()
                    ));

        }
    }

    public void saveFemales(List<Person> persons) throws SQLException{
        for(var person : persons){
            FemalesDao.create(new FemalesStudents(
                    person.getID(),
                    person.getName(),
                    person.getGender(),
                    person.getExersise(),
                    person.getHomeWork(),
                    person.getQuastions()
            ));

        }
    }

    public Dao<MalesStudents, String> getMalesDao(){
        return MalesDao;
    }

    public Dao<FemalesStudents, String> getFemalesDao(){
        return FemalesDao;
    }

    public List<MalesStudents> getMaleStudentByName(String name) throws SQLException{
        return MalesDao.queryBuilder().where().eq(MalesStudents.name,name).query();
    }

    public List<FemalesStudents> getFemaleStudentByName(String name) throws SQLException{
        return FemalesDao.queryBuilder().where().eq(FemalesStudents.name,name).query();
    }

    public void close() throws Exception {
        connectionSource.close();
    }



}
