
class Pattern{
public static void main(String[] args){
int rows =1;
for(int i=1;i<=7;i++)
{
int k=0;
for(int j=1;j<=rows;j++)
{
if(j<=i)
{
k=k+1;
}
else
{
k=k-1;
}

System.out.print(k + " ");
}
System.out.println(" ");
rows=rows+2;
}
}
}