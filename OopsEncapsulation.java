class Apple{
    String name;
    int prize;
    int weight;
    public Apple(String name,int prize,int weight){
        this.name=name;
        this.prize=prize;
        this.weight=weight;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPrize(int prize){
        this.prize=prize;
}
    public void setWeight(int weight){
        this.weight=weight;
    }
    public String getName(){
       return name;
    }
    public int getPrize(){
        return prize;
    }
    public int getWeight(){
        return weight;
    }
}
public class OopsEncapsulation {
    public static void main(String[] args) {
        Apple obj=new Apple("Priti",100,5);
        System.out.println(obj.getName());
        System.out.println(obj.getPrize());
        System.out.println(obj.getWeight());
        obj.setName("Pinky");
        System.out.println(obj.getName());
    }
}
