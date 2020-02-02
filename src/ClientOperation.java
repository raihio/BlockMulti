import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ClientOperation {

    private static RMIInterface rmi;

    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
        rmi = (RMIInterface) Naming.lookup("//localhost/MyServer");

        int[][] A =
                {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        int[][] B =
                {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        printMatrix(A);
        System.out.println("+");
        printMatrix(B);
        int[][] res = rmi.addBlock(A, B);
        System.out.println("=");
        printMatrix(res);
    }

    private static void printMatrix(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
