/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.builders;

/**
 *
 * I will build as follows, and return it to the director who will present it to the client.
 * 
 */
public interface I_BuilderCorpo extends I_Builder {
   public void partA(); 
    
   public ComplexObject getRepresentation();
}
