program soal_3;
uses crt;
var
  nama : String;
  tarif : real;
  jarak_tempuh : real;
  diskon : Integer;
  hasil : real;  
begin
clrscr();
  write('Nama Customer : ');
  readln(nama);
  Write('Jarak yang akan ditempuh (Km) : ');
  readln(jarak_tempuh);
  
  if (jarak_tempuh>0) and (jarak_tempuh<=10) then
  begin
  diskon := 0
  end
  else if (jarak_tempuh>10) and (jarak_tempuh<=15) then
  begin
  diskon := 2000
  end
  else if (jarak_tempuh>15) then
  begin
  diskon := 5000
  end
  else
  begin
  writeln ('Masukan jarak yang valid')
  end;
  
  if (jarak_tempuh>0) and (jarak_tempuh<=4) then  
  begin
  tarif := 9500
  end
  else if (jarak_tempuh>4) then
  begin
  tarif := 9500 + (2500*(jarak_tempuh-4));
  end
  else
  begin
  writeln ('Masukan jarak yang valid')
  end;
  
  hasil := tarif - diskon;
  
  writeln('Selamat anda mendapatkan potongan Rp. ',diskon);
  writeln('Tarif yang harus dibayarkan ',nama);
  Write('adalah sebesar Rp ',hasil);
  readln;
end.
