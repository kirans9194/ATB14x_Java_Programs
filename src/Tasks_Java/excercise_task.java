package Tasks_Java;

public class excercise_task {
    int x = 10;
    class Inner {
        void show() {
            System.out.println(x);
        }
    }
}

class Main11{
    public static void main(String[] args) {
        excercise_task o = new excercise_task();
        excercise_task.Inner i = o.new Inner(); i.show();
    }
}

