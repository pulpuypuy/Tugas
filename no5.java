import java.util.Scanner;

public class no5{
    public static void main(String[]args){
    double jasa=0,pendapatan=0;
    double gaji=3100000;
    double komisi=0,total;
    Scanner s = new Scanner(System.in);
    
    System.out.print("Masukan pendapatan staff marketing perbulan : Rp. ");
    pendapatan = s.nextInt();
    
    if (pendapatan>0){
        if (pendapatan<=2000000){
            jasa=100000;
            komisi=0.1*pendapatan;
        }else if (pendapatan>2000000 && pendapatan<5000000){
            jasa=200000;
            komisi=0.15*pendapatan;
        }else if (pendapatan>=5000000){
            jasa=300000;
            komisi=0.25*pendapatan;
        }
    }else{
        jasa=0;
        komisi=0;
    }
    total=jasa+komisi+gaji;
    
    System.out.println("------------------------------------------------");
    System.out.println("UANG JASA               : Rp."+jasa);
    System.out.println("------------------------------------------------");
    System.out.println("UANG KOMISI             : Rp."+komisi);
    System.out.println("------------------------------------------------");
    System.out.println("UANG PENDAPATAN TOTAL   : Rp."+total);
    System.out.println("------------------------------------------------");
    
    }
}