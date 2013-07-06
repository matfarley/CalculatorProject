
package calculatorproject;

/**
 *
 * @author  90045985
 */
public class CalculatorViewControlFrame extends javax.swing.JFrame {
    private String display;
    private String displayDecimal;
    private String displayNum;
    private boolean isBasicView;
    private boolean isDecimal;
    private String helpMessage;
     // Used to help display module handle value of PI etc.
    public boolean isStaticVariable;
    CalculatorModel calc = new CalculatorModel();

    
    
    /** Creates new form CalculatorViewControlFrame */
    public CalculatorViewControlFrame() {
        initComponents();
        setCalculator();
    }
    
    //Module initialises Calculator
    private void setCalculator(){
        
        calc.reset(true);
        txtDisplay.setText(calc.getDisplay());
        setView();
        setFont();
        calc.setDecimalPlaces(1);
        
    }
    
   
  
    /**Used to change the view between normal and extended.  Called to
     * set the view at start up and each time the view radio buttons 
     * are selected
     */ 
    private void setView(){
        if(radBasicView.isSelected() == true){
            isBasicView = true;
            this.setSize(420, 390);
            pnlExtension.setVisible(false);
    }
        else{
            isBasicView = false;
            this.setSize(580, 390);
            pnlExtension.setVisible(true);
            
        }
        }
       
