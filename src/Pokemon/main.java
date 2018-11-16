/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemon;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author Samira
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) throws FileNotFoundException, IOException   {
        // TODO code application logic here
        Fogo f=new Fogo("Charmander",123,12,'f',399,299,222,222,222);
        
        try{
        FileOutputStream arquivo=new  FileOutputStream("ListaPokemons.docx ");
        ObjectOutputStream obj=new ObjectOutputStream(arquivo);
        obj.writeObject(f);
        obj.flush();
         JOptionPane.showMessageDialog(null,"Sucesso");
            
        }
        catch(Exception erro){
            JOptionPane.showMessageDialog(null,"ocorreu um erro"+erro.getMessage());
            
            
        }
        
     
    }
   
    
}
