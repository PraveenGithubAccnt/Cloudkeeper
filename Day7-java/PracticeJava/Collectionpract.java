
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Collectionpract
{

    public void Arraylst()
    {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(23);
         arr.add(56);
          arr.add(13);
           arr.add(55);
            arr.add(78);
             arr.add(10);
        
        for(int i =0;i<arr.size();i++)
        {
            System.out.println("Element of array " + arr.get(i));
        }
          arr.remove(2);
        // Iterator<Integer> it=arr.iterator();
        // while (it.hasNext()) {
        //     System.out.println("Element of array list are " + it.next());
            
        // }
       // arr.clear();
       //arr.isEmpty();
         System.out.println("contains "+arr.contains(22));
        for(Integer it :arr)
        {
            System.out.println("Each Element of array " + it);
        }
    }

    public void mapprac()
    {
        Map<Integer, String> mapex = new HashMap<>();
        mapex.put(1, "One");
         mapex.put(2, "Two");
          mapex.put(3, "Three");
           mapex.put(4, "Four");
            mapex.put(5, "Five");

            System.out.println("Found Element "+ mapex.containsKey(2));
            System.out.println("Found Element "+ mapex.containsValue("SEVEN"));
            mapex.remove(3);

            for(Map.Entry<Integer, String> it:mapex.entrySet())
            {
                 System.out.println("Element of the map are "+it);

                 System.out.println("Key Present in the map "+it.getKey());
                 System.out.println("Key Present in the map "+it.getValue());
            }
    }
    public static void main(String[] args) 
    {
        Collectionpract obj=new Collectionpract();
        //obj.Arraylst();

        obj.mapprac();
    }
}