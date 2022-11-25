#include <stdio.h>

//Name: Ismail Oksüz
//ID: 150119516

int main(int argc, char** argv) {
    char first[512];
    char second[512];
    printf("first word : ");
    gets(first);
    int first_length = strlen(first);
    printf("second word : ");
    gets(second);
    int second_length = strlen(second);
    int all_chars_array[256] = {0};
    int i = 0;
    for(i = 0; i < first_length; i++){
        all_chars_array[((int)first[i])] += 1;
    }
    for(i = 0; i < second_length; i++){
        all_chars_array[((int)second[i])] -= 1;
    }
    int not_zero_count = 0;
    for(i = 0; i < 256; i++) {
        if(all_chars_array[i] != 0){
            not_zero_count++;
            break;
        }
    }
    if (not_zero_count == 0) {
        printf("%s and %s are Anagram", first, second);
    }
    else {
        printf("%s and %s are NOT Anagram", first, second);
    }
    return 0;
}
