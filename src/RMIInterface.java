import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote {

    int[][] multiplyBlock(int A[][], int B[][]) throws RemoteException;

    int[][] addBlock(int A[][], int B[][]) throws RemoteException;
}