    // Sets the fonts for each component on the calculator.  Pain or Bold
    private void setFont(){
        if(radPlain.isSelected() == true){
        java.awt.Font oldFont = this.getFont();
        java.awt.Font newFont = new java.awt.Font(oldFont.getName(), java.awt.Font.PLAIN, oldFont.getSize());
        //Setting fonts for menu items
        mnuView.setFont(newFont);
            radBasicView.setFont(newFont);
            radExtendedView.setFont(newFont);
        mnuFont.setFont(newFont);
            radPlain.setFont(newFont);
            radBold.setFont(newFont);
        mnuRound.setFont(newFont);
            rad0DCP.setFont(newFont);
            rad1DCP.setFont(newFont);
            rad2DCP.setFont(newFont);
            rad3DCP.setFont(newFont);
            rad4DCP.setFont(newFont);
            rad5DCP.setFont(newFont);
            rad6DCP.setFont(newFont);
            rad7DCP.setFont(newFont);
            rad8DCP.setFont(newFont);
            rad9DCP.setFont(newFont);
        mnuHelp.setFont(newFont);
            mnuAbout.setFont(newFont);
            mnuHotkeys.setFont(newFont);
        //setting font for display
        txtDisplay.setFont(newFont);
        // setting font for keypad components
        btn1.setFont(newFont);
        btn2.setFont(newFont);
        btn3.setFont(newFont);
        btn4.setFont(newFont);
        btn5.setFont(newFont);
        btn6.setFont(newFont);
        btn7.setFont(newFont);
        btn8.setFont(newFont);
        btn9.setFont(newFont);
        btn0.setFont(newFont);
        btnClearAll.setFont(newFont);
        btnClearEntry.setFont(newFont);
        btnEquals.setFont(newFont);
        btnMultiply.setFont(newFont);
        btnSubtract.setFont(newFont);
        btnDivide.setFont(newFont);
        btnAdd.setFont(newFont);
        btnFactorial.setFont(newFont);
        btnPositiveNegative.setFont(newFont);
        btnPowerOf.setFont(newFont);
        btn1DivideBy.setFont(newFont);
        btnSin.setFont(newFont);
        btnCos.setFont(newFont);
        btnTan.setFont(newFont);
        btnPI.setFont(newFont);
        btnAsin.setFont(newFont);
        btnAcos.setFont(newFont);
        btnAtan.setFont(newFont);
        btnE.setFont(newFont);
        //setting font for radio buttons Degrees/Radians
        radDegrees.setFont(newFont);
        radRad.setFont(newFont);
    
        
    }
        if(radBold.isSelected() == true){
            java.awt.Font oldFont = this.getFont();
            java.awt.Font newFont = new java.awt.Font(oldFont.getName(), java.awt.Font.BOLD, oldFont.getSize());
         //Setting fonts for menu items
        mnuView.setFont(newFont);
            radBasicView.setFont(newFont);
            radExtendedView.setFont(newFont);
        mnuFont.setFont(newFont);
            radPlain.setFont(newFont);
            radBold.setFont(newFont);
        mnuRound.setFont(newFont);
            rad0DCP.setFont(newFont);
            rad1DCP.setFont(newFont);
            rad2DCP.setFont(newFont);
            rad3DCP.setFont(newFont);
            rad4DCP.setFont(newFont);
            rad5DCP.setFont(newFont);
            rad6DCP.setFont(newFont);
            rad7DCP.setFont(newFont);
            rad8DCP.setFont(newFont);
            rad9DCP.setFont(newFont);
        mnuHelp.setFont(newFont);
            mnuAbout.setFont(newFont);
            mnuHotkeys.setFont(newFont);
        //setting font for display
        txtDisplay.setFont(newFont);
        // setting font for keypad components
        btn1.setFont(newFont);
        btn2.setFont(newFont);
        btn3.setFont(newFont);
        btn4.setFont(newFont);
        btn5.setFont(newFont);
        btn6.setFont(newFont);
        btn7.setFont(newFont);
        btn8.setFont(newFont);
        btn9.setFont(newFont);
        btn0.setFont(newFont);
        btnClearAll.setFont(newFont);
        btnClearEntry.setFont(newFont);
        btnEquals.setFont(newFont);
        btnMultiply.setFont(newFont);
        btnSubtract.setFont(newFont);
        btnDivide.setFont(newFont);
        btnAdd.setFont(newFont);
        btnFactorial.setFont(newFont);
        btnPositiveNegative.setFont(newFont);
        btnPowerOf.setFont(newFont);
        btn1DivideBy.setFont(newFont);
        btnSin.setFont(newFont);
        btnCos.setFont(newFont);
        btnTan.setFont(newFont);
        btnPI.setFont(newFont);
        btnAsin.setFont(newFont);
        btnAcos.setFont(newFont);
        btnAtan.setFont(newFont);
        btnE.setFont(newFont);
        //setting font for radio buttons Degrees/Radians
        radDegrees.setFont(newFont);
        radRad.setFont(newFont);
        }
    }
    void exceptionHandling(NumberFormatException nfe){
        calc.reset(true);
        txtDisplay.setText(calc.getDisplay());
        msgMessage.showMessageDialog(this,nfe.getMessage().toString(),"Message", javax.swing.JOptionPane.ERROR_MESSAGE);
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgrFont = new javax.swing.ButtonGroup();
        bgrDisplay = new javax.swing.ButtonGroup();
        bgrDegRad = new javax.swing.ButtonGroup();
        msgMessage = new javax.swing.JOptionPane();
        bgrRound = new javax.swing.ButtonGroup();
        pnlExtension = new javax.swing.JPanel();
        radRad = new javax.swing.JRadioButton();
        radDegrees = new javax.swing.JRadioButton();
        btnAsin = new javax.swing.JButton();
        btnSin = new javax.swing.JButton();
        btnCos = new javax.swing.JButton();
        btnAcos = new javax.swing.JButton();
        btnAtan = new javax.swing.JButton();
        btnTan = new javax.swing.JButton();
        btnPI = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        pnlMain = new javax.swing.JPanel();
        btnFactorial = new javax.swing.JButton();
        btnPositiveNegative = new javax.swing.JButton();
        btnPowerOf = new javax.swing.JButton();
        btn1DivideBy = new javax.swing.JButton();
        btnEquals = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        btnSubtract = new javax.swing.JButton();
        btnClearAll = new javax.swing.JButton();
        btnClearEntry = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        txtDisplay = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        mnuMainMenu = new javax.swing.JMenuBar();
        mnuView = new javax.swing.JMenu();
        radBasicView = new javax.swing.JRadioButtonMenuItem();
        radExtendedView = new javax.swing.JRadioButtonMenuItem();
        mnuFont = new javax.swing.JMenu();
        radPlain = new javax.swing.JRadioButtonMenuItem();
        radBold = new javax.swing.JRadioButtonMenuItem();
        mnuRound = new javax.swing.JMenu();
        rad0DCP = new javax.swing.JRadioButtonMenuItem();
        rad1DCP = new javax.swing.JRadioButtonMenuItem();
        rad2DCP = new javax.swing.JRadioButtonMenuItem();
        rad3DCP = new javax.swing.JRadioButtonMenuItem();
        rad4DCP = new javax.swing.JRadioButtonMenuItem();
        rad5DCP = new javax.swing.JRadioButtonMenuItem();
        rad6DCP = new javax.swing.JRadioButtonMenuItem();
        rad7DCP = new javax.swing.JRadioButtonMenuItem();
        rad8DCP = new javax.swing.JRadioButtonMenuItem();
        rad9DCP = new javax.swing.JRadioButtonMenuItem();
        mnuHelp = new javax.swing.JMenu();
        mnuAbout = new javax.swing.JMenuItem();
        mnuHotkeys = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CPCalculator");
        setBounds(new java.awt.Rectangle(0, 0, 260, 335));
        getContentPane().setLayout(null);

        pnlExtension.setMinimumSize(new java.awt.Dimension(160, 380));
        pnlExtension.setLayout(null);

        bgrDegRad.add(radRad);
        radRad.setText("Radians");
        radRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radRadActionPerformed(evt);
            }
        });
        pnlExtension.add(radRad);
        radRad.setBounds(90, 20, 80, 23);

        bgrDegRad.add(radDegrees);
        radDegrees.setSelected(true);
        radDegrees.setText("Degrees");
        radDegrees.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radDegreesItemStateChanged(evt);
            }
        });
        pnlExtension.add(radDegrees);
        radDegrees.setBounds(0, 20, 90, 23);

        btnAsin.setText("asin");
        btnAsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsinActionPerformed(evt);
            }
        });
        pnlExtension.add(btnAsin);
        btnAsin.setBounds(90, 60, 70, 50);

        btnSin.setText("sin");
        btnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinActionPerformed(evt);
            }
        });
        pnlExtension.add(btnSin);
        btnSin.setBounds(10, 60, 70, 50);

        btnCos.setText("cos");
        btnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosActionPerformed(evt);
            }
        });
        pnlExtension.add(btnCos);
        btnCos.setBounds(10, 110, 70, 50);

        btnAcos.setText("acos");
        btnAcos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcosActionPerformed(evt);
            }
        });
        pnlExtension.add(btnAcos);
        btnAcos.setBounds(90, 110, 70, 50);

        btnAtan.setText("atan");
        btnAtan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtanActionPerformed(evt);
            }
        });
        pnlExtension.add(btnAtan);
        btnAtan.setBounds(90, 160, 70, 50);

        btnTan.setText("tan");
        btnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanActionPerformed(evt);
            }
        });
        pnlExtension.add(btnTan);
        btnTan.setBounds(10, 160, 70, 50);

        btnPI.setText("PI");
        btnPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPIActionPerformed(evt);
            }
        });
        pnlExtension.add(btnPI);
        btnPI.setBounds(10, 210, 70, 50);

        btnE.setText("E");
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });
        pnlExtension.add(btnE);
        btnE.setBounds(90, 210, 70, 50);

        getContentPane().add(pnlExtension);
        pnlExtension.setBounds(400, 0, 180, 340);

        pnlMain.setMinimumSize(new java.awt.Dimension(345, 380));
        pnlMain.setPreferredSize(new java.awt.Dimension(345, 380));
        pnlMain.setLayout(null);

        btnFactorial.setText("x!");
        btnFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactorialActionPerformed(evt);
            }
        });
        pnlMain.add(btnFactorial);
        btnFactorial.setBounds(330, 210, 70, 50);

        btnPositiveNegative.setText("+/-");
        btnPositiveNegative.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPositiveNegativeActionPerformed(evt);
            }
        });
        pnlMain.add(btnPositiveNegative);
        btnPositiveNegative.setBounds(330, 160, 70, 50);

        btnPowerOf.setText("x^n");
        btnPowerOf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPowerOfActionPerformed(evt);
            }
        });
        pnlMain.add(btnPowerOf);
        btnPowerOf.setBounds(330, 110, 70, 50);

        btn1DivideBy.setText("1/x");
        btn1DivideBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1DivideByActionPerformed(evt);
            }
        });
        pnlMain.add(btn1DivideBy);
        btn1DivideBy.setBounds(330, 60, 70, 50);

        btnEquals.setText("=");
        btnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualsActionPerformed(evt);
            }
        });
        pnlMain.add(btnEquals);
        btnEquals.setBounds(170, 210, 70, 50);

        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        pnlMain.add(btnAdd);
        btnAdd.setBounds(250, 160, 70, 50);

        btnDivide.setText("/");
        btnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivideActionPerformed(evt);
            }
        });
        pnlMain.add(btnDivide);
        btnDivide.setBounds(250, 110, 70, 50);

        btnMultiply.setText("*");
        btnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplyActionPerformed(evt);
            }
        });
        pnlMain.add(btnMultiply);
        btnMultiply.setBounds(250, 60, 70, 50);

        btnSubtract.setText("-");
        btnSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtractActionPerformed(evt);
            }
        });
        pnlMain.add(btnSubtract);
        btnSubtract.setBounds(250, 210, 70, 50);

        btnClearAll.setText("CA");
        btnClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAllActionPerformed(evt);
            }
        });
        pnlMain.add(btnClearAll);
        btnClearAll.setBounds(10, 270, 150, 50);

        btnClearEntry.setText("CE");
        btnClearEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearEntryActionPerformed(evt);
            }
        });
        pnlMain.add(btnClearEntry);
        btnClearEntry.setBounds(170, 270, 150, 50);

        btnDot.setText(".");
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotActionPerformed(evt);
            }
        });
        pnlMain.add(btnDot);
        btnDot.setBounds(90, 210, 70, 50);

        txtDisplay.setEditable(false);
        pnlMain.add(txtDisplay);
        txtDisplay.setBounds(10, 10, 390, 40);

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        pnlMain.add(btn1);
        btn1.setBounds(10, 60, 70, 50);

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        pnlMain.add(btn4);
        btn4.setBounds(10, 110, 70, 50);

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        pnlMain.add(btn7);
        btn7.setBounds(10, 160, 70, 50);

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        pnlMain.add(btn0);
        btn0.setBounds(10, 210, 70, 50);

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        pnlMain.add(btn8);
        btn8.setBounds(90, 160, 70, 50);

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        pnlMain.add(btn5);
        btn5.setBounds(90, 110, 70, 50);

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        pnlMain.add(btn2);
        btn2.setBounds(90, 60, 70, 50);

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        pnlMain.add(btn9);
        btn9.setBounds(170, 160, 70, 50);

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        pnlMain.add(btn6);
        btn6.setBounds(170, 110, 70, 50);

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        pnlMain.add(btn3);
        btn3.setBounds(170, 60, 70, 50);

        getContentPane().add(pnlMain);
        pnlMain.setBounds(0, 0, 430, 340);

        mnuView.setText("View");

        bgrDisplay.add(radBasicView);
        radBasicView.setSelected(true);
        radBasicView.setText("Basic");
        radBasicView.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radBasicViewItemStateChanged(evt);
            }
        });
        mnuView.add(radBasicView);

        bgrDisplay.add(radExtendedView);
        radExtendedView.setText("Extended");
        radExtendedView.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radExtendedViewItemStateChanged(evt);
            }
        });
        mnuView.add(radExtendedView);

        mnuMainMenu.add(mnuView);

        mnuFont.setText("Font");
        mnuFont.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mnuFontItemStateChanged(evt);
            }
        });
        mnuFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFontActionPerformed(evt);
            }
        });

        bgrFont.add(radPlain);
        radPlain.setSelected(true);
        radPlain.setText("Plain");
        radPlain.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radPlainItemStateChanged(evt);
            }
        });
        mnuFont.add(radPlain);

        bgrFont.add(radBold);
        radBold.setText("Bold");
        radBold.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radBoldItemStateChanged(evt);
            }
        });
        mnuFont.add(radBold);

        mnuMainMenu.add(mnuFont);

        mnuRound.setText("Round");

        bgrRound.add(rad0DCP);
        rad0DCP.setText("whole numbers");
        rad0DCP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rad0DCPItemStateChanged(evt);
            }
        });
        mnuRound.add(rad0DCP);

        bgrRound.add(rad1DCP);
        rad1DCP.setSelected(true);
        rad1DCP.setText("1 decimal place");
        rad1DCP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rad1DCPItemStateChanged(evt);
            }
        });
        mnuRound.add(rad1DCP);

        bgrRound.add(rad2DCP);
        rad2DCP.setText("2 decimal places");
        rad2DCP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rad2DCPItemStateChanged(evt);
            }
        });
        mnuRound.add(rad2DCP);

        bgrRound.add(rad3DCP);
        rad3DCP.setText("3 decimal places");
        rad3DCP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rad3DCPItemStateChanged(evt);
            }
        });
        mnuRound.add(rad3DCP);

        bgrRound.add(rad4DCP);
        rad4DCP.setText("4 decimal places");
        rad4DCP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rad4DCPItemStateChanged(evt);
            }
        });
        mnuRound.add(rad4DCP);

        bgrRound.add(rad5DCP);
        rad5DCP.setText("5 decimal places");
        rad5DCP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rad5DCPItemStateChanged(evt);
            }
        });
        mnuRound.add(rad5DCP);

        bgrRound.add(rad6DCP);
        rad6DCP.setText("6 decimal places");
        rad6DCP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rad6DCPItemStateChanged(evt);
            }
        });
        mnuRound.add(rad6DCP);

        bgrRound.add(rad7DCP);
        rad7DCP.setText("7 decimal places");
        rad7DCP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rad7DCPItemStateChanged(evt);
            }
        });
        mnuRound.add(rad7DCP);

        bgrRound.add(rad8DCP);
        rad8DCP.setText("8 decimal places");
        rad8DCP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rad8DCPItemStateChanged(evt);
            }
        });
        mnuRound.add(rad8DCP);

        bgrRound.add(rad9DCP);
        rad9DCP.setText("9 decimal places");
        rad9DCP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rad9DCPItemStateChanged(evt);
            }
        });
        mnuRound.add(rad9DCP);

        mnuMainMenu.add(mnuRound);

        mnuHelp.setText("Help");

        mnuAbout.setText("About");
        mnuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAboutActionPerformed(evt);
            }
        });
        mnuHelp.add(mnuAbout);

        mnuHotkeys.setText("Hotkeys");
        mnuHotkeys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHotkeysActionPerformed(evt);
            }
        });
        mnuHelp.add(mnuHotkeys);

        mnuMainMenu.add(mnuHelp);

        setJMenuBar(mnuMainMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radBasicViewItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radBasicViewItemStateChanged
        setView();
    }//GEN-LAST:event_radBasicViewItemStateChanged

    private void radExtendedViewItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radExtendedViewItemStateChanged
        setView();
    }//GEN-LAST:event_radExtendedViewItemStateChanged

    private void btnAsinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsinActionPerformed
       
        //first passes in the operator and calls set nums
         calc.setOperator('i');
     //calls sets numbers and calls calculate()
       calc.setNums();
     // then recieves the answer and sets it to display
    txtDisplay.setText(calc.ansToString());
    }//GEN-LAST:event_btnAsinActionPerformed

    private void btnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinActionPerformed
        //first passes in the operator and calls set nums
         calc.setOperator('s');
     //calls sets numbers and calls calculate()
       calc.setNums();
     // then recieves the answer and sets it to display
    txtDisplay.setText(calc.ansToString());
    }//GEN-LAST:event_btnSinActionPerformed

    private void btn1DivideByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1DivideByActionPerformed
   try{
    //first passes in the operator and calls set nums
    calc.setOperator('d');
     //calls sets numbers and calls calculate()
       calc.setNums();
     // then recieves the answer and sets it to display
    txtDisplay.setText(calc.ansToString());
   }
   catch(NumberFormatException nfe){
        exceptionHandling(nfe);
   }
    }//GEN-LAST:event_btn1DivideByActionPerformed

    private void btnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplyActionPerformed
       //first passes in the operator
       calc.setOperator('*');
       //calls sets numbers and calls calculate()
       calc.setNums();
    }//GEN-LAST:event_btnMultiplyActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
       txtDisplay.setText(calc.display("3"));
    }//GEN-LAST:event_btn3ActionPerformed

    private void radPlainItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radPlainItemStateChanged
        setFont();
    }//GEN-LAST:event_radPlainItemStateChanged

    private void radBoldItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radBoldItemStateChanged
        setFont();
    }//GEN-LAST:event_radBoldItemStateChanged

