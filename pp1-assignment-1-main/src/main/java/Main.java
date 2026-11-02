void main() {
    Zone centrum = new Zone(1, "centrum");
    Zone stocholm = new  Zone(2, "stocholm");
    Zone flygplatsen = new Zone(3, "flygplatsen");

    //två kort
    TravelCard kort1 = new TravelCard();
    TravelCard kort2 = new TravelCard();
    IO.println(kort1);
    IO.println(kort2);

    //ladda kort
    kort1.topUp(100);
    kort2.topUp(10);

    //några resor på kortet

    Trip t1 = new Trip(centrum, stocholm);
    Trip t2 = new Trip(centrum, flygplatsen);
    IO.println("Resa 1: " + kort1.Travel(t1));
    IO.println("Resa 2: " + kort2.Travel(t2));
    IO.println(kort1);

    //misslyckad resa pgv låg saldo

    Trip t3 = new Trip(centrum, stocholm);
    IO.println("kort 2 resor: " + kort2.Travel(t3));
    IO.println(kort2);

    //ogiltig belopp

    IO.println("ladda 500 euro: " + kort1.topUp(500));
    IO.println("betala -5 euro: " + kort1.pay(-5));

    //utfärade kort
    IO.println("utfärdade kort: " + TravelCard.getIssuedCount());





}
