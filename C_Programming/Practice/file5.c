#include<stdio.h>
#include<fcntl.h> 
#include<unistd.h> // only linux based os 

// write data in a file

int main()
{
    int fd = 0;  

    fd = open("Marvellous.txt",O_RDWR);    // O_RDWR - read and write

    if(fd == -1)
    {
        printf("Unable to open a file\n");
    }
    else
    {
        printf("File gets successfully opened with fd : %d\n",fd);

        write(fd,"Jay Ganesh...",13);

        close(fd);
    }


    return 0;
}

// man close- linux command 
// close system call

