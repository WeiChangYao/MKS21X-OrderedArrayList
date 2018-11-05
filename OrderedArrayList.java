import java.util.ArrayList;
import java.util.List;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  private T value;
  public OrderedArrayList() {
    super();
  }
  public OrderedArrayList(int startingCap){
    super(startingCap);
  }
  
  public boolean add(T thing){
    if (size() == 0){
      super.add(thing);
      return true;
    }
    for (int i = 0; i<size(); i++){
      if (super.get(i).compareTo(thing) >= 0){
        super.add(i, thing);
        return true;
      }
    }
    return super.add(thing);
  }

  public void add(int index, T thing){
    add(thing);
  }
  
  public T set(int i, T thing){
    T ans = super.get(i);
    super.remove(i);
    add(thing);
    return ans;
  }
}