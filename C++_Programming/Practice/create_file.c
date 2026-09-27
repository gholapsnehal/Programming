#include<stdio.h>
#include<fcntl.h>

int main()
{
    int fd = 0;

    fd = creat("Marvellous.txt",0777);

    if(fd == -1)
    {
        printf("unable to create a file\n");
    }
    else
    {
        printf("file gets created with fd : %d\n",fd);
    }


    return 0;
}