package builder.builders;

import java.util.ArrayList;

public class ComplexObject {

    ArrayList<I_Product> co = new ArrayList<>();

    public ComplexObject add(I_Product product) {
        co.add(product);
        return this;
    }

}
