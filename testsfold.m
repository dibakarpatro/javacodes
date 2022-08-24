clc;
clear all;
close all;
x=[1 4 2 5 7 3];
n=-2:3;
[y,m]=sigfold(x,n)
subplot(2,1,1)
stem(n,x)
xlabel('no of samples');
ylabel('amplitude');
title('input sequence');
subplot(2,1,2)
stem(m,y)
xlabel('no of samples');
ylabel('amplitude');
title('folded sequence');