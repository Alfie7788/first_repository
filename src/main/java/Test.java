public class Test {
    public void maopao(int[] arr){
        int tmp=0;
        System.out.println(arr.length);
        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-i-1;j++ ){
                if(arr[j]>arr[j+1]){
                    tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
                System.out.print(arr[j]);
            }
            for (int j = arr.length - 1 - i; j < arr.length; j++) {
                System.out.print("【");
                System.out.print(arr[j]);
                System.out.print("】");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Test test = new Test();
        int[] a = {6,1,3,5,2};
        test.maopao(a);
    }
}