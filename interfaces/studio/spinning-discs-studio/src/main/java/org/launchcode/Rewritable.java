package org.launchcode;

public interface Rewritable {

    void writeFile(File file);
    void removeFile(File file);
    void reformatDisc();
    void runFile(File file);
}
