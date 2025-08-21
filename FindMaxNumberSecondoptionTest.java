import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    void returnTheElementFromAnArrayOfEqualElements() {
        int[] arr = {2, 2, 2, 2};
        int max = FindMaxNumberSecondOption.findMaxNumber(arr);
        assertEquals(2, max);
    }

    @Test
    void returnTheMaxElementFromAnArrayOfNegativeValues() {
        int[] arr = {-56, -23, -3, -9, -16};
        int max = FindMaxNumberSecondOption.findMaxNumber(arr);
        assertEquals(-3, max);
    }

    @Test
    void throwsExceptionForEmptyArray() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            FindMaxNumberSecondOption.findMaxNumber(new int[]{});
        });
        assertEquals("Array must not be empty", exception.getMessage());
    }

    @Test
    void testFindMaxNumberNullArray() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            FindMaxNumberSecondOption.findMaxNumber(null);
        });
        assertEquals("Array must not be empty", exception.getMessage());
    }

}