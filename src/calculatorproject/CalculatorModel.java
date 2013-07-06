
package calculatorproject;
import java.text.*;
/**
 *
 * @author 90045985
 */
public class CalculatorModel {
    private String display;
    private String displayNum;
    private String displayDecimal;
    private String errorMsg; // used for exceptions
    private int decimalPlaces;
    private boolean isBasicView;
    private boolean isDecimal;
    private boolean isNum1Set;
    private boolean isRadians;
    private double calcNum1; //used for calculations
    private double calcNum2; //used for calculations
    private char operator; //used for calculations
    private double answer; //used in calculations
    
    //Instantiating decimal formats
    DecimalFormat dF0 = new DecimalFormat("#,###,##0");
    DecimalFormat dF1 = new DecimalFormat("#,###,##0.0");
    DecimalFormat dF2 = new DecimalFormat("#,###,##0.00");
    DecimalFormat dF3 = new DecimalFormat("#,###,##0.000");
    DecimalFormat dF4 = new DecimalFormat("#,###,##0.0000");
    DecimalFormat dF5 = new DecimalFormat("#,###,##0.00000");
    DecimalFormat dF6 = new DecimalFormat("#,###,##0.000000");
    DecimalFormat dF7 = new DecimalFormat("#,###,##0.0000000");
    DecimalFormat dF8 = new DecimalFormat("#,###,##0.00000000");
    DecimalFormat dF9 = new DecimalFormat("#,###,##0.000000000");
    
    
    
    //new internal class to customize exceptions
    class customException extends NumberFormatException{
        public customException(String message){
            super(message); //passes error message to NFE parent
            
        }
        
        
    }
    
    
    //Method sets the isBoolean variable
    public void setIsDecimal(Boolean isDecimal){
        this.isDecimal = isDecimal;
    }
    
    //Operator value is passed in from the view
    public void setOperator(char operator) throws NumberFormatException{
           
        if(operator == '='){
            setNums(); 
        }
        else{
             this.operator = operator;
        }
    }
    
    //sets the isRadians boolean
    public void setIsRadians(boolean isRadians){
        this.isRadians = isRadians;
    }
  
    //sets the number of Decimal places for number formats
    public void setDecimalPlaces(int decimalPlaces){
        this.decimalPlaces = decimalPlaces;
    }
    
    //returns the value of display to the calling method
    public String getDisplay(){
        return display;
    }
    
     /**Resets the display values, booleans and num values in calculator class.
     * If boolean true is passed the method will clear all data in the 
     * CalculatorModel variables.  If false is passed, method will only reset
     * elements affecting the display
     */
    public void reset(boolean resetAll){
        display = "0.0"; //update in model
        displayDecimal = ""; //update in model
        displayNum = ""; //update in model
        isDecimal = false; 
       
            if(resetAll == true){
                calcNum1 = 0;
                calcNum2 = 0;
                operator =  '\u0000';
                isNum1Set = false;
                answer = 0;
                
    }
    }
    
   //Processes the button input and returns a the String "display" to the view 
   public String display(String value){
         
        //catches static values first i.e PI and E
        if(value.equals("E")){
              displayNum = String.valueOf(Math.E);
              display = displayNum;
              return display;
         }
        else if(value.equals("P")){
              displayNum = String.valueOf(Math.PI);
              display = displayNum;
              return display;
         }
        else if (value.equals("+/-")){
             display = String.valueOf(-parseDisplay());
             return display;
          
        }
         else{
            if(isDecimal == false){
                if(displayNum.equals("")){
                  displayNum = value;
                  display = displayNum + "." + 0;
                  return display;
            }
                else{
                    displayNum = displayNum + value;
                    display = displayNum +  "." + 0;
                    return display;
                }
            }
            
            else{ 
                if(displayDecimal.equals("") && value.equals("0")){
                   displayDecimal = value; 
                   display = displayNum + "." + displayDecimal;
                   return display; 
            
            }
                else {
                    displayDecimal = displayDecimal + value; 
                    display = displayNum + "." + displayDecimal;
                    return display;  
                
            }
            }
        }
   }
   
