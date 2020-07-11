/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analexico;

import java.io.File;

/**
 *
 * @author SERGIO
 */
public class Analexico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String path=    "C:/Users/SERGIO/Documents/NetBeansProjects/analexico/src/analexico/Lexer.flex";
 generarLexer(path);
    }
    public static void generarLexer(String path)
    {
        File file=new File(path);
    jflex.Main.generate(file);
    }
        // TODO code application logic here
    }

