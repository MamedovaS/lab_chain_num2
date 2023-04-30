import org.junit.Assert;
import org.junit.Test;

public class FilteredWordsServiceTest {
    private FilteredWordsService service = new FilteredWordsService();
    private String text = "aaarr rrra";

    @Test
    public void shouldFilterTextByRule() {

        Assert.assertEquals("rrra", service.filteredTextByRule(text));
    }

    @Test
    public void shouldReturnEmptyString(){
        
    }



}