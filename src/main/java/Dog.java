public class Dog extends Pet {

    public Dog(){
        super();

    }

    public Dog(String name,double weight){

        super(name,weight);
    }

    public String speak( ){
        return "Woof-woof";
    }

    public String toString(){

        return super.toString();
    }
}
