public class Car {
    private String name;
    private String brand;
    private int year;
    private int total_distance;

    public Car(String name, String brand, int year, int total_distance){
        this.name=name;
        this.brand=brand;
        this.year=year;
        this.total_distance=total_distance;
    }
    public void set_name (String name){ this.name = name; }
    public String get_name () { return this.name; }

    public void set_brand (String brand){ this.brand = brand; }
    public String get_brand () { return this.brand; }

    public void set_year (int year){ this.year = year; }
    public int get_year () { return this.year; }

    public void set_total_distance (int total_distance){ this.total_distance = total_distance; }
    public int get_total_distance () { return this.total_distance; }



    public void trip (int actual_distance){
        this.set_total_distance(this.get_total_distance() + actual_distance);
    }
}