private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
txtDisplay.setText(calc.display("1"));
}//GEN-LAST:event_btn1ActionPerformed

private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
txtDisplay.setText(calc.display("2"));
}//GEN-LAST:event_btn2ActionPerformed

private void btnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDotActionPerformed
calc.setIsDecimal(true);
isDecimal = true; // remove when migrated to Calculator Model
}//GEN-LAST:event_btnDotActionPerformed

private void btnClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAllActionPerformed
calc.reset(true);
txtDisplay.setText(calc.getDisplay());

}//GEN-LAST:event_btnClearAllActionPerformed

private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
txtDisplay.setText(calc.display("4"));
}//GEN-LAST:event_btn4ActionPerformed

private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
txtDisplay.setText(calc.display("5"));
}//GEN-LAST:event_btn5ActionPerformed

private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
txtDisplay.setText(calc.display("6"));
}//GEN-LAST:event_btn6ActionPerformed

private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
txtDisplay.setText(calc.display("7"));
}//GEN-LAST:event_btn7ActionPerformed

private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
txtDisplay.setText(calc.display("8"));
}//GEN-LAST:event_btn8ActionPerformed

private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
txtDisplay.setText(calc.display("9"));
}//GEN-LAST:event_btn9ActionPerformed

private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
txtDisplay.setText(calc.display("0"));
}//GEN-LAST:event_btn0ActionPerformed

