class BMI {
   static void bmi(float weight,float height){
   float checkBmi = weight/(height*height);
   System.out.println(checkBmi);
   if(checkBmi > 18.5 && checkBmi<=24.99){
   System.out.println("normal weight");
   }else if(checkBmi >= 25 && checkBmi<=29.9){
   System.out.println("overweight");
   }
   }
   public static void main(String[] args) {
   bmi((float)63.6,(float)1.7);
   }
}