package com.mycompany.ipv4conversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/** Tests the class IpToDecimalConverter.
 * @author Daljeet Singh (Dev-Daljeet)
 * @version 1.0
 */
class IpToDecimalConverterTest {

    IpToDecimalConverter onlyInstance = IpToDecimalConverter.getInstance();

    /** Tests the getInstance() method. Test will pass if onlyInstance is created successfully by getInstance() method.
     */
    @Test
    void onlyInstanceShouldBeCreated() {
        boolean result = onlyInstance instanceof IpToDecimalConverter;
        boolean expResult = true;
        assertEquals(expResult,result);
    }

    /** Tests the ipToDecimal() method. Test will pass if IP address is converted to IP decimal accurately by ipToDecimal() method.
     *  (Note: This test is same as Good test.)
     */
    @Test
    void ipShouldBeConvertedToDecimal() {
        String result = onlyInstance.ipToDecimal("192.168.0.111");
        String expResult = "IP address 192.168.0.111 is equal to 3232235631";
        assertEquals(expResult,result);
    }

    /** Tests the ipToDecimal() method. Test will pass if error message are returned by ipToDecimal() method.
     *  (Note: This test is same as bad test.)
     */
    @Test
    void errorMessageShouldBeReturned() {
        // Inputted value is empty.
        String resultOfEmptyValue = onlyInstance.ipToDecimal("");
        String expResultOfEmptyValue = "IP address cannot be empty";
        assertEquals(expResultOfEmptyValue,resultOfEmptyValue);

        // Octets length is wrong i.e., length is not equal to 4.
        String resultOfWrongOctetLength = onlyInstance.ipToDecimal("192.168.0");
        String expResultOfWrongOctetLength = "Invalid IP address";
        assertEquals(expResultOfWrongOctetLength,resultOfWrongOctetLength);

        // Octet value is wrong i.e., octet value doesn't lies in between 0(inclusive) and 255(inclusive).
        String resultOfWrongOctetValue = onlyInstance.ipToDecimal("192.168.0.500");
        String expResultOfWrongOctetValue = "Invalid IP address";
        assertEquals(expResultOfWrongOctetValue,resultOfWrongOctetValue);
    }
}