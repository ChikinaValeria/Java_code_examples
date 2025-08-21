import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class FindMaxNumberSecondOptionTest {

    @Test
    void returnTheOnlyElementInASingleElementArray(){
        int[] arr = {47};
        int max = FindMaxNumberSecondOption.findMaxNumber(arr);
        assertEquals(47, max);


    }

    @Test
    void returnTheMaximumElementFromAnArray() {
        int[] arr = {10, 5, 25, 8};
        int max = FindMaxNumberSecondOption.findMaxNumber(arr);
        assertEquals(25, max);
    }
}