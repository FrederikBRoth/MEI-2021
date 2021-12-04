/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AcceptanceTests;

/**
 *
 * @author fredd
 */
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import java.util.List;
import org.jhotdraw.samples.svg.figures.SVGTextAreaFigure;


public class WhenChangeFont extends Stage<WhenChangeFont> {
    @ExpectedScenarioState
    List<SVGTextAreaFigure> textareas;
    
    @ProvidedScenarioState
    SVGTextAreaFigure text_with_new_font;
    
    public WhenChangeFont the_user_decreases_the_fontsize_with_32(){
        int reducedFontSize = (int) (textareas.get(0).getFontSize() - 32.0F);
        textareas.get(0).setFontSize(reducedFontSize);
        text_with_new_font = textareas.get(0);
        return this;
    }
}
