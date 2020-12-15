public class Town implements Comparable<Town>{
    
   
    private String name;
    
  
    public Town(String name) {
        this.name = name;
    }
    
    
    public Town(Town templateTown) {
        this(templateTown.name);
    }
    
   
    public String getName() {
        return name;
    }
        
    
    public int compareTo(Town o) {
        return this.name.compareTo(o.name);
    }
    
    
    public boolean equals(Object obj) {
        Town town = (Town) obj;
        return this.name.compareTo(town.name) == 0;
    }
    
        public int hashCode() {
        return name.hashCode();
    }
    
   
    public String toString(){
        return name;
    }
}