   //Number format method.  Called in ansToString()
     public double numFormat(double num){
         switch(decimalPlaces){
             case 0:
                  num = Double.parseDouble(dF0.format(num));
                  break;
             case 1:
                  num = Double.parseDouble(dF1.format(num));
                  break;
             case 2:
                 num = Double.parseDouble(dF2.format(num));
                  break;
             case 3:
                 num = Double.parseDouble(dF3.format(num));
                 break;
             case 4:
                 num = Double.parseDouble(dF4.format(num));
                  break;
             case 5:
                 num = Double.parseDouble(dF5.format(num));
                  break;
             case 6:
                 num = Double.parseDouble(dF6.format(num));
                  break;
             case 7:
                 num = Double.parseDouble(dF7.format(num));
                  break;
             case 8:
                 num = Double.parseDouble(dF8.format(num));
                 break;
             case 9:
                 num = Double.parseDouble(dF9.format(num));
                  break;
              }
               
         return num;
     }
     
    
   
   
   // converts the display string into a double for calculations
   private double parseDisplay(){
       return Double.parseDouble(display);
   }
   
   /**sets the num1 to a string and applies the number formatting
    * to the result ready to be return to the view.
    * this is only called after the equals button is pressed
    * and clears the num1 value ready to start again
    */
   public String ansToString(){
       display = String.valueOf(numFormat(calcNum1));
       
       /**Test cases in the spec don't require calculations to be performed on the
        * answers of previous calculations so calcNum1 is cleared when the
        * answer is returned to the view
        */
        calcNum1 = 0;
        calcNum2 = 0;
        operator = '\u0000'; 
        isNum1Set = false;
        answer = 0;
        isDecimal = false;
        return display;
   }
       
   
   /** sets the numbers for the calculations and calls calculate method for
    * standard operators if calcNum1 is already set.  Also sets calcNum
    * variables and calls calculate for non standard operators which are
    * passed to setOperator() from the view
    * Operator codes for non standard operators are:
    * 1/x = d
    * x^n = ^
    * x! = f
    * sin = s
    * cos = c
    * tan = t
    * asin = i
    * acos = o
    * atan = n
    */
   public void setNums() throws NumberFormatException{
       /**This if statement will set calcNum1 and the operator so that the
        * calculator method can do all the work for the 1/x function.  
        */
       if(operator == 'd'){ 
           calcNum1 = 1;
           isNum1Set = true;
           operator = '/';
           calcNum2 = parseDisplay();
                if(calcNum2 == 0){
                    throw new customException("ERROR: Inverse of zero is infinity");
                    
                }
                else{
                    calculate();
                    reset(false); //clear display for next entry
                }
           
       }
       else if(operator == 'f'){
           if(parseDisplay()>20 || parseDisplay() < 0 ){
               //throws a custom exception all the way back up to the view.
               
              throw new customException("ERROR: Must be a positive integer"
                       + " between 0 and 20.");
               
           }
           else{
           
                if(display.startsWith("-")== true){
                    //throws a custom exception all the way back up to the view.
                    throw new customException("ERROR: Must be a positive integer"
                       + " between 0 and 20.");
            }
         
                 else{
                      if(display.endsWith(".0")== true){
                       calcNum1 = parseDisplay();
                       isNum1Set = true;
                       calculate();
                      reset(false); //clear display for next entry
                 }
                       else{
                         //throws a custom exception all the way back up to the view.
                          throw new customException("ERROR: Must be a positive integer"
                            + " between 0 and 20.");
               
            }
           }
           }
        }
       else if(operator == 's' || operator == 'c'|| operator == 't'|| operator == 'i'|| operator == 'o'|| operator == 'n'){
                calcNum1 = parseDisplay();
                isNum1Set = true;
                calculate();
                reset(false); //clear display for next entry
            }
               
       else    {
       if(isNum1Set == false){ 
            if(operator == '='){
               //APPLY FORMATTING TO THIS NUMBER
                calcNum1 = parseDisplay();
            }
            else{
            calcNum1 = parseDisplay();
            isNum1Set = true;
           reset(false);  //clear display for next entry
            }
        }
        else{
            calcNum2 = parseDisplay();
            calculate();
            reset(false); //clear display for next entry
        }
        
   }
           }
   
