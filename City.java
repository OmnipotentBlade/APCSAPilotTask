public class City {

    private String stateAbbr;
    private String placeName;
    private int population2010;
    private double noHealthInsurance;
    private double highBP;
    private double asthma;
    private double smoker;
    private double noLeisureExercise;
    private double obese;
    private double sleepDeprived;
    
    public City(String stateAbbr, String placeName, int population2010, double noHealthInsurance, double highBP, double asthma, double smoker, double noLeisureExercise, double obese, double sleepDeprived) {
        this.stateAbbr = stateAbbr;
        this.placeName = placeName;
        this.population2010 = population2010;
        this.noHealthInsurance = noHealthInsurance;
        this.highBP = highBP;
        this.asthma = asthma;
        this.smoker = smoker;
        this.noLeisureExercise = noLeisureExercise;
        this.obese = obese;
        this.sleepDeprived = sleepDeprived;
    }
    
    /****************** 
      Retrival Methods
    *******************/

    public String getStateAbbr() {
        return stateAbbr;
    }
    public String getPlaceName() {
        return placeName;
    }
    public int getPopulation2010() {
        return population2010;
    }
    public double getNoHealthInsurance() {
        return noHealthInsurance;
    }
    public double getHighBP() {
        return highBP;
    }
    public double getAsthma() {
        return asthma;
    } 
    public double getSmoker() {
        return smoker;
    }
    public double getNoLeisureExercise() {
        return noLeisureExercise;
    }
    public double getObese() {
        return obese;
    }
    public double getSleepDeprived() {
        return sleepDeprived;
    }

    public String toString() {
        return (
            "City data for " + placeName + ", " + stateAbbr + ":\n\n" +
            "City Population (2010): " + population2010 + "\n" +
            "% of People with No Health Insurance: " + noHealthInsurance + "\n" +
            "% of People with High Blood Pressure: " + highBP + "\n" +
            "% of People with Asthma: " + asthma + "\n" +
            "% of People who Smoke: " + smoker + "\n" +
            "% of People who do not Exercise: " + noLeisureExercise + "\n" +
            "% of People who are Obese: " + obese + "\n" +
            "% of People who are Sleep Deprived: " + sleepDeprived + "\n"
        );
    }
}
