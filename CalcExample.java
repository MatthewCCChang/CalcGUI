import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Write a description of class CalcExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalcExample implements ActionListener
{
    private JFrame frame;
    private JButton num;
    private JButton add,minus,mul,div,equ;
    private JLabel display;
    private int index;
    private int number;
    private String s1,s2,s3;
    public CalcExample(){
        frame= new JFrame("Calculator GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(200,200);
        frame.getContentPane().setBackground(Color.cyan);
        frame.getContentPane().setLayout(new GridBagLayout());
        
        GridBagConstraints panel= new GridBagConstraints();
        //panel.fill = GridBagConstraints.HORIZONTAL;
        //panel.weightx=0.5;
        //panel.gridwidth=1;
        panel.gridx=0;
        panel.gridy=1;
        panel.fill=GridBagConstraints.BOTH;
        panel.weightx=1;
        panel.weighty=1;
        num= new JButton("1");
        num.setActionCommand("1");
        num.addActionListener(this);
        frame.getContentPane().add(num,panel);
        
        //panel.fill = GridBagConstraints.HORIZONTAL;
        //panel.weightx=0.5;
        //panel.gridwidth=1;
        panel.gridx=1;
        panel.gridy=1;
        panel.fill=GridBagConstraints.BOTH;
        panel.weightx=1;
        panel.weighty=1;
        num= new JButton("2");
        num.setActionCommand("2");
        num.addActionListener(this);
        frame.getContentPane().add(num,panel);
        
        //panel.weightx=0.1;
        //panel.gridwidth=1;
        panel.gridx=2;
        panel.gridy=1;
        panel.fill=GridBagConstraints.BOTH;
        panel.weightx=1;
        panel.weighty=1;
        num= new JButton("3");
        num.setActionCommand("3");
        num.addActionListener(this);
        frame.getContentPane().add(num,panel);
        
        //panel.weightx=0.5;
        //panel.gridwidth=1;
        panel.gridx=0;
        panel.gridy=2;
        panel.fill=GridBagConstraints.BOTH;
        panel.weightx=1;
        panel.weighty=1;
        num= new JButton("4");
        num.setActionCommand("4");
        num.addActionListener(this);
        frame.getContentPane().add(num,panel);
        
        panel.gridx=1;
        panel.gridy=2;
        panel.fill=GridBagConstraints.BOTH;
        panel.weightx=1;
        panel.weighty=1;
        num= new JButton("5");
        num.setActionCommand("5");
        num.addActionListener(this);
        frame.getContentPane().add(num,panel);
        
        panel.gridx=2;
        panel.gridy=2;
        panel.fill=GridBagConstraints.BOTH;
        panel.weightx=1;
        panel.weighty=1;
        num= new JButton("6");
        num.setActionCommand("6");
        num.addActionListener(this);
        frame.getContentPane().add(num,panel);
        
        panel.gridx=0;
        panel.gridy=3;
        panel.fill=GridBagConstraints.BOTH;
        panel.weightx=1;
        panel.weighty=1;
        num= new JButton("7");
        num.setActionCommand("7");
        num.addActionListener(this);
        frame.getContentPane().add(num,panel);
        
        panel.gridx=1;
        panel.gridy=3;
        panel.fill=GridBagConstraints.BOTH;
        panel.weightx=1;
        panel.weighty=1;
        num= new JButton("8");
        num.setActionCommand("8");
        num.addActionListener(this);
        frame.getContentPane().add(num,panel);
        
        panel.gridx=2;
        panel.gridy=3;
        panel.fill=GridBagConstraints.BOTH;
        panel.weightx=1;
        panel.weighty=1;
        num= new JButton("9");
        num.setActionCommand("9");
        num.addActionListener(this);
        frame.getContentPane().add(num,panel);
        
        panel.gridx=1;
        panel.gridy=4;
        panel.fill=GridBagConstraints.BOTH;
        panel.weightx=1;
        panel.weighty=1;
        num= new JButton("0");
        num.setActionCommand("0");
        num.addActionListener(this);
        frame.getContentPane().add(num,panel);
        
        panel.gridx=0;
        panel.gridy=4;
        panel.fill=GridBagConstraints.BOTH;
        panel.weightx=1;
        panel.weighty=1;
        num= new JButton("C");
        num.setActionCommand("C");
        num.addActionListener(this);
        frame.getContentPane().add(num,panel);
        
        panel.gridx=3;
        panel.gridy=1;
        num= new JButton("+");
        num.setActionCommand("+");
        num.addActionListener(this);
        panel.fill=GridBagConstraints.BOTH;
        panel.weightx=1;
        panel.weighty=1;
        frame.getContentPane().add(num,panel);
        
        panel.gridx=3;
        panel.gridy=2;
        num= new JButton("-");
        num.setActionCommand("-");
        num.addActionListener(this);
        panel.fill=GridBagConstraints.BOTH;
        panel.weightx=1;
        panel.weighty=1;
        frame.getContentPane().add(num,panel);
        
        panel.gridx=3;
        panel.gridy=3;
        num= new JButton("*");
        num.setActionCommand("*");
        num.addActionListener(this);
        panel.fill=GridBagConstraints.BOTH;
        panel.weightx=1;
        panel.weighty=1;
        frame.getContentPane().add(num,panel);
        
        panel.gridx=3;
        panel.gridy=4;
        num= new JButton("/");
        num.setActionCommand("/");
        num.addActionListener(this);
        panel.fill=GridBagConstraints.BOTH;
        panel.weightx=1;
        panel.weighty=1;
        frame.getContentPane().add(num,panel);
        
        panel.gridx=2;
        panel.gridy=4;
        num= new JButton("=");
        num.setActionCommand("=");
        num.addActionListener(this);
        panel.fill=GridBagConstraints.BOTH;
        panel.weightx=1;
        panel.weighty=1;
        frame.getContentPane().add(num,panel);
        
        display= new JLabel();
        display.setBackground(Color.red);
        display.setOpaque(true);
        panel.gridx=0;
        panel.gridy=0;
        panel.fill=GridBagConstraints.BOTH;
        panel.gridwidth=4;
        display.setText(" ");
        frame.getContentPane().add(display,panel);
        
        frame.pack();
        frame.setVisible(true);
     }
    
    public boolean hasOp(){
        if((display.getText().indexOf("+")>=0) || (display.getText().indexOf("-")>=0)){
            return true;
        }
        if((display.getText().indexOf("*")>=0) || (display.getText().indexOf("/")>=0)){
            return true;
        }
        return false;
    }
     
    public boolean checkAdd(){
        if(display.getText().indexOf("+")>-1){
            return true;
        }
        return false;
    }
    
    public boolean checkSub(){
        if(display.getText().indexOf("-")>-1){
            return true;
        }
        return false;
    }
    
    public boolean checkMult(){
        if(display.getText().indexOf("*")>-1){
            return true;
        }
        return false;
    }
    
    public boolean checkDiv(){
        if(display.getText().indexOf("/")>-1){
            return true;
        }
        return false;
    }
    
    public void add(){
        index= display.getText().indexOf("+"); 
        s1=display.getText().substring(0,index);
        s2=display.getText().substring(index+1);
        number= (Integer.parseInt(s1)+Integer.parseInt(s2));
        s3=Integer.toString(number);
        display.setText(s3);
    }
    
    public void sub(){
       index= display.getText().indexOf("-"); 
       s1=display.getText().substring(0,index);
       s2=display.getText().substring(index+1);
       number= (Integer.parseInt(s1)+Integer.parseInt(s2));
        s3=Integer.toString(number);
       display.setText(s3); 
    }
    
    public void mult(){
       index= display.getText().indexOf("*"); 
       s1=display.getText().substring(0,index);
       s2=display.getText().substring(index+1);
       number= (Integer.parseInt(s1)+Integer.parseInt(s2));
        s3=Integer.toString(number);
       display.setText(s3); 
    }
    
    public void div(){
       index= display.getText().indexOf("/"); 
       s1=display.getText().substring(0,index);
       s2=display.getText().substring(index+1);
       number= (Integer.parseInt(s1)+Integer.parseInt(s2));
        s3=Integer.toString(number);
       display.setText(s3); 
    }
    
    public void actionPerformed(ActionEvent myEvent){
        
        if(myEvent.getActionCommand().equals("1")){
            display.setText(display.getText()+"1");
        }
        if(myEvent.getActionCommand().equals("2")){
            display.setText(display.getText()+"2");
        }
        if(myEvent.getActionCommand().equals("3")){
            display.setText(display.getText()+"3");
        }
        if(myEvent.getActionCommand().equals("4")){
            display.setText(display.getText()+"4");
        }
        if(myEvent.getActionCommand().equals("5")){
            display.setText(display.getText()+"5");
        }
        if(myEvent.getActionCommand().equals("6")){
            display.setText(display.getText()+"6");
        }
        if(myEvent.getActionCommand().equals("7")){
            display.setText(display.getText()+"7");
        }
        if(myEvent.getActionCommand().equals("8")){
            display.setText(display.getText()+"8");
        }
        if(myEvent.getActionCommand().equals("9")){
            display.setText(display.getText()+"9");
        }
        if(myEvent.getActionCommand().equals("0")){
            display.setText(display.getText()+"0");
        }
        if(myEvent.getActionCommand().equals("C")){
            display.setText(" ");
        }
        if(myEvent.getActionCommand().equals("+")){
           if(hasOp()){
             if(checkAdd()){
               add();  
             }
             if(checkSub()){
               sub();  
             } 
             if(checkMult()){
               mult();  
             }
             if(checkDiv()){
               div();  
             }
           }
           display.setText(display.getText()+"+");
        }
        if(myEvent.getActionCommand().equals("-")){
           if(hasOp()){
             if(checkAdd()){
               add();  
             }
             if(checkSub()){
               sub();  
             } 
             if(checkMult()){
               mult();  
             }
             if(checkDiv()){
               div();  
             }
           }
           display.setText(display.getText()+"-"); 
        }
        if(myEvent.getActionCommand().equals("*")){
           if(hasOp()){
             if(checkAdd()){
               add();  
             }
             if(checkSub()){
               sub();  
             } 
             if(checkMult()){
               mult();  
             }
             if(checkDiv()){
               div();  
             }
           }
           display.setText(display.getText()+"*"); 
        }
        if(myEvent.getActionCommand().equals("/")){
           if(hasOp()){
             if(checkAdd()){
               add();  
             }
             if(checkSub()){
               sub();  
             } 
             if(checkMult()){
               mult();  
             }
             if(checkDiv()){
               div();  
             }
           }
           display.setText(display.getText()+"/"); 
        }
        if(myEvent.getActionCommand().equals("=")){
            
            if(hasOp()){
               if(checkAdd()){
               add();  
             }
             if(checkSub()){
               sub();  
             } 
             if(checkMult()){
               mult();  
             }
             if(checkDiv()){
               div();  
             }
            }
        }
    }
}
