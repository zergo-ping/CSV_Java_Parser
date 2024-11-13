import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.opencsv.bean.CsvBindByName;

import com.opencsv.*;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;

public class Main {
    public static void main(String[] args) throws IOException, CsvException {

        CSVParser parser = new CSVParserBuilder().withSeparator(';').build();

        ArrayList<Person> personArrayList = new ArrayList<>();



        List<String[]> filteredData = new ArrayList<>();
        try(CSVReader reader = new CSVReaderBuilder(new FileReader("C:\\Users\\Никита\\Desktop\\10\\tableConvert.com_28e922.csv")).withCSVParser(parser).withSkipLines(3).build()){
            String[] line;
            while ((line = reader.readNext()) != null) {

                String str = Arrays.toString(line).substring(0);
                String[] parts = Arrays.toString(line).substring(1).split(";");
                Person person = new Person();
                person.setName(parts[0]);
                person.setPoints(Integer.parseInt(parts[3]));
                personArrayList.add(person);
                System.out.println(parts[3]);

            }

        }
        System.out.println(personArrayList.get(1).inString());


    }
}
