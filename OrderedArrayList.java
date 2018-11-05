public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>
  private T value;
  public OrderedArrayList() {
    super();
  }
  public OrderedArrayList(int startingCap){
    super(startingCap);
  }
  
  public bloolean add(T thing){
    if (size == 0){
      data[0] = thing;
      return true;
    }
    for (int i = 0; i<size; i++){
      if (data[i].comparesTo(thing) >= 0){
        super.add(i, thing);
        return true;
      }
    }
    return false;
  }

  public void add(int index, T thing){
    if (data[i].comparesTo(thing) >= 0){
        super.add(i, thing);
    }
  }
  
  public T set(int i, T thing){
    T ans = data[i];
    super.remove(i);
    add(thing);
    return T;
  }
}