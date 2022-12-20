program uas_3;
uses crt;
var
  batas,ganjil,genap,i:Integer;
  
begin
clrscr();
  write('Input batasan angka : ');
  ReadLn(batas);
  writeln('angka - angka yang merupakan kelipatan 3 atau 5 kurang dari ',batas,' adalah = ');
  
  ganjil:=0;
  genap:=0;
  
  for i:=1 to batas-1 do
    begin
      if(i mod 3=0) or (i mod 5=0) then
        begin
        write(i,' ');
          if(i mod 2 = 0) then
            begin
            genap:=genap+1
            end
           else 
            begin
            ganjil:=ganjil+1
            end
        end
    end;
  writeln();  
  writeln('Jumlah angka genap : ',genap,' angka');
  WriteLn('Jumlah angka ganjil : ',ganjil,' angka');
  readln;
  
end.
