import java.io.*;
public class pallin
{
	boolean palin(String str)
	{
		String str1="";
		int l=str.length();
		for(int i=l-1;i>=0;i--)
		{
			char ch=str.charAt(i);
			str1=str1+ch;
		}
		if(str1.compareTo(str)==0)
			return true;
		else
			return false;
	}
	void check(String str)
	{
		int l=str.length();
		String strar[]=new String[l];
		for(int i=0;i<l;i++)
		{
			strar[i]="";
		}
		int p=0;
		String str1= new String();
		str1="";
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				str1="";
				if(str.charAt(i)==str.charAt(j))
				{
					for(int k=i;k<=j;k++)
					{
						str1=str1+str.charAt(k);
					}
					if(palin(str1))
					{
						strar[p]=str1;
						p++;
					}
				}
			}
		}
		String max="";
		max=strar[0];
		for(int i=0;i<l-1;i++)
		{
			//System.out.println(strar[i]);
			int l1=strar[i+1].length();
			if(max.length()<l1)
				max=strar[i+1];		
		}
		System.out.println(max);
	}
	public static void main(String[] args)throws IOException
	{
		String str="";
		System.out.println("Enetr the string");
		BufferedReader Obj=new BufferedReader(new InputStreamReader(System.in));
		str=Obj.readLine();
		pallin a=new pallin();
		a.check(str);
	}
}
