import java.util.HashMap;
import java.util.Map;
public class p5_StringCountChar{
static void countChar(char[] letters){
Map<String,Integer> map = new HashMap<String,Integer>();
 String str;
 for(char c:letters){
 str = Character.toString(c);
 if(map.containsKey(str)){
 map.put(str, map.get(str)+1);
 }
 else{
 map.put(str, 1);
 }
 }
 System.out.print(letters);
 System.out.print(" - count -> ");
 System.out.println(map);
}
 public static void main(String[] args){
 char[] character = "sangmyung university".toCharArray();
 countChar(character);
 }
}