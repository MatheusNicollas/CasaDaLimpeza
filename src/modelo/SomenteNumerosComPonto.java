package modelo;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class SomenteNumerosComPonto extends PlainDocument {
    
    @Override
    public void insertString(int offset, String str, javax.swing.text.AttributeSet attr) throws BadLocationException{
        if (str.equals(",")) {
            super.insertString(offset, str.replaceAll(",","."), attr);
        }else{
            super.insertString(offset, str.replaceAll("[^0-9|^.]",""), attr);
        }    
    }
}
