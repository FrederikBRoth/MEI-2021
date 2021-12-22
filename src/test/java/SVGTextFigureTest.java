/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTests;
import org.jhotdraw.samples.svg.figures.SVGTextFigure;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SVGTextFigureTest {
  @Test
  public void defaultFontSize() {
    float defaultFont = 12.0F;
    SVGTextFigure textFigure = new SVGTextFigure();
    float sum = textFigure.getFontSize();
    assertEquals(defaultFont, sum, 0.0002);
  }
  @Test
  public void changeFontSize(){
    float defaultFont = 12.0F;
    SVGTextFigure textFigure = new SVGTextFigure();
    float size = textFigure.getFontSize();
    assertEquals(defaultFont, size, 0.0002);
    textFigure.setFontSize(20);
    size = textFigure.getFontSize();
    assertEquals(20.0F, size, 0.0002);
  }
}