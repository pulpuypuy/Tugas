program uas_4;
uses crt;
var
  kolom,baris : integer;
  i,l :Integer;
begin
clrscr();
  write('Input jumlah baris : ');
  ReadLn(baris);
  write('Input jumlah kolom : ');
  ReadLn(kolom);
  
  for i:=1 to baris do
  begin
    for l:=1 to kolom do
      begin
        if (i+l) mod 2 = 1 then
          write('O')
        else
          write('X')
      end;
      writeln;
  end;
  readln;
end.
