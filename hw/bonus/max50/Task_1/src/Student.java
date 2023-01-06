public class Student {
    private String name;
    private String group;
    private int age;
    private double mean_score;

    public Student(String name,String group,int age, double mean_score){
        this.name=name;
        this.group=group;
        this.age=age;
        this.mean_score=mean_score;

    }

    public void Set_name(){ this.name=name; }
    public String Get_name(){
        return this.name;
    }

    public void Set_group(){
        this.group=group;
    }
    public String Get_group(){
        return this.group;
    }

    public void Set_age(){
        this.age=age;
    }
    public int Get_age(){ return this.age; }

    public void Set_mean_score(){
        this.mean_score=mean_score;
    }
    public double Get_mean_score(){
        return this.mean_score;
    }

}
