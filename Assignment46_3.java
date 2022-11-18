// Program to accept matrix from user and reverse the contents of each columns

import java.io.*;
import java.util.*;

class Assignment46_3
{
	public static void main(String arg[])
	{
		int i=0,j=0,iRet=0;
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number of rows: ");
		int irow=sobj.nextInt();
		
		System.out.println("Enter the number of columns: ");
		int icol=sobj.nextInt();
		
		int Arr[][]=new int[irow][icol];
		
		System.out.println("Enter the elements");
		for(i=0;i<Arr.length;i++)
		{
			for(j=0;j<Arr[i].length;j++)
			{
				Arr[i][j]=sobj.nextInt();
			}
		}
		
		Matrix mobj=new Matrix();
		mobj.ReverseColumn(Arr,irow,icol);
	}
}

class Matrix
{
	public void ReverseColumn(int Arr[][],int iRow,int iCol)
	{
		int i,j,temp=0,iSum=0;
		
		System.out.println("Input Matrix");
		
		for(i=0;i<iRow;i++)
		{
			for(j=0;j<iCol;j++)
			{
				System.out.print(Arr[i][j]+" ");
			}
			System.out.println();
		}
		int temp1=iRow;
		for(j=0;j<iCol;j++)
		{
			for(i=0;i<iRow;i++)
			{
				temp=Arr[iRow-1][j];
				Arr[iRow-1][j]=Arr[i][j];
				Arr[i][j]=temp;
				iRow--;
			}
			iRow=temp1;
		}
		
		System.out.println("Transpose Matrix");
		
		for(i=0;i<iRow;i++)
		{
			for(j=0;j<iCol;j++)
			{
				System.out.print(Arr[i][j]+" ");
			}
			System.out.println();
		}

	}
}
