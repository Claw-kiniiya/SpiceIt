
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
 * @author law
 */
public class pies {
    Form frmPies;
    Label lblbaked,lblapple;
    TextArea txabaked,txaapple;
    Command cmdBack;
    Button next,previous;
    public void Pies(){
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
    
    previous = new Button("previous");
    next = new Button("next");
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
}}
