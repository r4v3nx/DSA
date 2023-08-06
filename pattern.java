//pattern printing
class Solution {

    void printSquare(int n) {
        
        for(int i = 0; i<n; i++){
            for(int j =0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
/* 
* * * * *
* * * * *
* * * * *
* * * * *
* * * * * 
*/

    void printTriangle(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
/*
*
* *
* * *
* * * *
* * * * *
*/
    void printTriangle(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/
void printTriangle(int n) {
    for(int i=0;i<n;i++){
        for(int j=0;j<i+1;j++){
            System.out.print(i+1 + " ");
            }
            System.out.println();
        }
    }
/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
*/

void printDiamond(int n) {
        // Your code here
for(int i=0; i<n; i++){
    for(int j=0; j<n-i-1; j++){
        System.out.print(" ");
    }
    for(int j=0; j<i+1; j++){
        System.out.print("* ");
    }
    for(int j=0; j<n-i-2; j++){
        System.out.print(" ");
    }
    System.out.println();
    
}
for(int i=0; i<n; i++){
    for(int j=0; j<i; j++){
        System.out.print(" ");
    }
    for(int j=0; j<n-i; j++){
        System.out.print("* ");
    }
    for(int j=0; j<i-1; j++){
        System.out.print(" ");
    }
    System.out.println();
}
    }
}
/*
    *
   * *
  * * *
 * * * *
* * * * *
* * * * *
 * * * *
  * * *
   * *
    *
       */

void playButton(int n) {
        // code here
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
* 
*/

void binAlternateTriangle(int n) {
        // code here
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
*/

void doubleTriangle(int n) {
        // code here
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(j+1+" ");
            }
    //2x(2n)-(2i+1), twice of downwards triangle -2 for extra spaces in first and last j loop = 4*n-(4*i+2)-2 = 4*(n-i-1)
            for(int j=0; j<4*(n-i-1); j++){
                System.out.print(" ");
            }
            for(int j=i+1; j>0; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
