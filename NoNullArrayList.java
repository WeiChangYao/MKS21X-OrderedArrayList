import java.util.ArrayList;
import java.util.List;
public class NoNullArrayList<T> extends ArrayList<T> { 
  private T value;
  public NoNullArrayList(){
    super();
  }
    public NoNullArrayList(int startingCap){
    super(startingCap);
  }
  public void add(int index, T thing){
    if (thing == null){
      throw new IllegalArgumentException();
    }
    else {
      super.add(index, thing);
    }
  }
  public boolean add(T thing){
    if (thing == null){
      throw new IllegalArgumentException();
    }
    else {
      return super.add(thing); //REMEMBER THE RETURN PART
    }
  }
  public T set(int i, T thing){
    if (thing == null){
      throw new IllegalArgumentException();
    }
    else {
      return super.set(i, thing);
    }
  }
}
