public class Main013 {
    public static void main(String[] args){
        Fruit apple = FruitFactory.getFruit("Apple");
        apple.get();
    }
}
class FruitFactory{
    public FruitFactory(String apple) {
    }

    public static Fruit getFruit(String type){
        if(type == "Apple"){
            return new Apple();
        }else if(type == "Banana"){
            return new Banana();
        }
        return null;
    }
}
interface Fruit{
    public void get();
}
class Apple implements Fruit{
    public void get(){
        System.out.println("苹果");
    }
}
class Banana implements Fruit{
    public void get(){
        System.out.println("香蕉");
    }
}