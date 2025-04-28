#include <time.h>
#include <stdlib.h>
#include <stdio.h>

int main(void)
{
    // int a = 1;
    // int b = 2;
    // int c = 3;

    // printf("a address: %d, pw: %d\n", &a, a);
    // printf("b address: %d, pw: %d\n", &b, b);
    // printf("c address: %d, pw: %d\n", &c, c);

    // int * address;
    // address = &a;
    // printf("default address: %d, pw: %d\n", address, *address);
    // address = &b;
    // printf("default address: %d, pw: %d\n", address, *address);
    // address = &c;
    // printf("default address: %d, pw: %d\n", address, *address);

    int arr[3] = {5, 10, 15};
    int * ptr = arr;
    for (int i = 0; i < 3; i++)
    {
        printf("배열 arr[%d] 값: %d\n", i, arr[i]);
        printf("배열 ptr[%d] 값: %d\n", i, ptr[i]);
    }
    printf("\n");
    ptr[0] = 100;
    ptr[1] = 200;
    ptr[2] = 300;
    for (int i = 0; i < 4; i++)
    {
        printf("배열 arr[%d] 값: %d\n", i, *(arr + i));
        printf("배열 arr[%d] 값: %d\n", i, &arr[i]);
        printf("배열 arr[%d] 값: %d\n", i, (arr + i));
        printf("배열 arr[%d] 값: %d\n", i, (ptr + i));
        printf("배열 ptr[%d] 값: %d\n", i, *(ptr + i));
    }
    
    printf("\n");
    printf("주소[인덱스]: %d\n", &arr[0]);
    printf("주소[인덱스]: %d\n", &arr[1]);
    printf("주소[인덱스]: %d\n", &arr[2]);
    printf("주소[값]: %d\n", arr);
    printf("주소[값]: %d\n", arr + 1);
    printf("주소[값]: %d\n", arr + 3);
    printf("주소[값]: %d\n", arr[3]);
    
}