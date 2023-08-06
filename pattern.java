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
    for(int k=0; k<i+1; k++){
        System.out.print("* ");
    }
    for(int l=0; l<n-i-2; l++){
        System.out.print(" ");
    }
    System.out.println();
    
}
for(int m=0; m<n; m++){
    for(int y=0; y<m; y++){
        System.out.print(" ");
    }
    for(int x=0; x<n-m; x++){
        System.out.print("* ");
    }
    for(int z=0; z<m-1; z++){
        System.out.print(" ");
    }
    System.out.println();
}
    }
}
