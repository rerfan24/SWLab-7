package codeGenerator;

import codeGenerator.AddressStrategy.DirectAddressStrategy;
import codeGenerator.AddressStrategy.ImidiateAddressStrategy;
import codeGenerator.AddressStrategy.IndirectAddressStrategy;

import static codeGenerator.TypeAddress.*;

/**
 * Created by mohammad hosein on 6/28/2015.
 */

public class Address {
    public int num;
    public varType varType;

    public AddressContext addressContext = new AddressContext();

    public Address(int num, varType varType , TypeAddress... Type) {
        this.num = num;

        if (Type.length == 0 || Type[0] == Direct)
            addressContext.setAddressStrategy(new DirectAddressStrategy());
        else if (Type[0] == Indirect)
            addressContext.setAddressStrategy(new IndirectAddressStrategy());
        else if (Type[0] == Imidiate)
            addressContext.setAddressStrategy(new ImidiateAddressStrategy());

        this.varType = varType;
    }

    public String toString() {
        return addressContext.returnString(num);
    }
}
