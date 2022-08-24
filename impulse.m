clc;
clear all;
close all;
n1=-3;
n2=3;
n0=0;
[y,n]=impseq(n0,n1,n2)
stem(n,y)
xlabel('no of samples');
ylabel('amplitude');
title('impulse sequence');