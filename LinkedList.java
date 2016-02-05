class LinkedList {

  private Node head;
  private Node referenceNode;
  private Node iterator;

  public LinkedList () {
    head = new Node();
    iterator = head;
  }

  public boolean isEmpty () {
    if (head.getPointer() == null) {
      return true;
    } else {
      return false;
    }
  }

  public void insert (int d) {
    if(isEmpty()) {
      referenceNode = new Node(d, null);
      head.setPointer(referenceNode);
    } else {
      while (iterator.getPointer() != null) {
        iterator = iterator.getPointer();
      }
      referenceNode = new Node(d, null);
      iterator.setPointer(referenceNode);
    }
    return;
  }

  public int delete () {
    return 0;
  }

  public boolean has (int d) {
    iterator = head;
    while (iterator.getPointer() != null) {
      iterator = iterator.getPointer();
      if (iterator.getValue() == d) {
        return true;
      }
    }
    return false;
  }

  public void print () {
    iterator = head;
    while (iterator.getPointer() != null) {
      iterator = iterator.getPointer();
      System.out.println(iterator.getValue());
    }
  }

}
