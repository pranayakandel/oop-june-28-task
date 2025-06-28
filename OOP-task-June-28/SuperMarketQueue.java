public class SupermarketQueue {
    private static final int MAX = 100;
    private String[] queue = new String[MAX];
    private int front = 0;
    private int rear = -1;

    public void addCustomer(String name) {
        if (rear == MAX - 1) {
            System.out.println("Queue is full.");
            return;
        }
        queue[++rear] = name;
    }

    public void serveCustomer() {
        if (isEmpty()) {
            System.out.println("No customers to serve.");
            return;
        }
        System.out.println("Serving: " + queue[front++]);
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Current Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public void displayCustomerCount() {
        System.out.println("Number of customers: " + (rear - front + 1));
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public static void main(String[] args) {
        SupermarketQueue smq = new SupermarketQueue();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Customer\n2. Serve Customer\n3. Display Queue\n4. Display Count\n5. Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();
                    smq.addCustomer(name);
                    break;
                case 2:
                    smq.serveCustomer();
                    break;
                case 3:
                    smq.displayQueue();
                    break;
                case 4:
                    smq.displayCustomerCount();
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