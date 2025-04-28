#include <time.h>
#include <stdlib.h>
#include <stdio.h>
int main(void) {
    // int age = 12;
    // printf("%d\n", age);
    // age = 13;
    // printf("%d\n", age);

    // float f = 46.5f;
    // printf("%.2f\n", f);
    // double d = 4.428;
    // printf("%.2lf\n", d);

    // for (int i = 0; i < 5; i++) {
    //     for (int j = 0; j < 4 - i; j++) {
    //         /* 
    //             *
    //            **
    //           ***
    //          ****
    //         *****
    //          */
    //         printf(" ");
    //     }
    //     for (int j = 0; j < i + 1; j++)
    //     {
    //         printf("*");
    //     }
    //     printf("\n");
    // }

    printf("\n피라미드 만들기\n");

/* 
    *    
   ***
  *****
 *******
*********
*/
    int height = 5;
    int width = 9;
    int side = 4;
    for (int i = 0; i < height; i++) 
    {
        for (int j = 0; j < side; j++) 
        {
            printf(" ");
        }
        for (int j = 0; j < width - side * 2; j++) 
        {
            printf("*");
        }
        for (int j = 0; j < side; j++) 
        {
            printf(" ");
        }
        printf("\n");
        side -= 1;
    }

    printf("\n");
    srand(time(NULL));
    for (size_t i = 0; i < 10; i++)
    {
        printf("%d ", rand() % (10 - 3) + 3);
    }
    
    char str = 'a';
    char string[] = "abcd";
    char string2[5] = "abcd";
    // char string[] = "abcd";
    int arr[5];
    int array[3] = {0, 1, 2};
    int array2[] = {0, 1, 2};
    // char array3 = {'a', 'b'};
}
