public class MiHebraB extends Thread{
    private int rep;
    private char caracter;
    MiHebraB(int rep, char caracter){
        this.rep = rep;
        this.caracter = caracter;
    };

    @Override
    public void run(){
        for(int i=0;i<rep;i++){
            System.out.println(caracter);
        }
    }
}
