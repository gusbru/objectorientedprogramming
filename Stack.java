
public class Stack<X> {
  private Object[] stack;
  private int size, maxHeight, end;

  // constructor
  public Stack(int maxHeight) throws Exception {
    if (maxHeight <= 0)
      throw new Exception("Size must be positive");
    
    this.maxHeight = maxHeight;
    this.stack     = new Object[maxHeight];
    this.end       = -1;
    this.size      = 0;
    
  }

  // copy constructor
  public Stack(Stack<X> model) throws Exception 
  {
    if (model == null) 
      throw new Exception("null object");

    this.maxHeight = model.maxHeight;
    this.end       = model.end;
    this.size      = model.size;
    this.stack     = new Object[maxHeight];

    for (int i = 0; i < model.getLength(); i++)
      this.stack[i] = model.getItem(i);

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

  public X getItem(int index) throws Exception 
  {
    if (this.size == 0)
      throw new Exception("Stack is empty");
    
    if (index < 0 || index > this.size)
      throw new Exception("Index outside range");

    return (X)this.stack[index];
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

  public boolean equals(Object obj) {
    if (this == obj)
      return true;

    if (obj == null)
      return false;
  
    if (this.getClass() != obj.getClass())
      return false;
    
    
    Stack s = (Stack<X>)obj;

    if (this.size != s.size)
      return false;

    int position = this.end;
    int quantity = this.size;

    while (quantity > 0) {
      if (!this.stack[position].equals(s.stack[position]))
        return false;
      
      position--;
      quantity--;
    }

    return true;
  }

  public String toString() {
    String str = "";

    for (int i = 0; i < this.size; i++) {
      str += this.stack[i] + " ";
    }

    return str;
  }

}
