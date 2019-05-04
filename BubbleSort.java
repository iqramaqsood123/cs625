class BubbleSort{
public static void main(String[] args){
int num []={103,284,196,836,222,395,78,70,6,2};
int a,b,i,temp=0;
int size=10;

for(i=0;i<10;i++)
System.out.println("THE ORIGNAL ARRAY IS=" +num [i] );
for(a=1;a<size;a++)
for(b=size-1;b>=a;b--){
if(num[b-1]>num[b]){
temp=num[b-1];
num[b-1]=num[b];
num[b]=temp;
}}
for(i=0;i<size;i++)
System.out.println("THE ARRAY IS SORTED FORM=" +num [i] );
}
}