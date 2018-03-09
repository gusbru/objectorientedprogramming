
public class Program {
  
  public static void main(String[] args) throws Exception {
    
    System.out.println("Starting...");
    
    try {
      int n = 5;
      Queue queue = new Queue(n);
      Stack stack = new Stack(n);

      System.out.println("The queue is full? " + queue.isFull());
      System.out.println("Elements: " + queue.toString());

      System.out.println("Filling the queue...");
      for (int i = 0; i < n; i++) {
        queue.addItem("Test" + i);
      }

      System.out.println("The queue is full? " + queue.isFull());
      System.out.println("Elements: " + queue.toString());

      System.out.println("Execute the first element: " + queue.getItem());
      queue.removeItem();

      System.out.println("The queue is full? " + queue.isFull());
      System.out.println("Elements: " + queue.toString());

      System.out.println("Add one element");
      queue.addItem("Test" + (n+1));

      System.out.println("The queue is full? " + queue.isFull());
      System.out.println("Elements: " + queue.toString());



    } catch (Exception error) {
      System.err.println(error);
    }
    
    
  }
}