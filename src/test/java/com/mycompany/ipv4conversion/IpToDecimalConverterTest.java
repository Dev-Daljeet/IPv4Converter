package com.mycompany.ipv4conversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IpToDecimalConverterTest {

    @Test
    void onlyInstanceShouldBeCreated() {
        System.out.println("onlyInstanceShouldBeCreated");
        IpToDecimalConverter onlyInstance = IpToDecimalConverter.getInstance();
        boolean result = onlyInstance instanceof IpToDecimalConverter;
        boolean expResult = true;
        assertEquals(expResult,result);
    }

    @Test
    void ipShouldBeConvertedToDecimal() {
        System.out.println("ipShouldBeConvertedToDecimal");
        IpToDecimalConverter onlyInstance = IpToDecimalConverter.getInstance();
        String result = onlyInstance.ipToDecimal("192.168.0.111");
        String expResult = "IP address 192.168.0.111 is equal to 3232235631";
        assertEquals(expResult,result);
    }

    @Test
    void errorMessageShouldBeReturned() {
        System.out.println("errorMessageShouldBeReturned");

        IpToDecimalConverter onlyInstance = IpToDecimalConverter.getInstance();

        String resultOfEmptyValue = onlyInstance.ipToDecimal("");
        String expResultOfEmptyValue = "IP address cannot be empty";
        assertEquals(expResultOfEmptyValue,resultOfEmptyValue);

        String resultOfWrongOctetLength = onlyInstance.ipToDecimal("192.168.0");
        String expResultOfWrongOctetLength = "Invalid IP address";
        assertEquals(expResultOfWrongOctetLength,resultOfWrongOctetLength);

        String resultOfWrongOctetValue = onlyInstance.ipToDecimal("192.168.0.500");
        String expResultOfWrongOctetValue = "Invalid IP address";
        assertEquals(expResultOfWrongOctetValue,resultOfWrongOctetValue);
    }
}