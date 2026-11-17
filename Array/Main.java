package Array;



public class Main {

    public static void main(String[] args) {
        

        //1.way of creating array
        int arr[] = {1,2,3,'a','b','c'};

        System.out.println(arr);
        System.out.println(arr[3]);
        arr[5] =66;
        System.out.println(arr[2]);


        //2.way to create array

        int arr2[] = new int[6];
        arr2[0] = 2;
        arr2[1] = 3;
        arr2[2] = 4;
        arr2[3] = 5;


        System.out.println("array printing ...");
        for (int i =1;i<arr.length-1;i++){
            System.out.println(arr2[i]);
        }
    
    }

}
