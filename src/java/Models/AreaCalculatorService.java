/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Mark
 */
public class AreaCalculatorService {
     private String message = "The area is ";
    private final String ERROR_MESSAGE = "There was an error please check your input "+
            "and try again.";
    private final String CIRCLE = "circle";
    private final String RECTANGLE = "rectangle";
    private final String TRIANGLE = "triangle";
    private double dHeight;
    private double dWidth;
    private double dRadius;
    private double area;
    
    private final double convertToDouble(String val) throws Exception{
        
        Double dVal = Double.parseDouble(val);
        System.out.println("~DVAL = "+dVal+" ~");
        return dVal;
    }
    
    private final double calculateRectangleArea(String height, String width) throws Exception{
        
    
        
            dHeight = this.convertToDouble(height);
         dWidth = this.convertToDouble(width);
         area = (dWidth * dHeight);
         return area;
        
    }
    private final double calculateTriangleArea(String height, String width) throws Exception{
       
         dHeight = this.convertToDouble(height);
         dWidth = this.convertToDouble(width);
         
         area = ((dWidth * dHeight)/2);
         
        return area;
    }
    private final double calculateCircleArea(String radius)throws Exception{
        dRadius = this.convertToDouble(radius);
        
        area = (dRadius*dRadius) * Math.PI;
        
        return area;
    }
    public final String calculateArea(String radius, String height, String width, String shape){
         switch (shape.toLowerCase()) {
             case RECTANGLE:
                 try{
                     message += this.calculateRectangleArea(height, width);
                 }catch(Exception ex){
                      message = this.ERROR_MESSAGE;
                 }
                 break;
             case TRIANGLE:
                 try{
                     message += this.calculateTriangleArea(height, width);
                 }catch(Exception ex){
                      message = this.ERROR_MESSAGE;
                 }
                 break;
             case CIRCLE:
                    try{
                        message += this.calculateCircleArea(radius);
                    }catch(Exception ex){
                         message = this.ERROR_MESSAGE;
                    }
                 break;
             default:
                  message = this.ERROR_MESSAGE;
                 break;
         }
        return message;
    
    }
    
    
}
