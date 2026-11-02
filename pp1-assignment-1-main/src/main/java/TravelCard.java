public class TravelCard {

    public static final int MAX_BALANCE = 200;

    private final int number;
    private int balance;
    private int tripCount;
    private Trip lastTrip;

    private static int nextNumber = 1001;

    public TravelCard() {
        this.number = nextNumber;
        nextNumber++;
        this.balance = 0;
        this.tripCount = 0;
        this.lastTrip = null;
    }


    public int getNumber() { return number; }
    public int getBalance() { return balance; }
    public int gettripCount() {return tripCount; }
    public Trip getLastTrip() { return lastTrip; }

    public static int getIssuedCount(){
        return nextNumber - 1001;
    }
    //topUp
    public boolean topUp(int amount) {
        if (amount <= 0) {
            return false;
        }
        if (balance + amount > MAX_BALANCE) {}
        return false;
    }
    //pay
    public boolean pay(int amount) {
        if (balance <= 0 ) {
            return false;
        }
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;

    }
    //travel
    public boolean Travel(Trip trip) {
       if (trip == null) {
           return false;

       }

       //använd pay för att inte upprepa kod
        if (!pay(trip.getPrice())) {
            return false;
        }

        tripCount++;
        lastTrip = trip;
        return true;

    }

    @Override
    public String toString() {
        String tripText;
        if (lastTrip == null) {
            tripText = " ingen resa ännu";
        } else {
            tripText = "senast" + lastTrip.toString();
        }
        return "kort" + number + ":" + balance + "euro" + tripCount +  "resor" + tripText;
    }

}
