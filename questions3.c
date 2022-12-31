#include<stdio.h>

int main()
{
 int score; 
printf("Enter score to check grade:\n"); 
scanf("%d", &score); 
if((score>=80)&&(score==80)) 
printf("proceed to the next stage"); 
else if((score<80)&&(score>=50))
 printf("try again");
else if((score<50)) 
printf("disqualified");
    return 0;
}