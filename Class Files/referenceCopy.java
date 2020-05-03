//Harrison pierce
//JAVA II
//9/15/17
public class referenceCopy
{
	public static void main(String[] args)
	{

	int[] array1 = {2,4,6,8,10};
	int[] array2 = array1;

	array1[0]=200;

	array2[4]=1000;

	System.out.print(value+" ");
	for(int value : array1)
		System.out.print(value + " ");
		System.out.println();

	System.out.println("the contents of array2:");
	for(int value : array2)
		System.out.print(value + " ");

	System.out.println();
	}
}