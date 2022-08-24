clc;
clear all;
close all;
n1=[-3:2];
x1=[9 2 3 4 3 1];
n2=[-2:4];
x2=[2 3 1 2 1 4 3];
subplot(2,2,1)
stem(n1,x1)
xlabel('no of samples');
ylabel('amplitude');
title('x1(n1)');
subplot(2,2,2)
stem(n2,x2)
xlabel('no of samples');
ylabel('amplitude');
title('x2(n2)');
[y,n]=sigmult(x1,n1,x2,n2)
subplot(2,2,[3,4])
stem(n,y)
xlabel('no of samples');
ylabel('amplitude');
title('x1(n1)*x2(n2)');

