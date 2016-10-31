class ChangeTemperature{
    static void FtoC(double Fahrenheit){
      System.out.println("Fahrenheit to Celsius : "+(Fahrenheit-32)/1.8+"C");
    }
    static void CtoF(double Celsius){
      System.out.println("Celsius to Fahrenheit : "+(Celsius*1.8+32)+"F");
    }
    public static void main(String[] args) {
    double Ftemp = 30.0;
    double Ctemp = 30.0;
    FtoC(Ftemp);
    CtoF(Ctemp);
	}
}