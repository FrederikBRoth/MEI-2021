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
import org.jhotdraw.draw.AttributeKey;
import static org.jhotdraw.draw.AttributeKeys.FONT_SIZE;
import static org.jhotdraw.draw.AttributeKeys.TRANSFORM;
import org.jhotdraw.draw.TextHolderFigure;
import org.jhotdraw.geom.Insets2D;

/**
 *
 * @author fredd
 */
public abstract class SVGText extends SVGAttributedFigure implements TextHolderFigure{
    
    
   public void setFontSize(float size, AffineTransform t, AttributeKey<Double> f, SVGText text) {
        Point2D.Double p = new Point2D.Double(0, size);
        AffineTransform tx = t;
        if (tx != null) {
            try {
                tx.inverseTransform(p, p);
                Point2D.Double p0 = new Point2D.Double(0, 0);
                tx.inverseTransform(p0, p0);
                p.y -= p0.y;
            } catch (NoninvertibleTransformException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("tester");
        f.set(text, Math.abs(p.y));
    }
   
   public float getFontSize(AffineTransform t, AttributeKey<Double> f, SVGText text) {
        System.out.println("test123452");
        Point2D.Double p = new Point2D.Double(0, f.get(text));
        AffineTransform tx = t;
        if (tx != null) {
            tx.transform(p, p);
            Point2D.Double p0 = new Point2D.Double(0, 0);
            tx.transform(p0, p0);
            p.y -= p0.y;
        }
        return (float) Math.abs(p.y);
   }


  
}
