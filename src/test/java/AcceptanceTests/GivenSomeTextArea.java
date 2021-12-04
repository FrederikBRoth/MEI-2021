/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AcceptanceTests;
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import org.jhotdraw.samples.svg.figures.SVGTextAreaFigure;

/**
 *
 * @author fredd
 */
public class GivenSomeTextArea extends Stage<GivenSomeTextArea>{
  
    @ProvidedScenarioState
    List<SVGTextAreaFigure> textareas = new ArrayList<SVGTextAreaFigure>();
    
    public GivenSomeTextArea textarea_with_fontsize_of_60() {
        textareas.add(new SVGTextAreaFigure());
        textareas.get(0).setFontSize(60);
        
        assertThat(textareas.get(0).getFontSize()).isEqualTo(60.0F);
        return this;
    }
    
}
