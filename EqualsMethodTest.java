package java;
class EqualsMethodTest{
public EqualsMethodTest(int a){
}
public static void main (String[] args){
    EqualsMethodTest v1 = new EqualsMethodTest(25);
    EqualsMethodTest v2 = new EqualsMethodTest(25);
    v1 = v2;
    System.out.println(v1.equals(v2));
}
}
