import java.io.BufferedReader;
import java.io.InputStreamReader;

public class no4{
    public static void main(String[]args )throws Exception{
        String jenisKamar="";
        int lamaInap=0,tarif=0,total=0;
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Jenis kelas kamar : ");
        jenisKamar = br.readLine();
        System.out.print("Lama menginap (dalam hari) : ");
        lamaInap = Integer.parseInt(br.readLine());
        
        switch (jenisKamar){
            case "Standard" : 
                if (lamaInap==1 || lamaInap<=2){
                    tarif=400000;
                }else if (lamaInap>2){
                    tarif=350000;
                }break;
                
            case "Eksekutif" :
                if (lamaInap==1 || lamaInap<=2){
                    tarif=1200000;
                }else if (lamaInap>2){
                    tarif=1000000;
                }break;
              
        }
        total = tarif * lamaInap;
        
        System.out.println("Total tarif yang harus dibayarkan adalah Rp. "+total);
        
        
        
        
    }
}