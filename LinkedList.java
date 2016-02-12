class LinkedList {

  private Node head;
  private Node referenceNode;

  public LinkedList () {
    head = new Node();
  }

  public boolean isEmpty () {
    if (head.getPointer() == null) {
      return true;
    } else {
      return false;
    }
  }

  public void insert (int d) {
    Node iterator = head;
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
    Node iterator = head;
    while (iterator.getPointer().getPointer() != null) {
      iterator = iterator.getPointer();
    }
    int delete_value = iterator.getPointer().getValue();
    iterator.setPointer(null);
    return delete_value;
  }

  public boolean has (int d) {
    Node iterator = head;
    while (iterator.getPointer() != null) {
      iterator = iterator.getPointer();
      if (iterator.getValue() == d) {
        return true;
      }
    }
    return false;
  }

  public void print () {
    Node iterator = head;
    while (iterator.getPointer() != null) {
      iterator = iterator.getPointer();
      System.out.println(iterator.getValue());
    }
  }

}
