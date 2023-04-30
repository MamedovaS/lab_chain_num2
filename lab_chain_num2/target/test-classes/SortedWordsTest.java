import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

class FilteredWordsServiceTest {
    FilteredWordsService service = new FilteredWordsService();
    String text = "aaarr rrra";

    @Test
    void shouldFilterTextByRule() {

        Assert.assertEquals("rrra", service.filteredTextByRule(text));
    }
    //shouldreturnEmptyStrIfnull


}