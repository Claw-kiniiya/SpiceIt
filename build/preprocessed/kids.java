
import com.sun.lwuit.Command;
import com.sun.lwuit.Form;
import com.sun.lwuit.Image;
import com.sun.lwuit.Label;
import com.sun.lwuit.TextArea;
import com.sun.lwuit.layouts.BoxLayout;


/**
 *
 * @author BETA-017
 */
public class kids {
    Form frmfore,frmcherry,frmchoc,frmchick,frmcran;
    Label lblfore,lblcherry,lblchoc,lblchick,lblcran;
    TextArea txafore,txacherry,txachoc,txachick,txacran;
    Image imgfore,imgcherry;
    Command Back;
    
    public void kids() {
        frmfore = new Form("Chocolate Treats");
        frmfore.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
        lblfore  = new Label("Black Forest sundaes with brownies");
        txafore = new TextArea("Cooking time"
+ "\n\nPrep: 20 mins "
+ "\n\nCook: 10 mins"
+ "\n\n(Makes 16)"
+ "\n\nIngredients"
+ "\n\nFor the ice cream"
   + "\n\n 568ml pot single cream"
    + "\n\n140g caster sugar"
    + "\n\n4 egg yolks"
   + "\n\n ½ tsp vanilla extract"
    + "\n\n200g dark chocolate (70% cocoa), "
                + "\nplus extra to decorate"
+ "\nFor the cherry sauce"
    + "\n\n1⁄2 400g can cherries"
    + "\n\n2 tbsp kirsch or brandy"
+ "\nTo serve"
    + "\n\n148ml double cream"
   + "\n\n 2 tsp icing sugar"
    + "\n\n2 brownie squares"
+ "\nFor the brownies"
    + "\n\n200g butter"
    + "\n\n175g dark brown sugar"
    + "\n\n140g granulated sugar"
    + "\n\n4 eggs"
    + "\n\n50g ground almonds"
   + "\n\n 50g plain flour"
    + "\n\n200g dark chocolate"
+ "\n\nMethod"
    + "\n\nFor the ice cream, "
+ "\n\npour the cream into a pan and bring to the boil. "
                + "\n\nBeat together the sugar, egg yolks and vanilla. "
                + "\n\nPour over 2 tbsp of the cream and whisk into the egg mixture. "
                + "\n\nPour the egg mixture into the pan with the cream, lower the heat, "
                + "\nthen cook for a few mins, stirring continuously with a wooden spoon, "
                + "\nuntil the custard coats the back of the spoon."
    + "\n\nMelt the chocolate in the microwave on High for 1 min, "
                + "\nthen stir into the bowl of custard. "
                + "\n\nWhen the custard has cooled, churn in an ice-cream maker according to manufacturers’ instructions."
    + "\n\nTo make the sauce, "
+ "\n\ndrain the cherries, reserving the liquid, then set aside. "
                + "\n\nPlace the liquid in a pan with the kirsch or brandy and simmer for 5 mins, or until syrupy. "
                + "\n\nReturn the cherries to the pan to heat through."
    + "\n\nTo assemble the sundaes," 
+ "\n\nwhip the cream with the icing sugar until soft peaks form. "
                + "\n\nCut the brownies into bite-size pieces, then place a handful at the bottom of 4 glasses. "
                + "\n\nScoop the ice cream on top, then drizzle with the cherries and sauce. "
                + "\n\nDollop with whipped cream and scatter with grated chocolate."
    + "\n\nFOR THE BROWNIES: Heat oven to 180C/fan 160C/gas 4, then grease and line a 20cm square brownie tin. "
                + "\n\nHeat the butter and dark chocolate in a pan until melted. "
                + "\n\nStir through dark brown sugar and granulated sugar. "
                + "\n\nLeave to cool for 5 mins, then mix through the eggs. "
                + "\n\nStir in the almonds and flour. Pour into the tin, then bake for 30-35 mins until just cooked through");
        
    txafore.setEditable(false);
    txafore.setFocus(false);
        frmfore.addComponent(lblfore);
        frmfore.addComponent(txafore);
        frmfore.addCommand(Back);
        frmfore.addCommandListener(Back);
        frmfore.show();
    }
    public void cherry() { 
     frmcherry = new Form("Chocolate Treats");
     frmcherry.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
   lblcherry  = new Label("Cherry cream sundaes");
   txacherry = new TextArea("Cooking time"
+ "\n\nReady in 15-20 mins, plus freezing time"
+ "\n\nMakes 10"
+ "\n\nIngredients"
    + "\n\n284ml carton double cream"
    + "\n\n2 tbsp icing sugar"
    + "\n\n200g toasted almonds, chopped"
    + "\n\n2-3 tbsp dark rum"
    + "\n\n10 amaretti biscuits"
    + "\n\n10 canned cherries (or fresh when in season)"
    + "\n\n50g dark chocolate, melted, to drizzle"
+ "\n\nMethod"
+ "\n\nArrange 6 paper muffin cases on a baking sheet. "
   + "\n\nWhisk together the cream and icing sugar until stiff. "
   + "\n\nFold in the almonds and rum."
+ "\n\nCrumble the biscuits and put the pieces in the bottom of the paper cases. "
   + "\n\nDivide the cream between them and top with a cherry. "
   + "\n\nFreeze for 1-2 hrs until firm. "
   + "\n\n(They will keep in the freezer for up to 2 weeks.) "
   + "\n\nRemove from the freezer 20 mins before serving, and drizzle with the chocolate."); 
   
    txacherry.setEditable(false);
    txacherry.setFocus(false);
    frmcherry.addComponent(lblcherry);
    frmcherry.addComponent(txacherry);
    frmcherry.addCommand(Back);
    frmcherry.addCommandListener(Back);
    frmcherry.show();
    }
}
