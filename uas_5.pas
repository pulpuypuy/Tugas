program uas_5;
uses crt;
var
  bilangan : array[1..5] of integer;
  i : Integer;
  
begin
clrscr();
  for i:=1 to 5 do
    begin
      write('Input bilangan ke-',i,': ');
      readln(bilangan[i]);
    end;
    
  for i:=1 to 5 do
    begin
      writeln(bilangan[i],' X ',i,' = ',bilangan[i]*i);
    end;
  readln;
end.
