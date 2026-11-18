public class BikeShop{
    private static final double LABOR_RATE = 65.0;
    private static int repairs = 0;
    
    public void serviceBike(Bycicle bike, double hours, String reason){
        double cost = chargeAmount(hours);
        if (isValid(hours)){
            bike.resetServiceNeeds();
            bike.editRecord(hours, reason, cost);
            repairs++;
        }
    }

    public double chargeAmount(double hours){
        if (isValid(hours)){
            return hours*LABOR_RATE;
        } else {
           return 0.0; 
        }
    }

    private boolean isValid(double hours){
        if (hours > 0){
            return true;
        } else {
            return false;
        }
    }

    public int getRepairs(){
        return repairs;
    }
}