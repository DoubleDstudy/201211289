public class p10_SeoulPeople{
static void stringReverse(){
int menSum = 0;
 float menAvg = 0;
 int womenSum = 0;
 float womenAvg = 0;
 int[] addressSum = new int[25];
 float[] addressAvg = new float[25];
 String[] live = {"city1","city2","city3","city4","city5"
 ,"city6","city7","city8","city9","city10"
 ,"city11","city12","city13","city14","city15"
 ,"city16","city17","city18","city19","city20"
 ,"city21","city22","city23","city24","city25"};
 int[][] data={
    {74425, 76326},
    {61164, 61636},
    {109688, 115744},
    {144796, 146776},
    {174996, 181676},
    {177841, 177434},
    {204630, 205980},
    {223373, 232245},
    {161055, 166130},
    {171576, 176735},
    {279169, 293772},
    {239450, 251066},
    {148690, 156510},
    {182977, 196992},
    {237792, 242641},
    {283869, 296762},
    {209344, 210282},
    {118965, 114441},
    {186503, 186856},
    {195734, 203014},
    {254381, 249472},
    {212401, 229111},
    {271654, 295354},
    {319197, 335045},
    {229829, 231671}
};
for(int i=0; i<data.length;i++ ){
menSum += data[i][0];
womenSum += data[i][1];
for(int j = 0;j<data[i].length;j++){
addressSum[i] += data[i][j];
}
addressAvg[i] = (float)addressSum[i]/(data[i].length);
System.out.println(live[i]+"(Sum : "+addressSum[i] + ", Avg : " + addressAvg[i]+")");
}
menAvg = (float)menSum/(data.length);
womenAvg = (float)womenSum/(data.length);
System.out.println();
System.out.println("MenNumber : "+menSum+", MenAvg : "+menAvg);
System.out.println("WomenNumber : "+womenSum+", WomenAvg : "+womenAvg+"\n");
System.out.println("Graph --------------");
for(int i=0;i<data.length;i++){
    System.out.print("(");
    for(int j =0;j<data[i].length;j++){
       System.out.printf(" %d ",data[i][j]);
    }
    System.out.print(")\n");
}
}
 public static void main(String[] args){
 stringReverse();
 }
}