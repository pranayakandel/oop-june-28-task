public class CallCenterQueue {
    private static final int MAX = 100;
    private String[] queue = new String[MAX];
    private int front = 0;
    private int rear = -1;

    public void addCall(String call) {
        if (rear == MAX - 1) {
            System.out.println("Call queue is full.");
            return;
        }
        queue[++rear] = call;
    }

    public void serveCall() {
        if (isEmpty()) {
            System.out.println("No calls to handle.");
            return;
        }
        System.out.println("Handling call: " + queue[front++]);
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Call queue is empty.");
            return;
        }
        System.out.print("Call Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public void displayCallCount() {
        System.out.println("Pending calls: " + (rear - front + 1));
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public static void main(String[] args) {
        CallCenterQueue ccq = new CallCenterQueue();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Call\n2. Handle Call\n3. Display Calls\n4. Display Call Count\n5. Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter call ID: ");
                    String call = sc.nextLine();
                    ccq.addCall(call);
                    break;
                case 2:
                    ccq.serveCall();
                    break;
                case 3:
                    ccq.displayQueue();
                    break;
                case 4:
                    ccq.displayCallCount();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}