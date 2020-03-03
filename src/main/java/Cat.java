public class Cat  {


    Pet pe;

    private String color = "red";



    public Cat(){
        super();


    }


    public Cat(String name,Double weight){

        this.color = color;

    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return  color;
    }


    public String getName() {

        return pe.getName();
    }

    public String speak( ){
        return "Miaaow";
    }

}
