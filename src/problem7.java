public class problem7 {
    public String max_string(String name){
        String[] arr=name.split("\\s+");
        int max=arr[0].length();
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i].length()>max)
            {
                max=i;
            }
        }
        return arr[max];}
    public static void main(String[] args) {
        String name="java python code program m o u";
        problem7 p=new problem7();
        System.out.println(p.max_string(name));
    }
}
