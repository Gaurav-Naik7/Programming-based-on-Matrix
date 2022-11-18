// Program to accept matrix and one number from user and return frequency of that number

import java.io.*;
import java.util.*;

class Assignment45_2
{
	public static void main(String arg[])
	{
		int i=0,j=0,iRet=0;
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number of rows: ");
		int irow=sobj.nextInt();
		
		System.out.println("Enter the number of columns: ");
		int icol=sobj.nextInt();
		
		System.out.println("Enter one number: ");
		int ino=sobj.nextInt();
		
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
		iRet=mobj.freq(Arr,irow,icol,ino);
		System.out.println("Frequency of the number is "+iRet);
	}
}

class Matrix
{
	public int freq(int Arr[][],int iRow,int iCol,int iNo)
	{
		int i,j,iFreq=0;
		
		for(i=0;i<iRow;i++)
		{
			for(j=0;j<iCol;j++)
			{
				if(Arr[i][j]==iNo)
				{
					iFreq++;
				}
			}
		}
		return iFreq;
	}
}
