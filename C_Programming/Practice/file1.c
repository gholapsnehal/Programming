#include<stdio.h>
#include<fcntl.h> // file control headerfile

int main()
{
    int fd = 0;    // file descriptor

    fd = creat("Marvellous.txt",0777);

    if(fd == -1)
    {
        printf("Unable to create a file\n");
    }
    else
    {
        printf("File gets successfully created\n");
    }


    return 0;
}

