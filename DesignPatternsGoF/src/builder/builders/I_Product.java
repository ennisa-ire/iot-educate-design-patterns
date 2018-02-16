/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.builders;

/**
 *
 * @author ennisa
 */

/*
Product and Product Represenations, as specificed by I_PRoduct.
 */
public interface I_Product {

    public String getName();
}

class ProductA implements I_Product {

    String name;
    String a;
    String b;
    String c;
    String d;

    @Override
    public String getName() {
        return "ProductA";
    }
}

class ProductB implements I_Product {

    String name;
    String x;
    String y;
    String z;

    @Override
    public String getName() {
        return "ProductB";
    }
}

class ProductC implements I_Product {

    String name;
    String d;
    String g;

    @Override
    public String getName() {
        return "ProductC";
    }

}
