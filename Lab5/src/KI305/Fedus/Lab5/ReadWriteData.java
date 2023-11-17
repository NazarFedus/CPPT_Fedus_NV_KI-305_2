package KI305.Fedus.Lab5;

import java.io.IOException;

/**
 * The ReadWriteData interface defines methods for reading and writing results in text and binary formats.
 */
public interface ReadWriteData {
    /**
     * Writes the result to a text file.
     *
     * @param fileName The name of the text file.
     * @throws IOException If an I/O error occurs.
     */
    void writeResultToTxt(String fileName) throws IOException;

    /**
     * Writes the result to a binary file.
     *
     * @param fileName The name of the binary file.
     * @throws IOException If an I/O error occurs.
     */
    void writeResultToBin(String fileName) throws IOException;

    /**
     * Reads the result from a text file.
     *
     * @param fileName The name of the text file.
     * @throws IOException If an I/O error occurs.
     */
    void readResultFromTxt(String fileName) throws IOException;

    /**
     * Reads the result from a binary file.
     *
     * @param fileName The name of the binary file.
     * @throws IOException If an I/O error occurs.
     */
    void readResultFromBin(String fileName) throws IOException;
}
