package advancedDay4Assignment33;

public class StringMock {
    String capacity;

    public StringMock() {
    }

    public StringMock(String capacity) {
        this.capacity = capacity;
    }

    @Deprecated
    public static int search(String string, char searchItem) {
        char[] charArray = string.toCharArray();
        for (int index = 0; index < charArray.length; index++) {
            if (charArray[index] == searchItem)
                return index;
        }
        return -1;
    }

    public static void main(String args[]){
        StringMock sample = new StringMock();
        String test = "Hello Aditya!";
        System.out.println(sample.search(test, 'A'));
    }
}
