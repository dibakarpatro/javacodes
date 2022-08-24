clc;
clear all;
n0=0;
n1=-20;
n2=20;
[y,n]=stepseq(n0,n1,n2)
stem(n,y)
xlabel('no of samples');
ylabel('amplitude');
title('step sequence');