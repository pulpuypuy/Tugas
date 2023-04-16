import java.util.Scanner;

public class no2{
    public static void main(String[]args){
    int bil1,bil2,output;
    Scanner s = new Scanner(System.in);
    System.out.print("Angka pertama   : ");
    bil1 = s.nextInt();
    System.out.print("Angka Kedua     : ");
    bil2 = s.nextInt();
    if (bil1==bil2){
        output=bil1+bil2;
    }
    else{
        output=bil1*bil2;
    }
    System.out.println("Output : "+output);
    
    }
}