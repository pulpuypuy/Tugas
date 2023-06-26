import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class chochoJOption{
    public static void main (String[]args){
        int pilihan,harga=0,lamaSewa=0;
        double dp=0,total=0,sisa=0;
        long noHp=0;
        String tipeKamar="",nama="",alamat="",sewa = "";
        boolean ulang = false;
        
        LocalDate tglMasuk = LocalDate.now();
        LocalDate tglKeluar = tglMasuk.plusMonths(lamaSewa);
        
        do{
        pilihan=Integer.parseInt(JOptionPane.showInputDialog("=============================\nSelamat Datang di Chocho Kost\n=============================\nKami Menyediakan 3 Tipe Kamar Kost : \n1. Kamar Premium\n2. Kamar Elite\n3. Kamar Standar\n4. Keluar\nSilahkan Pilih 1-4 : "));
       
        switch (pilihan){
            case 1 : tipeKamar = "Kamar Premium";
            harga = 1500000;
            sewa=(JOptionPane.showInputDialog("=============================\n"+"        "+tipeKamar+"        \n"+"=============================\n"+"Fasilitas : "+"\n1. Kasur"+"\n2. Lemari"+"\n3. Meja Belajar"+"\n4. AC"+"\n5. TV"+"\n6. WiFi"+"\n7. Kamar Mandi Modern"+"\n8. Laundry"+"\n9. Dapur Umum"
            +"\nHarga : Rp "+harga+"/Bulan"+"\nApakah anda ingin menyewa Tipe ini? (y/n): "));
            if ("y".equalsIgnoreCase(sewa)){
                nama = JOptionPane.showInputDialog("Masukan Nama Anda   : ");
                alamat = JOptionPane.showInputDialog("Masukan Alamat Anda : ");
                noHp = Long.parseLong(JOptionPane.showInputDialog("Masukan No HP Anda : "));
                lamaSewa = Integer.parseInt(JOptionPane.showInputDialog("Lama Sewa (Bulan) : "));
                
                total = harga * lamaSewa;
                dp = 0.5 * total;
                sisa = total-dp;
        
                System.out.println("=============================");
                System.out.println("        Bukti Penyewaan      ");
                System.out.println("=============================");
                System.out.println(tipeKamar);
                System.out.println("Harga : Rp "+harga+"/Bulan");
                System.out.println("Nama                : "+nama);
                System.out.println("Alamat              : "+alamat);
                System.out.println("Lama Sewa           : "+lamaSewa+"(bulan)");
                System.out.println("Jumlah Pembayaran   : "+"Rp "+total);
                System.out.println("DP Pembayaran       : "+"Rp "+dp);
                System.out.println("Sisa Pembayaran     : "+"Rp "+sisa);
                System.out.println("Tanggal Masuk       : "+tglMasuk);
                System.out.println("Tanggal Keluar      : "+tglKeluar);
            }
            else{
                ulang=true;
            }
            break;
            
            case 2 : tipeKamar = "Kamar Elite";
            harga = 1000000;
            sewa=(JOptionPane.showInputDialog("=============================\n"+"        "+tipeKamar+"        \n"+"=============================\n"+"Fasilitas : "+"\n1. Kasur"+"\n2. Lemari"+"\n3. Meja Belajar"+"\n4. AC"+"\n5. WiFi"
            +"\n6. Kamar Mandi"+"\n7. Dapur Umum"+"\nHarga : Rp "+harga+"/Bulan"+"\nApakah anda ingin menyewa Tipe ini? (y/n): "));
            if ("y".equalsIgnoreCase(sewa)){
                nama = JOptionPane.showInputDialog("Masukan Nama Anda   : ");
                alamat = JOptionPane.showInputDialog("Masukan Alamat Anda : ");
                noHp = Long.parseLong(JOptionPane.showInputDialog("Masukan No HP Anda : "));
                lamaSewa = Integer.parseInt(JOptionPane.showInputDialog("Lama Sewa (Bulan) : "));
                
                System.out.println("=============================");
                System.out.println("        Bukti Penyewaan      ");
                System.out.println("=============================");
                System.out.println(tipeKamar);
                System.out.println("Harga : Rp "+harga+"/Bulan");
                System.out.println("Nama                : "+nama);
                System.out.println("Alamat              : "+alamat);
                System.out.println("Lama Sewa           : "+lamaSewa+"(bulan)");
                System.out.println("Jumlah Pembayaran   : "+"Rp "+total);
                System.out.println("DP Pembayaran       : "+"Rp "+dp);
                System.out.println("Sisa Pembayaran     : "+"Rp "+sisa);
                System.out.println("Tanggal Masuk       : "+tglMasuk);
                System.out.println("Tanggal Keluar      : "+tglKeluar);
            }
            else{
                ulang=true;
            }
            break;
            
            case 3 : tipeKamar = "Kamar Standard";
            harga = 800000;
            sewa=(JOptionPane.showInputDialog("=============================\n"+"        "+tipeKamar+"        \n"+"=============================\n"+"Fasilitas : "+"\n1. Kasur"+"\n2. Lemari"+"\n3. WiFi"+"\n4. Kamar Mandi"+"\n5. Dapur Umum"+"\nHarga : Rp "+harga+"/Bulan"+"\nApakah anda ingin menyewa Tipe ini? (y/n): "));
            if ("y".equalsIgnoreCase(sewa)){
                nama = JOptionPane.showInputDialog("Masukan Nama Anda   : ");
                alamat = JOptionPane.showInputDialog("Masukan Alamat Anda : ");
                noHp = Long.parseLong(JOptionPane.showInputDialog("Masukan No HP Anda : "));
                lamaSewa = Integer.parseInt(JOptionPane.showInputDialog("Lama Sewa (Bulan) : "));
                
                System.out.println("=============================");
                System.out.println("        Bukti Penyewaan      ");
                System.out.println("=============================");
                System.out.println(tipeKamar);
                System.out.println("Harga : Rp "+harga+"/Bulan");
                System.out.println("Nama                : "+nama);
                System.out.println("Alamat              : "+alamat);
                System.out.println("Lama Sewa           : "+lamaSewa+"(bulan)");
                System.out.println("Jumlah Pembayaran   : "+"Rp "+total);
                System.out.println("DP Pembayaran       : "+"Rp "+dp);
                System.out.println("Sisa Pembayaran     : "+"Rp "+sisa);
                System.out.println("Tanggal Masuk       : "+tglMasuk);
                System.out.println("Tanggal Keluar      : "+tglKeluar);
            }
            else{
                ulang=true;
            }
            break;
            
            case 4 :
                System.exit(0);
            break;
        }
        }while(pilihan<1 || pilihan>4 || ulang);
        
        }
    }
