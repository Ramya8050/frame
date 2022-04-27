
    import java.awt.*;
    import javax.swing.*;
    
    
    public class WelcomeFrame
    {
        String message = "WELCOME!!!!!!!!!!!!";
    
        public WelcomeFrame(){
            frame();
        }
        public WelcomeFrame(String message){
            this.message=message;
        }
    
        private void frame() {
            WelcomeFrame j =new WelcomeFrame(message);
            j.setVisible(true);
            j.setLayout(null);
            j.setSize(300,200);
    
        }
    }