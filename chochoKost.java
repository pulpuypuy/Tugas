import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;

public class chochoKost{
    public static void main (String[]args){
        int pilihan,harga=0,lamaSewa=0, total=0,sisa=0;
        double dp=0;
        long noHp=0;
        String tipeKamar="",nama="",alamat="";
        boolean sewa = false;
        
        Scanner s = new Scanner(System.in);

        DecimalFormat formatUang = new DecimalFormat("#,###.##");
        String uangFormatted = formatUang.format(harga);
        uangFormatted = "Rp "+uangFormatted;

        do {
        System.out.println("=============================");
        System.out.println("Selamat Datang di Chocho Kost");
        System.out.println("=============================");
        System.out.println("Kami Menyediakan 3 Tipe Kamar Kost : ");
        System.out.println("\n1. Kamar Premium"+"\n2. Kamar Elite"+"\n3. Kamar Standar"+"\n4. Keluar");
        System.out.println("Silahkan Pilih 1-4 : ");
        pilihan = s.nextInt();
        
        switch (pilihan){
            case 1 : tipeKamar = "Kamar
            System.out.println("=============================");
            System.out.println("        "+tipeKamar+"        ");
            System.out.println("=============================");
            System.out.println("\nFasilitas : ");
            System.out.println("\n1. Kasur"+"\n2. Lemari"+"\n3. Meja Belajar"+"\n4. AC"+"\n5. TV"+"\n6. WiFi"
            +"\n7. Kamar Mandi Modern"+"\n8. Laundry"+"\n9. Dapur Umum");
            harga = 1500000;
            System.out.println("Harga : "+uangFormatted+"/Bulan");
            System.out.println("Apakah anda ingin menyewa Tipe ini? (y/n): ");
            sewa = s.next().equalsIgnoreCase("Y");
            if (sewa){
                System.out.println("=============================");
                System.out.println("      Formulir Penyewaan     ");
                System.out.println("=============================");
                System.out.println("Masukan Nama Anda : ");
                nama = s.next();
                System.out.println("Masukan Alamat Anda : ");
                alamat = s.next();
                System.out.println("Masukan No HP Anda : ");
                noHp = s.nextLong();
                System.out.println("Lama Sewa (Bulan) : ");
                lamaSewa = s.nextInt();
            }
            break;
            
            case 2 : tipeKamar = "Kamar Elite";
            System.out.println("=============================");
            System.out.println("        "+tipeKamar+"        ");
            System.out.println("=============================");
            System.out.println("\nFasilitas : ");
            System.out.println("\n1. Kasur"+"\n2. Lemari"+"\n3. Meja Belajar"+"\n4. AC"+"\n5. WiFi"
            +"\n6. Kamar Mandi"+"\n7. Dapur Umum");
            harga = 1000000;
            System.out.println("Harga : "+uangFormatted+"/Bulan");
            System.out.println("Apakah anda ingin menyewa Tipe ini? (y/n): ");
            sewa = s.next().equalsIgnoreCase("Y");
            if (sewa){
                System.out.println("=============================");
                System.out.println("      Formulir Penyewaan     ");
                System.out.println("=============================");
                System.out.println("Masukan Nama Anda : ");
                nama = s.next();
                System.out.println("Masukan Alamat Anda : ");
                alamat = s.next();
                System.out.println("Masukan No HP Anda : ");
                noHp = s.nextLong();
                System.out.println("Lama Sewa (Bulan) : ");
                lamaSewa = s.nextInt();
            }
            break;
            
            case 3 : tipeKamar = "Kamar Standard";
            System.out.println("=============================");
            System.out.println("        "+tipeKamar+"        ");
            System.out.println("=============================");
            System.out.println("\nFasilitas : ");
            System.out.println("\n1. Kasur"+"\n2. Lemari"+"\n3. WiFi"+"\n4. Kamar Mandi"+"\n5. Dapur Umum");
            harga = 800000;
            System.out.println("Harga : "+uangFormatted+"/Bulan");
            System.out.println("Apakah anda ingin menyewa Tipe ini? (y/n): ");
            sewa = s.next().equalsIgnoreCase("Y");
            if (sewa){
                System.out.println("=============================");
                System.out.println("      Formulir Penyewaan     ");
                System.out.println("=============================");
                System.out.println("Masukan Nama Anda : ");
                nama = s.next();
                System.out.println("Masukan Alamat Anda : ");
                alamat = s.next();
                System.out.println("Masukan No HP Anda : ");
                noHp = s.nextLong();
                System.out.println("Lama Sewa (Bulan) : ");
                lamaSewa = s.nextInt();    
            }
            break;
            
            case 4 : 
            System.out.println("Program berakhir");
            System.exit(0);
            break;
          
        }
        }while(pilihan<1 || pilihan>4 || !sewa);
        
        LocalDate tglMasuk = LocalDate.now();
		LocalDate tglKeluar = tglMasuk.plusMonths(lamaSewa);
		
        total = uangFormatted * lamaSewa;
        dp = 0.5 * total;
        sisa = total-dp;
        
        System.out.println("=============================");
        System.out.println("        Bukti Penyewaan      ");
        System.out.println("=============================");
        System.out.println(tipeKamar);
        System.out.println("Nama                : "+nama);
        System.out.println("Alamat              : "+alamat);
        System.out.println("Lama Sewa           : "+lamaSewa+"(bulan)");
        System.out.println("Jumlah Pembayaran   : "+total);
        System.out.println("Tanggal Masuk       : "+tglMasuk);
        System.out.println("Tanggal Keluar      : "+tglKeluar);
        System.out.println("DP Pembayaran       : "+dp);
        System.out.println("Sisa Pembayaran     : "+sisa);
        
    }
}