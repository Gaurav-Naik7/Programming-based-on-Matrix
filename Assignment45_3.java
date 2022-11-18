// Program to accept matrix and return largest number from both the diagonals

import java.io.*;
import java.util.*;

class Assignment45_3
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
		iRet=mobj.MaxDiagonal(Arr,irow,icol);
		System.out.println("Largest number from both the diagonals is "+iRet);
	}
}

class Matrix
{
	public int MaxDiagonal(int Arr[][],int iRow,int iCol)
	{
		int i,j,iMax;
		
		iMax=Arr[0][0];

		for(i=0;i<iRow;i++)
		{			
			for(j=iCol;j>=1;j--)
			{
				if(i==j)
				{
					if(Arr[i][j]>iMax)
					{
						iMax=Arr[i][j];
					}
				}
			}
		}
		
		for(i = 0; i < iRow;i++)
		{
			if(Arr[i][iCol-1]>iMax)
			{
				iMax=Arr[i][iCol-1];
			}
			iCol--;
		}
		
		return iMax;
		
	}
}
