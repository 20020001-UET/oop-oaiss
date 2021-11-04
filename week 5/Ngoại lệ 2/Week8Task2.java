import java.lang.NullPointerException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.ArithmeticException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Week8Task2 {

    static final String NO_BUG = "Không có lỗi";

    /**
     * nullPointerEx.
     * 
     * @throws NullPointerException
     */
    public static void nullPointerEx() throws NullPointerException {
        throw new NullPointerException();
    }

    /**
     * nullPointerExTest.
     * 
     * @return String
     */
    public static String nullPointerExTest() {
        try {
            nullPointerEx();
            return NO_BUG;
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
    }

    /**
     * arrayIndexOutOfBoundsEx.
     * 
     * @throws ArrayIndexOutOfBoundsException
     */
    public static void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * arrayIndexOutOfBoundsExTest.
     * 
     * @return String
     */
    public static String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
            return NO_BUG;
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array index Out of Bounds";
        }
    }

    /**
     * arithmeticEx.
     * 
     * @throws ArithmeticException
     */
    public static void arithmeticEx() throws ArithmeticException {
        throw new ArithmeticException();
    }

    /**
     * arithmeticExTest.
     * 
     * @return String
     */
    public static String arithmeticExTest() {
        try {
            arithmeticEx();
            return NO_BUG;
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
    }

    /**
     * fileNotFoundEx.
     * 
     * @throws FileNotFoundException
     */
    public static void fileNotFoundEx() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    /**
     * fileNotFoundExTest.
     * 
     * @return String
     */
    public static String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
            return NO_BUG;
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
    }

    /**
     * isEx.
     * 
     * @throws IOException
     */
    public static void isEx() throws IOException {
        throw new IOException();
    }

    /**
     * isExTest.
     * 
     * @return String
     */
    public static String isExTest() {
        try {
            isEx();
            return NO_BUG;
        } catch (IOException e) {
            return "Lỗi IO";
        }
    }
}
