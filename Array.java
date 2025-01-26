import java.util.*;
public class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        System.out.print("Enter elements of array: ");
        for(int i = 0; i<5; i++){
            array[i] = sc.nextInt();
        }
        System.out.print("Elements in array are: ");
        for(int i = 0; i<5; i++){
            System.out.print(array[i]+" ");
        }
        int max = array[0], min = array[0];
        for(int i=1; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.printf("\nLargest element = %d\nSmallest element = %d",max,min);
    }
}




