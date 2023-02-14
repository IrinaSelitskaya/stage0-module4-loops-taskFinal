package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
     for(int i=0;i<cathetusLength;i++){
      for(int j=0;j<cathetusLength-i-1;j++){
        System.out.print(" ");}
      for(int k=0;k<2*i+1;k++){
        int x=i+1-k;
        if(x>=1){
         System.out.print(x);
        }else{
         System.out.print(k-i+1);}
      }
      System.out.println();}
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
