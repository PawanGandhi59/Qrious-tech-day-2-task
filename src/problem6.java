public class problem6 {
    public StringBuffer short_form(String name){
        String[] arr=name.split("\\s+");
        StringBuffer shortform=new StringBuffer();
        for(int i=0;i<arr.length;i++)
        {
            shortform.append(arr[i].charAt(0));
        }
        return shortform;
    }
    public static void main(String[] args) {
        String name="java python code program m o u";
        problem6 p=new problem6();
        System.out.println(p.short_form(name));
    }
}
