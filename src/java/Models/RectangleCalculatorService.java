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
public class RectangleCalculatorService {
    private String message = "The area is ";
    private final String ERROR_MESSAGE = "There was an error please check your input "+
            "and try again. <a href='RectangleCalculator.jsp'>Go Back</a>";
    
    private final double convertToDouble(String val) throws Exception{
        
        Double dVal = Double.parseDouble(val);
        System.out.println("~DVAL = "+dVal+" ~");
        return dVal;
    }
    
    public String calculateArea(String height, String width){
        
        Double dHeight;
        Double dWidth;
        Double area;
        try{
            dHeight = this.convertToDouble(height);
         dWidth = this.convertToDouble(width);
         area = dWidth * dHeight;
         message += area.toString();
        }catch(Exception ex){
          message = ERROR_MESSAGE;
        }
        System.out.println("~MESSAGE "+message+" ~");
        return message;
    }
}
