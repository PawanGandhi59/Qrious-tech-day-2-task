import java.util.ArrayList;

public class problem2 {
    public static void main(String[] args) {
        ArrayList<Object> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1.1);
        arrayList.add(2.2);
        arrayList.add(false);
        arrayList.add("java");
        arrayList.add(1L);
        arrayList.add(2L);
        arrayList.add(45);
        arrayList.add(3.6);
        String name;
        int  intcount=0,doublecount=0,bytecount=0,shortcount=0,longcount=0,floatcount=0,booleancount=0,charactercount=0,stringcount=0;
        ArrayList<Integer> i=null;
        ArrayList<Byte> bytearraylist=null;
        ArrayList<Double> doublearraylist=null;
        ArrayList<Short> shortarraylist=null;
        ArrayList<Long> longarrylist=null;
        ArrayList<Float> floatarraylist=null;
        ArrayList<Boolean> booleanarraylist=null;
        ArrayList<Character> characterarraylist=null;
        ArrayList<String> stringarraylisti=null;
        for(Object o:arrayList){
           name=o.getClass().getSimpleName();
           switch (name){
               case "Integer":
                   if(intcount==0){i=new ArrayList<>();intcount++;i.add((Integer) o);}
                   else{i.add((Integer)o);}
                   break;
               case "Double":
                   if(doublecount==0){doublearraylist=new ArrayList<>();doublecount++;doublearraylist.add((Double)o);}
                   else{doublearraylist.add((Double)o);}
                   break;
               case "Byte":
                   if(bytecount==0){bytearraylist=new ArrayList<>();bytecount++;bytearraylist.add((Byte) o);}
                   else{bytearraylist.add((Byte) o);}
                   break;
               case "Short":
                   if(shortcount==0){shortarraylist=new ArrayList<>();shortcount++;shortarraylist.add((Short) o);}
                   else{shortarraylist.add((Short) o);}
                   break;
               case "Long":
                   if(longcount==0){longarrylist=new ArrayList<>();longcount++;longarrylist.add((Long) o);}
                   else{longarrylist.add((Long) o);}
                   break;
               case "Float":
                   if(floatcount==0){floatarraylist=new ArrayList<>();floatcount++;floatarraylist.add((Float) o);}
                   else{floatarraylist.add((Float) o);}
                   break;
               case "Boolean":
                   if(booleancount==0){booleanarraylist=new ArrayList<>();booleancount++;booleanarraylist.add((Boolean) o);}
                   else{booleanarraylist.add((Boolean) o);}
                   break;
               case "Character":
                   if(charactercount==0){characterarraylist=new ArrayList<>();charactercount++;characterarraylist.add((Character) o);}
                   else{characterarraylist.add((Character) o);}
                   break;
               case "String":
                   if(stringcount==0){stringarraylisti=new ArrayList<>();stringcount++;stringarraylisti.add((String) o);}
                   else{stringarraylisti.add((String) o);}
                   break;
           }
       }
        if(intcount>0){System.out.println(i);}
        if(floatcount>0){
            System.out.println(floatarraylist);
        }
        if(doublecount>0){
            System.out.println(doublearraylist);
        }
        if(longcount>0){
            System.out.println(longarrylist);
        }
        if(shortcount>0){
            System.out.println(shortarraylist);
        }
        if(bytecount>0){
            System.out.println(bytearraylist);
        }
        if(booleancount>0){
            System.out.println(booleanarraylist);
        }
        if(charactercount>0){
            System.out.println(characterarraylist);
        }
        if(stringcount>0){
            System.out.println(stringarraylisti);
        }

    }
}
