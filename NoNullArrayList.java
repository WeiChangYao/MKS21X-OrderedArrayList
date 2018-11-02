import java.util.ArrayList;
import java.util.List;
public class NoNullArrayList<T> extends ArrayList<T> { 
  private T value;
  public NoNullArrayList() {
    super();
  }
  public NoNullArrayList(int startingCap){
    super(startingCap);
  }
  public boolean add(T thing){
    if (thing == null){
      throw new IllegalArgumentException();
    }
    else {
      super.add(thing);
    }
  }
  public void add(int index, T thing){
    if (thing == null){
      throw new IllegalArgumentException();
    }
    else {
      super.add(index, thing);
    }
  }
  
}
