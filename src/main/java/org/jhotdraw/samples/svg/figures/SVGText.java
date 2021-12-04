/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.samples.svg.figures;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import static org.jhotdraw.draw.AttributeKeys.FONT_SIZE;
import static org.jhotdraw.draw.AttributeKeys.TRANSFORM;
import org.jhotdraw.draw.TextHolderFigure;
import org.jhotdraw.geom.Insets2D;

/**
 *
 * @author fredd
 */
public abstract class SVGText extends SVGAttributedFigure implements TextHolderFigure{
    
    
   public double setFontSize(float size, AffineTransform t) {
        Point2D.Double p = new Point2D.Double(0, size);
        AffineTransform tx = t;
        if (tx != null) {
            try {
                tx.inverseTransform(p, p);
                Point2D.Double p0 = new Point2D.Double(0, 0);
                tx.inverseTransform(p0, p0);
                p.y -= p0.y;
                return p.y;
            } catch (NoninvertibleTransformException ex) {
                ex.printStackTrace();
            }
        }
        return 0;
    }


  
}
