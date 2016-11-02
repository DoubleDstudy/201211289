import java.util.Calendar;
class SundayCount{
   static void countSunday(){
   int SundayCount = 0;
   Calendar start = Calendar.getInstance();
   for(int i = 1901;i<=2000;i++){
   for(int j = 0;j<12;j++){
  start.set(i, j,1);
  if(start.get(Calendar.DAY_OF_WEEK) == 1){
  SundayCount++;
   }
   }
   }
   System.out.println("1901-01-01 ~ 2000-12-31 Sunday : "+ SundayCount+" ");
   }
   public static void main(String[] args) {
  countSunday();
   }
}