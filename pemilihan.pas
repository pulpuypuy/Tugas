program pemilihan;
uses crt;
var
  angka1,angka2,hasil : integer;
  jawaban : integer;
  perulangan : integer;
  
begin
clrscr();
  Randomize();
  angka1 := random(100);
  angka2 := random(100);
  
  perulangan := 5;
  hasil := angka1 + angka2;
  
  repeat
  begin
    write(angka1,'+',angka2,' : ');
    readln(jawaban);
      if (jawaban=hasil) then
        begin
          writeln('Jawaban Anda Benar');
          perulangan := perulangan*20;
          writeln('Nilai Anda : ',perulangan);
        end
      else
        begin
          writeln('Jawaban Anda Salah');
        end;
         
    perulangan:=perulangan-1;
    
      if (perulangan=0) then
          writeln('Nilai Anda : 0');
  end;
  until
    (jawaban=hasil) or (perulangan=0);
    writeln('Program Selesai');
    
  readln;
end.
  