   //Method for calculating factorials - NEEDS ERROR CHECKING!!
   private double factorial(double n){
       int factorial = 1;
       for(int i = 1; i <=(int)n; i++){
           factorial *= i;
           
           }
       return (double)factorial;
   }
   
   
   /**the main calculation takes place here.  display is processed by the 
    * parseDisplay() method. and the operators are applied.
    * ROUNDING NEEDS TO BE APPLIED TO ANSWER!!
    * NEEDS ERROR CATCHING
    */
   private void calculate() throws NumberFormatException{
       
       switch(operator){
           case '+':
               answer = calcNum1 + calcNum2;
               calcNum1 = answer;
               answer = 0; // clear answer ready for next calculation
               calcNum2 = 0.0; //clear num2 ready for next calculation
               break;
           case '-':
               answer = calcNum1 - calcNum2;
               calcNum1 = answer;
               answer = 0; 
               calcNum2 = 0.0;
               break;
           case '/': 
               if(calcNum2 == 0){
                   reset(true);
                   throw new customException("ERROR: Divide by zero");
               }
               else{
               answer = calcNum1 / calcNum2;
               calcNum1 = answer;
               answer = 0; 
               calcNum2 = 0.0; 
               }
               break;
           case '*':
               answer = calcNum1 * calcNum2;
               calcNum1 = answer;
               answer = 0; 
               calcNum2 = 0.0; 
               break;
           case '^':
               answer = Math.pow(calcNum1,calcNum2);
               calcNum1 = answer;
               answer = 0; 
               calcNum2 = 0.0;
               break;
           case 'f':
               answer = factorial(calcNum1);
               calcNum1 = answer;
               answer = 0; 
               calcNum2 = 0.0;
               break;
           case 's':
              if(isRadians == true){
                    answer = Math.sin(calcNum1); 
               }
               else{
                   answer = Math.sin(Math.toRadians(calcNum1));
               }
               calcNum1 = answer;
               answer = 0; 
               calcNum2 = 0.0;
               break;
           case 'c':
               if(isRadians == true){
                    answer = Math.cos(calcNum1); 
               }
               else{
                   answer = Math.cos(Math.toRadians(calcNum1));
               }
               calcNum1 = answer;
               answer = 0; 
               calcNum2 = 0.0;
               break;
           case 't':
               if(isRadians == true){
                    answer = Math.tan(calcNum1); 
               }
               else{
                   answer = Math.tan(Math.toRadians(calcNum1));
               }
               calcNum1 = answer;
               answer = 0; 
               calcNum2 = 0.0;
               break;
           case'i':
               if(isRadians == true){
                   answer = Math.asin(calcNum1);
               }
               else{
                   answer = Math.toDegrees(Math.asin(calcNum1));
               }
               calcNum1 = answer;
               answer = 0; 
               calcNum2 = 0.0;
               break;
           case'o':
               if(isRadians == true){
                   answer = Math.acos(calcNum1);
               }
               else{
                   answer = Math.toDegrees(Math.acos(calcNum1));
               }
               calcNum1 = answer;
               answer = 0; 
               calcNum2 = 0.0;
               break;
           case'n':
               if(isRadians == true){
                   answer = Math.atan(calcNum1);
               }
               else{
                   answer = Math.toDegrees(Math.atan(calcNum1));
               }
               calcNum1 = answer;
               answer = 0; 
               calcNum2 = 0.0;
               break;
       }
       }
       
           
       
       
              
   }

        
