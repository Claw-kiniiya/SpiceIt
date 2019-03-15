
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
 * @author student
 */
public class breakfast{
    private Form frmbreakfast;
    private TextArea txaburger,txabanana,txaBLT,txaeng,txasausage,txaalmond;
    private Command cmdBack; 

public void breakfast(){
    frmbreakfast = new Form("Breakfast");
    frmbreakfast.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
            
    txaburger = new TextArea("Name: "
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

    txabanana = new TextArea("Name: "
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
    
    txaBLT = new TextArea("Name: "
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
    txaeng = new TextArea("Name: "
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
txasausage = new TextArea("Name: "
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
txaalmond = new TextArea("Name: "
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

frmbreakfast.addComponent(txaburger); 
    frmbreakfast.addComponent(txabanana);
    frmbreakfast.addComponent(txaBLT);
    frmbreakfast.addComponent(txaeng);
    frmbreakfast.addComponent(txasausage);
    frmbreakfast.addComponent(txaalmond);
    frmbreakfast.setBackCommand(cmdBack); 
    frmbreakfast.addCommandListener(cmdBack);
        
    frmbreakfast.show();
}}


