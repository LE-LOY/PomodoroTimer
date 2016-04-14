//@author LE-LOY

package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class ActiveMark {
    Color color;
    Rectangle rect;
    int width;
    int height;
    
    public ActiveMark(Color color, int x, int y, int width, int height){
        this.color = color;
        this.width = width;
        this.height = height;
        this.rect = new Rectangle(x, y, width, height);
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(rect.x, rect.y, width, height);
    }
}
