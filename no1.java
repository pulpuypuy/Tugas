import java.util.Scanner;

public class no1{
    public static void main(String[]args){
    Double r,volume,pi=3.14;
    Scanner s = new Scanner(System.in);
    System.out.print("Input jari-jari bola : ");
    r = s.nextDouble();
    
    volume = 4/3.0*pi*r*r*r;
    
    System.out.printf("Volume bola adalah : %.3f\n",volume);
    }
}