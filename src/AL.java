import java.util.List;
import java.util.ArrayList;

public class AL {
    public static void main(String[] args){
        List list = new ArrayList<String>();

        list.add("static");
        list.add("void");
        list.add("main");

        for(int i =0; i <list.size(); i++){
            System.out.println(list.get(i));
        }

        list.remove(1);

        int voidIndex = list.indexOf("main");

        System.out.println(voidIndex);
    }
}
