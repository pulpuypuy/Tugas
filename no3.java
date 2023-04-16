import java.io.BufferedReader;
import java.io.InputStreamReader;

public class no3{
    public static void main(String[]args )throws Exception{
        String nama;
        int jarak,harga=0,disc=0,total=0;
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Nama Customer : ");
        nama = br.readLine();
        System.out.print("Jarak yang akan ditempuh (KM) : ");
        jarak = Integer.parseInt(br.readLine());
        
        if (jarak<=4){
            harga=9500;
        }else if (jarak>5){
            harga=9500+((jarak-4)*2500);
        }
        
        if (jarak<=10){
            disc=0;
        }else if(jarak<=15){
            disc=2000;
        }else{
            disc=5000;
        }
        
        total= harga-disc;
        System.out.println("Selamat, anda mendapatkan potongan Rp. "+disc);
        System.out.println("Tarif yang harus dibayarkan "+nama+" adalah sebesar "+total);
        
        
        
        
        
        
    }
}