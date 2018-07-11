import java.util.TreeSet;

public class Trees {
    public static void main(String[] args){

        TreeSet treeSet = new TreeSet();
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("3");
        treeSet.add("4");
        System.out.println(treeSet);

        System.out.println(treeSet.first());

        boolean test = treeSet.contains("4");
        System.out.println(test);

        System.out.println(treeSet.size());

     
        treeSet.remove("2");
        System.out.println(treeSet);


        try {
            treeSet.add(3);
        } catch (Exception e) {
        }

        try {
            treeSet.add(null);
        } catch (Exception e) {
        }

 
        try {
            treeSet.add("1");
            System.out.println(treeSet);
        } catch (Exception e) {
        }


    }
}
