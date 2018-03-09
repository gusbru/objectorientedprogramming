
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

  public void addElement(X item) throws Exception {
    if (item == null)
      throw new Exception("Item cannot be null");

    if (this.size == this.maxHeight)
      throw new Exception("Stack Overflow!");

    this.size++;
    this.end++;
    this.stack[end] = item;
  }

  public X getElement() throws Exception {
    if (this.size == 0)
      throw new Exception("Stack empty");
    
    return this.stack[this.end];
  }

}