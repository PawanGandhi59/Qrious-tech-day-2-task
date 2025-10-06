public class problem3 {
    public int max(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={-5};
       problem3 p=new problem3();
        System.out.println(p.max(arr));
    }
}
