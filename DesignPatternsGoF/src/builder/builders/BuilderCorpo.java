/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.builders;
 
/**
 *
 * We have not create a new representation of the complex product.
 */
public class BuilderCorpo implements I_BuilderCorpo {

    ComplexObject co = new ComplexObject();

    public static void main(String[] args) {
        // TODO code application dlogic here
    }

    @Override
    public void partA() {
        System.out.println("INF: Building Supplier Corpo - Adding Part A");
        co.add(new ProductA());
    }

   

    @Override
    public ComplexObject getRepresentation() {
        return co;
    }

    @Override
    public String getName() {
         return "Building Supplier, Corpo Ltd";
    }

}
