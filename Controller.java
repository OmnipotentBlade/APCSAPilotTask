import java.util.ArrayList;

public class Controller {
    
    /**
     * Loads dataset from .csv file.
     * 
     * @author Coby Henrichsen, with some minor changes by Ahmed Osman
     * @return ArrayList of all data in provided .csv file, encapsulated in City objects
     */
    public static ArrayList<City> dataLoad() {

        ArrayList<City> data = DataReader.readData("HealthyCities.csv");

        System.out.println("There are " + data.size() + " entries in the file!\n");

        return data;
    }
}
