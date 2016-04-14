package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Test {
    static Test test = new Test();
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JPanel panel = new JPanel()	{
                ArrayList squares = new ArrayList();
                int squareSize;
                
                {
                    //squares = new ActiveMark[9][9];
                    squareSize = 32;  //32 with x 32 height for each square.
                    setBackground(Color.black);
                    setForeground(Color.black);
                    setPreferredSize(new Dimension(288,288));
                    //populateSquares();
                }
                
                private void populateSquares() {
//                    ArrayList marks = DateTime.marks;
//                    int size = marks.size();
//                    
//                    for(int i=0; i<size; ++i){
//                        squares.add(new ActiveMark())
//                    }
//                    
//                    for(int col = 0; col < squares.length; col++) { //each column.
//                        for(int row = 0; row < squares[0].length; row++) { //each row.
//                            squares[col][row] = new ActiveMark(new Color(new Random().nextInt(256),new Random().nextInt(256),new Random().nextInt(256))
//                                    ,col * squareSize, row * squareSize, 32, 32);
//                        }
//                    }
                }
                
                private void paintSquares(Graphics g) {
                    squares = DateTime.marks;
                    int size = squares.size();
                    
                    for(int i=0; i<size; ++i){
                        ActiveMark square = (ActiveMark) squares.get(i);
                        square.draw(g);
                    }
                    
//                    for (ActiveMark[] square : squares) {
//                        //each column.
//                        for (ActiveMark activity : square){
//                            activity.draw(g);
//                        }
////                            for (int row = 0; row < squares[0].length; row++) {
////                                //each row.
////                                square[row].draw(g);
////                            }
//                    }
                }
                
                @Override
                public void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    paintSquares(g);
                }
            };
            
            //the main window
            JFrame frame = new JFrame("Colored squares.");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(panel);
            frame.setResizable(false);
            frame.pack();
            frame.setVisible(true);
        });//end invokeLater()
        
    }//end main();
}//end class.
