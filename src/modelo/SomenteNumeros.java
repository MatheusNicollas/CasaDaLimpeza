package modelo;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class SomenteNumeros extends PlainDocument {
    
    public void insertString(int offset, String str, javax.swing.text.AttributeSet attr) throws BadLocationException{
        super.insertString(offset, str.replaceAll("[^0-9]",""), attr);
    }
}
