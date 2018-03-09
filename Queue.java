
public class Queue<X> {
  private Object[] queue;
  private int size, maxLength, begin, end;

  public Queue(int maxLength) throws Exception {
    if (maxLength <= 0)
      throw new Exception("Invalid queue size");
    
    this.maxLength = maxLength;
    this.size      =  0;
    this.begin     =  0;
    this.end       = -1;
    this.queue     = new Object[maxLength];
  }

  public void addItem(X item) throws Exception {
    if (item == null)
      throw new Exception("Must provide one element");
    
    if (this.size == this.maxLength)
      throw new Exception("Queue is full");

    this.size++;
    this.end = (this.end + 1) % this.maxLength ;
    this.queue[this.end] = item;
  }

  public X getItem() throws Exception {
    if (this.size == 0)
      throw new Exception("Queue is empty");

    return (X)this.queue[this.begin];
  }

  public void removeItem() throws Exception {
    if (this.size == 0)
      throw new Exception("Queue is empty, cannot remove an item");
    
    this.queue[this.begin] = null;
    this.begin = (this.begin + 1) % this.maxLength;
    this.size--;
  }

  public boolean isFull() {
    return this.size == this.maxLength;
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
    int position;

    for (int i = 0; i < this.size; i++) {
      position = (this.begin + i) % this.maxLength;
      str += this.queue[position] + " ";
    }

    return str;
  }



}