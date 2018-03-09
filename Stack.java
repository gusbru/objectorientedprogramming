
public class Stack<X> {
  Object[] stack;
  int size, maxHeight, end;

  public Stack(int maxHeight) throws Exception {
    if (maxHeight <= 0)
      throw new Exception("Size must be positive");
    
    this.maxHeight = maxHeight;
    this.stack     = new Object[maxHeight];
    this.end       = -1;
    this.size      = 0;
    
  }

  public void addItem(X item) throws Exception {
    if (item == null)
      throw new Exception("Item cannot be null");

    if (this.size == this.maxHeight)
      throw new Exception("Stack Overflow!");

    this.size++;
    this.end++;
    this.stack[end] = item;
  }

  public X getItem() throws Exception {
    if (this.size == 0)
      throw new Exception("Stack is empty");
    
    return (X)this.stack[this.end];
  }

  public void removeItem() throws Exception {
    if (this.size == 0)
      throw new Exception("Stack is empty. Cannot remove any element.");

    this.stack[this.end] = null;
    this.end--;
    this.size--;
  }

  public boolean isFull() {
    return this.size == this.maxHeight;
  }

  public boolean isEmpty() {
    return this.size == 0;
  }

  public int getLength() {
    return this.size;
  }

  // public boolean equals(Object obj) {}

  public String toString() {
    String str = "";

    for (int i = 0; i < this.size; i++) {
      str += this.stack[i] + " ";
    }

    return str;
  }

}