private void btnClearEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearEntryActionPerformed
calc.reset(false);
txtDisplay.setText(calc.getDisplay());
}//GEN-LAST:event_btnClearEntryActionPerformed

private void mnuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAboutActionPerformed
    helpMessage = "CpCalculator\n" +
            "Version 1.2.2_456\n" +
            "May 2013\n " +
            "\n" +
            "Created by Matthew Farley 90045985";
    
    msgMessage.showMessageDialog(this,helpMessage, "About", javax.swing.JOptionPane.INFORMATION_MESSAGE);
}//GEN-LAST:event_mnuAboutActionPerformed

private void mnuHotkeysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHotkeysActionPerformed
helpMessage = "+ - addition\n" +
        "- - subtraction\n"+
        "* - multiplication\n"
        + "\\ - division\n"
        + "\n"
        + "s - sin\n"
        + "S - arcsin\n"
        + "c - cos\n"
        + "C - arccos\n"
        + "t - tan\n"
        + "T - arctan\n"
        + "\n"
        + "i - inverse\n"
        + "m - +/-\n"
        + "^ - power\n"
        + "! - factorial\n"
        + "\n"
        + "d - clear all(CA)\n"
        + "D - clear entry(CE)\n"
        + "\n"
        + "Degits 0 - 9 can be entered from the\n"
        + "keypad or the keyboard's digit keys";
