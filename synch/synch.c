#include <stdio.h>
#include <stdlib.h>

int checkToUpdate() {
  system("git add .");
  system("git commit -m Update");
  system("git push");
  return 0;

}

int main() {
    int checkToUpdate();
    printf("Exit ...\n");
    return 0;
}
