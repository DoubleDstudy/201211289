import java.util.ArrayList;
import java.util.Collections;
class p14_Student{//p14_Student{
private String name;
private int number;
p14_Student(String name, int number){
this.name = name;
this.number = number;
}
public String getName(){
return name;
}
 static void studentSort() {
 ArrayList<String> studentNameList = new ArrayList<String>();
p14_Student s1 = new p14_Student("sm 4",1);
p14_Student s2 = new p14_Student("sm 5",2);
p14_Student s3 = new p14_Student("sm 3",2);
p14_Student s4 = new p14_Student("sm 2",2);
p14_Student s5 = new p14_Student("sm 1",2);
p14_Student s6 = new p14_Student("sm 6",2);
studentNameList.add(s1.getName());
studentNameList.add(s2.getName());
studentNameList.add(s3.getName());
studentNameList.add(s4.getName());
studentNameList.add(s5.getName());
studentNameList.add(s6.getName());
Collections.sort(studentNameList);
System.out.println(studentNameList);
 }
public static void main(String[] args) {
 studentSort();
 }
 }