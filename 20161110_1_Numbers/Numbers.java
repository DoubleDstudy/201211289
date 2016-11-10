import java.util.ArrayList;
class Numbers{
	Numbers(){
		System.out.println("Let's go!");
	}
	public void setNumbers(ArrayList<Integer> aList){
  		for(int i=1; i<=1000;i++){
  			if(i % 4 == 0 && i % 5 !=0){
  				aList.add(i);
  			}
  		}
  		System.out.println("Make a list!");
  		System.out.println(aList);
	}
	public int sumList(ArrayList<Integer> aList){
  		int sumListAll = 0;
  		int maxiter = aList.size();
  		for(int i =0; i<maxiter;i++){
  			sumListAll += aList.get(i);
  		}
		return sumListAll;
	}
   	public static void main(String[] args) {
 	ArrayList<Integer> list = new ArrayList<Integer>();
 	Numbers n = new Numbers();
 	n.setNumbers(list);
 	System.out.println("sum : " + n.sumList(list));
   	}
}