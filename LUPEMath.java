/******************************************************************************************************************
Author: @talesofcrypto
Date: 6/24/2018
Purpose: $LUPE frens use for math
*******************************************************************************************************************/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LUPEMath extends JFrame
{
   //instance variables
   private JLabel lbllupe, lblprice, lblcurrency, lblworth, lblcurrency2, lblimage;
   private JTextField txtlupe, txtprice, txtcurrency, txtworth, txtcurrency2;
   private JButton btnCalculate;
   private JPanel pnlTop, pnlBottom;
   private ImageIcon image;
   
   
   //constructor method(s)
   public LUPEMath()
   {
      setSize(325, 550); 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setTitle("$LUPE Math");
      setLocationRelativeTo(null);
      buildTopPanel();
      buildBottomPanel();
      setLayout(new GridLayout(2,1));
      add(pnlTop);
      add(pnlBottom);
      setVisible(true);
   }
   public void buildTopPanel()
   {
      pnlTop = new JPanel();
      lbllupe = new JLabel("How many $LUPE fren hodl?:");
      txtlupe = new JTextField(19);
      lblprice = new JLabel("How much 1 $LUPE?:");
      txtprice = new JTextField(19);
      lblcurrency = new JLabel("Currency(USD,BTC,ETH):");
      txtcurrency = new JTextField(19);
      btnCalculate = new JButton("Calculate");
      btnCalculate.addActionListener(new CalcButtonListener());
      lblworth = new JLabel("Frens $LUPE is worth muchos de dinero:");
      txtworth = new JTextField(19);
      lblcurrency2 = new JLabel("Valued in this Currency:");
      txtcurrency2 = new JTextField(5);
      
      pnlTop.add(lbllupe);
      pnlTop.add(txtlupe);
      pnlTop.add(lblprice);
      pnlTop.add(txtprice);
      pnlTop.add(lblcurrency);
      pnlTop.add(txtcurrency);
      pnlTop.add(btnCalculate);
      pnlTop.add(lblworth);
      pnlTop.add(txtworth);
      pnlTop.add(lblcurrency2);
      pnlTop.add(txtcurrency2);
   }
   
   public void buildBottomPanel()
   {
      pnlBottom = new JPanel();
      image = new ImageIcon(getClass().getResource("Lupe.jpg"));
      lblimage = new JLabel(image);
      
      pnlBottom.add(lblimage);
   }
   
       
   private class CalcButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         String temp = txtlupe.getText();
         double lupe = Double.parseDouble(temp);
         temp = txtprice.getText();
         double price = Double.parseDouble(temp);
         
         double finalworth = calculateLupe(lupe, price);
         String lastworth = ("$" + finalworth);
         txtworth.setText(lastworth);
         String lastcurrency = ("$" + txtcurrency);
         String getcurrency = txtcurrency.getText();
         txtcurrency2.setText(getcurrency);
      }
   }
   
   public double calculateLupe(double lupe, double price)
   {
      double lupemoney = lupe * price;
      return lupemoney;
   }

   
   public static void main(String[] args)
   {
      new LUPEMath();
   }
}




   
   
   
   
   
   
   
