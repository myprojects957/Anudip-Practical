/* 
 * CharAt() for first ele
 * SetCharAt(o,'p')  for change the ele
 * insert(0,s) for insert
 * delete(1,3) to delete
 */

public class string_builder {
    public static void main(String[]args){
        StringBuilder sb= new StringBuilder("hello");
        System.out.println(sb);
        System.out.println(sb.charAt(1));
        sb.setCharAt(0,'l');
        System.out.println(sb);
        sb.insert(0,'s');
        System.out.println(sb);
        sb.delete(1,3);
        System.out.println(sb);
    }
}
