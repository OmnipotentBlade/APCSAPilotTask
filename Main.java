import java.util.ArrayList;

public class Main {

    private static ArrayList<City> cities = DataReader.readData();

    public static void main(String[] args) {
        
        for (int i = 0; i < 3; i++) {
            System.out.println(cities.get((int) ((Math.random() * cities.size()) + 1)));
        }

        getHighestPopulation();
        getHighestAsthma();
        getHighestNoLeisureExercise();
        getHighestNoHealthInsurance();
        getHighestHighBP();
        getHighestObese();
        getHighestSleepDeprived();
        getHighestSmoker();

        System.out.println("\nThe average Population for all cities is " + calcAveragePopulation() + " people.");
        System.out.println("The average percentage for people with Asthma for all cities is " + calcAverageAsthma() + "%.");
        System.out.println("The average percentage for people who do not get Exercise for all cities is " + calcAverageNoLeisureExercise() + "%.");
        System.out.println("The average percentage for people with no Health Insurance for all cities is " + calcAverageNoHealthInsurance() + "%.");
        System.out.println("The average percentage for people with High Blood Pressure for all cities is " + calcAverageHighBP() + "%.");
        System.out.println("The average percentage for people who are Obese for all cities is " + calcAverageObese() + "%.");
        System.out.println("The average percentage for people who were Sleep Deprived for all cities is " + calcAverageSleepDeprived() + "%.");
        System.out.println("The average percentage for people who Smoke for all cities is " + calcAverageSmoker() + "%.");
    }

    /*******************
     Calculation Methods
    ********************/

    public static double calcAveragePopulation() {
        int total = 0;
        int count = 0;

        for (int i = 0; i < cities.size(); i++) {
            total += cities.get(i).getPopulation2010();
            count++;
        }
        return ((double) total / count);
    }
    public static double calcAverageNoHealthInsurance() {
        double total = 0;
        int count = 0;

        for (int i = 0; i < cities.size(); i++) {
            total += cities.get(i).getNoHealthInsurance();
            count++;
        }
        return (double)(total / count);
    }
    public static double calcAverageHighBP() {
        double total = 0;
        int count = 0;

        for (int i = 0; i < cities.size(); i++) {
            total += cities.get(i).getHighBP();
            count++;
        }
        return (double)(total / count);
    }
    public static double calcAverageAsthma() {
        double total = 0;
        int count = 0;

        for (int i = 0; i < cities.size(); i++) {
            total += cities.get(i).getAsthma();
            count++;
        }
        return (double)(total / count);
    }
    public static double calcAverageSmoker() {
        double total = 0;
        int count = 0;

        for (int i = 0; i < cities.size(); i++) {
            total += cities.get(i).getSmoker();
            count++;
        }
        return (double)(total / count);
    }
    public static double calcAverageNoLeisureExercise() {
        double total = 0;
        int count = 0;

        for (int i = 0; i < cities.size(); i++) {
            total += cities.get(i).getNoLeisureExercise();
            count++;
        }
        return (double)(total / count);
    }
    public static double calcAverageObese() {
        double total = 0;
        int count = 0;

        for (int i = 0; i < cities.size(); i++) {
            total += cities.get(i).getObese();
            count++;
        }
        return (double)(total / count);
    }
    public static double calcAverageSleepDeprived() {
        double total = 0;
        int count = 0;

        for (int i = 0; i < cities.size(); i++) {
            total += cities.get(i).getSleepDeprived();
            count++;
        }
        return (double)(total / count);
    }

    /*******************
     Comparison Methods
    ********************/

    public static void getHighestPopulation() {
        int max = 0;
        int index = 0;

        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).getPopulation2010() > max) {
                max = cities.get(i).getPopulation2010();
                index = i;
            }
        }

        System.out.println(cities.get(index).getPlaceName() + ", " + cities.get(index).getStateAbbr() + ", with " + cities.get(index).getPopulation2010() + " people, is the city with the highest population.");
    }
    public static void getHighestNoHealthInsurance() {
        double max = 0;
        int index = 0;

        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).getNoHealthInsurance() > max) {
                max = cities.get(i).getNoHealthInsurance();
                index = i;
            }
        }

        System.out.println(cities.get(index).getPlaceName() + ", " + cities.get(index).getStateAbbr() + ", with " + cities.get(index).getNoHealthInsurance() + "%, is the city with the highest percentage of citizens with no health insurance.");
    }
    public static void getHighestHighBP() {
        double max = 0;
        int index = 0;

        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).getHighBP() > max) {
                max = cities.get(i).getHighBP();
                index = i;
            }
        }

        System.out.println(cities.get(index).getPlaceName() + ", " + cities.get(index).getStateAbbr() + ", with " + cities.get(index).getHighBP() + "%, is the city with the highest percentage of citizens with high blood pressure.");
    }
    public static void getHighestAsthma() {
        double max = 0;
        int index = 0;

        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).getAsthma() > max) {
                max = cities.get(i).getAsthma();
                index = i;
            }
        }

        System.out.println(cities.get(index).getPlaceName() + ", " + cities.get(index).getStateAbbr() + ", with " + cities.get(index).getAsthma() + "%, is the city with the highest percentage of citizens with asthma.");
    }
    public static void getHighestSmoker() {
        double max = 0;
        int index = 0;

        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).getSmoker() > max) {
                max = cities.get(i).getSmoker();
                index = i;
            }
        }

        System.out.println(cities.get(index).getPlaceName() + ", " + cities.get(index).getStateAbbr() + ", with " + cities.get(index).getSmoker() + "%, is the city with the highest percentage of citizens who smoke.");
    }
    public static void getHighestNoLeisureExercise() {
        double max = 0;
        int index = 0;

        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).getNoLeisureExercise() > max) {
                max = cities.get(i).getNoLeisureExercise();
                index = i;
            }
        }

        System.out.println(cities.get(index).getPlaceName() + ", " + cities.get(index).getStateAbbr() + ", with " + cities.get(index).getNoLeisureExercise() + "%, is the city with the highest percentage of citizens who lead a leisurely life with no exercise.");
    }
    public static void getHighestObese() {
        double max = 0;
        int index = 0;

        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).getObese() > max) {
                max = cities.get(i).getObese();
                index = i;
            }
        }

        System.out.println(cities.get(index).getPlaceName() + ", " + cities.get(index).getStateAbbr() + ", with " + cities.get(index).getObese() + "%, is the city with the highest percentage of citizens who are obese.");
    }
    public static void getHighestSleepDeprived() {
        double max = 0;
        int index = 0;

        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).getSleepDeprived() > max) {
                max = cities.get(i).getSleepDeprived();
                index = i;
            }
        }

        System.out.println(cities.get(index).getPlaceName() + ", " + cities.get(index).getStateAbbr() + ", with " + cities.get(index).getSleepDeprived() + "%, is the city with the highest percentage of citizens who are sleep deprived.");
    }
}
