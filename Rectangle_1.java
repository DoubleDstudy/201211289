class Rectangle{
private int width;
private int height;
public Rectangle(int width,int height){
this.width = width;
this.height = height;

}
public void reSetSize(int width,int height){
this.width=width;
this.height=height;
}
public int calcArea(){
return width*height;
}
}
Rectangle r = new Rectangle(3,4);
System.out.println("Area : "+r.calcArea());
r.reSetSize(4,5);
System.out.println("Area : "+ r.calcArea());