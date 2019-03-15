import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class LoadingBarSplash extends Canvas implements Runnable {
  
   private int canvasWidth, canvasHeight, scrollBar_width = 0;
   private Thread scrollingBarThread = null;   
   private static int SCROLLING_BAR_LEN;
   private Image Loading = null;
   private static final String Load = "/icon.jpeg";
   
   public LoadingBarSplash() {
      
      setFullScreenMode(true);           
    
      /* obtain the height and width dimensions of the canvas */
      canvasWidth = getWidth();
      canvasHeight = getHeight();

      /* load the mathLogo image */
      try {
         Loading = Image.createImage(Load);
      } catch (Exception e) {
         System.out.println("Unable to load splash Image");
      }

      /*
       * SCROLLING_BAR_LEN starts at val1=25 and finishes at canvasWidth-50
       * "subtracting 25 from both sides
       */
      SCROLLING_BAR_LEN = canvasWidth - 50;

      /* create the thread and start it */
      scrollingBarThread = new Thread(this);
      scrollingBarThread.start();     

   }

   /* method that draws a scrolling bar on the screen */
   protected void paint(Graphics g) {
      /* set color to white */
      g.setColor(0, 0, 0);
      /* clear the screen */
      g.fillRect(0, 0, canvasWidth, canvasHeight);
      
      showNotify();

      g.setColor(255, 0, 0);
   g.drawString ("Learn how to cook", getWidth ()/2,  5, Graphics.TOP|Graphics.HCENTER);
      /* draw the image at the center of screen */
      if (Loading != null) {
         int imgH = Loading.getHeight();
         int imgW = Loading.getWidth();
         g.drawImage(Loading, (canvasWidth - imgW) / 2, (canvasHeight - (imgH + imgH / 2)) / 2, Graphics.TOP | Graphics.LEFT);
      }

      /* use a color to draw the scrolling bar */
      g.setColor(0, 255, 0);
      /* calculating the scrollBar_Ypos to be 3/4 of the screenHeight */
      int scrollBar_Ypos = ((canvasHeight * 3) / 4);

      g.fillRect(25, scrollBar_Ypos, scrollBar_width, 8);

      /* draw a blue rectangle around the scrolling bar */
      g.setColor(112,224, 90);
      g.drawRect(25, scrollBar_Ypos, SCROLLING_BAR_LEN, 8);

      /* draw a blue Loading...String below the loadingbar */
      g.setColor(72, 247, 209);
      String barStr = "Loading SpiceIt App......";
      g.drawString(barStr, (canvasWidth - barStr.length()) / 2, scrollBar_Ypos +10, Graphics.HCENTER | Graphics.TOP);

      System.gc();
   }

   /* 
    * method that increments the scrollBar_width to be drawn on the display
    */
   public void run() {
      while (scrollBar_width < SCROLLING_BAR_LEN) {
          System.out.println("SplashScreen  -- scrollBar_width = " + scrollBar_width);
         /* increment the scrollingBar drawn on screen by 2 */
         scrollBar_width = scrollBar_width + 2;

         /*
          * call repaint to redraw the scrolling Bar every time the Width changes
          */
         repaint();

         try {
            /* 
             * pause the thread to allow the user to see the drawing on the screen
             */
            Thread.sleep(50);
         } catch (InterruptedException interupt) {
            System.out.println("Thread Interrupted : " + interupt.getMessage());
         }
      }
   }

   
   protected void showNotify() {
        this.setFullScreenMode(true);
        canvasWidth = this.getWidth();
        canvasHeight = this.getHeight();
    }

   
}
