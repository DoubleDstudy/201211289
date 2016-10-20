class EnumShape {
enum Shape {TRIANGLE, SQUARE}
public static void main(String[] args) {
Shape sel=Shape.TRIANGLE;
int size=100;
int sides = 0;
double angle = 0;
switch (sel) {
    case TRIANGLE:
        sides=3;
        angle=120;
        break;
    case SQUARE:
        sides=4;
        angle=90;
        break;
}
System.out.printf("%s: %d %.1f",sel,sides,angle);
}
}