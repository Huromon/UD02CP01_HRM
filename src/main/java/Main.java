public class Main {

    public static void main(String[] args) {
        System.out.println("mientras que los Hilos creados con Runneable  parece que mantienen el orden");
        System.out.println("los hilos con .start() se van mezclando entre ellos al solaparse los unos con los otros");
        System.out.println("con run");
       MiHebra hebra1 = new MiHebra(17,'A');
       MiHebra hebra2 = new MiHebra(15,'B');
       MiHebra hebra3 = new MiHebra(16,'C');
       hebra1.run();
       hebra2.run();
       hebra3.run();

        System.out.println("\n con start");
        MiHebraB hebraB1 = new MiHebraB(17,'D');
        MiHebraB hebraB2 = new MiHebraB(15,'E');
        MiHebraB hebraB3 = new MiHebraB(16,'F');
        hebraB1.start();
        hebraB2.start();
        hebraB3.start();



    }


}
