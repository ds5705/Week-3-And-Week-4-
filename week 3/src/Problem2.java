class Client {
    String name;
    int riskScore;
    double balance;

    Client(String n, int r, double b) {
        name = n;
        riskScore = r;
        balance = b;
    }
}

public class Problem2 {

    static void bubbleSort(Client[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].riskScore > arr[j + 1].riskScore) {
                    Client temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Client[] arr = {
                new Client("A", 20, 1000),
                new Client("B", 50, 2000),
                new Client("C", 80, 1500)
        };

        bubbleSort(arr);

        System.out.println("Sorted Clients:");
        for (Client c : arr) {
            System.out.println(c.name + " " + c.riskScore);
        }
    }
}