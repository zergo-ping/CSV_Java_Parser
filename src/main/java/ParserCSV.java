import Models.Person;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

import Models.Students;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;


public class ParserCSV {

    public static void CSVParser(Students students) throws IOException, CsvException {

        CSVParser parser = new CSVParserBuilder().withSeparator(';').build();

        ArrayList<Person> personArrayList = new ArrayList<>();



        CSVReader reader = new CSVReaderBuilder(new FileReader("C:\\Users\\Никита\\Desktop\\10\\java-rtf — копия(in).csv", Charset.forName("CP1251"))).withCSVParser(parser).withSkipLines(3).build();

        String[] lines;
        while((lines = reader.readNext()) != null){
            String[] line = Arrays.toString(lines).split(", ");


            Person person = new Person();
            person.setName(line[0].replace("[",""));
            person.setID(line[1]);
            if (line[3].charAt(0) == 'А' && Character.isDigit(line[4].charAt(0))) {
                person.setExersise(Integer.parseInt(line[4]));
                person.setHomeWork(Integer.parseInt(line[5]));
                person.setQuastions(Integer.parseInt(line[6]));
            } else {
                person.setExersise(Integer.parseInt(line[5]));
                person.setHomeWork(Integer.parseInt(line[6]));
                person.setQuastions(Integer.parseInt(line[7]));
            }
            person.setGender(API.APIRequest(person.getName()));
            students.add_to_List(person);




            //System.out.print(person.getName() + " " + person.getExersise() + " " + person.getHomeWork() + " " + person.getQuastions() + "\n");



        }

    }

}
