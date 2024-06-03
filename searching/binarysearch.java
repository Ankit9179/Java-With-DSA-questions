package searching;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = { 2, 12, 13, 32, 49, 52, 70, 88, 91, 99 };
        int target = 91;
        int n = arr.length;
        int first = 0;
        int last = n - 1;
        int mid = (first + last) / 2;

       while (first<last) {
        if( first ==last){
            System.out.println("index of " + target + " " + mid);
        }else if(target < arr[mid]){
            
        }else{

        }
       }


        System.out.println(n + " " + first + " " + last + " " + mid);
    }
}
