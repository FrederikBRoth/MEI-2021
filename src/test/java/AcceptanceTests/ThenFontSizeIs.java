/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AcceptanceTests;

import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import static org.assertj.core.api.Assertions.assertThat;
import org.jhotdraw.samples.svg.figures.SVGTextAreaFigure;
/**
 *
 * @author fredd
 */
public class ThenFontSizeIs {
    
    @ExpectedScenarioState
    SVGTextAreaFigure text_with_new_font;
    
    public void the_font_size_is_changed_to_28(){
        the_font_size_is_changed_to(28.0F);
    }
    
    public void the_font_size_is_changed_to(float fontSize){
        assertThat(text_with_new_font.getFontSize()).isEqualTo(fontSize);
    }
}
