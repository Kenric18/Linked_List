class ListTest {

  public static void main(String[] args) {

    LinkedList list = new LinkedList();

    list.insert (1);
    list.insert (3);
    list.insert (6);
    list.insert (5);

    list.print ();

    for (int l = 0; l < 6; ++l) {
      if (!list.has(l)) {
        System.out.println (l + " is not in the list");
      }
    }
/*
    while (!list.isEmpty()) {
      int d = list.delete();
      System.out.println("deleted: " + d);
    }

    list.print ();
   */
  }

}