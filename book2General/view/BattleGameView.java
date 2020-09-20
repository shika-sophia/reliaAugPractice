package book2General.view;

import javax.swing.JFrame;

public class BattleGameView extends JFrame{

    public static void main(String[] args) {
        BattleGameView frame = new BattleGameView();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //新ウィンドウ(開始x,開始y,横幅width,縦高height)
        frame.setBounds(10, 10, 1200, 700);
        frame.setTitle("BattleGameView");
        frame.setVisible(true);

    }//main()


}//class
