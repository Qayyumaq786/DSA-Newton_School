package problemsolving.aug31;

public class FlipImage {
    /**
     110    011    100
     101 -> 101 -> 010
     001    100    011

     // Step1: Reverse row
     // Step2: Invert elements


     1234 -> swap 1&4, swap 2&3

     */

    private void swap(int[][] image, int row, int col1, int col2){
        int temp = image[row][col1];
        image[row][col1] = image[row][col2];
        image[row][col2] = temp;
    }


    /**

     1 3 5 6 7 -> 7 6 5 4  3  1

     */

    private void reverseRow(int[][] image,int row){
        int ptr1= 0, ptr2 = image[0].length-1;
        while(ptr1<ptr2){
            swap(image,row, ptr1,ptr2);
            ptr1++;
            ptr2--;
        }
    }

    public int[][] flipAndInvertImage(int[][] image) {
        // Step 1
        int n = image.length; // rows
        int m = image[0].length; // columns

        for(int i=0; i<n ;i++){
            reverseRow(image, i);
        }

        // invert image
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                if(image[i][j] ==1)
                    image[i][j] = 0;
                else
                    image[i][j] = 1;
            }
        }
        return image;
    }
}
