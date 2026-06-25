public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 6, 1};
        int max = arr[0];
        int secondMax = arr[0];

        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];

            }
        }

        System.out.println("The second largest number is: " + secondMax);
    }
}