msgMessage.showMessageDialog(this,helpMessage, "Hotkeys", javax.swing.JOptionPane.INFORMATION_MESSAGE);
}//GEN-LAST:event_mnuHotkeysActionPerformed

private void mnuFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFontActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_mnuFontActionPerformed

private void mnuFontItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mnuFontItemStateChanged
setFont();
}//GEN-LAST:event_mnuFontItemStateChanged

private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
//first passes in the operator
    calc.setOperator('+');
    //calls sets numbers and calls calculate()
    calc.setNums();
   

}//GEN-LAST:event_btnAddActionPerformed

private void btnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualsActionPerformed
    try{
    calc.setOperator('='); //first passes in the operator
    // then recieves the answer and sets it to display
    txtDisplay.setText(calc.ansToString());
    }
    catch(NumberFormatException nfe){
        exceptionHandling(nfe);
    }
    
}//GEN-LAST:event_btnEqualsActionPerformed

private void btnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivideActionPerformed
  //first passes in the operator
       calc.setOperator('/');
       //calls sets numbers and calls calculate()
       calc.setNums();
}//GEN-LAST:event_btnDivideActionPerformed

private void btnSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtractActionPerformed
  //first passes in the operator
       calc.setOperator('-');
       //calls sets numbers and calls calculate()
       calc.setNums();
}//GEN-LAST:event_btnSubtractActionPerformed

