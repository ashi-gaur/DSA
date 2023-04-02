import java.util.*;*;
class stack{
    ArrayList<Integer> al= new ArrayList<>();
    int m=0;
    void push(int x){
        al.add(x);
        if(x<m)
     {       m=x;}
    }
    int pop(){
        int r=al.get(al.size()-1);
        al.remove(al.size()-1);
        return r;
    }
    int min(){
        return m;
    }
}
public class getminstack{
    stack s1= new stack();
    s1.push(5);
    s1.push(7);
    s1.push(9);
    System.out.println(s1.getmin());
    s1.push(1);
    System.out.println(s1.getmin());
}