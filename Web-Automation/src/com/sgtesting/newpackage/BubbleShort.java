package com.sgtesting.newpackage;

public class BubbleShort {
	
	static void bubbleshort(int a[])
	{
		int n=a.length;
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<(n-i);j++)
			{
				if(a[j-1]>a[j])
				{
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
					
				}
				
				
			}
			System.out.println(a[i]);
		}
		 
	}

	public static void main(String[] args) {
		int a[]={10,2,5,77,8};
		BubbleShort.bubbleshort(a);

	}

}
