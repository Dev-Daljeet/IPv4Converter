package com.mycompany.ipv4conversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalToIpConverterTest {

    @Test
    void onlyInstanceShouldBeCreated() {
        System.out.println("onlyInstanceShouldBeCreated");
        DecimalToIpConverter onlyInstance = DecimalToIpConverter.getInstance();
        boolean result = onlyInstance instanceof DecimalToIpConverter;
        boolean expResult = true;
        assertEquals(expResult,result);
    }

    @Test
    void decimalShouldBeConvertedToIp() {
        System.out.println("decimalShouldBeConvertedToIp");
        DecimalToIpConverter onlyInstance = DecimalToIpConverter.getInstance();
        String result = onlyInstance.decimalToIp("3232235631");
        String expResult = "IP Decimal 3232235631 is equal to 192.168.0.111";
        assertEquals(expResult,result);
    }

    @Test
    void errorMessageShouldBeReturned()
    {
        System.out.println("errorMessageShouldBeReturned");

        DecimalToIpConverter onlyInstance = DecimalToIpConverter.getInstance();

        String resultOfEmptyValue = onlyInstance.decimalToIp("");
        String expResultOfEmptyValue = "IP Decimal cannot be empty";
        assertEquals(expResultOfEmptyValue,resultOfEmptyValue);

        String resultOfWrongDecimalValue = onlyInstance.decimalToIp("4294967296");
        String expResultOfWrongDecimalValue = "Invalid IP decimal";
        assertEquals(expResultOfWrongDecimalValue,resultOfWrongDecimalValue);
    }
}