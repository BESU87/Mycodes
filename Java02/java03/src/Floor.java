public class Floor {
    // write code here
    private double width;
    private double length;

    //constructor

    public Floor(double width, double length){

        if(width < 0){
            width = 0;
        }
        if(length < 0){
            length = 0;
        }
        this.width = width;
        this.length = length;
    }


    // Methods

    public double getArea(){
        return width *length;
    }


}




