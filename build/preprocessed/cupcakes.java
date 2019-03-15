
import com.sun.lwuit.Command;
import com.sun.lwuit.Form;
import com.sun.lwuit.Image;
import com.sun.lwuit.Label;
import com.sun.lwuit.TextArea;
import com.sun.lwuit.layouts.BoxLayout;
import java.io.IOException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author law
 */
public class cupcakes {
    private Form frmCupcakes;
    private Label cupcakes;
    Image imgBBC,imgblackvelvet,imgcampfire,imgcelebration,imgChocofudge,imgCocorasp,imgcranberry,imgDevils,imgLouise,imgrose,imgpumpkin,imgReindeer;
    private TextArea txaBBC,txablackvelvet,txacampfire,txacelebration,txachocofudge,txacocorasp,txacranberry,txadevils,txalouise,txarose,txapumpkin,txareindeer;
    private Command cmdBack;
    
    SpiceIt st;
    Object Cupcakes;
    cupcakes(SpiceIt st){
        this.st=st;
    }
public void Cupcakes(){
    frmCupcakes = new Form("Cupcakes");
    frmCupcakes.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
    try
       { imgBBC = Image.createImage("/BBC.jpg");
       } catch(IOException x){}
    
    txaBBC = new TextArea("Name: BBC children in Need Cupcakes"
+"Cooking time"
+"Prep: 15 mins Cook: 25 mins"
+"Makes 12"
+"Ingredients"
   +" 350g plain flour"
    +"85g golden caster sugar"
    +"85g light sugar"
    +"1 tbsp baking powder"
    +"zest 2 lemons or small oranges"
    +"2 eggs"
    +"284ml carton soured cream"
    +"1 tsp vanilla extract"
    +"100g butter, melted"
+"Method"
    +"Heat oven to 200C/fan 180C/ gas 6." 
    +"Line a 12-hole muffin tin with paper cases."
    +"Mix the flour, sugars, baking powder and zest." 
    +"In another bowl, beat the eggs, then stir in the cream, vanilla and butter and pour into the dry ingredients. "
    + "Stir to mix but don’t overbeat. Spoon into cases."
    +"Bake for 25 mins. Leave to cool in the tin for 5 mins, then turn out and leave to cool completely on a wire rack."
    +"For the caramel springs design . Gently heat 175g caster sugar and 1 tbsp liquid glucose in a heavy-based pan to form a caramel."
        + "Pour a small puddle onto oiled greaseproof paper. When cold, roughly crush."
        + "Cool the rest until caramel falls in long threads from a spoon, then twirl threads round an oiled knifesharpening steel and slide off to make springs. "
        + "If the caramel gets too hard, gently reheat." 
        +"Using a fork, dip 36 hazelnuts in caramel. Cool on baking parchment."
        + "Lightly whip 170ml double cream and fold in some crushed caramel. "
        + "Cut circles from centre of each cake, and cut in half. "
        + "Fill the centres with the cream, stick in the halved circles, "
        + "dust with icing sugar and top with nuts and caramel springs."
    +"For the peanut butter & jelly popcorn design. "
        + "Softly whip 170ml double cream with 1 tbsp icing sugar, then stir in 1 tbsp peanut butter. "
        + "Heat 150ml double cream and 4 tsp caster sugar just to boiling, "
        + "take off the heat and stir in 85g finely chopped dark chocolate and 1½ tbsp boiling water. "
        + "Slice off cake tops. Cut small hollows from the peaks, then coat tops with chocolate icing. "
        + "Spoon raspberry jam and the peanut butter cream into the hollows and spread both over the bases. "
        + "Replace the lids and top with shop-bought caramel popcorn."
    +"For the chef’s hat design . Melt 175g dark chocolate. "
        + "Draw hat outlines onto baking parchment, then pipe over lines with chocolate. "
        + "Spread more chocolate in to fill the outline. Leave to set. "
        + "Melt 100g white chocolate, then use a small writing nozzle to pipe decoration and ‘chef’ onto hats. "
        + "Cut circles from rolled-out ready-to-roll white icing to fit the cakes.");
    cmdBack = new Command("Back");
    
    try
       { imgblackvelvet = Image.createImage("/blackvelvet.jpg");
       } catch(IOException x){}
    txablackvelvet = new TextArea("Name: Black Velvet Cupcakes"
+"Cooking time"
+ "Prep: 35 mins Cook: 25 mins"
+ "Makes 6"
+ "\nIngredients"
    + "100g softened butter, plus extra for greasing"
    + "175g light brown soft sugar"
    + "1 egg"
    + "100g self-raising flour"
    + "50g ground almonds"
    + "5 tbsp cocoa, plus a little extra for decorating"
    + "150ml Guinness"
+ "\nFor the cream"
    + "200ml double cream"
    + "25g icing sugar"
    + "splash Champagne (optional)"
+ "\nMethod"
    + "Heat oven to 180C/160C fan/gas 4. "
    + "Grease and line the bases of 6 dariole moulds with baking parchment. "
    + "Put the butter, sugar, egg, flour, ground almonds, bicarbonate, cocoa and Guinness in a mixing bowl. "
    + "Beat together until lump-free. "
    + "Divide between the tins then bake for 20-25 mins until risen and a skewer poked in comes out clean. "
    + "Cool for 15 mins, then remove from tins and cool completely – the same way up they baked, don’t turn upside-down."
    + "Whip cream with the icing sugar and splash of Champagne, if using, until thick. "
    + "Spoon a dollop onto the top of each cake and dust with a touch of cocoa. "
    + "Serve with glasses of Champagne or Black Velvets for pudding.");
    try
       { imgcampfire = Image.createImage("/campfire.jpg");
       } catch(IOException x){}
    txacampfire = new TextArea("Campfire cupcakes"
+"Cooking time"
+"Prep: 10 mins Cook: 20 mins"
+"Makes 12"
+"\nIngredients"
    +"140g light sugar"
    +"100g self-raising flour"
    +"50g cocoa powder"
    +"1 tsp baking powder"
    +"3 eggs"
    +"125ml vegetable oil"
    +"3 tbsp milk"
    +"50g milk chocolate chips"
    +"30g pack mini marshmallows"
+"\nMethod"
    +"Heat oven to 180C/160C fan/gas 4. "
    + "Tip the sugar, flour, cocoa and baking powder into a large bowl. "
    + "Whisk together the eggs, vegetable oil and milk, then stir together with the dry ingredients until well combined. "
    + "Add the milk chocolate chips. Place cupcake cases into a 12-hole bun tin. "
    + "Divide the mixture between the cases, then bake for 20 mins until risen and cooked through. "
    + "You can now leave to cool and store for up to 2 days in an airtight container."
    +"Just before serving (either warm from the oven or cold), arrange marshmallows over the tops of the cakes. "
    + "Heat grill to medium and pop the cakes under it for 30 secs, watching all the time, "
    + "just until the marshmallows are lightly browned. Remove and eat straight away.");
    try
       { imgcelebration = Image.createImage("/celebration.jpg");
       } catch(IOException x){}
    txacelebration = new TextArea("Celebration cupcakes"
+"Cooking time"
+"Prep: 2 hrs, 30 mins Cook: 25 mins - 30 mins"
+"Makes 24"
+"\nIngredients"
    +"3 large eggs"
    +"200g natural yogurt"
    +"2 tsp vanilla extract"
    +"250g caster sugar"
    +"280g self-raising flour"
    +"140g ground almonds"
    +"250g pack butter, softened"
+"\nTo decorate"
    +"250g pack butter, softened"
    +"300g icing sugar, sifted, plus extra for rolling"
    +"500g pack ready-to-roll icing, for the tops"
    +"few different food colourings"
    +"extra icing and decorations of your choice "
+"\nMethod"
    +"Heat oven to 160C/140C fan/gas 3. "
    + "Line 2 x 12-hole muffin tins with paper cases. "
    + "Put the eggs, yogurt, vanilla, sugar, flour, almonds and butter in your largest mixing bowl "
    + "and beat until smooth and lump-free. Divide between the paper cases and bake for 25-30 mins "
    + "(swapping the trays after 15 mins if you have to use 2 shelves) until a skewer poked into the "
    + "centre of the cakes comes out clean. Cool on a wire rack. "
    + "They can be frozen for up to 1 month or kept in an airtight container overnight."
    +"To decorate, beat the butter and icing sugar together until smooth and light. "
    + "Use a teaspoon to spoon a heaped dollop into the centre of each cake or, for speed, "
    + "spoon into a food bag, cut about 2cm off the corner and pipe a dollop onto each."
    +"Divide the icing into as many colours as you want – plus a piece left to be white, or to brush with glitter, "
    + "if you like. Knead a little colouring into each piece until you have a good colour, "
    + "then roll out onto a surface lightly dusted with icing sugar. Use a 6.5cm fluted cutter to stamp out rounds "
    + "and press down onto the icing to flatten it a bit. "
    + "Repeat with the other colours to cover all the cakes. "
    + "Now decorate as you wish, or see our ideas, below.");
    try
       { imgChocofudge = Image.createImage("/Chocofudge.jpg");
       } catch(IOException x){}
    txachocofudge = new TextArea("Chocolate fudge cupcakes"
+"Cooking time"
+"Prep: 30 mins Cook: 25 mins - 30 mins Plus cooling"
+"Makes 12"
+"\nIngredients"
    +"200g butter"
    +"200g plain chocolate, under 70% cocoa solids is fine"
    +"200g light, soft brown sugar"
    +"2 eggs, beaten"
    +"1 tsp vanilla extract"
    +"250g self-raising flour"
    +"Smarties, sweets and sprinkles, to decorate"
+"\nFor the icing"
    +"200g plain chocolate"
    +"100ml double cream, not fridge-cold"
    +"50g icing sugar"
+"\nMethod"
    +"Heat oven to 160C/140C fan/gas 3 and line a 12-hole muffin tin with cases. "
    + "Gently melt the butter, chocolate, sugar and 100ml hot water together in a large saucepan, "
    + "stirring occasionally, then set aside to cool a little while you weigh the other ingredients."
    +"Stir the eggs and vanilla into the chocolate mixture. "
    + "Put the flour into a large mixing bowl, then stir in the chocolate mixture until smooth. "
    + "Spoon into cases until just over three-quarters full (you may have a little mixture leftover), "
    + "then set aside for 5 mins before putting on a low shelf in the oven and baking for 20-22 mins. Leave to cool."
    +"For the icing, melt the chocolate in a heatproof bowl over a pan of barely simmering water. "
    + "Once melted, turn off the heat, stir in the double cream and sift in the icing sugar. "
    + "When spreadable, top each cake with some and decorate with your favourite sprinkles and sweets.");
    try
       { imgCocorasp = Image.createImage("/cocorasp.jpg");
       } catch(IOException x){}
    txacocorasp = new TextArea("Coconut & raspberry cupcakes"
+"Cooking time"
+"Prep: 25 mins Cook: 20 mins"
+"Makes 12-15"
+"\nIngredients"
    +"175g self-raising flour"
    +"140g caster sugar"
    +"50g desiccated coconut"
    +"140g butter, softened"
    +"½ tsp vanilla extract"
    +"2 large eggs"
    +"4 tbsp milk"
    +"140g raspberries, fresh or frozen"
+"\nFor the frosting"
    +"280g icing sugar"
    +"85g butter, softened"
    +"4 tbsp raspberry coulis, from a bottle or fresh"
    +"a little desiccated or shredded coconut, to decorate"
+"\nMethod"
    + "Heat oven to 190C/170C fan/gas 5. "
    + "Line a 12-hole muffin tin with deep paper cases or a 15-hole bun tin with cake cases. "
    + "Tip all the cake ingredients except the raspberries into a bowl and beat for 1-2 mins until light and fluffy. "
    + "Gently fold in the raspberries."
    + "Divide the mixture between the cases and bake for 18-20 mins (add a couple of extra mins for deep cases), "
    + "until golden brown and firm to the touch. Leave to cool."
    + "Beat together the icing sugar, butter and raspberry coulis to make a light, fluffy icing. "
    + "Spoon or pipe onto the cakes and sprinkle with coconut.");
    try
       { imgcranberry = Image.createImage("/cranberry.jpg");
       } catch(IOException x){}
    txacranberry = new TextArea("Cranberry ripple cheese-cupcakes"
+"Cooking time"
+"Prep: 20 mins Cook: 40 mins"
+"Makes 12"
+"\nIngredients"
    +"250g digestive biscuits"
    +"100g butter, melted"
    +"600g soft cheese"
    +"2 tbsp plain flour"
    +"175g caster sugar"
    +"dash vanilla extract"
    +"2 eggs, plus 1 yolk"
+"\nFor the ripple"
    +"400g cranberries, fresh or frozen"
    +"100g icing sugar, plus extra for dusting"
+"\nMethod"
    +"First make the ripple by putting the cranberries and icing sugar into a shallow pan "
    + "and cooking down over a medium-high heat for 10 mins until the berries collapse into a thick and sticky sauce. "
    + "Turn off the heat and leave to cool."
    + "Heat oven to 180C/160C fan/gas 4. Line a 12-hole muffin tin with 12 muffin cases. "
    + "Crush the biscuits in a plastic bag or whizz in a food processor, then mix with the melted butter. "
    + "Divide between the muffin cases and press down with your fingers. "
    + "In a separate bowl, mix the soft cheese with the flour, sugar and vanilla extract, "
    + "then gradually beat in the eggs and yolk until smooth. "
    + "Ripple the berry mix through the cheese, being careful not to over-mix. "
    + "Spoon the mix into the cases and smooth the tops with the back of the spoon. "
    + "Bake for 30 mins, leave to cool, then chill in the fridge until completely cold."
    + "To serve, peel the cases off the cakes, if you like, then dust with icing sugar. "
    + "Serve piled up on a nice dish for everyone to help themselves.");
    try
       { imgDevils = Image.createImage("/Devils.jpg");
       } catch(IOException x){}
    txadevils = new TextArea("Devil’s food cupcakes"
+"Cooking time"
+"Prep: 20 mins Cook: 25 mins"
+"Makes 16"
+"\nIngredients"
    +"50g cocoa powder"
    +"2 large eggs, at room temperature"
    +"1 tsp vanilla extract"
    +"175g plain flour"
    +"½ tsp salt"
    +"½ tsp bicarbonate of soda"
    +"225g caster sugar"
    +"175g unsalted butter, softened"
+"\nFor the frosting"
    +"4 tbsp unsalted butter, softened"
    +"200g cream cheese, softened"
    +"1 tsp vanilla"
    +"400g icing sugar, sifted"
    +"small handful silver balls or sprinkles, for decoration"
+"\nMethod"
    +"Heat oven to 180C/160C fan/gas 4. "
    + "Line 2 muffin tins with 16 paper muffin cases. "
    + "Whisk together 175ml boiling water with the cocoa powder in a medium-sized bowl until smooth. "
    + "Allow the mixture to cool until it reaches room temperature (put it in the freezer to speed it up), "
    + "then whisk it with the eggs and vanilla."
    +"In an electric mixer, combine the flour, salt, bicarbonate of soda and sugar. "
    + "Mix on a low speed for 30 secs, then add one-third of the cocoa liquid and softened butter. "
    + "Keep mixing on a low speed, then turn up to medium high and beat for 1 min. "
    + "Add the remaining liquid in 3 batches, beating each one for 30 secs. "
    + "Scrape the sides and bottom of the bowl with a spatula and mix one more time. "
    + "Fill the cupcake liners three-quarters full and bake for 20 mins, then remove and let them cool in the tin."
    +"To make the frosting, beat the butter and cream cheese for 2-3 mins until creamy, then add the vanilla. "
    + "While still mixing, pour in the sugar in 4 batches, beating each time to fully combine. "
    + "Beat for a further min, then chill for 2 hrs."
    +"Swirl the frosting over the cooled cupcakes and decorate with silver balls or whatever you like.");
    try
       { imgLouise = Image.createImage("/Louise.jpg");
       } catch(IOException x){}
    txalouise = new TextArea("Little Louise cupcakes"
+"Cooking time"
+"Prep: 30 mins Cook: 1 hr"
+"Makes 12"
+"\nIngredients"
    +"175g butter, softened"
    +"350g golden or white caster sugar"
    +"1 tsp vanilla extract"
    +"5 eggs, 4 separated"
    +"175g plain flour"
    +"1 tsp baking powder"
    +"150ml milk"
    +"12 tsp raspberry jam - use a firm jam, we used Waitrose Essential Raspberry Jam"
    +"85g desiccated coconut"
+"\nMethod"
    +"Heat oven to 180C/160C fan/gas 4 and line a 12-hole muffin tin with cases. "
    + "In a large mixing bowl beat together the butter, 175g of the sugar and the vanilla extract "
    + "until light and fluffy. Beat in the whole egg, followed by the 4 yolks, before briefly beating in the flour, "
    + "baking powder and milk until smooth. Divide two-thirds of the mix evenly between the cases,"
    + " then top the centre of each with 1 tsp jam. Divide remaining cake mix over the top, "
    + "using a wet finger to smooth it in place so no jam is visible. "
    + "Bake for 18-22 mins until a skewer poked into the centre comes out clean. "
    + "Wait until cool enough to handle, then transfer the cakes to a flat baking sheet."
    +"Lower oven to 110C/90C fan/gas ¼. Using a large, clean bowl, beat the 4 egg whites until stiff, "
    + "then continue whisking while you gradually add the remaining 175g sugar. "
    + "Beat until thick and shiny,then fold in the coconut and use spoonfuls of the mixture to top each cake."
    + "Bake for 30-35 mins until the outside of the meringue is crisp, then cool before serving.");
    try
       { imgrose = Image.createImage("/rose.jpg");
       } catch(IOException x){}
    txarose = new TextArea("Little rose & almond cupcakes"
+"Cooking time"
+"Prep: 1 hr, 15 mins Cook: 22 mins"
+"Makes 12"
+"\nIngredients"
    +"140g self-raising flour"
    +"100g ground almonds"
    +"½ tsp baking powder"
    +"175g caster sugar"
    +"½ tsp almond extract"
    +"3 large eggs"
    +"100g natural yogurt"
    +"175g melted butter"
+"\nTo decorate"
    +"100g icing sugar, plus extra for dusting and sticking syrup"
    +"350g ready-roll icing"
    +"175g marzipan"
    +"green, yellow and pink food colourings"
+"\nMethod"
    + "Heat oven to 180C/160C fan/gas 4 and line a 12-hole muffin tin with cupcake or muffin cases. "
    + "Mix the flour, almonds, baking powder and sugar together in a large bowl. "
    + "Beat the almond extract and eggs into the yogurt, then tip this into the dry ingredients with the butter. "
    + "Whisk together until lump-free, then divide between the cases. "
    + "Bake for 18-22 mins until a skewer poked in comes out clean. Cool on a wire rack. "
    + "The cakes will freeze for up to 1 month."
    + "Roll out the marzipan on a surface dusted with a little icing sugar, to about the thickness of a £1 coin. "
    + "Using a 6cm round biscuit cutter, stamp out 12 circles, re-rolling and stamping trimmings if necessary. "
    + "Mix enough icing sugar into a cup of water to give a syrupy icing, "
    + "then brush over backs of the marzipan circles and stick onto cakes."
    + "Knead a little yellow food colouring into one-quarter of the ready-roll icing, "
    + "a little pink into another quarter and green into another quarter. "
    + "Wrap up the green icing and set aside, "
    + "then repeat step 2 using a 7cm cutter to stamp out 4 circles each from the pink, "
    + "yellow and white icing, sticking again with syrup."
    + "Mix enough water into the 100g icing sugar to give a stiff-ish icing. "
    + "Divide into three, leave one white, and colour the others pink and "
    + "yellow – make these colours a little darker so the roses stand out. "
    + "Transfer icing into small food bags, twist tops to seal and snip off just the tiniest tip "
    + "of one corner on each bag. Pipe spirals on cakes, mixing up the colours. "
    + "Pinch small bits of the green icing into leaves, marking the vein with a toothpick if you like. "
    + "Add 1, 2 or 3 leaves to each spiral so it looks like a rose (you can use the syrupy icing to help them "
    + "stick if you need). The cakes are best eaten within 2 days, and once decorated will keep for 1-2 days "
    + "in airtight containers.");
    try
       { imgpumpkin = Image.createImage("/pumpkin.png");
       } catch(IOException x){}
    txapumpkin = new TextArea("Pumpkin passion cupcakes"
+"Cooking time"
+"Prep: 15 mins Cook: 25 mins"
+"Makes 12"
+"\nIngredients"
    +"175ml sunflower oil"
    +"175g light muscovado sugar"
    +"3 large eggs"
    +"1 tsp vanilla extract"
    +"200g coarsely grated pumpkin or butternut squash flesh"
    +"100g sultanas"
    +"grated zest 1 orange"
    +"2 tsp ground cinnamon"
    +"200g self-raising flour"
    +"1 tsp bicarbonate of soda"
+"\nFor the frosting"
    +"200g tub full-fat cream cheese"
    +"85g icing sugar"
    +"toasted chopped pecans to decorate (optional)"
+"\nMethod"
    + "Heat oven to 180C/160C fan/gas 4. "
    + "Line a 12-hole muffin tray with paper cases. "
    + "Pour the oil into a large bowl and add the sugar, eggs and vanilla. "
    + "Beat together, then add the grated pumpkin, sultanas and orange zest."
    + "Stir in the cinnamon, flour and bicarbonate of soda, the mixture will be quite wet. "
    + "Spoon into the cases. Bake for 25 mins until firm and springy to the touch and a skewer "
    + "inserted in the centre of a cupcake comes out clean. Cool completely on a wire rack. "
    + "At this stage you can freeze the cakes for 4 months."
    + "To make the frosting, beat the cream cheese and sugar together until smooth then spread on top of the cupcakes. "
    + "Leave plain or decorate with toasted pecans. Store in the fridge, "
    + "but return to room temperature to serve for the best flavour and texture.");
    try
       { imgReindeer = Image.createImage("/Reindeer.png");
       } catch(IOException x){}
    txareindeer = new TextArea("Reindeer cupcakes"
+"Cooking time"
+"Prep: 15 mins Cook: 30 mins"
+"Makes 12"
+"\nIngredients"
    +"175g butter"
    +"165g caster sugar"
    +"½ tsp natural vanilla extract"
    +"2 eggs, at room temperature"
    +"110g self-raising flour"
    +"150g plain flour"
    +"160ml buttermilk"
    +"500g fondant icing coloured brown, 100g/4oz of it a paler brown"
    +"50g fondant icing coloured red"
    +"25g fondant icing coloured black"
    +"twigs or wire for the antlers and spaghetti for attaching the ears"
+"\nFor the ganache"
    +"140g chocolate, chopped"
    +"75ml double cream"
+"\nMethod"
    + "Heat oven to 180C/160C fan/gas 4. Line the holes of a 12-hole muffin tin with paper cases."
    + "Beat the butter, sugar and vanilla in a medium bowl using an electric mixer until light and fluffy."
    + "Beat the eggs into the butter mixture one at a time. Add half the sifted flours and half the buttermilk, "
    + "and mix on low speed until just combined. Mix in the remaining flours and buttermilk."
    + "Divide the mix evenly among the paper cases. Gently smooth the tops (this will help the cupcakes to rise evenly)."
    + "Bake for 25-30 mins or until lightly golden and cooked when tested with a skewer. "
    + "Allow to stand for 5 mins in the tin before transferring to a wire rack to cool."
    + "To make the ganache, put the chocolate in a bowl, bring the cream to a simmer and pour it over the chocolate. "
    + "Stir until smooth. Cool until firm."
    + "Ice the cupcakes with ganache, then with brown fondant icing. "
    + "Use the rest of the colours for the ears, eye and nose. "
    + "Attach ears to the head by pushing a 3cm piece of spaghetti a little way into the ear, "
    + "then pushing the other end into the head. See below to download more detailed instructions. "
    + "Remember to warn people that not every element of the decoration is edible!");
    
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
    frmCupcakes.setBackCommand(cmdBack); 
    frmCupcakes.addCommandListener(cmdBack);
    
    frmCupcakes.show();
    
}}


