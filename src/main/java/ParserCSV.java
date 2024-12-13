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

    public static void CSVParser() throws IOException, CsvException {

        CSVParser parser = new CSVParserBuilder().withSeparator(';').build();

        ArrayList<Person> personArrayList = new ArrayList<>();

        Students students = new Students();


        CSVReader reader = new CSVReaderBuilder(new FileReader("C:\\Users\\Никита\\Desktop\\10\\java-rtf — копия(in).csv", Charset.forName("CP1251"))).withCSVParser(parser).withSkipLines(3).build();

        String[] lines;
        while((lines = reader.readNext()) != null){
            String[] line = Arrays.toString(lines).split(", ");


            Person person = new Person();
            person.setName(line[0]);
            person.setID(line[1]);
            if (line[2].charAt(0) == 'А') {
                person.setExersise(line[3]);
                person.setHomeWork(line[4]);
                person.setQuastions(line[5]);
            } else {
                person.setExersise(line[5]);
                person.setHomeWork(line[6]);
                person.setQuastions(line[7]);
            }



            System.out.print(person.getName() + " " + person.getExersise() + " " + person.getHomeWork() + " " + person.getQuastions() + "\n");



        }

    }

}
