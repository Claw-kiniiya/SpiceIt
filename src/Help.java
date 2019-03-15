
import com.sun.lwuit.Button;
import com.sun.lwuit.Command;
import com.sun.lwuit.Form;
import com.sun.lwuit.Label;
import com.sun.lwuit.TextArea;
import com.sun.lwuit.layouts.BoxLayout;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BETA-017
 */
public class Help {
    Form frmHelp;
    Label lblHelp;
    TextArea txaHelp;
    Button btnHelp;
    Command cmdBack,Exit;
    
    public void Help(){
       frmHelp = new Form("");
        frmHelp.setLayout(new BoxLayout(BoxLayout.Y_AXIS));     
        
        lblHelp = new Label("About");
        txaHelp = new TextArea("This application gives you insight on how to Bake and Cook a wide variety of recipes to your satisfaction."
                + "\n\n To view different recipes ,select the Categories button from the main menu option."
                + "\n You will find a list of various recipes."
                + "\n\n Click on their buttons to view their vast display of delicious recipes.");
        txaHelp.setEditable(false);
        txaHelp.setFocus(false);
        cmdBack = new Command("Back");
        Exit = new Command("Exit");
        
        frmHelp.addComponent(lblHelp);
        frmHelp.addComponent(txaHelp);
        frmHelp.addCommand(cmdBack);
        frmHelp.addCommandListener(cmdBack);
        frmHelp.addCommand(Exit);
        frmHelp.addCommandListener(Exit);
        frmHelp.show();
       
   }
}
