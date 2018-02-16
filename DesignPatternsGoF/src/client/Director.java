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
import builder.builders.I_Builder;

/**
 *
 * Director will deal with Builders
 * 
 */
public class Director {
 
    ComplexObject co ;
    I_Builder builder;

   public Director(I_Builder builder) {
        this.builder = builder;
   }
    
    
   

    
}
