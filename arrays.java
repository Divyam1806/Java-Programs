import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
public class arrays{

    public static int linearSearch(int marks[], int key){
        for (int i=0;i<=marks.length;i++){
            if (marks[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int marks[], int key){
        int start =0 , end = marks.length - 1;
        while(start<=end){
            int mid = (start + end)/2;
            if(marks[mid] == key){
                return mid;
            }
            if(marks[mid]> key){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }

    public static void reverseArray(int marks[]){
        int first=0 , last=marks.length-1;
        while(last>first){
            int temp=marks[last];
            marks[last] = marks[first];
            marks[first] = temp;
            first++;
            last--;
        }
    }
    public static void pairs(int marks[]){
        for(int i=0;i<marks.length;i++){
            int c= marks[i];
            for(int j=i+1;j<marks.length;j++){
                System.out.print("(" + c + "," + marks[j] + ")");
            }
            System.out.println();
        }
    }
    public static void subArray(int marks[]){
        int ts = 0;
        for(int i=0;i<marks.length;i++){
            for (int j=i;j<marks.length;j++){
                for (int k=i;k<=j;k++){
                    System.out.print(marks[k] + " ");
                }
                System.out.println();
                ts++;
            }
            System.out.println();
        }
        System.out.println("Total number of sub arrays : " + ts);
    }
    public static void sumSubArray(int marks[]){
        int s = 0;
        for(int i=0;i<marks.length;i++){
            for (int j=i;j<marks.length;j++){
                for (int k=i;k<=j;k++){
                    System.out.print(marks[k] + " ");
                    s=s+marks[k];
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total sum of sub arrays : " + s);
    }
    public static void kadaneSum(int marks[]){
        int ms= Integer.MIN_VALUE;
        int cs=0;
        for (int i=0;i<marks.length;i++){
            cs+= marks[i];
            if (cs<0){
                cs=0;
            }
            ms= Math.max(ms,cs);
        }
        System.out.println("Max subarray sum using kadane's method :" + ms);
    }

    public static int trappedRainwater(int height[]){
        int n=height.length;
        // Left max height
        int leftMax[] = new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        // Right max height
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]= Math.max(height[i],rightMax[i+1]);
        }

         // trapped water
        int trappedWater = 0;
        for(int i=0;i<n;i++){
            int waterLevel= Math.min(leftMax[i],rightMax[i]);
            trappedWater+= waterLevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        /* Creation of arrys
         * int array_name[] = new dataType[size of array];
         * for example.....
         * int marks[] = new int[50];
         * Another method.....
         * int array_name[] = {1,2,3};
         * the above is an array containing elements 1,2 and 3
         * length of array = array_name.length;
         */
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter elements of array");
        for (int i=0;i<marks.length;i++){
            marks[i] = sc.nextInt();
        }
         System.out.println("Total rainwater trapped : " + trappedRainwater(marks));

       /* for(int i=0;i<marks.length;i++)
        System.out.print(marks[i] + " ");
        System.out.print("\nreversed array : ");
        reverseArray(marks);
        for(int i=0;i<marks.length;i++)
        System.out.print(marks[i] + " ");*/

       /*  System.out.println("Enter element to be searched :");
        int key = sc.nextInt();
        int index = binarySearch(marks,key);
        if (index == -1){
            System.out.println("Element not found....");
        }
        else{
            System.out.println("Element found at index " + index);
        }*/
    }
}