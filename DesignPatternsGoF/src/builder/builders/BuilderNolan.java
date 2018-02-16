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
public class BuilderNolan implements I_BuilderNolans {

    ComplexObject co = new ComplexObject();

    public static void main(String[] args) {
        // TODO code application dlogic here
    }

    @Override
    public void partA() {
        System.out.println("INF: Building Supplier Nolan - Adding Part A");
        co.add(new ProductA());
    }

    @Override
    public void partB() {
        System.out.println("INF: Building Supplier Nolan - Adding Part B");
        co.add(new ProductB());
    }

    @Override
    public void partC() {
        System.out.println("INF: Building Supplier Nolan - Adding Part C");
        co.add(new ProductC());
    }

    @Override
    public ComplexObject getRepresentation() {
        return co;
    }

    @Override
    public String getName() {
         return "Building Supplier, Nolans Ltd";
    }

}