private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
txtDisplay.setText(calc.display("E"));
}//GEN-LAST:event_btnEActionPerformed

private void btnPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPIActionPerformed
txtDisplay.setText(calc.display("P")); //P will be used as a character for PI
}//GEN-LAST:event_btnPIActionPerformed

private void btnPositiveNegativeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPositiveNegativeActionPerformed
txtDisplay.setText(calc.display("+/-"));
}//GEN-LAST:event_btnPositiveNegativeActionPerformed

private void btnPowerOfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPowerOfActionPerformed
//first passes in the operator
    calc.setOperator('^');
    //calls sets numbers and calls calculate()
    calc.setNums();
}//GEN-LAST:event_btnPowerOfActionPerformed

private void btnFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactorialActionPerformed
try{
    //first passes in the operator and calls set nums
    calc.setOperator('f');
     //calls sets numbers and calls calculate()
       calc.setNums();
     // then recieves the answer and sets it to display
    txtDisplay.setText(calc.ansToString());
}
catch(NumberFormatException nfe){
        exceptionHandling(nfe);
}
}//GEN-LAST:event_btnFactorialActionPerformed

private void radDegreesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radDegreesItemStateChanged
    calc.setIsRadians(false);
}//GEN-LAST:event_radDegreesItemStateChanged

private void radRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radRadActionPerformed
    calc.setIsRadians(true);
}//GEN-LAST:event_radRadActionPerformed

