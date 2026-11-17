package Array;


public class ObjectArray {

    public static void sum2dArray(){
        int sum =0;
        int arr[][] = {{23,4,55},{34,54,56}};
        for (int i=0;i<arr.length;i++){
            for (int j =0;j<arr[i].length;j++){
                sum = sum +arr[i][j];
            }
        }

        System.out.println("sum of 2d array is : "+sum);
    }



    public static void summArray(){
        int arr[] ={12,23,433,54,63};
        int sum = 0;
        for(int i =0; i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println("sum of the array is : "+sum);

    }
    public static void main(String[] args) {
        
        int arr[][] = {{1,2,3},{4,5,6,},{7,8,9},{10,11,12}};
        System.out.println(arr[0][2]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][2]);

        for (int i=0;i<arr.length;i++){
            //System.out.println(arr[i]);//gives address of i values
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        summArray();

        sum2dArray();
    }


}
