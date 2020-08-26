import com.ui.StraightFrame;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] ignored) {
        System.setProperty("sun.java2d.uiScale","1.0");

        UIManager.put("ToolTip.background", new Color(39, 40, 34));
        UIManager.put("ToolTip.border", new Color(0,0,0));
        UIManager.put("ToolTip.font", new Font("tahoma", Font.BOLD, 20));
        UIManager.put("ToolTip.foreground", new Color(85,85,255));

        new Main();
    }

    Main() {
        StraightFrame sf = new StraightFrame(800,600, new ImageIcon("src\\com\\io\\pictures\\defBackground.png"));
        sf.setTitle("StraightShot");

        JLabel desc = new JLabel("<html>An email client by <br/>Mallory Duke and<br/>Nathan Cheshire</html>");
        desc.setForeground(new Color(252, 251, 227));
        desc.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
        desc.setBounds(60,60, 800 - 60 - 60, 400);
        sf.getContentPane().add(desc);

        sf.setVisible(true);
        sf.setLocationRelativeTo(null);
    }
}
