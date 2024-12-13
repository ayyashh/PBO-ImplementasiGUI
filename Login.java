import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  

public class Login{  
   String username = "risyad";  
   String password = "123";  
   String msg = " ";  

   // Declare the text fields as class variables
   JTextField txtUsername;
   JTextField txtPassword;

   public static void main(String[] args){  
     Login gui = new Login();  
     gui.go();  
   }  

   public void go(){  
     JFrame frame = new JFrame();  
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

     // Use GridLayout to properly align components
     JPanel panel = new JPanel();
     panel.setLayout(new GridLayout(3, 2, 10, 10)); // 3 rows, 2 columns

     JLabel lblUsername = new JLabel("Username:");    
     JLabel lblPassword = new JLabel("Password:");  

     // Initialize the text fields
     txtUsername = new JTextField(20);  
     txtPassword = new JTextField(20);  

     JButton btnLogin = new JButton("Login");  
     btnLogin.addActionListener(new LoginListener());  

     JButton btnCancel = new JButton("Cancel");  
     btnCancel.addActionListener(new CancelListener());  

     // Add components to the panel
     panel.add(lblUsername);  
     panel.add(txtUsername);  
     panel.add(lblPassword);  
     panel.add(txtPassword);  
     panel.add(btnLogin);  
     panel.add(btnCancel);  

     frame.getContentPane().add(BorderLayout.CENTER, panel);  
     frame.setSize(300, 300);  
     frame.setVisible(true);  
   }  

   public class LoginListener implements ActionListener{  
     public void actionPerformed(ActionEvent event){  
       // Use the correct variables for username and password check
       if(username.equals(txtUsername.getText())){  
         if(password.equals(txtPassword.getText())){  
           msg = "Login Granted!";  
         }else{  
           msg = "Login Denied";  
         }  
       }else{  
         msg = "Login Denied";  
       }    
       JOptionPane.showMessageDialog(null, msg);            
     }  
   }  

   public class CancelListener implements ActionListener{  
     public void actionPerformed(ActionEvent event){  
       // Correct the text clearing for both fields
       txtUsername.setText("");  
       txtPassword.setText("");  
       txtUsername.requestFocus();  
     }  
   }  
}