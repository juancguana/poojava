class Main {
  public static void main(String[] args) {
    System.out.println("Hola mundo");

    UberX uberX = new UberX("AMQ123", new Account("Andres Herrera", "1711054122"), "Chevrolet", "Sonic");
    uberX.setPassenger(4);
    uberX.printDataCar();

    UberVan uberVan = new UberVan("PDA3212", new Account("Andres Herrera", "1711054122"));
    uberVan.setPassenger(6);
    uberVan.printDataCar();

  }
}