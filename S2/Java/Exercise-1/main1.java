import java.util.*;
public class main1 {
    public static void main(String[] args) {
        product ob1=new product("car",20,1);
        product ob2=new product("bike",4,2);
        product ob3=new product("bus",34,3);
        if(ob1.price<ob2.price && ob1.price<ob3.price ){
            System.out.println(ob1.name+" is the chepest");
        }
        else if(ob2.price<ob1.price && ob2.price<ob3.price){
            System.out.println(ob2.name+ " is the cheapest");
        }
        else{
            System.out.println(ob3.name+ " is the cheapest");
        }
    
    }
}
class product{
    String name;
    int price;
    int code;
product(String name , int price,int code){
    this.name=name;
    this.price=price;
    this.code=code;
}
}
