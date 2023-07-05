import java.util.Scanner;

public class ahmadsaifulla{
    public static void main(String[]args){
        String menu = "",lagi="";
        boolean ulang = false;
        int pilihan = 0,potongan = 0,i,j;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Silahkan Tentukan Pilihan Menu yang Mau Anda Kerjakan");
        System.out.print("Mulai Tentukan Pilihan Anda [y/t] ? ");
        menu = s.nextLine();
    
        do{
        if (menu.equalsIgnoreCase("y")){
            System.out.println("1 : Pilih > Tarif Sewa Kendaraan");
            System.out.println("2 : Pilih > Perubahan Kelipatan Angka dengan '#'");
            System.out.println("3 : Pilih > Membuat Kelipatan Angka Akhir");
            System.out.println("4 : Pilih > Perulangan 'X' dan 'O' ");
            System.out.println("5 : Pilih > Data Penjualan Gamis");
            System.out.println("6 : Pilih > Pendaftaran Mahasiswa Baru");
            System.out.println();
            System.out.print("Masukkan pilihan anda : ");
            pilihan = s.nextInt();
            
            switch(pilihan){
                case 1 :
                    System.out.println("-----------------------------------");
                    System.out.println("* MENGHITUNG TARIF SEWA KENDARAAN *");
                    System.out.println("-----------------------------------");
                    System.out.println("*Promo IDUL ADHA*");
                    System.out.println("#Kendaraan >=3#");
                    System.out.println("-Lama sewa >= 3 hari Potongan 200.000");
                    System.out.println("-Lama sewa <= 2 hari Potongan 100.000");
                    System.out.println("#Kendaraan <=2#");
                    System.out.println("-Lama sewa >= 3 hari Potongan 50.000");
                    System.out.println("-Lama sewa <= 2 hari tidak dapat Potongan");
                    System.out.println();
                    System.out.print("Masukan Penyewa Kendaraan       : ");
                    String penyewa = s.next();
                    System.out.print("Masukan Jumlah Kendaraan Sewa   : ");
                    int jumlah = s.nextInt();
                    System.out.print("Masukan Lama Sewa (Hari)        : ");
                    int lamaSewa = s.nextInt();
                    System.out.println("");
                    
                    int hargaSewa = 200000;
                    
                    if (jumlah<=2){
                        if (lamaSewa<=2){
                            potongan = 0;
                        }else if (lamaSewa>=3){
                            potongan = 50000;
                        }
                    }else if (jumlah>=3){
                        if (lamaSewa<=2){
                            potongan = 100000;
                        }else if (lamaSewa>=3){
                            potongan = 200000;
                        }
                    }
                    
                    int hargaKendaraan = jumlah * hargaSewa;
                    int tarif = hargaKendaraan * lamaSewa - potongan;
                    
                    System.out.println("Nama Penyewa          : "+penyewa);
                    System.out.println("Harga Kendaraan       : "+hargaKendaraan);
                    System.out.println("Anda dapat potongan   : "+potongan);
                    System.out.println("Tarif yang anda bayar : "+tarif);
                    System.out.println();
                    System.out.print("Input Pilihan Lagi [y/t] ? ");
                    lagi = s.next();
                    if(lagi.equalsIgnoreCase("y")){
                        ulang=true;
                    }else{
                        System.exit(0);
                    }
                    break;
                    
                case 2 :
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("* MENGHITUNG PERUBAHAN KELIPATAN ANGKA dengan '#' SESUAI INPUTAN*");
                    System.out.println("-----------------------------------------------------------------");
                    System.out.print("Input Angka Pertama   = ");
                    int angka1 = s.nextInt();
                    System.out.print("Input Angka Kedua     = ");
                    int angka2 = s.nextInt();
                    System.out.print("Input Angka Batas     = ");
                    int angkaBatas = s.nextInt();
                    
                    System.out.println();
                    i=1;
                    while(i<=angkaBatas){
                        if(i % angka1 == 0 || i % angka2 == 0){
                            System.out.print(" # ");
                            i++;
                        }else{
                            System.out.print(i+"");
                            i++;
                        }
                    }
                    System.out.println();
                    System.out.println();
                    System.out.print("Input Pilihan Lagi [y/t] ? ");
                    lagi = s.next();
                    if(lagi.equalsIgnoreCase("y")){
                        ulang=true;
                    }else{
                        System.exit(0);
                    }
                    break;
                    
                case 3 :
                    System.out.println("-----------------------------------");
                    System.out.println("* MEMBUAT KELIPATAN ANGKA AKHIR *");
                    System.out.println("-----------------------------------");
                    System.out.print("Input Angka Akhir   = ");
                    int akhir = s.nextInt();
                    System.out.print("Input Angka Batas   = ");
                    int batas = s.nextInt();
                    i=akhir;
                    do{
                        System.out.print(i+" ");
                        i+=10;
                    }while(i<batas);
                    System.out.println();
                    System.out.println();
                    System.out.print("Input Pilihan Lagi [y/t] ? ");
                    lagi = s.next();
                    if(lagi.equalsIgnoreCase("y")){
                        ulang=true;
                    }else{
                        System.exit(0);
                    }
                    break;
                    
                case 4 :
                    System.out.println("----------------------------------");
                    System.out.println("* MEMBUAT PERULANGAN 'X' dan 'O' *");
                    System.out.println("----------------------------------");
                    System.out.print("Input Baris   = ");
                    int baris = s.nextInt();
                    System.out.print("Input Kolom   = ");
                    int kolom = s.nextInt();
                    
                    for (i=1; i<=baris; i++){
                        for(j=1; j<=kolom; j++){
                          if(j%2==0){
                              System.out.print("O");
                          }else{
                              System.out.print("X");
                          }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    System.out.print("Input Pilihan Lagi [y/t] ? ");
                    lagi = s.next();
                    if(lagi.equalsIgnoreCase("y")){
                        ulang=true;
                    }else{
                        System.exit(0);
                    }
                    break;
                    
                case 5 :
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("    === Data Pemesanan Gamis/Sarimbit ===    ");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.print("Masukan Nama Penjaga        : ");
                    String penjaga = s.next();
                    System.out.print("Masukan Banyaknya Pesanan   : ");
                    int jumlahPesanan = s.nextInt();
                    
                    int[] hargaPesanan = new int[jumlahPesanan];
                    int[] kode = new int[jumlahPesanan];
                    for(i=0; i<jumlahPesanan; i++){
                        System.out.print("Pesanan ke "+(i+1)+"                : Rp.  ");
                        hargaPesanan[i] = s.nextInt();
                        System.out.print("Kode Barang                 : ");
                        kode[i] = s.nextInt();
                    }
                    double pendapatan=0;
                    for(i=0; i<jumlahPesanan; i++){
                        pendapatan += hargaPesanan[i];
                    }
                    double keuntungan = 0.1*pendapatan;
                    double pendapatanBersih = pendapatan - keuntungan;
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Hasil total Pendapatan  = Rp."+pendapatan);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Keuntungan 3 Barang     = Rp."+keuntungan);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Pendapatan Bersih       = Rp."+pendapatanBersih);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println();
                    
                    System.out.print("Input Pilihan Lagi [y/t] ? ");
                    lagi = s.next();
                    if(lagi.equalsIgnoreCase("y")){
                        ulang=true;
                    }else{
                        System.exit(0);
                    }
                    break;
                    
                case 6 :
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~``");
                    System.out.println("    === Data Pendaftaran Mahasiswa Baru ===    ");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~``");
                    System.out.print("Masukan Jumlah Data Mahasiswa: ");
                    int jumlahData = s.nextInt();
                    System.out.println();
                    String[][] dataMahasiswa = new String[jumlahData][3];
                    
                    for(i=0; i<jumlahData; i++){
                            System.out.println("Masukan Data Mahasiswa ke "+(i+1));
                            System.out.print("NIM       : ");
                            dataMahasiswa[i][0] = s.next();
                            System.out.print("NAMA      : ");
                            dataMahasiswa[i][1] = s.next();
                            System.out.print("JURUSAN   : ");
                            dataMahasiswa[i][2] = s.next();
                    }
                    
                    System.out.println("Data Mahasiswa yang Mendaftar Baru ");
                    System.out.println("NIM"+"            "+"NAMA"+"            "+"JURUSAN"+"            ");
                    
                    for(i=0; i<jumlahData; i++){
                            System.out.print(dataMahasiswa[i][0]+"          ");
                            System.out.print(dataMahasiswa[i][1]+"          ");
                            System.out.print(dataMahasiswa[i][2]+"          ");
                            System.out.println();
                    }
                    
                }
            }else{
                System.exit(0);    
            }
        
        }while(ulang);
    }
    }