program soal_4;
uses crt;
var
  nilai1,nilai2,hasil : Integer;
  
begin
  clrscr();
  Write('Masukan Nilai 1 : ');
  ReadLn(nilai1);
  write('Masukan Nilai 2 : ');
  ReadLn(nilai2);
  
  if (nilai1=nilai2) then
  begin
  hasil := 0;
  end
  else if (nilai1>nilai2) and (nilai1 mod 6 = nilai2 mod 6) then
  begin
  hasil := nilai2;
  end
  else if (nilai1<nilai2) and (nilai1 mod 6 = nilai2 mod 6) then
  begin
  hasil := nilai1;
  end
  else if (nilai1>nilai2) then
  begin 
  hasil := nilai1;
  end
  else
  begin
  hasil := nilai2;
  end;

  
  WriteLn('Hasil : ',hasil);
  readln;
end.
