/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculator.pkg2.pkg0;

import java.awt.event.KeyEvent;
import java.text.DecimalFormat;


public class CalculatorGui extends javax.swing.JFrame {
    //variables declarations
String operand1 = "";
String operand2 = "";
double results;
String operation;
boolean clearScreen;
String currentScreen;
double num1;
double num2;
    public CalculatorGui() {
        initComponents();
        }
       
    
    



    

    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calculatorScreen = new javax.swing.JTextField();
        number1 = new javax.swing.JButton();
        number2 = new javax.swing.JButton();
        number3 = new javax.swing.JButton();
        number4 = new javax.swing.JButton();
        number5 = new javax.swing.JButton();
        number6 = new javax.swing.JButton();
        number7 = new javax.swing.JButton();
        number8 = new javax.swing.JButton();
        number9 = new javax.swing.JButton();
        sumSymbol = new javax.swing.JButton();
        sustSymbol = new javax.swing.JButton();
        divSymbol = new javax.swing.JButton();
        multSymbol = new javax.swing.JButton();
        equalSymbol = new javax.swing.JButton();
        number0 = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        posToNeg = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        backStep = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        calculatorScreen.setEditable(false);
        calculatorScreen.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        calculatorScreen.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        calculatorScreen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        calculatorScreen.setFocusable(false);
        calculatorScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorScreenActionPerformed(evt);
            }
        });

        number1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        number1.setText("1");
        number1.setPreferredSize(new java.awt.Dimension(50, 50));
        number1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                number1MouseClicked(evt);
            }
        });

        number2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        number2.setText("2");
        number2.setPreferredSize(new java.awt.Dimension(50, 50));
        number2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                number2MouseClicked(evt);
            }
        });

        number3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        number3.setText("3");
        number3.setPreferredSize(new java.awt.Dimension(50, 50));
        number3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                number3MouseClicked(evt);
            }
        });

        number4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        number4.setText("4");
        number4.setPreferredSize(new java.awt.Dimension(50, 50));
        number4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                number4MouseClicked(evt);
            }
        });

        number5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        number5.setText("5");
        number5.setPreferredSize(new java.awt.Dimension(50, 50));
        number5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                number5MouseClicked(evt);
            }
        });

        number6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        number6.setText("6");
        number6.setPreferredSize(new java.awt.Dimension(50, 50));
        number6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                number6MouseClicked(evt);
            }
        });

        number7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        number7.setText("7");
        number7.setPreferredSize(new java.awt.Dimension(50, 50));
        number7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                number7MouseClicked(evt);
            }
        });

        number8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        number8.setText("8");
        number8.setPreferredSize(new java.awt.Dimension(50, 50));
        number8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                number8MouseClicked(evt);
            }
        });

        number9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        number9.setText("9");
        number9.setPreferredSize(new java.awt.Dimension(50, 50));
        number9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                number9MouseClicked(evt);
            }
        });

        sumSymbol.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        sumSymbol.setText("+");
        sumSymbol.setPreferredSize(new java.awt.Dimension(50, 50));
        sumSymbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sumSymbolMouseClicked(evt);
            }
        });

        sustSymbol.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        sustSymbol.setText("-");
        sustSymbol.setPreferredSize(new java.awt.Dimension(50, 50));
        sustSymbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sustSymbolMouseClicked(evt);
            }
        });

        divSymbol.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        divSymbol.setText("÷");
        divSymbol.setPreferredSize(new java.awt.Dimension(50, 50));
        divSymbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                divSymbolMouseClicked(evt);
            }
        });

        multSymbol.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        multSymbol.setText("x");
        multSymbol.setPreferredSize(new java.awt.Dimension(50, 50));
        multSymbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                multSymbolMouseClicked(evt);
            }
        });
        multSymbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multSymbolActionPerformed(evt);
            }
        });

        equalSymbol.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        equalSymbol.setText("=");
        equalSymbol.setPreferredSize(new java.awt.Dimension(50, 50));
        equalSymbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                equalSymbolMouseClicked(evt);
            }
        });

        number0.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        number0.setText("0");
        number0.setPreferredSize(new java.awt.Dimension(50, 50));
        number0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                number0MouseClicked1(evt);
            }
        });

        dot.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        dot.setText(".");
        dot.setPreferredSize(new java.awt.Dimension(50, 50));
        dot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dotMouseClicked(evt);
            }
        });

        posToNeg.setText("+/-");
        posToNeg.setPreferredSize(new java.awt.Dimension(50, 50));
        posToNeg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                posToNegMouseClicked(evt);
            }
        });

        clear.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        clear.setText("C");
        clear.setPreferredSize(new java.awt.Dimension(50, 50));
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });

        backStep.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        backStep.setText("←");
        backStep.setPreferredSize(new java.awt.Dimension(50, 50));
        backStep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backStepMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calculator Master 2.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(number7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(number8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(number9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backStep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(calculatorScreen)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(number1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(number2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(number3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(number4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(number5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(number6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(number0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(posToNeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sumSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sustSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(divSymbol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(multSymbol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(equalSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(calculatorScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backStep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(number4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(number5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(number6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(number1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(number2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(number3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(number0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sustSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(divSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(multSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(equalSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(posToNeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sumSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculatorScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatorScreenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calculatorScreenActionPerformed

    private void multSymbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multSymbolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_multSymbolActionPerformed

    private void number0MouseClicked1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number0MouseClicked1
     String currentScreen = calculatorScreen.getText();
     calculatorScreen.setText(currentScreen + "0");
     
     if(clearScreen){
           calculatorScreen.setText("");
           calculatorScreen.setText("0");
           clearScreen = false;
     } 
    }//GEN-LAST:event_number0MouseClicked1

    private void number1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number1MouseClicked
     String currentScreen = calculatorScreen.getText();
     calculatorScreen.setText(currentScreen + "1");
     
     if(clearScreen){
           calculatorScreen.setText("");
           calculatorScreen.setText("1");
           clearScreen = false;
     }
    }//GEN-LAST:event_number1MouseClicked

    private void number2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number2MouseClicked
     String currentScreen = calculatorScreen.getText();
     calculatorScreen.setText(currentScreen + "2");
     
     if(clearScreen){
           calculatorScreen.setText("");
           calculatorScreen.setText("2");
           clearScreen = false;
     } 
    }//GEN-LAST:event_number2MouseClicked

    private void number3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number3MouseClicked
     String currentScreen = calculatorScreen.getText();
     calculatorScreen.setText(currentScreen + "3");
     
     if(clearScreen){
           calculatorScreen.setText("");
           calculatorScreen.setText("3");
           clearScreen = false;
     }             
    }//GEN-LAST:event_number3MouseClicked

    private void number4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number4MouseClicked
     String currentScreen = calculatorScreen.getText();
     calculatorScreen.setText(currentScreen + "4");
     
     if(clearScreen){
           calculatorScreen.setText("");
           calculatorScreen.setText("4");
           clearScreen = false;
     } 
    }//GEN-LAST:event_number4MouseClicked

    private void number5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number5MouseClicked
     String currentScreen = calculatorScreen.getText();
     calculatorScreen.setText(currentScreen + "5");
     
     if(clearScreen){
           calculatorScreen.setText("");
           calculatorScreen.setText("5");
           clearScreen = false;
     } 
    }//GEN-LAST:event_number5MouseClicked

    private void number6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number6MouseClicked
     String currentScreen = calculatorScreen.getText();
     calculatorScreen.setText(currentScreen + "6");
     
     if(clearScreen){
           calculatorScreen.setText("");
           calculatorScreen.setText("6");
           clearScreen = false;
     } 
    }//GEN-LAST:event_number6MouseClicked

    private void number7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number7MouseClicked
     String currentScreen = calculatorScreen.getText();
     calculatorScreen.setText(currentScreen + "7");
     
     if(clearScreen){
           calculatorScreen.setText("");
           calculatorScreen.setText("7");
           clearScreen = false;
     } 
    }//GEN-LAST:event_number7MouseClicked

    private void number8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number8MouseClicked
     String currentScreen = calculatorScreen.getText();
     calculatorScreen.setText(currentScreen + "8");
     
     if(clearScreen){
           calculatorScreen.setText("");
           calculatorScreen.setText("8");
           clearScreen = false;
     } 
    }//GEN-LAST:event_number8MouseClicked

    private void number9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number9MouseClicked
     String currentScreen = calculatorScreen.getText();
     calculatorScreen.setText(currentScreen + "9");
     
     if(clearScreen){
           calculatorScreen.setText("");
           calculatorScreen.setText("9");
           clearScreen = false;
     } 
    }//GEN-LAST:event_number9MouseClicked

    private void dotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dotMouseClicked
     String currentScreen = calculatorScreen.getText();
     calculatorScreen.setText(currentScreen + ".");
     
     if(clearScreen){
           calculatorScreen.setText("");
           calculatorScreen.setText(".");
           clearScreen = false;
     } 
    }//GEN-LAST:event_dotMouseClicked

    private void sumSymbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sumSymbolMouseClicked
           operation = "+";
                   if(operand1.isEmpty()){
                   operand1 = calculatorScreen.getText();
                   calculatorScreen.setText("");
                   } else if (clearScreen) {
                   calculatorScreen.setText("");
                   } else {
                       equalSymbolMouseClicked(evt);
                   }
                   
            
    }//GEN-LAST:event_sumSymbolMouseClicked

    private void sustSymbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sustSymbolMouseClicked
    operation = "-";
                   if(operand1.isEmpty()){
                   operand1 = calculatorScreen.getText();
                   calculatorScreen.setText("");
                   } else if (clearScreen) {
                   calculatorScreen.setText("");
                   } else {
                       equalSymbolMouseClicked(evt);
                   }
    }//GEN-LAST:event_sustSymbolMouseClicked

    private void divSymbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divSymbolMouseClicked
    operation = "/";
                   if(operand1.isEmpty()){
                   operand1 = calculatorScreen.getText();
                   calculatorScreen.setText("");
                   } else if (clearScreen) {
                   calculatorScreen.setText("");
                   } else {
                       equalSymbolMouseClicked(evt);
                   }
    }//GEN-LAST:event_divSymbolMouseClicked

    private void multSymbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multSymbolMouseClicked
    operation = "*";
                   if(operand1.isEmpty()){
                   operand1 = calculatorScreen.getText();
                   calculatorScreen.setText("");
                   } else if (clearScreen) {
                   calculatorScreen.setText("");
                   } else {
                       equalSymbolMouseClicked(evt);
                   }
    }//GEN-LAST:event_multSymbolMouseClicked

    private void equalSymbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalSymbolMouseClicked
        // TODO add your handling code here:
        if(operand2.isEmpty()){
        operand2 = calculatorScreen.getText();
        }
        num1 = Double.parseDouble(operand1);
        num2 = Double.parseDouble(operand2);
        
        switch(operation){
            case "+":
                results = num1 + num2;
                break;
            case "-":
                results = num1 - num2;
                break;
            case "*":
                results = num1 * num2;
                break;
            case "/":
                results = num1 / num2;
                break;
        }
        
         
        // Format the result to show only two decimal places
    DecimalFormat format = new DecimalFormat("#.####");
    String formattedResult = format.format(results);

    calculatorScreen.setText(formattedResult);
    operand1 = formattedResult; // update operand1 with the result
    clearScreen = true;
    }//GEN-LAST:event_equalSymbolMouseClicked

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
    calculatorScreen.setText("");
    operand1 = "";
    operand2 = "";
    }//GEN-LAST:event_clearMouseClicked

    private void backStepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backStepMouseClicked
     String currentScreen = calculatorScreen.getText();
     if (currentScreen.length() > 0) {
        currentScreen = currentScreen.substring(0, currentScreen.length() - 1);
        calculatorScreen.setText(currentScreen);
    }        // TODO add your handling code here:
    }//GEN-LAST:event_backStepMouseClicked

    private void posToNegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posToNegMouseClicked
        String currentScreen = calculatorScreen.getText();
        
       if(currentScreen.startsWith("-")){
        currentScreen = currentScreen.substring(1);
        calculatorScreen.setText(currentScreen);
       
         } else {
            
        calculatorScreen.setText("-" + currentScreen);
        }
    }//GEN-LAST:event_posToNegMouseClicked

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculatorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backStep;
    private javax.swing.JTextField calculatorScreen;
    private javax.swing.JButton clear;
    private javax.swing.JButton divSymbol;
    private javax.swing.JButton dot;
    private javax.swing.JButton equalSymbol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton multSymbol;
    private javax.swing.JButton number0;
    private javax.swing.JButton number1;
    private javax.swing.JButton number2;
    private javax.swing.JButton number3;
    private javax.swing.JButton number4;
    private javax.swing.JButton number5;
    private javax.swing.JButton number6;
    private javax.swing.JButton number7;
    private javax.swing.JButton number8;
    private javax.swing.JButton number9;
    private javax.swing.JButton posToNeg;
    private javax.swing.JButton sumSymbol;
    private javax.swing.JButton sustSymbol;
    // End of variables declaration//GEN-END:variables
}