private void rad0DCPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rad0DCPItemStateChanged
calc.setDecimalPlaces(0);
}//GEN-LAST:event_rad0DCPItemStateChanged

private void rad1DCPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rad1DCPItemStateChanged
calc.setDecimalPlaces(1);
}//GEN-LAST:event_rad1DCPItemStateChanged

private void rad2DCPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rad2DCPItemStateChanged
calc.setDecimalPlaces(2);
}//GEN-LAST:event_rad2DCPItemStateChanged

private void rad3DCPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rad3DCPItemStateChanged
calc.setDecimalPlaces(3);
}//GEN-LAST:event_rad3DCPItemStateChanged

private void rad4DCPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rad4DCPItemStateChanged
calc.setDecimalPlaces(4);
}//GEN-LAST:event_rad4DCPItemStateChanged

private void rad5DCPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rad5DCPItemStateChanged
calc.setDecimalPlaces(5);
}//GEN-LAST:event_rad5DCPItemStateChanged

private void rad6DCPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rad6DCPItemStateChanged
calc.setDecimalPlaces(6);
}//GEN-LAST:event_rad6DCPItemStateChanged

private void rad7DCPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rad7DCPItemStateChanged
calc.setDecimalPlaces(7);
}//GEN-LAST:event_rad7DCPItemStateChanged

