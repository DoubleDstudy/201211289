class LeapYear{
   static void leapYear(int year){
  if(((year % 4 ==0) && (year % 100 !=0)) ||(year % 400 ==0)){
  System.out.println("Oh, Good LeapYear!!! "+year);
  }else
  System.out.println("It is not LeapYear");
   }
   public static void main(String[] args) {
  leapYear(2016);
   }
}