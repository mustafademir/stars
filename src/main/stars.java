package main;

public class stars {
    public static void main(String[] args) {
        int edgeSpaceCount = 3;
            for(int i = 1; i <= 7; i += 2) {
                for (int z=edgeSpaceCount; z>= 0; z--) {
                    System.out.print(" ");
                }
                for (int k=0; k<i; k++) {
                    System.out.print("*");
                }
                edgeSpaceCount -= 1;
                System.out.println("");
            }
    }
}
