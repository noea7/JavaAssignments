package lt.techin.kristina.pratybos18.p18_4;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Object> stackList = new LinkedList<>();
        stackList.push(10);
        stackList.push("Labas");
        stackList.push(true);
        System.out.println(stackList);
        System.out.println(stackList.pop());
        System.out.println(stackList);
        System.out.println(stackList.size());
    }
}
