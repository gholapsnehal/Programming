#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>   // universal standard


int main()
{
    unlink("Marvellous.txt");     // delete a file

    return 0;
}