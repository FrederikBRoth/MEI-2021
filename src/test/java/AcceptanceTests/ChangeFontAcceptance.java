/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AcceptanceTests;
import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.Test;

/**
 *
 * @author fredd
 */

public class ChangeFontAcceptance extends ScenarioTest<GivenSomeTextArea, WhenChangeFont, ThenFontSizeIs>{
    
    @Test
    public void change_font_size() {
        given().textarea_with_fontsize_of_60();
        when().the_user_decreases_the_fontsize_with_32();
        then().the_font_size_is_changed_to_28();
    }
    
}
    


