/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.lwuit.Button;
import com.sun.lwuit.Command;
import com.sun.lwuit.Display;
import com.sun.lwuit.Form;
import com.sun.lwuit.List;
import com.sun.lwuit.TextArea;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.events.ActionListener;
import com.sun.lwuit.layouts.BoxLayout;
import javax.microedition.midlet.*;

/**
 * @author Acer
 */
public class NavigationApp extends MIDlet {
    Form home,main;
    String[] numbers;
    int pos;//tracking the position
    TextArea taDisplay;
    String clickedItem;

    public void startApp() {
        Display.init(this);
        home();
    }
    
    public void home()
    {
    home=new Form("Home");
    String[] cats={"Category one"};
    final List list=new List(cats);
    list.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae)
        {
         int selected=list.getSelectedIndex();    
         switch(selected)
         {
             case 0:
                 clickedItem="Numbers List";
                 numbers=null;
                 numbers=new String[]{""};
                 main();
                 break;
                        
         }         
        }
     });
    
    
    home.addComponent(list);
    
    home.show();
    }
    public void main()
    {
    pos=0; 
    main=new Form(clickedItem);
    main.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
    taDisplay=new TextArea(4,20);  
    taDisplay.setText("Click Next or Previous to view");
    taDisplay.setEditable(false);
    Button next=new Button("Next");
    Button prev=new Button("Previous");
    next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
               moveNext(); //throw new UnsupportedOperationException("Not supported yet.");
            }
        });
    prev.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
               movePrev(); //throw new UnsupportedOperationException("Not supported yet.");
            }
        });   
    main.addComponent(taDisplay);
    main.addComponent(next);
    main.addComponent(prev);
    Command back=new Command("Back"){

            public void actionPerformed(ActionEvent evt) {
               home(); //super.actionPerformed(evt);
            }
    
    };
    main.setBackCommand(back);
    
    main.show();   
    
    }
    
    //Navigation
    public void moveNext()
    {
     if(pos<numbers.length)
     {
         taDisplay.setText(numbers[pos]);
         pos++;
     }
     else
     {
      pos=0;
      taDisplay.setText(numbers[pos]);
     }
    taDisplay.repaint();
    }
    public void movePrev()
    {
    if(pos>=0&&pos<numbers.length)
     {
         taDisplay.setText(numbers[pos]);
         pos--;
     }
     else
     {
      pos=numbers.length-1;
      taDisplay.setText(numbers[pos]);
     }
    taDisplay.repaint();    
    }    
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}
