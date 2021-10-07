#include <stdio.h>
#include <stdlib.h>

int checkToUpdate() {
  system("git add test.txt");
  system("git commit -m Update");
  system("git push");
  printf("Done!\n");
  return 0;

}

int main() {
    int check = checkToUpdate();
    printf("Exit ...\n");
    return 0;
}
