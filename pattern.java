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
}
