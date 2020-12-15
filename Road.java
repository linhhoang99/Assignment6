public class Road implements Comparable<Road>{
    
    
    private int degrees;
    
    private String name;
    
    private Town source;
    
    private Town destination;
    
    public Road(Town source, Town destination, int degrees, String name) {
        this.source = source;
        this.destination = destination;
        this.degrees = degrees;
        this.name = name;
    }
    
    public Road(Town source, Town destination, String name) {
        this.source = source;
        this.destination = destination;
        this.degrees = 1;
        this.name = name;
    }
    
    public Road(Road templateRoad) {
        this(templateRoad.source, templateRoad.destination, 
                templateRoad.degrees, templateRoad.name);
    }
 
    public boolean contains(Town town) {
        return source.getName().equals(town.getName()) ||
                destination.getName().equals(town.getName());
    }
    

    public boolean equals(Object r) {
        Road road = (Road) r;
        return (road.destination.equals(this.destination) 
                && road.source.equals(this.source)) || 
                (road.destination.equals(this.source) 
                && road.source.equals(this.destination));
    }
    
   
    public Town getDestination() {
        return destination;
    }
    
 
    public String getName() {
        return name;
    }
  
    public Town getSource() {
        return source;
    }
    
  
    public int getWeight() {
        return degrees;
    }
    

    public int compareTo(Road o) {
        return this.name.compareTo(o.name);
    }
    
 
    public String toString() {
        return name + "," + degrees + ";" + source + ";" + destination;
    }
}
