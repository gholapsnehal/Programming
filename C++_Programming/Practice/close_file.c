#include<stdio.h>
#include<fcntl.h>



int main()
{
    
    int fd = 0;
    
    fd = open("Marvellous.txt",O_RDWR);

    if(fd == -1)
    {
        printf("Unable to open file\n");
    }
    else
    {
        printf("file gets opened with fd : %d\n",fd);
    }

    close(fd);

    return 0;
}