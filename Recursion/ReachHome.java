package Recursion;

class ReachHome {

    static void reach(int src, int dest) {
        if (src == dest) {
            System.out.println("PAUCH GAYA");
            return;
        }
        // proceesing ek step aage badhjao
        src++;

        // recursive call
        reach(src, dest);
    }

    public static void main(String[] args) {
        int dest = 10;
        int src = 1;

        reach(src, dest);
    }
}