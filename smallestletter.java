public class smallestletter {
    public static void main(String[] args) {
char[] letters = {'c','f','j'};
System.out.println(nextGreatestLetter(letters,'f'));

    }

        static char nextGreatestLetter(char[] letters, char target) {
            int start = 0;
            int end = letters.length-1;
            if(target >= letters[letters.length-1]){
                return letters[0];
            }
            while(start<=end){
                int mid = start + (end-start)/2;
                if(letters[mid]<=target){
                    start = mid+1;
                }
                else if(letters[mid]>target){
                    end = mid-1;
                }

            }
            return letters[start];
        }
    }