private void rad8DCPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rad8DCPItemStateChanged
calc.setDecimalPlaces(8);
}//GEN-LAST:event_rad8DCPItemStateChanged

private void rad9DCPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rad9DCPItemStateChanged
calc.setDecimalPlaces(9);
}//GEN-LAST:event_rad9DCPItemStateChanged

private void btnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCosActionPerformed
 //first passes in the operator and calls set nums
         calc.setOperator('c');
     //calls sets numbers and calls calculate()
       calc.setNums();
     // then recieves the answer and sets it to display
    txtDisplay.setText(calc.ansToString());
}//GEN-LAST:event_btnCosActionPerformed

private void btnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTanActionPerformed
 //first passes in the operator and calls set nums
         calc.setOperator('t');
     //calls sets numbers and calls calculate()
       calc.setNums();
     // then recieves the answer and sets it to display
    txtDisplay.setText(calc.ansToString());
}//GEN-LAST:event_btnTanActionPerformed

private void btnAcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcosActionPerformed
  //first passes in the operator and calls set nums
         calc.setOperator('o');
     //calls sets numbers and calls calculate()
       calc.setNums();
     // then recieves the answer and sets it to display
    txtDisplay.setText(calc.ansToString());
}//GEN-LAST:event_btnAcosActionPerformed

private void btnAtanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtanActionPerformed
  //first passes in the operator and calls set nums
         calc.setOperator('n');
     //calls sets numbers and calls calculate()
       calc.setNums();
     // then recieves the answer and sets it to display
    txtDisplay.setText(calc.ansToString());
}//GEN-LAST:event_btnAtanActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorViewControlFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgrDegRad;
    private javax.swing.ButtonGroup bgrDisplay;
    private javax.swing.ButtonGroup bgrFont;
    private javax.swing.ButtonGroup bgrRound;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn1DivideBy;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAcos;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAsin;
    private javax.swing.JButton btnAtan;
    private javax.swing.JButton btnClearAll;
    private javax.swing.JButton btnClearEntry;
    private javax.swing.JButton btnCos;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnEquals;
    private javax.swing.JButton btnFactorial;
    private javax.swing.JButton btnMultiply;
    private javax.swing.JButton btnPI;
    private javax.swing.JButton btnPositiveNegative;
    private javax.swing.JButton btnPowerOf;
    private javax.swing.JButton btnSin;
    private javax.swing.JButton btnSubtract;
    private javax.swing.JButton btnTan;
    private javax.swing.JMenuItem mnuAbout;
    private javax.swing.JMenu mnuFont;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenuItem mnuHotkeys;
    private javax.swing.JMenuBar mnuMainMenu;
    private javax.swing.JMenu mnuRound;
    private javax.swing.JMenu mnuView;
    private javax.swing.JOptionPane msgMessage;
    private javax.swing.JPanel pnlExtension;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JRadioButtonMenuItem rad0DCP;
    private javax.swing.JRadioButtonMenuItem rad1DCP;
    private javax.swing.JRadioButtonMenuItem rad2DCP;
    private javax.swing.JRadioButtonMenuItem rad3DCP;
    private javax.swing.JRadioButtonMenuItem rad4DCP;
    private javax.swing.JRadioButtonMenuItem rad5DCP;
    private javax.swing.JRadioButtonMenuItem rad6DCP;
    private javax.swing.JRadioButtonMenuItem rad7DCP;
    private javax.swing.JRadioButtonMenuItem rad8DCP;
    private javax.swing.JRadioButtonMenuItem rad9DCP;
    private javax.swing.JRadioButtonMenuItem radBasicView;
    private javax.swing.JRadioButtonMenuItem radBold;
    private javax.swing.JRadioButton radDegrees;
    private javax.swing.JRadioButtonMenuItem radExtendedView;
    private javax.swing.JRadioButtonMenuItem radPlain;
    private javax.swing.JRadioButton radRad;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration//GEN-END:variables

}
