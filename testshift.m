clc;
clear all;
n=[-3:3];
x=[11 12 13 14 15 16 17];
[y,m]=sigshift(x,n,2);
subplot(3,1,1);
stem(n,x)
xlabel('no of samples');
ylabel('amplitude');
title('x(n)');
subplot(3,1,2);
stem(m,y)
xlabel('no of samples');
ylabel('amplitude');
title('x(n-2)');
[y1,n1]=sigshift(x,n,-3);
subplot(3,1,3);
stem(n1,y1)
xlabel('no of samples');
ylabel('amplitude');
title('x(n+3)');