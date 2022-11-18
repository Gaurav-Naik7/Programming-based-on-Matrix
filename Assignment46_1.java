// Program to accept matrix from user and display transpose of the matrix

import java.io.*;
import java.util.*;

class Assignment46_1
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
		mobj.Transpose(Arr,irow,icol);
	}
}

class Matrix
{
	public void Transpose(int Arr[][],int iRow,int iCol)
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
		
		for(i=0;i<iRow/2+1;i++)
		{
			for(j=i;j<iCol;j++)
			{
				temp=Arr[i][j];
				Arr[i][j]=Arr[j][i];
				Arr[j][i]=temp;
			}
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
