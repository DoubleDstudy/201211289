public class p6_StringReverse{
static void stringReverse(String s){
String hello = "hello";
hello.toCharArray();
char[] chArr = hello.toCharArray();
StringBuilder strB = new StringBuilder();
for(int i = chArr.length-1; i>=0 ; i--){
    strB.append(chArr[i]);
}
System.out.println(strB);
}
 public static void main(String[] args){
 String str = "hello";
 stringReverse(str);
 }
}