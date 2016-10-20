class EnumDay {
enum Day{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY};
public static void main(String[] args) {
String dayStr;
int day = Day.THURSDAY.ordinal();
System.out.println(day);
switch(day){
case 0: dayStr="Sunday"; break;
case 1: dayStr="Monday"; break;
case 2: dayStr="Tuesday"; break;
case 3: dayStr="wednesday"; break;
case 4: dayStr="Thursday"; break;
case 5: dayStr="Friday"; break;
case 6: dayStr="Saturday"; break;
default: dayStr="invalid"; break;
}
System.out.println(dayStr);
for(Day d : Day.values())
System.out.println(d);
}
}