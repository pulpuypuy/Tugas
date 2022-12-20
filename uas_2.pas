program uas_2;
uses crt;
var
  angka,i :Integer;
  hasil:integer;
begin
clrscr();
  Write('Input Sebuah Angka : ');
  readln(angka);
  
  hasil:=1;
  for i:=1 to angka do
    begin
      hasil := hasil*i;
    end;
    
  writeln(angka,' Faktorial = ',hasil);
  readln;
end.
