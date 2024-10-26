package mainstuf;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class xando extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    JButton buttons(String name){
        JButton button = new JButton(name);
        button.setFocusable(false);
        button.setFont(new Font("Calibri", 1, 50));
        button.addActionListener(this);

        return button;
    }
    xando(){
        JPanel panel1 = new JPanel();
        GridLayout grid = new GridLayout(3,3);
        panel1.setLayout(grid);


        b1 = buttons("");
        panel1.add(b1);
        b2 = buttons("");
        panel1.add(b2);
        b3 = buttons("");
        panel1.add(b3);
        b4 = buttons("");
        panel1.add(b4);
        b5 = buttons("");
        panel1.add(b5);
        b6 = buttons("");
        panel1.add(b6);
        b7 = buttons("");
        panel1.add(b7);
        b8 = buttons("");
        panel1.add(b8);
        b9 = buttons("");
        panel1.add(b9);


        add(panel1);


        setTitle("X & O");
        setSize(600,600);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);



    }
    int p = 0;
    String choice = "";
    public void actionPerformed(ActionEvent e){

        
        
       if (e.getActionCommand() == ""){
        p += 1;
        while(p < 10){
            if (p % 2 == 0){
                choice = "O";
                break;
            }
            else{
                choice = "X";
                break;
            }
        }
            if(e.getSource() == b1){
                b1.setText(choice);
            }
            else if(e.getSource() == b2){
                b2.setText(choice);
            }
            else if(e.getSource() == b3){
                b3.setText(choice);
            }
            else if(e.getSource() == b4){
                b4.setText(choice);
            }
            else if(e.getSource() == b5){
                b5.setText(choice);
            }
            else if(e.getSource() == b6){
                b6.setText(choice);
            }
            else if(e.getSource() == b7){
                b7.setText(choice);
            }
            else if(e.getSource() == b8){
                b8.setText(choice);
            }
            else if(e.getSource() == b9){
                b9.setText(choice);
            }
        }
       
        if((b1.getText() == "X" &  b2.getText() == "X"  & b3.getText() == "X" ) | (b1.getText() == "O" &  b2.getText() == "O" & b3.getText() == "O" )) {
            JOptionPane.showMessageDialog(null, b1.getText() + " WINS!!", "WINNER", 1);
            dispose();
            // top line "1, 2, 3"
        }else if ((b1.getText() == "X" &  b4.getText() == "X" & b7.getText() == "X" ) | (b1.getText() == "O" &  b4.getText() == "O" & b7.getText() == "O" )){
            JOptionPane.showMessageDialog(null, b1.getText() + " WINS!!", "WINNER", 1);
            dispose();
            // left line "1, 4, 7"
        }else if ((b3.getText() == "X" &  b6.getText() == "X" & b9.getText() == "X" ) | (b3.getText() == "O" &  b6.getText() == "O" & b9.getText() == "O" )){
            JOptionPane.showMessageDialog(null, b3.getText() + " WINS!!", "WINNER", 1);
            dispose();
            // right line "3, 6, 9"
        }else if ((b7.getText() == "X" &  b8.getText() == "X" & b9.getText() == "X" ) | (b7.getText() == "O" &  b8.getText() == "O" & b9.getText() == "O" )){
            JOptionPane.showMessageDialog(null, b7.getText() + " WINS!!", "WINNER", 1);
            dispose();
            // bottom line "7, 8, 9"
        }else if ((b1.getText() == "X" &  b5.getText() == "X" & b9.getText() == "X" ) | (b1.getText() == "O" &  b5.getText() == "O" & b9.getText() == "O" )){
            JOptionPane.showMessageDialog(null, b1.getText() + " WINS!!", "WINNER", 1);
            dispose();
            // left to right slant "1, 5, 9"
        }else if ((b3.getText() == "X" &  b5.getText() == "X" & b7.getText() == "X" ) | (b3.getText() == "O" &  b5.getText() == "O" & b7.getText() == "O" )){
            JOptionPane.showMessageDialog(null, b3.getText() + " WINS!!", "WINNER", 1);
            dispose();
            // right to left slant "3, 5, 7"
        }else if ((b2.getText() == "X" &  b5.getText() == "X" & b8.getText() == "X" ) | (b2.getText() == "O" &  b5.getText() == "O" & b8.getText() == "O" )){
            JOptionPane.showMessageDialog(null, b2.getText() + " WINS!!", "WINNER", 1);
            dispose();
            // top to bottom middle "2, 5, 8"
        }else if ((b4.getText() == "X" &  b5.getText() == "X" & b6.getText() == "X" ) | (b4.getText() == "O" &  b5.getText() == "O" & b6.getText() == "O" )){
            JOptionPane.showMessageDialog(null, b4.getText() + " WINS!!", "WINNER", 1);
            dispose();
            // left to right middle "4, 5, 6"
        }else if(p == 9){
            JOptionPane.showMessageDialog(null, "TIE!", "", 1);
            dispose();
            new xando();
        }
    }

    public static void main(String[] args) {
        new xando();
    }
}
