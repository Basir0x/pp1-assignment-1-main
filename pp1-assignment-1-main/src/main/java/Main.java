void main() {
    Zone centrum = new Zone(1, "Centrum");
    Zone hamnen = new  Zone(2, "Hamnen");
    Zone Flygfältet = new Zone(3, "Flygfältet");

    //två kort
    TravelCard kort1 = new TravelCard();
    TravelCard kort2 = new TravelCard();
    IO.println(kort1);
    IO.println(kort2);

    //ladda kort
    kort1.topUp(100);
    kort2.topUp(10);

    //några resor på kortet

    Trip t1 = new Trip(centrum, centrum);
    Trip t2 = new Trip(centrum, hamnen);
    IO.println("Resa 1: " + kort1.travel(t1));
    IO.println("Resa 2: " + kort2.travel(t2));
    IO.println(kort1);

    //misslyckad resa pgv låg saldo

    Trip t3 = new Trip(centrum, hamnen);
    IO.println("kort 2 resor: " + kort2.travel(t3));
    IO.println(kort2);

    //ogiltig belopp

    IO.println("ladda 500 euro: " + kort1.topUp(500));
    IO.println("betala -5 euro: " + kort1.pay(-5));

    //utfärade kort
    IO.println("utfärdade kort: " + TravelCard.getIssuedCount());





}
