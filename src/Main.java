public class Main {
    public static void main(String[] args) {
//Task1
        int[] q = new int[3];
        q[0] = 1;
        q[1] = 2;
        q[2] = 3;
        double[] w = {1.57, 7.654, 9.986};
        String[] e = {"Салат", "дорога", "!!!!"};
//Task2
        System.out.println("\nTask 2");
        for (int i = 0; i < q.length - 1; i++) {
            System.out.print(q[i] + ", ");
        }
        {
            System.out.print(q[q.length - 1]);
        }
        {
            System.out.println();
        }
        for (int i = 0; i < w.length - 1; i++) {
            System.out.print(w[i] + ", ");
        }
        {
            System.out.print(w[w.length - 1]);
        }
        {
            System.out.println();
        }
        for (int i = 0; i < e.length - 1; i++) {
            System.out.print(e[i] + ", ");
        }
        {
            System.out.print(e[e.length - 1]);
        }
        {
            System.out.println();
        }
    }
}