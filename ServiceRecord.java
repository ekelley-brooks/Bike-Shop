public class ServiceRecord {
    private String description = "";
    private double accumulatedCost = 0.0;
    private boolean compleation = false;

    public ServiceRecord(String d, double c){
        description = d;
        accumulatedCost = c;
    }

    public String getDescription(){
        return description;
    }

    public double getCost(){
        return accumulatedCost;
    }

    public boolean getCompleation(){
        return compleation;
    }

    public void addServiceHours(double hours, String reason){
        String lowerReason = reason.toLowerCase();
        description += hours + " hours of work done because " + lowerReason + ", ";
    }

    public void addCharge(double c){
        if (isvalid(c)){
            accumulatedCost += c;
        }
    }

    private boolean isvalid(double c){
        if (c > 0){
            return true;
        } else {
            return false;
        }
    }

    public void compleateService(){
        compleation = true;
    }

    public String toString(){
        return "Discription: " + description + "\nTotal Cost: $" + accumulatedCost;
    }
}

//What do you mean by mark a record compleate