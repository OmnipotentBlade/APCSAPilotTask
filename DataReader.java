import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataReader {
    
    /**
     * Method to read .csv files and store the indiviudal attributes of each city in an ArrayList object.
     * </p> Credit: Cody Henrichsen (https://youtu.be/IDMBEcHGeSU)
     * 
     * @param filename - The name of the .csv file to read from.
     * @return ArrayList of City objects.
     * @author Coby Henrichsen, with some minor changes by Ahmed Osman
     */
    public static ArrayList<City> readData(String filename) {
        ArrayList<City> dataList = new ArrayList<City>();

        File dataFile = new File(filename);

        try (Scanner fileScanner = new Scanner(dataFile);) {
            ArrayList<String> lines = new ArrayList<String>();

            while (fileScanner.hasNextLine()) {
                lines.add(fileScanner.nextLine());
            }

            for (int i = 0; i < lines.size(); i++) {
                String line = lines.get(i);
                String[] data = line.split(",");

                String stateAbbr = data[0];
                String placeName = data[1];
                int population2010 = Integer.parseInt(data[2]);
                double noHealthInsurance = Double.parseDouble(data[3]);
                double highBP = Double.parseDouble(data[4]);
                double asthma = Double.parseDouble(data[5]);
                double smoker = Double.parseDouble(data[6]);
                double noLeisureExercise = Double.parseDouble(data[7]);
                double obese = Double.parseDouble(data[8]);
                double sleepDeprived = Double.parseDouble(data[9]);

                City arr = new City(stateAbbr, placeName, population2010, noHealthInsurance, highBP, asthma, smoker, noLeisureExercise, obese, sleepDeprived);

                dataList.add(arr);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return dataList;
    }
}
