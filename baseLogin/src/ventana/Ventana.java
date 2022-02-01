
package ventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Ventana extends JFrame implements ActionListener {
    
    
    private Fondo fondo;
    private JButton play;
    private JButton stop;
    private JLabel username;
    private JLabel password;
    private JTextField textUsername;
    private JPasswordField textPasword;
    
    public Ventana(){
        iniComponents();
        entorno();
        iniFont();
        ponerButton();
        ponerButtonStop();
        
        
        
    }
    
    private void iniComponents(){
        this.setSize(640,480);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setTitle("MYSIMCA");
       
    }
    
    private void iniFont(){
        fondo= new Fondo();
        this.fondo.setBounds(0,0,this.getWidth(),this.getHeight());
        this.add(fondo);
    }
    
    private void ponerButton(){
        this.play= new JButton("Play");
        this.play.setBounds(this.getWidth()-120,this.getHeight()-460,100,30);
        this.add(play);
        this.play.addActionListener(this);
        
    }
    private void ponerButtonStop(){
        this.stop= new JButton("stop");
        this.stop.setBounds(this.getWidth()-120,this.getHeight()-400,100,30);
        this.add(stop);
        this.stop.addActionListener(this);
        
    }
    
    private void entorno(){
        this.username=new JLabel("Username");
        this.username.setBounds(100,100,100,20);
        this.add(username);
        this.password=new JLabel("Password");
        this.password.setBounds(100,140,100,20);
        this.add(password);
        this.textUsername= new JTextField();
        this.textUsername.setBounds(170,100,100,20);
        this.add(textUsername);
        this.textPasword= new JPasswordField();
        this.textPasword.setBounds(170,140,100,20);
        this.add(textPasword);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==play){
            Eseltruenopay.song.play();
        }
        if(e.getSource()==stop){
            Eseltruenopay.song.stop();
        }
    }
}
