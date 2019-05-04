public class MinMax2
{
public static void main(String args[])
{
int nums[] = new int [99,-10,100123,18,-978,5623,463,-9,287,49};
int min,max;
min=max=nums[0];
for(i=1;i<10;i++;)
{
if (nums[i] < min) min = max[i];
if (nums[i] > max) max = nums[i];
}
system.out.println("min and max:" + min + " " + max);
 }
}