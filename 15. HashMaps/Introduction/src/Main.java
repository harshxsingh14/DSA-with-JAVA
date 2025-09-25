import java.util.*;

class MapUsingHash {

  private Entity[] entities;
  
  public MapUsingHash() {
    entities = new Entity[100];
  }

  public void put(String key, String value) {
    int hash = Math.abs(key.hashCode() % entities.length);
    entities[hash] = new Entity(key, value); // overriding
  }

  public String get(String key) {
    int hash = Math.abs(key.hashCode() % entities.length);
    if(entities[hash] != null && entities[hash].key.equals(key)) {
      return entities[hash].value;
    }
    return null;
  }

  public void remove(String key) {
    int hash = Math.abs(key.hashCode() % entities.length);
    if(entities[hash] != null && entities[hash].key.equals(key)) {
    entities[hash] = null;
    }
  }

  private class Entity {
    String key;
    String value;

    public Entity(String key, String value) {
      this.key = key;
      this.value = value;
    }
  }
}



class Main {
  public static void main(String[] args) {
    // hashDemo();
    HashMap1<String, String> map = new HashMap1<>();
    
map.put("Ferrari LaFerrari", "A hybrid hypercar with a V12 engine and F1-inspired electric boost");
map.put("Bugatti Chiron", "A record-breaking hypercar with a quad-turbo W16 engine");
map.put("Lamborghini Aventador", "A flagship V12 supercar with aggressive design and raw power");


    System.out.println(map);
    
    
  }

  public static void hashDemo() {

    HashMap<String, Integer> map = new HashMap<>();

    map.put("harsh", 29);
    map.put("Sachin", 19);
    map.put("Rahul", 44);

    // System.out.println(map.get("Sachin"));
    // System.out.println(map.getOrDefault("Apoorv", 78));
    System.out.println(map.containsKey("Sachin"));

    HashSet<Integer> set = new HashSet<>();
    set.add(56);
    set.add(9);
    set.add(12);
    set.add(43);
    set.add(56);
    set.add(2);

    System.out.println(set);
  }
  
}