#include<iostream>
#include<cstring>
using namespace std;


int main()
{
    char str[1000];
    cin>>str;
    int l=strlen(str);
   
    int max_length=0;
    int flag=0;
    int initial,final;
    for(int i=0;i<l;i++)
    {
        for(int j=i+1;j<l;j++)
        {
            flag=0;
            for(int k=i;k<=(j+1)/2;k++)
            {
       
                if(str[k] != str[j-k+i])               //Most important part
                    {
                        flag=1;
                        break;
                    }
               
                if(flag==0 && j-i>max_length)
                    {
                        initial=i;
                        final=j;
                        max_length = j-i+1;
                    }
            }        
                   
           
        }
    }
   
   
    for(int i=initial;i<=final;i++)
    {
        cout<<str[i];
    }
           
    return 1;
   
   
}
