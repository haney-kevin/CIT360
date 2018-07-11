import java.util.LinkedList;

public class Lists {
    public static void main(String[] args) {

        LinkedList lnkLst = new LinkedList();
        lnkLst.push("Alicia");
        lnkLst.push("David");
        lnkLst.push("Sean");
        lnkLst.push("Nikki");
        System.out.println(lnkLst);


        System.out.println(lnkLst.pop());
        System.out.println(lnkLst.pop());

        lnkLst.remove(1);
        System.out.println(lnkLst);

        lnkLst.push(5);
        System.out.println(lnkLst);

        lnkLst.addLast("Last?");
        System.out.println(lnkLst);

 
        System.out.println(lnkLst.get(1));

 
        try {
            lnkLst.get(3);
        } catch (Exception e) {
        }

        try {
            lnkLst.get(-1);
        } catch (Exception e) {
        }

    }
}