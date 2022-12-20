program uas_1;
uses crt;
var
  angka: Integer;
  bilangan :Integer;
  hasil1,hasil2:Integer;
  
begin
clrscr();
  Write('Input sebuah angka : ');
  readln(angka);
  bilangan:=1;
  while (bilangan<11) do
    begin
      hasil1:= angka mod bilangan;
      hasil2:= angka div bilangan;
      writeln(angka,':',bilangan,'= ',hasil2,' sisa ',hasil1);
      bilangan:=bilangan+1
    end;
  readln;
end.
