str = input("Enter a String")
str_len = len(str)

max_length = flag = initial = final = 0

for i in range(str_len):                
    for j in range(i+1,str_len):
        flag = 0                       
        for k in range(i,j+1):
            if(str[k]!=str[j+i-k]):
                flag = 1
                break
            if(flag == 0 and j-i>max_length):
                initial = i
                final = j 
                max_length = j-i+1

for c in range(initial,final+1):
    print(str[c],end=" ")