
import com.sun.lwuit.Button;
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
 * @author law
 */

public class choco {
    private Form frmChoco;
    private Label lblChoco;
    private TextArea txachip,txachilli,txachoco;
    private Button next,previous;
    
public void choco(){
    frmChoco = new Form("Chocolate Treats");
    frmChoco.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
    lblChoco = new Label("Chocolate");
    txachip = new TextArea("skinny choc-chip bikkies"
+"\nIngredients "
+"60ml (1/4 cup) apple sauce"
+"1 egg"
+"1 tsp vanilla extract"
+"100g Devondale Light Dairy Spread"
+"100g ( 2 cup) raw caster sugar"
+"190g (1 1/4 cups) plain flour"
+"1/2 tsp bicarbonate of soda"
+"90g (1 cup) rolled oats"
+"80g Woolworths Select Dark Chocolate, finely chopped"
+"65g (1/3 cup) sultanas"
+"\nMethod "
+"\nStep 1"
+"Preheat oven to 180°C. Line 2 baking trays with baking paper. "
+ "Whisk apple sauce, egg and vanilla in a jug until combined. "
+ "Use an electric beater to beat spread and sugar in a bowl until pale and creamy. "
+ "Beat in egg mixture."
+"\nStep 2"
+"Sift over the flour and bicarbonate of soda."
+ " Stir until well combined. Stir in the oats, chocolate and sultanas."
+"\nStep 3"
+"Drop tablespoonfuls of mixture, 3cm apart, on lined trays. "
+ "Bake, swapping trays halfway through cooking, for 16-18 minutes or until golden. "
+ "Cool on trays for 5 minutes. Transfer to a wire rack.");
    txachip.setEditable(false);
    txachip.setFocus(false);
    previous = new Button("previous");
    next = new Button("next");
    
 txachilli = new TextArea("Chilli chocolate cookie"
+"Cooking time"
+"Prep:20 mins"
+"Cook:12 mins"
+"Makes 40 cookies"
+"\nIngredients"
+"225g unsalted butter, softened"
+"100g caster sugar"
+"175g dark muscovado sugar"
+"2 tsp vanilla extract"
+"2 eggs, beaten"
+"300g plain flour"
+"50g cocoa powder"
+"1 tsp baking powder"
+"1½ tsp cayenne pepper (less or more to taste)"
+"100g bar dark chilli chocolate, roughly chopped"
+"100g bar white chocolate, roughly chopped"
+"100g bar dark chocolate, roughly chopped"
+"vanilla ice cream"
+"\nMethod"
+"Beat the butter and sugars together, then gradually mix in the vanilla and eggs. "
+ "In another bowl, combine the flour, cocoa, a pinch of salt, "
+ "baking powder and cayenne pepper, then mix these into the butter and fold in all the chocolate."
+"Heat oven to 180C/160C fan/gas 4. "
+ "Place walnut-sized spoonfuls of the mixture on baking sheets lined with baking parchment, "
+ "leaving enough space between so they don’t melt together. "
+ "Bake in batches, for 10-12 mins, depending on how gooey you like your cookies."
+ " Allow to cool on the baking sheets for 1 min before removing to a plate to cool completely. "
+ "Serve with vanilla ice cream.");
    txachilli.setEditable(false);
    txachilli.setFocus(false);
    previous = new Button("previous");
    next = new Button("next");
    
  txachoco = new TextArea("giant choco-chip cookie"
+ "\nIngredients"
+ "4 cups plain flour"
+ "1 1/2 teaspoons bicarbonate of soda"
+ "1 1/2 teaspoons salt"
+ "250g unsalted butter, softened"
+ "1 1/2 cups firmly packed brown sugar"
+ "3/4 cup caster sugar"
+ "3 teaspoons vanilla extract"
+ "2 large eggs"
+ "2 large egg yolks"
+ "3/4 cup thickened cream"
+ "2 x 230g packets milk choc chips or dark choc chips"
+ "750g cream cheese, softened"
+ "1 cup icing sugar mixture"
+ "\nMethod"
+ "\nStep 1"
+ "Preheat oven to 180°C/160°C fan-forced. "
+ "Whisk flour, bicarbonate of soda and salt in a medium bowl. "
+ "Using an electric mixer, beat butter, brown sugar and caster sugar on medium speed "
+ "until light and fluffy. Beat in vanilla, eggs and yolks. "
+ "Reduce speed to low. Beat in flour mixture, in 2 batches, alternating with cream. "
+ "Stir in choc chips."
+ "\nStep 2"
+ "Drop 1 1/4 cups batter onto the centre of a baking tray lined with baking paper. "
+ "Using a spatula, spread into a 20cm circle. "
+ "Bake for 7 to 8 minutes or until edges are pale golden brown. "
+ "Remove from oven. Use a spatula to reshape circle. Return to oven."
+ " Bake for 6 to 7 minutes or until golden brown. Cool slightly on tray. "
+ "Slide a spatula underneath to loosen. Transfer to wire rack. Cool. "
+ "Repeat to make 4 more cookies."
+ "\nStep 3"
+ "Using an electric mixer, beat cream cheese and sugar on medium-high speed until light and fluffy. "
+ "Spread onto 4 cookies. Stack cookies on a serving plate, placing unfrosted cookie on top. "
+ "Chill for at least 20 minutes (or up to 4 hours) until frosting is set. "
+ "Serve at room temperature.");
  txachoco.setEditable(false);
  txachoco.setFocus(false);
    previous = new Button("previous");
    next = new Button("next");
    frmChoco.addComponent(lblChoco);
    frmChoco.addComponent(txachip);
    frmChoco.addComponent(txachilli);
    frmChoco.addComponent(txachoco);
    frmChoco.addComponent(previous);
    frmChoco.addComponent(next);
    frmChoco.show();
}}
