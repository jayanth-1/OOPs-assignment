class Parent{
    int x=10;
    void show(){
        System.out.println("parent-show");
    }
   
    void OnlyParent(){
        System.out.println("OnlyParentShow");
    }
}
 
class Child extends Parent{
    int x=20;
    void show(){
        System.out.println("child-show");
    }
    void OnlyChildShow(){
        System.out.println("OnlyChildShow");
    }
}
 
public class ParentChild {
 
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
        p.OnlyParentShow();
        System.out.println(p.x);       //upcasting, in java upcasting is done automatically
    }
}