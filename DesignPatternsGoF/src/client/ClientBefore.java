/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import builder.builders.BuilderAIG;
import builder.builders.BuilderCorpo;
import builder.builders.BuilderNolan;
import builder.builders.ComplexObject;

/**
 *
 * @author ennisa
 */
public class ClientBefore {
    
    public static void main (String[] args) {
        // Build my own product
         
        Director d ;
        d = new Director(new BuilderAIG());
        d = new Director(new BuilderCorpo());
        d = new Director(new BuilderNolan());
                
                 
       
           
    }
}
