// Program to accept matrix from user and return addition of diagonal elements

import java.io.*;
import java.util.*;

class Assignment45_1
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
		iRet=mobj.AddDiagonal(Arr,irow,icol);
		System.out.println("Addition of diagonal elements is "+iRet);
	}
}

class Matrix
{
	public int AddDiagonal(int Arr[][],int iRow,int iCol)
	{
		int i,j,iSum=0;
		
		for(i=0;i<iRow;i++)
		{
			for(j=0;j<iCol;j++)
			{
				if(i==j)
				{
					iSum=iSum+Arr[i][j];
				}
			}
		}
		return iSum;
	}
}
