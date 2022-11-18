// Program to accept matrix from user and check whether matrix is identity or not

import java.io.*;
import java.util.*;

class Assignment46_4
{
	public static void main(String arg[])
	{
		int i=0,j=0;
		
		boolean bRet;
		
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
		bRet=mobj.ChkIdentity(Arr,irow,icol);
		if(bRet==true)
		{
			System.out.println("It is an identity matrix");
		}
		else
		{
			System.out.println("It is not an identity matrix");
		}
	}
}

class Matrix
{
	public boolean ChkIdentity(int Arr[][],int iRow,int iCol)
	{
		int i,j,temp=0,iSum=0;
		
		for(i=0;i<iRow;i++)
		{
			for(j=0;j<iCol;j++)
			{
				if(i==j)
				{
					if(Arr[i][j]!=1)
					{
						return false;
					}
				}
				else
				{
					if(Arr[i][j]!=0)
					{
						return false;
					}
				}
			}
		}
		return true;
	}
}
