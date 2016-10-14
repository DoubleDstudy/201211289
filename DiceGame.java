class DiceGame {
private Player p1;
private Player p2;
private int userPoint1=0;
private int userPoint2=0;
private String userName1,userName2;
public DiceGame(String name1,String name2){
this.p1 = new Player(name1);
this.p2 = new Player(name2);
userName1 = name1;
userName2 = name2;
}
private void Compare(){
int user1 = p1.getNum();
int user2 = p2.getNum();
if(user1 > user2){
userPoint1++;
System.out.println(p1.getName()+" Win!");
sortPoint();
}else if(user1 < user2){
userPoint2++;
System.out.println(p2.getName()+" Win!");
sortPoint();
}else{
System.out.println("Draw OMG!\n");
sortPoint();
}
}
public void sortPoint(){
if(userPoint1>userPoint2){
System.out.println(userName1+" : " + userPoint1+"p\n"+ userName2+ " : " + userPoint2+"p\n");
}else if(userPoint1<userPoint2){
System.out.println(userName2+" : " + userPoint2+"p\n"+ userName1+ " : " + userPoint1+"p\n");
}else
System.out.println(userName1+" : " + userPoint1+"p\n"+ userName2 + " : " + userPoint2+"p\n");
}
public void startGame(){
p1.play();
p2.play();
Compare();
}
}