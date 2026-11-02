public class Trip {

    private final Zone from;
    private final Zone to;

    public Trip (Zone from, Zone to) {
        this.from = from;
        this.to = to;
    }

    public Zone getFrom() {return from;}
    public Zone getTo() {return to;}

    public int getPrice() {
        int distance = Math.abs(to.getNumber() - from.getNumber());
        return 3 + distance;

    }
    @Override
    public String toString() {
        return from.getNumber() + " till" + to.getName() + "(" + getPrice() + "euro)";
    }
}


