class MiHebra implements Runnable {
private int rep;
private char caracter;
    MiHebra(int rep, char caracter) {
        this.rep = rep;
        this.caracter=caracter;
    }

@Override
    public void run() {
    for (int i=0;i<rep;i++)
    {
        System.out.print(caracter);
    }

}
}
