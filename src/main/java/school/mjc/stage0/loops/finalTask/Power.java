package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
     int x=numberToPrint;
     if(power==1){
      System.out.println(x);
     }else{
      for(int i=2;i<=power;i++){
       x*=numberToPrint;} 
      System.out.println(x);} 
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
