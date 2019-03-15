/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.lwuit.Button;
import com.sun.lwuit.Command;
import com.sun.lwuit.Container;
import com.sun.lwuit.Dialog;
import com.sun.lwuit.Display;
import com.sun.lwuit.Form;
import com.sun.lwuit.Image;
import com.sun.lwuit.Label;
import com.sun.lwuit.TextArea;
import com.sun.lwuit.animations.Transition3D;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.events.ActionListener;
import com.sun.lwuit.layouts.BorderLayout;
import com.sun.lwuit.layouts.BoxLayout;
import com.sun.lwuit.plaf.UIManager;
import com.sun.lwuit.util.Resources;
import java.io.IOException;
import javax.microedition.midlet.*;

/**
 * @author emobilis
 */
public class SpiceIt extends MIDlet implements ActionListener { 
   Form frmHome,frmCategories,frmCupcakes,frmRecipes,frmHalloween,
           frmbreakfast,frmKids,frmmexican,frmAbout,frmHelp,frmPies;
   
    Form frmCal;
    Container ctnCal;
    
    //String With Details
    String name = "Navigation";
    Dialog exitNew;
    TextArea txtexit;
    Button Yes;
    Button No; 
    
    Command cmdbtnnxt = null;
    Command cmdBack = null;
    Command prev = new Command("Previous");
    Command nxt = new Command("Next");
    Command Exit = new Command("Exit");
    Command Back = new Command("Back");
    
    Label lblImage;
    Label lblcategory,lblcupcakes,lblRecipes,txacupcakes,lblhallo;
    Label lblpie,lblapricot,lblblueberry,lblcinammon,lbloat
            ,lblcrumble,lblcake,lblpanetart,lblandytart,lblcoffee,lblvale;
    Label lblbirth,lblbug,lblchoc;
    Label lblmexi;
    TextArea txapie,txaapricot,txablueberry,txacinammon,txaoat
            ,txacrumble,txacake,txapanetart,txaandytart,txacoffee,txavale;
    TextArea txaBBC,txablackvelvet,txacampfire,txacelebration,txachocofudge,
            txacocorasp,txacranberry,txadevils,txalouise,txarose,txapumpkin,txareindeer; 
    TextArea txabirth,txabug,txachoc;
    TextArea txamexi;
    TextArea txaburger,txabanana,txaBLT,txaeng,txasausage,txaalmond;
    TextArea txahallo,txaAbout,txaHelp;
    
    Form frmfore,frmcherry,frmchoc,frmchick,frmcran;
    Label lblfore,lblcherry,lblchc,lblchick,lblcran;
    TextArea txafore,txacherry,txachc,txachick,txacran;
    Image imgfore,imgcherry;
    
    Label lblbaked,lblapple;
    TextArea txabaked,txaapple;
    Button next,previous;
    
    Button btnCategories,btncupcakes,btnkids,btnmexican,btnHelp,btnbreak,btnpies;
    Button btnRecipes,btnhallo,btnCupcakes,btnAbout,btnnxt,btnprev; 
    
    Image imgcategories; 
    Image imgrecipe;
    Image imgback,imghome,imgExit,imgcategory;
    Image imgBBC,imgblackvelvet,imgcampfire,imgcelebration,imgChocofudge,
          imgCocorasp,imgcranberry,imgDevils,imgLouise,imgrose,imgpumpkin,imgReindeer;
    Image imgbirth;
    Image imgAbout;
 
    private LoadingBarSplash bar;
    Dialog splash,dialg;
    
