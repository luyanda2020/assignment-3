public class Pet{

    private String name = "Tiger";
    private double weight;

    public Pet( ){


    }
    public Pet(String name,double weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName( ){
        return name;
    }

    public void setName(String petName){
        name = petName;
    }

    public void setWeight(double petWeight){
        weight = petWeight;
    }

    public double getWeight(){

        return weight;	}



    public String speak( ){
        return "I am a cute pat";
    }

    public String toString(){

        return "name " + " " + getName() +" "+ "weight  " + getWeight();
    }


}

