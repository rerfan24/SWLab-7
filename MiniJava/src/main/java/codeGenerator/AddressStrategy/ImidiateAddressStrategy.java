package codeGenerator.AddressStrategy;

public class ImidiateAddressStrategy implements AddressStrategy{
    @Override
    public String returnString(int num) {
        return "#" + num;
    }
}