    public void startApp() {
        Display.init(this);
        try {
         Resources res = null;
         res = Resources.open("/TipsterTheme.res");
            UIManager.getInstance().setThemeProps(res.getTheme("Theme 1"));
         } catch(Exception ex) {
            Dialog.show("Error","Theme could not Load", "", "");
         }
         Home();
    
         try
        {imghome = Image.createImage("/home.png");
        imgcategory = Image.createImage("/category.png");
        imgrecipe = Image.createImage("/recipe.jpeg");
        imgAbout = Image.createImage("/about.png");
        imgbirth = Image.createImage("/birth.png");
       } catch(IOException x){}
         };   
   public void Home() {
        frmHome = new Form("Home");
        frmHome.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
        btnCategories = new Button("Categories");
        btnRecipes = new Button("Apple Recipes");
        btnAbout = new Button("About");
        btnHelp = new Button("Help");
        
        btnCategories.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Categories();
            }});

        btnRecipes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Recipes();
            }});
               
        btnAbout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                About();   
            }});
        
         btnHelp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Help();
            }});
        Exit = new Command("Exit");
        frmHome.addCommand(Exit);
        frmHome.addCommandListener(this);
        frmHome.addComponent(btnCategories);        
        frmHome.addComponent(btnRecipes);
        frmHome.addComponent(btnAbout);
        frmHome.addComponent(btnHelp);
        frmHome.show();
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
        
            txtexit = new TextArea("Do you want to exit?");
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
   public void Categories(){
        frmCategories = new Form("Categories");
        frmCategories.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
        btnhallo = new Button("Halloween");
        btnhallo.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae) {
            Halloween();
        }});
        btncupcakes = new Button("Cupcakes");
        btncupcakes.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae) 
        {
            Cupcakes();
        }});
        btnkids = new Button("Kids Treats");
        btnkids.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae) {
            Kids();
        }});
        btnmexican = new Button("Mexican Delicacies");
        btnmexican.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae) {
            Mexican();
        }});
        
        btnbreak = new Button("Breakfast");
        btnbreak.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae) {
            Breakfast();
        }});
        btnpies = new Button("Breakfast");
        btnpies.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae) {
            Pies();
        }});
        cmdBack = new Command("Back");
        frmCategories.addComponent(btnhallo);
        frmCategories.addComponent(btncupcakes);
        frmCategories.addComponent(btnkids);
        frmCategories.addComponent(btnmexican);
        frmCategories.addComponent(btnbreak);
        frmCategories.addComponent(btnpies);
        frmCategories.addCommand(cmdBack);
        frmCategories.addCommandListener(this);
        frmCategories.show();
        }
   public void Pies() {
    frmPies = new Form("Pies");
    frmPies.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
    lblbaked = new Label("Pies");
    txabaked = new TextArea("Baked apples with burnt sugar cream"
+"\n\nApples come into season just as the weather gets cooler, so what better way to enjoy them than in this baked dessert."
+"\n\n6 SERVINGS"
+"\n\nIngredients"
+"\n\n6 large Pink Lady apples"
+"\n\n80g fresh dates, pitted, chopped"
+"\n\n60g chilled butter, chopped"
+"\n\n25g (1/4 cup) flaked almonds"
+"\n\n2 tbs brown sugar"
+"\n\n1 tbs finely shredded fresh ginger"
+"\n\n2 tsp finely grated orange rind"
+"\n\n160ml (2/3 cup) fresh orange juice"
+"\n\n80ml (1/3 cup) water"
+"\n\n4 whole cloves"
+"\n\n300ml ctn double cream"
+"\n\nToffee"
+"\n\n100g (1/2 cup, firmly packed) dark brown sugar"
+"\n\n60ml (1/4 cup) water"
+"\n\nMethod"
+"\n\nStep 1"
+"\n\nUse an apple corer to core apples, leaving base intact. "
+ "Use a teaspoon to scoop out the flesh to create a slightly wider cavity. "
+ "Cut a horizontal slit around each apple to prevent the skin from splitting during cooking."
+"\n\nStep 2"
+"\n\nPreheat oven to 180ºC. Place the apples upright in a baking dish."
+ " Combine date, butter, almonds, sugar, ginger and orange rind in a bowl. "
+ "Divide among the apple cavities and press down firmly. "
+ "Pour orange juice and water into the dish. Add cloves to the dish. "
+ "Bake for 40-50 minutes or until the apples are tender. Set aside for 10 minutes to cool slightly."
+"\n\nStep 3"
+"\n\nMeanwhile, to make the toffee, line a baking tray with non-stick baking paper. "
+ "Cook the sugar and water in a saucepan over medium-low heat, stirring, until sugar dissolves. "
+ "Reduce heat to low. Cook, without stirring, for 10 minutes or until golden. "
+ "Set aside until the bubbles subside. Pour over the prepared tray. Set aside until set."
+"\n\nStep 4"
+"\n\nUse a rolling pin to smash the toffee into small pieces. Place the cream in a bowl. "
+ "Fold in the toffee. Serve with the apples.");
    txabaked.setEditable(false);
    txabaked.setFocus(false);
    
    prev = new Command("previous");
    nxt = new Command("next");
    lblapple = new Label("American Apple Pie");
    txaapple = new TextArea("Name: American Apple Pie"
+"\n\nPREP TIME:20 mins"
+"\n\nCOOK TIME:40 mins"
+"\n\nREADY IN: 1 hr 30 mins"
+"\n\nOriginal recipe makes 1 - 9 inch pie"
+"\n\nIngredients"
+"\n\n1/3 cup packed light brown sugar"
 +"\n\n1/3 cup white sugar"
 +"\n\n1 tablespoon all-purpose flour"
 +"\n\n1 teaspoon lemon juice"
 +"\n\n1/3 teaspoon ground cinnamon"
 +"\n\n7 1/2 cups peeled, cored and sliced apples"
 +"\n\n1 cup raisins"
 +"\n\n1 recipe pastry for a 9 inch double crust pie"
 +"\n\n1 egg"
+"\n\nDirections"
+"\n\nPreheat oven 425 degrees F (220 degrees C). Spray deep dish pie plate with cooking spray"
+"\n\nCombine white sugar, light brown sugar, flour, lemon, cinnamon, and mix well. "
+ "Add apples and raisins to sugar mixture; stir until fruit is well coated."
+"\n\nSpoon apple mixture into pie crust. Place second piecrust on top of filling, and trim edges. "
+ "Lightly glaze top of pie with a beaten egg, then sprinkled with a little sugar."
+"\n\nBake till golden brown, about 35 to 40 minutes. Place on a wire rack, and cool 30 minutes.");
    frmPies.addComponent(lblbaked);
    frmPies.addComponent(txabaked);
    frmPies.addComponent(previous);
    frmPies.addComponent(next);
    frmPies.addComponent(lblapple);
    frmPies.addComponent(txaapple);
    frmPies.addCommand(cmdBack);
    frmPies.addCommandListener(cmdBack);
    
      frmPies.show();
   }
   public void Breakfast() {
    frmbreakfast = new Form("Breakfast");
    frmbreakfast.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
            
    txaburger = new TextArea("******************"
 +"\n\nThe great breakfast burger"
+"\n\nCooking time"
+"\n\nPrep: 20 mins"
+"\n\nCook: 35 mins"
+"\n\nPlus chilling"
+"\n\nServes 8"
 +"\n\nIngredients"
+"\n\n1 medium onion, roughly chopped"
+"\n\n2 tbsp tomato ketchup"
+"\n\n1 tbsp oyster sauce"
+"\n\n1kg sausagemeat, or meat squeezed from 16 large sausages"
+"\n\n1 egg yolk"
+"\n\n25g pack flat-leaf parsley, leaves chopped"
+"\n\n8 slices melting cheese (we used havarti)"
+"\n\nTo serve"
+"\n\n8 grilled rashers streaky smoked bacon"
+"\n\n8 ciabatta buns, halved"
+"\n\ntomato relish"
+"\n\nMethod"
+"\n\nPut the onion, ketchup and oyster sauce in a food processor, "
+"\n\nthen blend to a coarse paste, scraping down the sides of the processor if you need to. "
+"\n\nPut the sausagemeat into a mixing bowl, beat in the onion mix, egg yolk and 25ml water "
+"\n\n(and I mean really beat; if you have a tabletop mixer, do it in that), then add the parsley. "
+"\n\nSeparate the mix into 8, roll into large balls, then flatten into patties. "
+"\n\nChill on a plate for 1 hr."
+"\n\nTo cook the burgers, heat a griddle or large frying pan "
+"\n\nwithout adding any extra fat. "
+"\n\nFry for 3 mins on one side until golden, "
+"\n\nturn down the heat for 5 mins, "
+"\n\nthen flip and repeat on the other side."
+"\n\nWhile the burgers cook, fry the bacon and some eggs as well. "
+"\n\nHeat the grill, then lightly toast the insides of the ciabatta buns."
+"\n\nPlace the cooked burgers on a baking sheet, "
+"\n\nput a slice of cheese on each, "
+"\n\nthen pop under the grill to melt. "
+"\n\nSit the burgers on their buns, then place the bacon on top. "
+"\n\nIf you feel like them, slide fried eggs on top of the bacon. "
+"\n\nServe with a napkin.");
        txaburger.setEditable(false);
        txaburger.setFocus(false);
        
    txabanana = new TextArea("******************"
 + "\nBanana pancakes with crispy bacon & syrup"
+ "\nCooking time"
+ "\nPrep: 15 mins"
+ "\nCook: 25 mins"
+ "\nServes 4" 
+ "\nmakes about 10 pancakes"
 + "\n\nIngredients"
+ "\n8 rashers smoked streaky bacon (or pancetta strips)"
+ "\n140g self-raising flour"
+ "\n1 tsp baking powder"
+ "\n2 tbsp light soft brown sugar"
+ "\n2 ripe bananas, 1 mashed, 1 thinly sliced"
+ "\n2 large eggs"
+ "\n25g butter, melted, plus a little extra"
+ "\n125ml milk"
+ "\nmaple syrup"
 + "\n\nMethod"
+ "\nHeat the grill to high. "
+ "\nArrange the bacon on a baking tray lined with foil. "
+ "\nCook for 5-7 mins until crisp, then turn off the grill but leave the tray inside to keep warm. "
+ "\nIn a bowl, mix the flour, baking powder and sugar with a pinch of salt. "
+ "\nMake a well in the centre and add the mashed banana, eggs, butter and milk. "
+ "\nWhisk to a smooth batter without any flour lumps."
+ "\nHeat a little butter in a large frying pan. "
+ "\nOnce sizzling, ladle in small dollops of the pancake batter, leaving a little space between each, "
+ "\nas they will spread out. "
+ "\nPut 2 or 3 slices of banana onto the surface of each pancake and cook for 2 mins over a medium heat. "
+ "\nWhen you see bubbles appear between the banana slices, flip the pancakes over and cook for 1 min more, "
+ "\nuntil puffed up and golden. "
+ "\nTransfer to a plate and keep warm with the bacon while you cook the rest. "
+ "\nServe the pancakes with the crispy bacon and a drizzle of maple syrup.");
        txabanana.setEditable(false);
        txabanana.setFocus(false);
        
    txaBLT = new TextArea("******************"
+ "\nBLT burger"
+ "\nCooking time"
+ "\nReady in 30 minutes plus chilling"
+ "\nServes 6"
+ "\n\nIngredients"
+ "\n1¼kg minced beef"
+ "\n6 slices cheddar"
+ "\n12 slices bacon, cooked until crisp"
+ "\n1 red onion, thinly sliced"
+ "\n2 tomatoes, thickly sliced into 5mm slices"
+ "\n6 leaves romaine (cos) lettuce, ribs removed"
+ "\n6 burger buns, sliced in half"
+ "\n\nFor the BLT sauce"
+ "\n8 tbsp mayonnaise"
+ "\n5 tbsp tomato ketchup"
+ "\n1 tbsp red wine vinegar"
+ "\n1 tbsp grated onion"
+ "\n1 tsp Worcestershire sauce"
+ "\nflat-leaf parsley, chopped to make 1 tbsp"
+ "\ntarragon, chopped to make 1 tbsp"
+ "\n\nMethod"
+ "\nStir the sauce ingredients together. "
+ "\nChill for at least 1 hour."
+ "\nSeason the beef, then gently form six large, flattish patties. "
+ "\nGrill for 3 minutes each side for rare, or longer if you prefer, on a medium-high heat "
+ "\n(don’t push down on the burgers or the juices will escape). "
+ "\nGrill further to melt a slice of cheese on top."
+ "\nTo serve, put a burger on each halved bun. "
+ "\nTop with bacon, onion, tomato, lettuce, a tablespoon of Blt sauce and a bun half.");
    txaBLT.setEditable(false);
    txaBLT.setFocus(false);
    
    txaeng = new TextArea("******************"
+ "\nOne-pan English breakfast"
+ "\nCooking time"
+ "\nPrep: 5 mins "
+ "Cook: 15 mins"
+ "\nServes 4"
+ "\n\nIngredients"
+ "\n4 good-quality pork chipolatas"
+ "\n4 rashers smoked back bacon"
+ "\n140g button mushrooms"
+ "\n6 eggs, beaten"
+ "\n8 cherry tomatoes, halved"
+ "\nhandful grated cheese (optional)"
+ "\n1 tbsp snipped chives"
+ "\n\nMethod"
+ "\nHeat the grill to high. "
+ "\nHeat a medium non-stick frying pan, "
+ "\nadd the chipolatas and fry for 3 mins. "
+ "\nAdd the bacon, turning occasionally, until it starts to crisp, about 5 mins more. "
+ "\nTip in the mushrooms and continue to cook for a further 3-5 mins. "
+ "\nDrain any excess fat and move the ingredients so they are evenly spread out."
+ "\nSeason the eggs, then add to the pan, swirling to fill the spaces. "
+ "\nGently move with a fork for 2 mins over a low-medium heat until beginning to set. "
+ "\nScatter over the tomatoes, cheese, if using, and chives, then grill for 2 mins until set. "
+ "\nCut into wedges and serve with your favourite sauces.");
        txaeng.setEditable(false);
        txaeng.setFocus(false);
        
txasausage = new TextArea("******************"
+ "Sausage & egg baps with spicy tomato sauce"
+ "\nCooking time"
+ "\nPrep: 10 mins"
+ "\nCook: 20 mins"
+ "\nServes 4"
+ "\n\nIngredients"
+ "\n12 Cumberland sausages"
+ "\n1 tsp vegetable oil"
+ "\n4 large eggs"
+ "\n4 large soft white or wholemeal baps"
+ "\n\nFor the sauce"
+ "\n4 large, ripe plum tomatoes, chopped"
+ "\n1 tsp English mustard powder"
+ "\n½ tsp chilli flakes"
+ "\n1 tbsp each red wine vinegar, soft brown sugar, tomato ketchup"
+ "\n\nMethod"
+ "\nPlace all the ingredients for the sauce in a large pan. "
+ "\nCook over a medium-high heat for 10-12 mins until most of the liquid has evaporated and the tomatoes have broken down, "
+ "\nleaving you with a thick, spoonable sauce."
+ "\nSqueeze the sausagemeat from the skins and shape into 4 flat patties. "
+ "\nHeat the oil in a large frying pan. "
+ "\nCook the patties for 4 mins each side, squashing them down with the back of a spatula, "
+ "\nuntil crisp and golden on both sides. Remove from the pan and keep warm."
+ "\nHeat the grill. "
+ "Crack the eggs into the pan and cook to your liking. "
+ "Meanwhile, slice open the baps and lightly toast, cut-side up, under the grill. "
+ "Add a spoonful of the spicy tomato sauce to each bap, then a sausage patty, then top with a fried egg.");
        txasausage.setEditable(false);
        txasausage.setFocus(false);
        
txaalmond = new TextArea("******************"
+ "\nChocolate & almond croissants"
+ "\nCooking time"
+ "\nPrep: 5 mins"
+ "\nCook: 5 mins"
+ "\nServes 6"
+ "\n\nIngredients"
+ "\n6 croissants"
+ "\n100g marzipan, broken into small pieces"
+ "\n50g toasted sliced almonds"
+ "\n50g milk chocolate, chopped"
+ "\n\nMethod"
+ "\nHeat oven to 180C/160C fan/gas 4. "
+ "\nSlice into each croissant lengthways, but don’t go all the way through – they should open like books. "
+ "\nSprinkle or spread the bottom half of each with marzipan, followed by 1 tsp almonds and 1 tbsp chocolate."
+ "\nClose up, put on a baking sheet and sprinkle the remaining chocolate and almonds on top. "
+ "Bake for 5 mins or until the chocolate has melted. Serve warm.");
        txaalmond.setEditable(false);
        txaalmond.setFocus(false);
        
    frmbreakfast.addComponent(txaburger); 
    frmbreakfast.addComponent(txabanana);
    frmbreakfast.addComponent(txaBLT);
    frmbreakfast.addComponent(txaeng);
    frmbreakfast.addComponent(txasausage);
    frmbreakfast.addComponent(txaalmond);
    frmbreakfast.addCommand(cmdBack); 
    frmbreakfast.addCommandListener(this);
        
    frmbreakfast.show();
       
   }
   public void Mexican(){
       frmmexican = new Form("Mexican Delicacies");
       frmmexican.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
        
       lblmexi = new Label("");
       txamexi = new TextArea("");
       frmmexican.addComponent(lblmexi);
       frmmexican.addComponent(txamexi);
        frmmexican.addComponent(btnmexican);
        frmmexican.addCommand(cmdBack);
        frmmexican.addCommandListener(this);
        frmmexican.show();
   }
   public void Kids(){
      frmKids = new Form("Kids Treats");
      frmKids.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
      lblbirth = new Label("Birthday Biscuits");
      txabirth = new TextArea("Cooking time:"
+"\n\nPrep: 30 mins"
+"\n\nCook: 10 mins"
+"\n\nMakes 24"
+"\n\nIngredients"
+"\n\n250g plain white flour"
+"\n\n85g golden caster sugar"
+"\n\n175g unsalted butter, at room temperature, cubed"
+"\n\n2 tbsp lemon curd"
+"\n\n250g white icing sugar"
+"\n\n1 tbsp strawberry conserve"
+"\n\nMethod"
+"\n\nHeat oven to 180C/fan 160C/gas 4. "
+"\n\nPut the flour, sugar and butter into a food processor. "
+"\n\nWhizz until the mixture forms crumbs, then pulse a little more until it forms a ball."
+"\n\nSpread a large sheet of baking parchment over the work surface and turn the dough onto it. "
+"\n\nDust with a little flour, then roll out to about the thickness of two £1 coins. "
+"\n\nStamp out 24 rounds using a 5cm round fluted cutter, then cut out the middles with the end of a piping nozzle. "
+"\n\nCarefully peel the rest of the mixture away from the stamped shapes. "
+"\n\nLift onto baking sheets and bake for 10 mins until pale golden. "
+"\n\nCool on a wire rack."
+"\n\nPut the lemon curd into a bowl with 2 tbsp boiling water and mix until smooth. "
+"\n\nSieve in 175g of the icing sugar; stir together to make a smooth icing. "
+"\n\nPut the strawberry fruit spread in another bowl and add 2 tsp boiling water, mix, then sieve in the remaining icing sugar."
+"\n\nSpoon the lemon icing over the biscuits, then drizzle or pipe over the pinky icing. "
+"\n\nLeave to set for at least 20 mins. "
+"\n\nWill keep for up to 2 days in an airtight tin, longer if left un-iced.");
        txabirth.setEditable(false);
        txabirth.setFocus(false);
    btnprev = new Button("Previous");
    btnnxt = new Button("Next");
    
lblbug = new Label("Birthday Biscuits");
txabug = new TextArea("Cooking time:"
+"\n\nPrep: 50 mins "
+"\n\nCook: 1 hr, 20 mins"
+"\n\nServes 16"
+"\n\nIngredients"
+"\n\nEasy vanilla cake and syrup mix "
+"\n\n100g white chocolate "
+"\n\nBasic vanilla buttercream mix "
+"\n\n12 giant chocolate buttons, 6 cut in half"
+"\n\ntreat-size pack chocolate buttons"
+"\n\n2 chocolate sticks "
+"\n\nmulticoloured candles"
+"\n\nred (or whatever colour you like) writing icing tubes "
+"\n\nMethod"
+"\n\nBake the Easy vanilla cake in a greased, lined deep 20cm cake tin as in the basic recipe; "
+"\n\ndrench with syrup and leave to cool. "
+"\n\nLeave the oven on."
+"\n\nBreak the white chocolate into cubes into a microwaveable bowl, "
+"\n\nand heat on High for 1 min (or melt over a pan of simmering water). "
+"\n\nStir, then leave any remaining lumps to melt in the warm liquid chocolate."
+"\n\n \n\nOnce just-warm, beat the chocolate into the buttercream."
+"\n\nStart the butterflies. Put the whole giant buttons on a flat baking tray on non-stick baking paper, "
+"\n\nthen put into the oven for 20-30 secs or until the chocolate looks shiny. "
+"\n\nTake out, scatter with hundreds and thousands, "
+"\n\nthen leave to set completely before cutting in half with a large non-serrated knife. "
+"\n\nFor the ladybirds, pipe dots of icing all over the already cut giant button halves, "
+"\n\nthen leave aside to dry."
+"\n\nSpread the buttercream over the cake, "
+"\n\nthen start to arrange the butterflies. "
+"\n\nCut each Matchmaker into 3 – these will make the bodies. "
+"\n\nPress onto the cake, then stick four giant button halves around each body to make ‘wings’. "
+"\n\nFor the ladybirds, place two spotty button halves together, "
+"\n\nthen use a small button for the head. "
+"\n\nScatter more hundreds and thousands all over the cake, then poke in the candles.");
txabug.setEditable(false);
txabug.setFocus(false);

lblfore  = new Label("Black Forest sundaes with brownies");
txafore = new TextArea("Cooking time"
+"\n\nPrep: 20 mins "
+"\n\nCook: 10 mins"
+"\n\n(Makes 16)"
+"\n\nIngredients"
+"\n\nFor the ice cream"
+"\n\n 568ml pot single cream"
+"\n\n140g caster sugar"
+"\n\n4 egg yolks"
+"\n\n ½ tsp vanilla extract"
+"\n\n200g dark chocolate (70% cocoa), "
+"\n\nplus extra to decorate"
+"\n\nFor the cherry sauce"
+"\n\n1⁄2 400g can cherries"
+"\n\n2 tbsp kirsch or brandy"
+"\n\nTo serve"
+"\n\n148ml double cream"
+"\n\n 2 tsp icing sugar"
+"\n\n2 brownie squares"
+"\n\nFor the brownies"
+"\n\n200g butter"
+"\n\n175g dark brown sugar"
+"\n\n140g granulated sugar"
+"\n\n4 eggs"
+"\n\n50g ground almonds"
+"\n\n 50g plain flour"
+"\n\n200g dark chocolate"
+"\n\nMethod"
+"\n\nFor the ice cream, "
+"\n\npour the cream into a pan and bring to the boil. "
+"\n\nBeat together the sugar, egg yolks and vanilla. "
+"\n\nPour over 2 tbsp of the cream and whisk into the egg mixture. "
+"\n\nPour the egg mixture into the pan with the cream, lower the heat, "
+"\n\nthen cook for a few mins, stirring continuously with a wooden spoon, "
+"\n\nuntil the custard coats the back of the spoon."
+"\n\nMelt the chocolate in the microwave on High for 1 min, "
+"\n\nthen stir into the bowl of custard. "
+"\n\nWhen the custard has cooled, churn in an ice-cream maker according to manufacturers’ instructions."
+"\n\nTo make the sauce, "
+"\n\ndrain the cherries, reserving the liquid, then set aside. "
+"\n\nPlace the liquid in a pan with the kirsch or brandy and simmer for 5 mins, or until syrupy. "
+"\n\nReturn the cherries to the pan to heat through."
+"\n\nTo assemble the sundaes," 
+"\n\nwhip the cream with the icing sugar until soft peaks form. "
+"\n\nCut the brownies into bite-size pieces, then place a handful at the bottom of 4 glasses. "
+"\n\nScoop the ice cream on top, then drizzle with the cherries and sauce. "
+"\n\nDollop with whipped cream and scatter with grated chocolate."
+"\n\nFOR THE BROWNIES: Heat oven to 180C/fan 160C/gas 4, then grease and line a 20cm square brownie tin. "
+"\n\nHeat the butter and dark chocolate in a pan until melted. "
+"\n\nStir through dark brown sugar and granulated sugar. "
+"\n\nLeave to cool for 5 mins, then mix through the eggs. "
+"\n\nStir in the almonds and flour. "
+ "\n\nPour into the tin, then bake for 30-35 mins until just cooked through");
        
    txafore.setEditable(false);
    txafore.setFocus(false);

   lblcherry  = new Label("Cherry cream sundaes");
   txacherry = new TextArea("Cooking time"
+"\n\nReady in 15-20 mins, plus freezing time"
+"\n\nMakes 10"
+"\n\nIngredients"
+"\n\n284ml carton double cream"
+"\n\n2 tbsp icing sugar"
+"\n\n200g toasted almonds, chopped"
+"\n\n2-3 tbsp dark rum"
+"\n\n10 amaretti biscuits"
+"\n\n10 canned cherries (or fresh when in season)"
+"\n\n50g dark chocolate, melted, to drizzle"
+"\n\nMethod"
+"\n\nArrange 6 paper muffin cases on a baking sheet. "
+"\n\nWhisk together the cream and icing sugar until stiff. "
+"\n\nFold in the almonds and rum."
+"\n\nCrumble the biscuits and put the pieces in the bottom of the paper cases. "
+"\n\nDivide the cream between them and top with a cherry. "
+"\n\nFreeze for 1-2 hrs until firm. "
+"\n\n(They will keep in the freezer for up to 2 weeks.) "
+"\n\nRemove from the freezer 20 mins before serving, and drizzle with the chocolate."); 
   
    txacherry.setEditable(false);
    txacherry.setFocus(false);

      cmdBack = new Command("Back");
      
      frmKids.addCommand(cmdBack);
      frmKids.addCommandListener(this);
      frmKids.addComponent(lblbirth);
      frmKids.addComponent(txabirth);
      frmKids.addComponent(lblbug);
      frmKids.addComponent(txabug);
      frmKids.addComponent(lblfore);
      frmKids.addComponent(txafore);
      frmKids.addComponent(lblcherry);
      frmKids.addComponent(txacherry);
      frmKids.show();
   }
   public void Recipes(){
        frmRecipes = new Form("Apple Recipes");
        frmRecipes.setLayout(new BoxLayout(BoxLayout.Y_AXIS)); 
          
        lblpie= new Label("American Apple Pie");
        txapie = new TextArea("\n\nMakes 1 - 9 inch pie"
+"\n\nPrep. 20 mins"
+"\n\nCook.  40 mins"
+"\n\nReady in.  1 hr 30 mins"
+"\n\n\n Ingredients"
+"\n\n1/3 cup packed light brown sugar"
+"\n\n1/3 cup white sugar"
+"\n\n1 tablespoon all-purpose flour"
+"\n\n1 teaspoon lemon juice"
+"\n\n1/3 teaspoon ground cinnamon"
+"\n\n7 1/2 cups peeled, cored and sliced apples"
+"\n\n1 cup raisins"
+"\n\n1 recipe pastry for a 9 inch double crust pie"
+"\n\n1 egg"
+"\n\n\n Directions"
+"\n\nPreheat oven 425 degrees F (220 degrees C). "
+"\n\nSpray deep dish pie plate with cooking spray."
+"\n\nCombine white sugar, light brown sugar, flour, lemon, cinnamon, and mix well."
+"\n\nAdd apples and raisins to sugar mixture; stir until fruit is well coated."
+"\n\nSpoon apple mixture into pie crust. "
+"\n\nPlace second piecrust on top of filling, and trim edges. "
+"\n\nLightly glaze top of pie with a beaten egg, then sprinkled with a little sugar."
+"\n\nBake till golden brown, about 35 to 40 minutes. Place on a wire rack, and cool 30 minutes."
+"\n\nReady to serve. ");
        txapie.setEditable(false);
        txapie.setFocus(false);
        btnprev = new Button("previous");
        btnprev.addActionListener(this);
        btnnxt = new Button("next");
        btnnxt.addActionListener(this);
        
        frmRecipes.setTransitionOutAnimator(Transition3D.createRotation(500, true));
        lblapricot = new Label("Apple and apricot crumble");
        txaapricot = new TextArea("\n\n8 SERVINGS"
+"\n\n\n Ingredients"
+"\n\n4 Gala(red)apples, peeled, cored, cut into thin wedges"
+"\n\n825g can apricots in syrup or juice, drained reserving liquid"
+"\n\n1/4 tsp ground cinnamon"
+"\n\nVanilla custard, to serve"
+"\n\nClassic oat crumble"
+"\n\n115g (3/4 cup) plain flour"
+"\n\n100g chilled butter, chopped"
+"\n\n100g (1/2 cup, firmly packed) brown sugar"
+"\n\n250g (1/2 cup) rolled oats"
+"\n\n\nMethod Notes"
+"\n\n\nStep 1"
+"\n\nPreheat oven to 180°C."
+"\n\nCombine apple, apricot, cinnamon and 160ml (2/3 cup) of reserved liquid in a bowl."
+"\n\n\nStep 2"
+"\n\nTo make the classic oat crumble, place the flour in a large bowl."
+"\n\nUse your fingertips to rub the butter into the flour until the mixture resembles coarse breadcrumbs."
+"\n\nAdd the sugar and oats, and stir until well combined."
+"\n\n\nStep 3"
+"\n\nSpoon the apple mixture into a 2.5L (10-cup) capacity ovenproof dish." 
+"\n\nDivide the crumble among serving bowls." 
+"\n\nServe with custard. ");
        txaapricot.setEditable(false);
        txaapricot.setFocus(false);
        btnprev = new Button("previous");
        btnprev.addActionListener(this);
        btnnxt = new Button("btnnxt");
        btnnxt.addActionListener(this);
        
        lblblueberry = new Label("Apple and blueberry shortcake pie");
        txablueberry = new TextArea("\n\n8 SERVINGS"
+"\n\n\nIngredients"
+"\n\n125g unsalted butter"
+"\n\n100g (1/2 cup) caster sugar"
+"\n\n1 egg"
+"\n\n1 tsp vanilla essence"
+"\n\n150g (1 cup) self-raising flour"
+"\n\n100g (2/3 cup) plain flour"
+"\n\n2 tbs brown sugar"
+"\n\nPouring cream or vanilla custard, to serve"
+"\n\n\n Filling"
+"\n\n\n4 large Granny Smith(green) apples, peeled, cored, cut into thin wedges"
+"\n\n1 tsp finely grated lemon rind"
+"\n\n70g (1/3 cup) caster sugar(superfine)"
+"\n\n60ml (1/4 cup) water"
+"\n\n300g pkt frozen blueberries, thawed"          
+"\n\n\n Method Notes"
+"\n\n\n Step 1"
+"\n\nTo make the filling, place the apple, lemon rind, sugar and water in a saucepan "
+"\n\nover low heat. Cover and simmer for 10 minutes or until apple is soft. "
+"\n\nAdd the blueberries and simmer for 1 minute. Set aside to cool."           
+"\n\n\nStep 2"
+"\n\nMeanwhile, use electric beaters to beat the butter and caster sugar in a bowl until pale and creamy."
+"\n\nBeat in the egg and vanilla. Sift the combined flour over the butter mixture and stir to combine."
+"\n\nTurn onto a lightly floured surface and knead until smooth. "
+"\n\nWrap one-third of the dough in plastic wrap. Wrap remaining dough in plastic wrap."
+"\n\nPlace both dough portions in the fridge for 30 minutes to rest."
+"\n\n\n Step 3"
+"\n\nPreheat oven to 180ºC." 
+"\n\nRoll out the larger dough portion on a lightly floured surface into a 24cm disc." 
+"\n\nLine a round 20cm springform pan with the pastry disc, to cover the base and about 2cm up the side."
+"\n\nStrain the filling to remove any excess moisture and transfer to the prepared pan. "
+"\n\nRoll out the remaining dough portion and cut into 2cm-wide strips. "
+"\n\nArrange the strips in a lattice pattern over the filling and press to seal."
+"\n\nSprinkle with the demerara sugar."
+"\n\n\n Step 4"
+"\n\nBake for 30 minutes. "
+"\n\nSet aside in the pan for 10 minutes to cool." 
+"\n\nServe warm with cream or custard. ");
        txablueberry.setEditable(false);
        txablueberry.setFocus(false);
        btnprev = new Button("previous");
        btnprev.addActionListener(this);
        btnnxt = new Button("next");
        btnnxt.addActionListener(this);
        
        lblcinammon = new Label("Apple and cinnamon pancakes");
        txacinammon = new TextArea("Name: "
+"\n\nApple and cinnamon pancakes"
+"\n\n12 MAKES"
+"\n\nIngredients "
+"\n\n1 1/2 cups milk"
+"\n\n1 egg"
+"\n\n2 teaspoons vanilla extract"
+"\n\n2 cups White Wings self-raising flour"
+"\n\n1/4 teaspoon bicarbonate of soda"
+"\n\n1/3 cup caster sugar"
+"\n\n25g butter, melted"
+"\n\n2 teaspoons ground cinnamon"
+"\n\n1 granny smith apple, peeled, grated"
+"\n\n2 tablespoons brown sugar"
+"\n\nMethod "
+"\n\nStep 1"
+"\n\nWhisk milk, egg and vanilla together in a jug. "
+"\n\nSift flour and bicarbonate of soda into a bowl."
+"\n\nStir in sugar. "
+"\n\nMake a well in centre. "
+"\n\nAdd milk mixture. Whisk until just combined. Stir in cinnamon, apple and sugar."
+"\n\n Step 2"
+"\n\nHeat a large non-stick frying pan over medium heat."
+"\n\nBrush pan with butter. "
+"\n\nUsing 1/4 cup mixture per pancake, cook 2 pancakes for 3 to 4 minutes or until bubbles appear on surface. "
+"\n\nTurn and cook for 3 minutes or until cooked through. "
+"\n\nTransfer to a plate."
+"\n\nCover loosely with foil to keep warm."
+"\n\nRepeat with remaining mixture, brushing pan with butter between batches. Serve.");
        txacinammon.setEditable(false);
        txacinammon.setFocus(false);
        btnprev = new Button("previous");
        btnprev.addActionListener(this);
        btnnxt = new Button("next");
        btnnxt.addActionListener(this);
        
        lbloat = new Label("Apple and oat muffins");
        txaoat = new TextArea("Name: "
+"\n\nApple and oat muffins"
+"\n\n12 MAKES"
+"\n\nIngredients"
+"\n\n1 cup (150g) self-raising flour"
+"\n\n1 cup (150g) plain flour"
+"\n\n3/4 cup tightly packed brown sugar"
+"\n\n1/2 cup rolled oats, plus 1 tbs extra"
+"\n\n1 1/2 cups (375ml) vanilla yoghurt, at room temperature"
+"\n\n2 eggs, lightly beaten"
+"\n\n100ml light olive oil"
+"\n\n1 red or green skinned apple, thinly sliced"
+"\n\n Method Notes"
+"\n\n Step 1"
+"\n\nPreheat oven to 180°C. Grease 2 x 6 Texas (large) muffin pans with cooking spray or line with muffin cases."
+"\n\n Step 2"
+"\n\nSift flours and baking powder together. Stir in sugar and oats. Whisk yoghurt, eggs and oil together. "
+"\n\nAdd to flour, mix until just combined. Do not over-mix."
+"\n\n Step 3"
+"\n\nDivide mixture evenly into muffin pans until three-quarters full. "
+"\n\nGently push slices of apple into mixture until covered and sprinkle with extra rolled oats."
+"\n\n Step 4"
+"\n\nBake for 25 minutes or until golden in colour and cooked when tested. "
+"\n\nCool for 5 minutes in pan before transferring to a wire cake rack. Serve warm.");
        txaoat.setEditable(false);
        txaoat.setFocus(false);
        btnprev = new Button("previous");
        btnprev.addActionListener(this);
        btnnxt = new Button("next");
        btnnxt.addActionListener(this);
                
        lblcrumble = new Label("Apple and strawberry crumble cake");
        txacrumble = new TextArea(" Name: "
+"\n\nApple and strawberry crumble cake"
+"\n\n12 SERVINGS"
+"\n\nIngredients "
+"\n\nMelted butter, to grease"
+"\n\n200g butter, at room temperature"
+"\n\n155g (3/4 cup) caster sugar"
+"\n\n2 tsp vanilla essence"
+"\n\n2 eggs, at room temperature"
+"\n\n150g (1 cup) self-raising flour"
+"\n\n150g (1 cup) plain flour"
+"\n\n185ml (3/4 cup) milk"
+"\n\n1 Granny Smith9(red) apple, peeled, cored, thickly sliced"
+"\n\n200g strawberries, washed, hulled, halved"
+"\n\nCrumble topping"
+"\n\n75g (1/2 cup) plain flour"
+"\n\n50g chilled butter, chopped"
+"\n\n55g (1/4 cup, firmly packed) brown sugar"
+"\n\nMethod Notes"
+"\n\nStep 1"
+"\n\nPreheat oven to 180°C. Brush a round 20cm (base measurement) springform pan with melted butter to lightly grease. "
+"\n\nLine the base with non-stick baking paper. Place the prepared pan on a baking tray."
+"\n\nStep 2"
+"\n\nUse an electric beater to beat the butter, sugar and vanilla in a bowl until pale and creamy."
+"\n\nAdd the eggs, 1 at a time, beating well after each addition. "
+"\n\nUse a large metal spoon to fold in the combined flour and the milk until well combined."
+"\n\nStep 3"
+"\n\nSpoon into the prepared pan."
+"\n\nUse the back of the spoon to smooth the surface."
+"\n\nArrange the apple and strawberry on top."
+"\n\nStep 4"
+"\n\nTo make the crumble topping, place the flour and butter in a bowl. "
+"\n\nUse your fingertips to rub the butter into the flour until the mixture resembles coarse breadcrumbs."
+"\n\nStir in the sugar."
+"\n\nStep 5"
+"\n\nSprinkle the crumble topping over the apple and strawberry. "
+"\n\nBake in oven for 1 hour 10 minutes or until a skewer inserted into the centre comes out clean. "
+"\n\nSet aside in the pan for 10 minutes before transferring to a wire rack to cool slightly. "
+"\n\nServe cake warm or at room temperature. ");
        txacrumble.setEditable(false);
        txacrumble.setFocus(false);
        btnprev = new Button("previous");
        btnprev.addActionListener(this);
        btnnxt = new Button("next");
        btnnxt.addActionListener(this);
        
        lblcake = new Label("Apple cake");
        txacake = new TextArea(" Name:"
+"\n\nApple cake"
+"\n\n8 SERVINGS "
+"\n\nIngredients "
+"\n\n125g butter, chopped"
+"\n\n1/2 cup firmly packed brown sugar"
+"\n\n1 teaspoon vanilla extract"
+"\n\n2 eggs"
+"\n\n1 cup self-raising flour"
+"\n\n1/2 cup plain flour"
+"\n\n3/4 cup milk"
+"\n\n2 small royal gala apples"
+"\n\n1/4 cup apricot jam"
+"\n\nDouble cream, to serve"
+"\n\nMethod"
+"\n\nStep 1"
+"\n\nPreheat oven to 180°C/160°C fan-forced."
+"\n\nGrease a 6cm-deep, 20cm (base) round springform pan."
+"\n\nLine base with baking paper. "
+"\n\nPlace butter, sugar and vanilla in a bowl. "
+"\n\nUsing an electric mixer, beat for 5 to 6 minutes or until light and creamy. "
+"\n\nAdd eggs, 1 at a time, beating after each addition."
+"\n\nStep 2"
+"\n\nSift flours over butter mixture. "
+"\n\nAdd milk. Fold until just combined. "
+"\n\nSpoon into prepared pan"
+"\n\nCore and quarter apples. "
+"\n\nThinly slice. Arrange apples in 2 circles on batter, pressing down gently."
+"\n\nStep 3"
+"\n\nBake for 35 to 40 minutes or until a skewer inserted in the centre comes out clean. "
+"\n\nStand in pan for 10 minutes."
+"\n\nRemove side from pan. "
+"\n\nSlide cake onto a wire rack to cool."
+"\n\nStep 4"
+"\n\nPlace jam in a microwave-safe bowl. "
+"\n\nMicrowave on high (100%) for 30 seconds to 1 minute or until runny."
+"\n\nBrush cake top with jam. Serve with cream.");
        txacake.setEditable(false);
        txacake.setFocus(false);       
        btnprev = new Button("previous");
        btnprev.addActionListener(this);
        btnnxt = new Button("next");
        btnnxt.addActionListener(this);
        
        lblpanetart = new Label("Apple frangipane tart");
        txapanetart= new TextArea("Name: "
+"\n\nApple frangipane tart"
+"\n\nIngredients "
+"\n\n2 sheets frozen shortcrust pastry, partially thawed"
+"\n\n100g butter, softened"
+"\n\n1/2 cup caster sugar"
+"\n\n2 eggs"
+"\n\n1 cup almond meal"
+"\n\n2 tablespoons plain flour"
+"\n\n2 small golden delicious apples, peeled, cored, quartered, thinly sliced"
+"\n\nExtra 10g butter, melted"
+"\n\nIcing sugar mixture, for dusting"
+"\n\nMethod Notes"
+"\n\nStep 1"
+"\n\nPreheat oven to 200C/180C fan-forced. "
+"\n\nLine an 2.5cm-deep, 11cm x 34cm loose-based rectangular fluted tart pan with pastry."
+"\n\nTrim edges."
+"\n\nPrick base all over with a fork. "
+"\n\nPlace on a baking tray. Line pastry with baking paper."
+"\n\nFill with pastry weights or uncooked rice."
+"\n\nStep 2"
+"\n\nBake for 10 minutes. Remove weights or rice and paper. "
+"\n\nBake for another 10 minutes or until pastry is golden."
+"\n\nStep 3"
+"\n\nMeanwhile, using an electric mixer, beat butter and sugar until light and fluffy. "
+"\n\nAdd eggs, 1 at a time, beating until just combined."
+"\n\nStir in almond and flour. "
+"\n\nSpoon almond mixture into pastry case."
+"\n\nLevel top with a spatula. "
+"\n\nArrange apple on top, overlapping slices slightly. "
+"\n\nDrizzle melted butter over apple."
+"\n\nStep 4"
+"\n\nBake tart for 35 minutes or until golden. "
+"\n\nCool in pan. "
+"\n\nServe dusted with icing sugar.");
        txapanetart.setEditable(false);
        txapanetart.setFocus(false);
        btnprev = new Button("previous");
        btnprev.addActionListener(this);
        btnnxt = new Button("next");
        btnnxt.addActionListener(this);
        
        lblandytart= new Label("Apple Normandy tart");
        txaandytart = new TextArea("Name:"
+"\n\nApple Normandy tart"
+"\n\n12 SERVINGS"
+"\n\nIngredients"
+"\n\n1 sheet (25cm) ready-rolled puff pastry"
+"\n\n100g butter, softened"
+"\n\n1/2 cup (100g) caster sugar"
+"\n\n1 egg"
+"\n\n1 cup (100g) almond meal"
+"\n\n1/4 cup (40g) plain flour"
+"\n\n1 tsp ground cinnamon"
+"\n\n2 tbs Calvados"
+"\n\n2 pink lady apples, very thinly sliced crossways"
+"\n\n1 tbs lemon juice"
+"\n\n2 tbs caster sugar, extra"
+"\n\nMethod Notes"
+"\n\nStep 1"
+"\n\nPreheat oven to 200°C."
+"\n\nLine the base and sides of a 22cm square (base measurement) fluted tart tin with removable base with the pastry. "
+"\n\nUse a fork to prick the base all over. Bake in preheated oven for 15 minutes or until puffed and golden."
+"\n\nRemove from oven and use a clean tea towel to press the base of the pastry to flatten. "
+"\n\nSet aside for 15 minutes to cool."
+"\n\nStep 2"
+"\n\nUse an electric mixer to beat the butter and sugar in a bowl until pale and creamy. "
+"\n\nAdd the egg and beat until just combined. Add the almond meal, flour and cinnamon and stir to combine. "
+"\n\nAdd the Calvados and stir until just combined. Spoon the mixture into the prepared pastry case and smooth the surface."
+"\n\nStep 3"
+"\n\nBrush the apple slices with the lemon juice and arrange over the tart. "
+"\n\nSprinkle evenly with the extra sugar. "
+"\n\nBake in oven for 20-25 minutes or until apples begin to curl and filling is set."
+"\n\nRemove from oven and set aside to cool in the pan. "               
+"\n\nServe warm or at room temperature.");
        txaandytart.setEditable(false);
        txaandytart.setFocus(false);
        btnprev = new Button("previous");
        btnprev.addActionListener(this);
        btnnxt = new Button("next");
        btnnxt.addActionListener(this);
        
        lblcoffee = new Label("Cappuccino coffee cake");
        txacoffee = new TextArea("Name:"
+"\n\nCappuccino coffee cake"
+"\n\nServes 8"
+"\n\nIngredients"
+"\n\n225g (8oz) very soft butter, plus more for the tins"
+"\n\n225g (8oz) light sugar or caster sugar"
+"\n\n225g (8oz) self-raising flour"
+"\n\n1 tsp baking powder"
+"\n\n4 large eggs"
+"\n\n4 level tsp instant coffee, dissolved in 1 tbsp boiling water"
+"\n\nFor the coffee icing"
+"\n\n175g (6oz) soft butter"
+"\n\n350g (12oz) icing sugar"
+"\n\n4 level tsp instant coffee, dissolved in 1 tbsp boiling water"
+"\n\nMethod"
+"\n\nPreheat the oven to 180C/160C fan/350F/315F fan/Gas 4. "
+"\n\nButter and line the base of two deep 20cm (8in) sandwich cake tins."
+"\n\nMeasure all the cake ingredients, except the coffee, "
+"\n\ninto a large mixing bowl and beat together until smooth. "
+"\n\nStir in the dissolved coffee until thoroughly blended. "
+"\n\nDivide the mixture evenly between the two prepared tins and level the tops."
+"\n\nBake in the preheated oven for about 25–30 minutes until golden brown, "
+"\n\nshrinking away from the sides of the tin and the sponge springs back when lightly pressed."
+"\n\nTo make the icing, mix the butter and sugar together in a mixing bowl and beat together until smooth."
+"\n\nBeat in the dissolved coffee and divide into four. "
+"\n\nWhen they are cold, slice each cake horizontally in half, giving four layers of cake. "
+"\n\nSit one base on a cake stand and spread with a quarter of the mixture."
+"\n\nContinue layering up with cake and icing so you finish with icing on top and swirl to give an attractive finish."
+"\n\nThe cake can be made and iced up to two days ahead, kept covered in the fridge. Iced or un-iced, it freezes well."
+"\n\nAGA COOKING"
+"\n\nTwo-oven Aga: bake on the grid shelf on the floor of the roasting oven, "
+"\n\nwith the cold sheet on the second set of runners, for about 25 minutes, until golden brown."
+"\n\nThree and four-oven Aga: bake on the grid shelf on the floor of the baking oven for about 25 minutes. "
+"\n\nIf getting too brown, slide the cold sheet on to the second set of runners.");
        txacoffee.setEditable(false);
        txacoffee.setFocus(false);
        btnprev = new Button("previous");
        btnprev.addActionListener(this);
        btnnxt = new Button("next");
        btnnxt.addActionListener(this);
        
        lblvale = new Label("Valentine day plum cakes");
        txavale = new TextArea("Name:"
+"\n\nValentine day plum cakes"
+"\n\nServes 4"
+"\n\nIngredients"
+"\n\n25g butter,melted & cooled"
+"\n\n5 eggs"
+"\n\n5 tablespoons castor sugar"
+"\n\n30g cocoa powder"
+"\n\n1 cup self-raising flour"
+"\n\n250g ripe plums,deseeded"
+"\n\n250ml double thick whipping cream"
+"\n\n1/4 cup grated chocolate" 
+"\n\nMETHOD"
+"\n\nHeat oven to gas mark 5 or 190oF."
+"\n\nPrepare a cake roll tin with butter & lining.Whisk the eggs & sugar untill thick and white."
+"\n\nSift the flour and cocoa over the mixture,and then fold in using a large metal spoon."
+"\n\nFold in the butter.Pour the mixture into a cake tin and level smooth with  a palette knife."
+"\n\nBake for 15 minutes or until the cake feels firm to the touch and springs back when pressed."
+"\n\nTurn the cake out onto a coling rack and peel off the lining paper."
+"\n\nAllow to cool."
+"\n\nMeanwhile,select and reserve 6 plums to decorate."
+"\n\nWhip the cream untill it holds its shape"
+"\n\nUsing a glass to shaoe,cut 12 rounds from the cake."
+"\n\nSet the 6 cake circles on a large tray,spread with cream,and then arrange the stoned plums on top."
+"\n\nTop with a second circle of sponge cake.Spread the rest of the cream and sprinkle with chocolate,"
+"\n\nand then set a plum on each cake to serve."
+"\n\nCooking tips"
+"\n\nWhen cooking Chocolate cakes,dust the baking tins with cocoa powder for extra flavour."
+"\n\nTo preventt sponge cakes from falling in after baking,invert them immediately upon removal from the oven."
+"\n\nFor an extra sweet Valentine`s Day treat,use glace cherries instead of plums.");
        txavale.setEditable(false);
        txavale.setFocus(false);
        btnprev = new Button("previous");
        btnprev.addActionListener(this);
        btnnxt = new Button("next");
        btnnxt.addActionListener(this);
        
        cmdBack = new Command("Back");
        frmRecipes.addCommand(cmdBack);
        frmRecipes.addCommandListener(this);
        frmRecipes.addComponent(lblpie);
        frmRecipes.addComponent(txapie);
        frmRecipes.addComponent(lblapricot);
        frmRecipes.addComponent(txaapricot);
        frmRecipes.addComponent(lblblueberry);
        frmRecipes.addComponent(txablueberry);
        frmRecipes.addComponent(lblcinammon);
        frmRecipes.addComponent(txacinammon);
        frmRecipes.addComponent(lbloat);
        frmRecipes.addComponent(txaoat);
        frmRecipes.addComponent(lblcrumble);
        frmRecipes.addComponent(txacrumble);
        frmRecipes.addComponent(lblcake);
        frmRecipes.addComponent(txacake);
        frmRecipes.addComponent(lblpanetart);
        frmRecipes.addComponent(txapanetart);
        frmRecipes.addComponent(lblandytart);
        frmRecipes.addComponent(txaandytart);
        frmRecipes.addComponent(lblcoffee);
        frmRecipes.addComponent(txacoffee);
        frmRecipes.addComponent(lblvale);
        frmRecipes.addComponent(txavale);
         
       frmRecipes.addComponent(btnnxt);
       frmRecipes.addComponent(btnprev);
        frmRecipes.show(); 
    }  
   public void Halloween(){
        frmHalloween = new Form("Halloween");
        frmHalloween.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
        
        lblhallo = new Label("Treats");
        txahallo = new TextArea("");
        
        cmdBack = new Command("Back");
        frmHalloween.addComponent(lblhallo);
        frmHalloween.addComponent(txahallo);
        frmHalloween.addCommand(cmdBack);
        frmHalloween.addCommandListener(this);
        frmHalloween.show();
    }
   public void Cupcakes(){
    frmCupcakes = new Form("Cupcakes");
    frmCupcakes.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
    try
       { imgBBC = Image.createImage("/BBC.png");
       } catch(IOException x){}
    
    txaBBC = new TextArea("Name: BBC children in Need Cupcakes"
+"\n\nCooking time"
+"\n\nPrep: 15 mins Cook: 25 mins"
+"\n\nMakes 12"
+"\n\nIngredients"
+"\n\n 350g plain flour"
+"\n\n85g golden caster sugar"
+"\n\n85g light sugar"
+"\n\n1 tbsp baking powder"
+"\n\nzest 2 lemons or small oranges"
+"\n\n2 eggs"
+"\n\n284ml carton soured cream"
+"\n\n1 tsp vanilla extract"
+"\n\n100g butter, melted"
+"\n\nMethod"
+"\n\nHeat oven to 200C/fan 180C/ gas 6." 
+"\n\nLine a 12-hole muffin tin with paper cases."
+"\n\nMix the flour, sugars, baking powder and zest." 
+"\n\nIn another bowl, beat the eggs, then stir in the cream, "
+ "\nvanilla and butter and pour into the dry ingredients. "
+"\n\nStir to mix but don’t overbeat. "
+ "\n\nSpoon into cases."
+"\n\nBake for 25 mins. "
+ "\n\nLeave to cool in the tin for 5 mins, then turn out and leave to cool completely on a wire rack."
+"\n\nFor the caramel springs design . "
+ "\n\nGently heat 175g caster sugar and 1 tbsp liquid glucose in a heavy-based pan to form a caramel."
+"\n\nPour a small puddle onto oiled greaseproof paper. "
+ "\n\nWhen cold, roughly crush."
+"\n\nCool the rest until caramel falls in long threads from a spoon, "
+ "\nthen twirl threads round an oiled knife-sharpening steel and slide off to make springs. "
+"\n\nIf the caramel gets too hard, gently reheat." 
+"\n\nUsing a fork, dip 36 hazelnuts in caramel. "
+ "\n\nCool on baking parchment."
+"\n\nLightly whip 170ml double cream and fold in some crushed caramel. "
+"\n\nCut circles from centre of each cake, and cut in half. "
+"\n\nFill the centres with the cream, stick in the halved circles, "
+"\ndust with icing sugar and top with nuts and caramel springs."
+"\n\nFor the peanut butter & jelly popcorn design. "
+"\n\nSoftly whip 170ml double cream with 1 tbsp icing sugar, then stir in 1 tbsp peanut butter. "
+"\n\nHeat 150ml double cream and 4 tsp caster sugar just to boiling, "
+"\ntake off the heat and stir in 85g finely chopped dark chocolate and 1½ tbsp boiling water. "
+"\n\nSlice off cake tops. "
+ "\n\nCut small hollows from the peaks, then coat tops with chocolate icing. "
+"\n\nSpoon raspberry jam and the peanut butter cream into the hollows and spread both over the bases. "
+"\n\nReplace the lids and top with shop-bought caramel popcorn."
+"\n\nFor the chef’s hat design . Melt 175g dark chocolate. "
+"\n\nDraw hat outlines onto baking parchment, then pipe over lines with chocolate. "
+"\n\nSpread more chocolate in to fill the outline. "
+ "\n\nLeave to set. "
+"\n\nMelt 100g white chocolate, then use a small writing nozzle to pipe decoration and ‘chef’ onto hats. "
+"\n\nCut circles from rolled-out ready-to-roll white icing to fit the cakes.");
    cmdBack = new Command("Back");
    
    try
       { imgblackvelvet = Image.createImage("/blackvelvet.png");
       } catch(IOException x){}
    txablackvelvet = new TextArea("Name: Black Velvet Cupcakes"
+"\n\nCooking time"
+"\n\nPrep: 35 mins Cook: 25 mins"
+"\n\nMakes 6"
+"\n\nIngredients"
+"\n\n100g softened butter, plus extra for greasing"
+"\n\n175g light brown soft sugar"
+"\n\n1 egg"
+"\n\n100g self-raising flour"
+"\n\n50g ground almonds"
+"\n\n5 tbsp cocoa, plus a little extra for decorating"
+"\n\n150ml Guinness"
+"\n\nFor the cream"
+"\n\n200ml double cream"
+"\n\n25g icing sugar"
+"\n\nsplash Champagne (optional)"
+"\n\nMethod"
+"\n\nHeat oven to 180C/160C fan/gas 4. "
+"\n\nGrease and line the bases of 6 dariole moulds with baking parchment. "
+"\n\nPut the butter, sugar, egg, flour, ground almonds, bicarbonate, cocoa and Guinness in a mixing bowl. "
+"\n\nBeat together until lump-free. "
+"\n\nDivide between the tins then bake for 20-25 mins until risen and a skewer poked in comes out clean. "
+"\n\nCool for 15 mins, then remove from tins and cool completely – the same way up they baked, don’t turn upside-down."
+"\n\nWhip cream with the icing sugar and splash of Champagne, if using, until thick. "
+"\n\nSpoon a dollop onto the top of each cake and dust with a touch of cocoa. "
+"\n\nServe with glasses of Champagne or Black Velvets for pudding.");
    try
       { imgcampfire = Image.createImage("/campfire.png");
       } catch(IOException x){}
    txacampfire = new TextArea("Campfire cupcakes"
+"\n\nCooking time"
+"\n\nPrep: 10 mins Cook: 20 mins"
+"\n\nMakes 12"
+"\n\nIngredients"
+"\n\n140g light sugar"
+"\n\n100g self-raising flour"
+"\n\n50g cocoa powder"
+"\n\n1 tsp baking powder"
+"\n\n3 eggs"
+"\n\n125ml vegetable oil"
+"\n\n3 tbsp milk"
+"\n\n50g milk chocolate chips"
+"\n\n30g pack mini marshmallows"
+"\n\nMethod"
+"\n\nHeat oven to 180C/160C fan/gas 4. "
+"\n\nTip the sugar, flour, cocoa and baking powder into a large bowl. "
+"\n\nWhisk together the eggs, vegetable oil and milk, then stir together with the dry ingredients until well combined. "
+"\n\nAdd the milk chocolate chips. Place cupcake cases into a 12-hole bun tin. "
+"\n\nDivide the mixture between the cases, then bake for 20 mins until risen and cooked through. "
+"\n\nYou can now leave to cool and store for up to 2 days in an airtight container."
+"\n\nJust before serving (either warm from the oven or cold), arrange marshmallows over the tops of the cakes. "
+"\n\nHeat grill to medium and pop the cakes under it for 30 secs, watching all the time, "
+"\n\njust until the marshmallows are lightly browned. Remove and eat straight away.");
    try
       { imgcelebration = Image.createImage("/celebration.png");
       } catch(IOException x){}
    txacelebration = new TextArea("Celebration cupcakes"
+"\n\nCooking time"
+"\n\nPrep: 2 hrs, 30 mins Cook: 25 mins - 30 mins"
+"\n\nMakes 24"
+"\n\nIngredients"
+"\n\n3 large eggs"
+"\n\n200g natural yogurt"
+"\n\n2 tsp vanilla extract"
+"\n\n250g caster sugar"
+"\n\n280g self-raising flour"
+"\n\n140g ground almonds"
+"\n\n250g pack butter, softened"
+"\n\nTo decorate"
+"\n\n250g pack butter, softened"
+"\n\n300g icing sugar, sifted, plus extra for rolling"
+"\n\n500g pack ready-to-roll icing, for the tops"
+"\n\nfew different food colourings"
+"\n\nextra icing and decorations of your choice "
+"\n\nMethod"
+"\n\nHeat oven to 160C/140C fan/gas 3. "
+"\n\nLine 2 x 12-hole muffin tins with paper cases. "
+"\n\nPut the eggs, yogurt, vanilla, sugar, flour, almonds and butter in your largest mixing bowl "
+"\n\nand beat until smooth and lump-free. Divide between the paper cases and bake for 25-30 mins "
+"\n\n(swapping the trays after 15 mins if you have to use 2 shelves) until a skewer poked into the "
+"\n\ncentre of the cakes comes out clean. Cool on a wire rack. "
+"\n\nThey can be frozen for up to 1 month or kept in an airtight container overnight."
+"\n\nTo decorate, beat the butter and icing sugar together until smooth and light. "
+"\n\nUse a teaspoon to spoon a heaped dollop into the centre of each cake or, for speed, "
+"\n\nspoon into a food bag, cut about 2cm off the corner and pipe a dollop onto each."
+"\n\nDivide the icing into as many colours as you want – plus a piece left to be white, or to brush with glitter, "
+"\n\nif you like. Knead a little colouring into each piece until you have a good colour, "
+"\n\nthen roll out onto a surface lightly dusted with icing sugar. Use a 6.5cm fluted cutter to stamp out rounds "
+"\n\nand press down onto the icing to flatten it a bit. "
+"\n\nRepeat with the other colours to cover all the cakes. "
+"\n\nNow decorate as you wish, or see our ideas, below.");
    try
       { imgChocofudge = Image.createImage("/Chocofudge.png");
       } catch(IOException x){}
    txachocofudge = new TextArea("Chocolate fudge cupcakes"
+"\n\nCooking time"
+"\n\nPrep: 30 mins Cook: 25 mins - 30 mins Plus cooling"
+"\n\nMakes 12"
+"\n\nIngredients"
+"\n\n200g butter"
+"\n\n200g plain chocolate, under 70% cocoa solids is fine"
+"\n\n200g light, soft brown sugar"
+"\n\n2 eggs, beaten"
+"\n\n1 tsp vanilla extract"
+"\n\n250g self-raising flour"
+"\n\nSmarties, sweets and sprinkles, to decorate"
+"\n\nFor the icing"
+"\n\n200g plain chocolate"
+"\n\n100ml double cream, not fridge-cold"
+"\n\n50g icing sugar"
+"\n\nMethod"
+"\n\nHeat oven to 160C/140C fan/gas 3 and line a 12-hole muffin tin with cases. "
+"\n\nGently melt the butter, chocolate, sugar and 100ml hot water together in a large saucepan, "
+"\n\nstirring occasionally, then set aside to cool a little while you weigh the other ingredients."
+"\n\nStir the eggs and vanilla into the chocolate mixture. "
+"\n\nPut the flour into a large mixing bowl, then stir in the chocolate mixture until smooth. "
+"\n\nSpoon into cases until just over three-quarters full (you may have a little mixture leftover), "
+"\n\nthen set aside for 5 mins before putting on a low shelf in the oven and baking for 20-22 mins. Leave to cool."
+"\n\nFor the icing, melt the chocolate in a heatproof bowl over a pan of barely simmering water. "
+"\n\nOnce melted, turn off the heat, stir in the double cream and sift in the icing sugar. "
+"\n\nWhen spreadable, top each cake with some and decorate with your favourite sprinkles and sweets.");
    try
       { imgCocorasp = Image.createImage("/Cocorasp.png");
       } catch(IOException x){}
    txacocorasp = new TextArea("Coconut & raspberry cupcakes"
+"\n\nCooking time"
+"\n\nPrep: 25 mins Cook: 20 mins"
+"\n\nMakes 12-15"
+"\n\nIngredients"
+"\n\n175g self-raising flour"
+"\n\n140g caster sugar"
+"\n\n50g desiccated coconut"
+"\n\n140g butter, softened"
+"\n\n½ tsp vanilla extract"
+"\n\n2 large eggs"
+"\n\n4 tbsp milk"
+"\n\n140g raspberries, fresh or frozen"
+"\n\nFor the frosting"
+"\n\n280g icing sugar"
+"\n\n85g butter, softened"
+"\n\n4 tbsp raspberry coulis, from a bottle or fresh"
+"\n\na little desiccated or shredded coconut, to decorate"
+"\n\nMethod"
+"\n\nHeat oven to 190C/170C fan/gas 5. "
+"\n\nLine a 12-hole muffin tin with deep paper cases or a 15-hole bun tin with cake cases. "
+"\n\nTip all the cake ingredients except the raspberries into a bowl and beat for 1-2 mins until light and fluffy. "
+"\n\nGently fold in the raspberries."
+"\n\nDivide the mixture between the cases and bake for 18-20 mins (add a couple of extra mins for deep cases), "
+"\n\nuntil golden brown and firm to the touch. Leave to cool."
+"\n\nBeat together the icing sugar, butter and raspberry coulis to make a light, fluffy icing. "
+"\n\nSpoon or pipe onto the cakes and sprinkle with coconut.");
    try
       { imgcranberry = Image.createImage("/cranberry.png");
       } catch(IOException x){}
    txacranberry = new TextArea("Cranberry ripple cheese-cupcakes"
+"\n\nCooking time"
+"\n\nPrep: 20 mins Cook: 40 mins"
+"\n\nMakes 12"
+"\n\nIngredients"
+"\n\n250g digestive biscuits"
+"\n\n100g butter, melted"
+"\n\n600g soft cheese"
+"\n\n2 tbsp plain flour"
+"\n\n175g caster sugar"
+"\n\ndash vanilla extract"
+"\n\n2 eggs, plus 1 yolk"
+"\n\nFor the ripple"
+"\n\n400g cranberries, fresh or frozen"
+"\n\n100g icing sugar, plus extra for dusting"
+"\n\nMethod"
+"\n\nFirst make the ripple by putting the cranberries and icing sugar into a shallow pan "
+"\n\nand cooking down over a medium-high heat for 10 mins until the berries collapse into a thick and sticky sauce. "
+"\n\nTurn off the heat and leave to cool."
+"\n\nHeat oven to 180C/160C fan/gas 4. Line a 12-hole muffin tin with 12 muffin cases. "
+"\n\nCrush the biscuits in a plastic bag or whizz in a food processor, then mix with the melted butter. "
+"\n\nDivide between the muffin cases and press down with your fingers. "
+"\n\nIn a separate bowl, mix the soft cheese with the flour, sugar and vanilla extract, "
+"\n\nthen gradually beat in the eggs and yolk until smooth. "
+"\n\nRipple the berry mix through the cheese, being careful not to over-mix. "
+"\n\nSpoon the mix into the cases and smooth the tops with the back of the spoon. "
+"\n\nBake for 30 mins, leave to cool, then chill in the fridge until completely cold."
+"\n\nTo serve, peel the cases off the cakes, if you like, then dust with icing sugar. "
+"\n\nServe piled up on a nice dish for everyone to help themselves.");
    try
       { imgDevils = Image.createImage("/Devils.png");
       } catch(IOException x){}
    txadevils = new TextArea("Devil’s food cupcakes"
+"\n\nCooking time"
+"\n\nPrep: 20 mins Cook: 25 mins"
+"\n\nMakes 16"
+"\n\nIngredients"
+"\n\n50g cocoa powder"
+"\n\n2 large eggs, at room temperature"
+"\n\n1 tsp vanilla extract"
+"\n\n175g plain flour"
+"\n\n½ tsp salt"
+"\n\n½ tsp bicarbonate of soda"
+"\n\n225g caster sugar"
+"\n\n175g unsalted butter, softened"
+"\n\nFor the frosting"
+"\n\n4 tbsp unsalted butter, softened"
+"\n\n200g cream cheese, softened"
+"\n\n1 tsp vanilla"
+"\n\n400g icing sugar, sifted"
+"\n\nsmall handful silver balls or sprinkles, for decoration"
+"\n\nMethod"
+"\n\nHeat oven to 180C/160C fan/gas 4. "
+"\n\nLine 2 muffin tins with 16 paper muffin cases. "
+"\n\nWhisk together 175ml boiling water with the cocoa powder in a medium-sized bowl until smooth. "
+"\n\nAllow the mixture to cool until it reaches room temperature (put it in the freezer to speed it up), "
+"\n\nthen whisk it with the eggs and vanilla."
+"\n\nIn an electric mixer, combine the flour, salt, bicarbonate of soda and sugar. "
+"\n\nMix on a low speed for 30 secs, then add one-third of the cocoa liquid and softened butter. "
+"\n\nKeep mixing on a low speed, then turn up to medium high and beat for 1 min. "
+"\n\nAdd the remaining liquid in 3 batches, beating each one for 30 secs. "
+"\n\nScrape the sides and bottom of the bowl with a spatula and mix one more time. "
+"\n\nFill the cupcake liners three-quarters full and bake for 20 mins, then remove and let them cool in the tin."
+"\n\nTo make the frosting, beat the butter and cream cheese for 2-3 mins until creamy, then add the vanilla. "
+"\n\nWhile still mixing, pour in the sugar in 4 batches, beating each time to fully combine. "
+"\n\nBeat for a further min, then chill for 2 hrs."
+"\n\nSwirl the frosting over the cooled cupcakes and decorate with silver balls or whatever you like.");
    try
       { imgLouise = Image.createImage("/Louise.png");
       } catch(IOException x){}
    txalouise = new TextArea("Little Louise cupcakes"
+"\n\nCooking time"
+"\n\nPrep: 30 mins Cook: 1 hr"
+"\n\nMakes 12"
+"\n\nIngredients"
+"\n\n175g butter, softened"
+"\n\n350g golden or white caster sugar"
+"\n\n1 tsp vanilla extract"
+"\n\n5 eggs, 4 separated"
+"\n\n175g plain flour"
+"\n\n1 tsp baking powder"
+"\n\n150ml milk"
+"\n\n12 tsp raspberry jam - use a firm jam, we used Waitrose Essential Raspberry Jam"
+"\n\n85g desiccated coconut"
+"\n\nMethod"
+"\n\nHeat oven to 180C/160C fan/gas 4 and line a 12-hole muffin tin with cases. "
+"\n\nIn a large mixing bowl beat together the butter, 175g of the sugar and the vanilla extract "
+"\n\nuntil light and fluffy. Beat in the whole egg, followed by the 4 yolks, before briefly beating in the flour, "
+"\n\nbaking powder and milk until smooth. Divide two-thirds of the mix evenly between the cases,"
+"\n\n then top the centre of each with 1 tsp jam. Divide remaining cake mix over the top, "
+"\n\nusing a wet finger to smooth it in place so no jam is visible. "
+"\n\nBake for 18-22 mins until a skewer poked into the centre comes out clean. "
+"\n\nWait until cool enough to handle, then transfer the cakes to a flat baking sheet."
+"\n\nLower oven to 110C/90C fan/gas ¼. Using a large, clean bowl, beat the 4 egg whites until stiff, "
+"\n\nthen continue whisking while you gradually add the remaining 175g sugar. "
+"\n\nBeat until thick and shiny,then fold in the coconut and use spoonfuls of the mixture to top each cake."
+"\n\nBake for 30-35 mins until the outside of the meringue is crisp, then cool before serving.");
    try
       { imgrose = Image.createImage("/rose.png");
       } catch(IOException x){}
    txarose = new TextArea("Little rose & almond cupcakes"
+"\n\nCooking time"
+"\n\nPrep: 1 hr, 15 mins Cook: 22 mins"
+"\n\nMakes 12"
+"\n\nIngredients"
+"\n\n140g self-raising flour"
+"\n\n100g ground almonds"
+"\n\n½ tsp baking powder"
+"\n\n175g caster sugar"
+"\n\n½ tsp almond extract"
+"\n\n3 large eggs"
+"\n\n100g natural yogurt"
+"\n\n175g melted butter"
+"\n\nTo decorate"
+"\n\n100g icing sugar, plus extra for dusting and sticking syrup"
+"\n\n350g ready-roll icing"
+"\n\n175g marzipan"
+"\n\ngreen, yellow and pink food colourings"
+"\n\nMethod"
+"\n\nHeat oven to 180C/160C fan/gas 4 and line a 12-hole muffin tin with cupcake or muffin cases. "
+"\n\nMix the flour, almonds, baking powder and sugar together in a large bowl. "
+"\n\nBeat the almond extract and eggs into the yogurt, then tip this into the dry ingredients with the butter. "
+"\n\nWhisk together until lump-free, then divide between the cases. "
+"\n\nBake for 18-22 mins until a skewer poked in comes out clean. Cool on a wire rack. "
+"\n\nThe cakes will freeze for up to 1 month."
+"\n\nRoll out the marzipan on a surface dusted with a little icing sugar, "
+ "\nto about the thickness of a £1 coin. "
+"\n\nUsing a 6cm round biscuit cutter, stamp out 12 circles, "
+ "\nre-rolling and stamping trimmings if necessary. "
+"\n\nMix enough icing sugar into a cup of water to give a syrupy icing, "
+"\n\nthen brush over backs of the marzipan circles and stick onto cakes."
+"\n\nKnead a little yellow food colouring into one-quarter of the ready-roll icing, "
+"\n\na little pink into another quarter and green into another quarter. "
+"\n\nWrap up the green icing and set aside, "
+"\n\nthen repeat step 2 using a 7cm cutter to stamp out 4 circles each from the pink, "
+"\n\nyellow and white icing, sticking again with syrup."
+"\n\nMix enough water into the 100g icing sugar to give a stiff-ish icing. "
+"\n\nDivide into three, leave one white, and colour the others pink and "
+"\n\nyellow – make these colours a little darker so the roses stand out. "
+"\n\nTransfer icing into small food bags, twist tops to seal and snip off just the tiniest tip "
+"\n\nof one corner on each bag. Pipe spirals on cakes, mixing up the colours. "
+"\n\nPinch small bits of the green icing into leaves, "
+ "\n\nmarking the vein with a toothpick if you like. "
+"\n\nAdd 1, 2 or 3 leaves to each spiral so it looks like a rose "
+ "\n(you can use the syrupy icing to help them "
+"\n\nstick if you need). "
+ "\n\nThe cakes are best eaten within 2 days, and once decorated will keep for 1-2 days "
+"\n\nin airtight containers.");
    try
       { imgpumpkin = Image.createImage("/pumpkin.png");
       } catch(IOException x){}
    txapumpkin = new TextArea("Pumpkin passion cupcakes"
+"\n\nCooking time"
+"\n\nPrep: 15 mins Cook: 25 mins"
+"\n\nMakes 12"
+"\n\nIngredients"
+"\n\n175ml sunflower oil"
+"\n\n175g light muscovado sugar"
+"\n\n3 large eggs"
+"\n\n1 tsp vanilla extract"
+"\n\n200g coarsely grated pumpkin or butternut squash flesh"
+"\n\n100g sultanas"
+"\n\ngrated zest 1 orange"
+"\n\n2 tsp ground cinnamon"
+"\n\n200g self-raising flour"
+"\n\n1 tsp bicarbonate of soda"
+"\n\nFor the frosting"
+"\n\n200g tub full-fat cream cheese"
+"\n\n85g icing sugar"
+"\n\ntoasted chopped pecans to decorate (optional)"
+"\n\nMethod"
+"\n\nHeat oven to 180C/160C fan/gas 4. "
+"\n\nLine a 12-hole muffin tray with paper cases. "
+"\n\nPour the oil into a large bowl and add the sugar, eggs and vanilla. "
+"\n\nBeat together, then add the grated pumpkin, sultanas and orange zest."
+"\n\nStir in the cinnamon, flour and bicarbonate of soda, the mixture will be quite wet. "
+"\n\nSpoon into the cases. Bake for 25 mins until firm and springy to the touch and a skewer "
+"\n\ninserted in the centre of a cupcake comes out clean. "
    + "\n\nCool completely on a wire rack. "
+"\n\nAt this stage you can freeze the cakes for 4 months."
+"\n\nTo make the frosting, beat the cream cheese and sugar together until smooth then spread on top of the cupcakes. "
+"\n\nLeave plain or decorate with toasted pecans. Store in the fridge, "
+"\n\nbut return to room temperature to serve for the best flavour and texture.");
    try
       { imgReindeer = Image.createImage("/Reindeer.png");
       } catch(IOException x){}
    txareindeer = new TextArea("Reindeer cupcakes"
+"\n\nCooking time"
+"\n\nPrep: 15 mins Cook: 30 mins"
+"\n\nMakes 12"
+"\n\nIngredients"
+"\n\n175g butter"
+"\n\n165g caster sugar"
+"\n\n½ tsp natural vanilla extract"
+"\n\n2 eggs, at room temperature"
+"\n\n110g self-raising flour"
+"\n\n150g plain flour"
+"\n\n160ml buttermilk"
+"\n\n500g fondant icing coloured brown, 100g/4oz of it a paler brown"
+"\n\n50g fondant icing coloured red"
+"\n\n25g fondant icing coloured black"
+"\n\ntwigs or wire for the antlers and spaghetti for attaching the ears"
+"\n\nFor the ganache"
+"\n\n140g chocolate, chopped"
+"\n\n75ml double cream"
+"\n\nMethod"
+"\n\nHeat oven to 180C/160C fan/gas 4. Line the holes of a 12-hole muffin tin with paper cases."
+"\n\nBeat the butter, sugar and vanilla in a medium bowl using an electric mixer until light and fluffy."
+"\n\nBeat the eggs into the butter mixture one at a time. Add half the sifted flours and half the buttermilk, "
+"\n\nand mix on low speed until just combined. Mix in the remaining flours and buttermilk."
+"\n\nDivide the mix evenly among the paper cases. Gently smooth the tops (this will help the cupcakes to rise evenly)."
+"\n\nBake for 25-30 mins or until lightly golden and cooked when tested with a skewer. "
+"\n\nAllow to stand for 5 mins in the tin before transferring to a wire rack to cool."
+"\n\nTo make the ganache, put the chocolate in a bowl, bring the cream to a simmer and pour it over the chocolate. "
+"\n\nStir until smooth. Cool until firm."
+"\n\nIce the cupcakes with ganache, then with brown fondant icing. "
+"\n\nUse the rest of the colours for the ears, eye and nose. "
+"\n\nAttach ears to the head by pushing a 3cm piece of spaghetti a little way into the ear, "
+"\n\nthen pushing the other end into the head. See below to download more detailed instructions. "
+"\n\nRemember to warn people that not every element of the decoration is edible");
    
    frmCupcakes.addCommand(cmdBack);  
    frmCupcakes.addComponent(txaBBC);
    frmCupcakes.addComponent(txablackvelvet);
    frmCupcakes.addComponent(txacampfire);
    frmCupcakes.addComponent(txacelebration);
    frmCupcakes.addComponent(txacocorasp);
    frmCupcakes.addComponent(txachocofudge);
    frmCupcakes.addComponent(txacranberry);
    frmCupcakes.addComponent(txadevils); 
    frmCupcakes.addComponent(txalouise);
    frmCupcakes.addComponent(txarose);
    frmCupcakes.addComponent(txapumpkin);
    frmCupcakes.addComponent(txareindeer); 
    frmCupcakes.addCommandListener(this);
    
    frmCupcakes.show();
   }
   public void About(){
        frmAbout = new Form("");
        frmAbout.setLayout(new BoxLayout(BoxLayout.Y_AXIS));     
        
        txaAbout = new TextArea("App Name: \nSpiceIt"
                +"\n\nVersion: \n1.0"
                +"\n\nDeveloper: \nLawrence Njoroge"
                +"\n\nContact: \nsteedapps@gmail.com"
                +"\n\nDescription: \nThis application gives you insight on how to Bake and Cook a wide variety of recipes to your satisfaction.");
        txaAbout.setEditable(false);
        txaAbout.setFocus(false);
        cmdBack = new Command("Back");
        Exit = new Command("Exit");
        
        frmAbout.addComponent(txaAbout);
        frmAbout.addCommand(cmdBack);
        frmAbout.addCommandListener(this);
        frmAbout.addCommand(Exit);
        frmAbout.addCommandListener(this);
        frmAbout.show();
    }
   public void Help(){
       frmHelp = new Form("");
        frmHelp.setLayout(new BoxLayout(BoxLayout.Y_AXIS));     

        txaHelp = new TextArea("This application gives you insight on how to Bake and Cook a wide variety of recipes to your satisfaction."
                +"\n\n To view different recipes ,select the Categories button from the main menu option."
                +"\n\n You will find a list of various recipes."
                +"\n\n Click on their buttons to view their vast display of delicious recipes.");
        txaHelp.setEditable(false);
        txaHelp.setFocus(false);
        cmdBack = new Command("Back");
        Exit = new Command("Exit");
        
        frmHelp.addComponent(txaHelp);
        frmHelp.addCommand(cmdBack);
        frmHelp.addCommandListener(this);
        frmHelp.addCommand(Exit);
        frmHelp.addCommandListener(this);
        frmHelp.show();
       
   }
   public void pauseApp() {
    }    
    public void destroyApp(boolean unconditional) {
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getCommand() == Back){
          Home();
          
        }else if(ae.getCommand() == Exit){
            
            destroyApp(true);
           
           notifyDestroyed();
           
        }else if(ae.getSource() == btnCategories){
           
           Categories();
           
        }else if(ae.getSource() == btnRecipes){
            
            Recipes();
            
       }else if(ae.getSource() == btnAbout){
           
           About();
       
       }else if(ae.getSource() == btnhallo){
           
           Halloween(); 
           
       }else if(ae.getSource() == btnkids){
           
           Kids();
       
       }else if(ae.getSource() == btnmexican){
           
           Mexican();
           
       }else if(ae.getSource() == btncupcakes){
           
           Cupcakes();
           
       }else if(ae.getSource() == btnHelp){
           
           Help();
          
       }else if(ae.getCommand() == cmdBack){
           
           Home();
           
       }}}

    

    
