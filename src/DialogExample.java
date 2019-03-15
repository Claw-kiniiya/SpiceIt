/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.lwuit.*;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.events.ActionListener;
import com.sun.lwuit.layouts.BorderLayout;
import com.sun.lwuit.layouts.BoxLayout;
import com.sun.lwuit.plaf.UIManager;
import com.sun.lwuit.util.Resources;
import java.io.IOException;
import javax.microedition.midlet.MIDlet;

/**
 * @author Njeru
 */
public class DialogExample extends MIDlet {
    Form frmCal;
    Container ctnCal;
    
    //String With Details
    String name = "Navigation";
    Dialog exitNew;
    TextArea txtexit;
    Button Yes;
    Button No;

    public void startApp() {
        
        Display.init(this);        
        try {
            Resources res = Resources.open("/TimelineTheme.res");
            UIManager.getInstance().setThemeProps(res.getTheme("Theme 1"));
         } catch(IOException ex) {
            //Insert Error Dialog
         }
        
        ShowDialog();
    }
    
    public void ShowDialog(){
        frmCal = new Form("Show String");
        frmCal.setLayout(new BorderLayout());
        ctnCal = new Container(new BoxLayout(BoxLayout.Y_AXIS)); 
        Button button = new Button("Click to View Dialog 1");
        Button button1= new Button("Click to View Dialog 2");
        ctnCal.addComponent(button);
        ctnCal.addComponent(button1);
            
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                exit();
            }
        }); 
        
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                exitForm();
            }
        });
        
        frmCal.addComponent(BorderLayout.CENTER,ctnCal);
        frmCal.show();
    }
    
    public void exit() {
        final Dialog exit = new Dialog("EXIT");
            TextArea txtexit = new TextArea("Are you sure you want to exit?");
            txtexit.setEditable(false);
            txtexit.getStyle().setBorder(null);
            exit.addComponent(txtexit);
            txtexit.getStyle().setFgColor(000000);
            
            
            exit.addCommand(new Command("Yes"){
              
                public void actionPerformed(ActionEvent ev) {
                destroyApp(true);
                notifyDestroyed();
                }});
                
            exit.addCommand(new Command("No"){
              public void actionPerformed(ActionEvent ev) {
                exit.dispose();//dialog removal from the screen
                }
            });
            exit.show();
    }
    
    public void exitForm(){
            exitNew = new Dialog("");
            exitNew.setLayout(new BorderLayout());
            Container ctnExit = new Container(new BoxLayout(BoxLayout.Y_AXIS)); 
            Dialog.setAutoAdjustDialogSize(false);
        
            txtexit = new TextArea("Want to exit?");
            txtexit.setEditable(false);
            txtexit.getStyle().setBorder(null);
            
            Yes = new Button("Yes"); 
            Yes.setAlignment(Button.CENTER);
            Yes.getStyle().setFgColor(0x000000);            
            Yes.getUnselectedStyle().setMargin(10, 0, 25, 25);
            Yes.getSelectedStyle().setMargin(10, 0, 25, 25);
            Yes.getPressedStyle().setMargin(10, 0, 25, 25);             
            Yes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                destroyApp(true);
                notifyDestroyed();
            }
        });
            No = new Button("No"); 
            No.setAlignment(Button.CENTER);
            No.getStyle().setFgColor(0x000000);
            No.getUnselectedStyle().setMargin(10, 0, 25, 25);
            No.getSelectedStyle().setMargin(10, 0, 25, 25);
            No.getPressedStyle().setMargin(10, 0, 25, 25);             
            No.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                exitNew.dispose();                
            }
        });
            
            ctnExit.addComponent(txtexit);
            ctnExit.addComponent(Yes);
            ctnExit.addComponent(No);                     
            exitNew.addComponent(BorderLayout.CENTER,ctnExit); 
            int height = Display.getInstance().getDisplayHeight()
                       - (exitNew.getContentPane().getPreferredH()
                       + exitNew.getTitleComponent().getPreferredH());
                height /= 2;
            exitNew.show(10, 10, 10, 10, true, false);
            
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}
