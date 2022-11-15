program while_do;
uses crt;
var
  i,angka,batas :Integer;
  
begin
  clrscr();
  write('Input angka kelipatan yang diinginkan : ');
  ReadLn(angka);
  Write('Input batasan angka yang ingin ditampilkan : ');
  ReadLn(batas);
  
  i := angka;
  writeln('Bilangan kelipatan ',angka,'antara 0 - ',batas,':');
  while (i<=batas) do
    begin
      write(i, ' ');
      i := i + angka;
    end;
  readln;
  
end.
