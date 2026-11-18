public class Bycicle{
    private String owner = "";
    private String model = "";
    private int milage;
    private int serviceNeeds;
    private final int iD;
    private static int idCounter = 1;
    private ServiceRecord record;
    public Bycicle(String o, String m){
        owner = o;
        model = m;
        milage = 0;
        serviceNeeds = 0;
        iD = idCounter;
        idCounter++;

        record = new ServiceRecord("", 0.0);
    }

    public void ride(int m){
        if (m > 0){
            milage += m;
            serviceNeeds += m;
        }
    }

    public boolean needsService(){
        if (serviceNeeds > 500){
            return true;
        } else {
            return false;
        }
    }

    public ServiceRecord getServiceRecord(){
        return record;
    }

    public void resetServiceNeeds(){
        serviceNeeds = 0;
    }

    public void editRecord(double hours, String reason, double cost){
        record.addCharge(cost);
        record.addServiceHours(hours, reason);
        record.compleateService();
    }

    public int getMilage(){
        return milage;
    }

    public String getModel(){
        return model;
    }

    public String getOwner(){
        return owner;
    }

    public int getID(){
        return iD;
    }

    public String toString(){
        return "Bike " + iD + " is owned by " + owner + " and is a " + model + " bike with " + milage + " miles";
    }
}