//Harrison Pierce
//10/12/17
//This program takes user entered information from main method and calculates the area of the given shape
//Then returns the value back to the main method
public class geometry { 
    

            
    public static  double areacircle(double r) { //This method takes users radius from main method and assigns it to 'r' variable
             
        if(r < 0) { System.out.println("There was an error!"); } //if the given radius is a negative number, an error message is displayed
        
        double areacircle = r * r * Math.PI;        //Calculates the area of a circle using formula and assigns value to 'areacircle' variable
        return areacircle;                          //returns area of circle to main method
    }

    public static double arearect(double l, double w) {
        if(l < 0 || w < 0) { System.out.println("There was an error!"); } //if the given radius is a negative number, an error message is displayed
        
        double arearect = l * w;         //Calculates the area of a rectangle using formula and assigns value to 'arearect' variable
        return arearect;                 //returns area of the rectangle to main method
    }

    public static double areatri(double b, double h) {
        if(b < 0 || h < 0) { System.out.println("There was an error!"); } //if the given radius is a negative number, an error message is displayed
        
        double areatri = b * h * .5;	 	//Calculates the area of a triangle using formula and assigns value to 'areatri' variable	
        return areatri;                         //returns area of the triangle to main method
    }

}


