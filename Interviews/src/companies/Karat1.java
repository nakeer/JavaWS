package companies;


//Imagine we have an image. We’ll represent this image as a simple 2D array where every pixel is a 1 or a 0. The image you get is known to have a single rectangle of 0s on a background of 1s. Write a function that takes in the image and returns the coordinates of the rectangle -- either top-left and bottom-right; or top-left, width, and height.

import java.io.*;
import java.util.*;

/*
* To execute Java, please define "static void main" on a class
* named Solution.
*
* If you need more classes, simply define them inline.
*/

class Solution {
 static int[][] image = new int[][] {
   {0, 0, 0}, // 2 - 2,3 - 2,6
   {0, 0, 0} // 3 - 3,5 - 
 };


public static void main(String[] args) {
 
 System.out.println(Arrays.toString(getCords(image)));
}

public static int[] getCords(int[][] imagematrix) {
 int rowStart = -1, columnStart = -1, colCord = -1, rowCord = -1; 
 int[] result = new int[4];
 System.out.println(imagematrix.length + ": " + imagematrix[0].length);
 for(int i =0;i<imagematrix.length;i++){
   for(int j=0;j<imagematrix[0].length;j++) {
      //System.out.println(imagematrix[i][j]);
      if(imagematrix[i][j] == 0 ){
         rowStart = i;
         columnStart = j;
         System.out.println(i + " : " + j);
         colCord = getColCords(i,j);
         rowCord = getRowCords(i,j);
         
         result[0] = rowStart;
         result[1] = columnStart;
         result[2] = rowCord-1;
         result[3] = colCord-1;
 
         return result;
      }
   }
   
 }
 return null;
 

}

public static int getColCords(int row, int col) {
 
   for(int j=col;j<image[0].length;j++) {
     if(image[row][j] != 0)
       return j-1;
     else {
       continue;
     }
  
 }
 return 0;
}

public static int getRowCords(int row, int col) {
 for(int i =row;i<image.length;i++){
     if(image[i][col] != 0)
       return i;
     else {
       continue;
     }
   }
 return 0;
}

}


public class Karat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
