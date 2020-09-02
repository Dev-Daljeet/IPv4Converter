package com.mycompany.ipv4conversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/** Tests the class DecimalToIpConverter.
 * @author Daljeet Singh (Dev-Daljeet)
 * @version 1.0
 */
class DecimalToIpConverterTest {

    private DecimalToIpConverter onlyInstance = DecimalToIpConverter.getInstance();

    /** Tests the getInstance() method. Test will pass if onlyInstance is created successfully by getInstance() method.
     */
    @Test
    void onlyInstanceShouldBeCreated()
    {
        boolean result = onlyInstance instanceof DecimalToIpConverter;
        boolean expResult = true;
        assertEquals(expResult,result);
    }

    /** Tests the decimalToIp() method. Test will pass if IP decimal is converted to IP address accurately by decimalToIp() method.
     *  (Note: This test is same as Good test.)
     */
    @Test
    void decimalShouldBeConvertedToIp()
    {
        String result = onlyInstance.decimalToIp("3232235631");
        String expResult = "IP Decimal 3232235631 is equal to 192.168.0.111";
        assertEquals(expResult,result);
    }

    /** Tests the decimalToIp() method. Test will pass if error message are returned by ipToDecimal() method.
     *  (Note: This test is same as bad test.)
     */
    @Test
    void errorMessageShouldBeReturned()
    {
        // Inputted value is empty.
        String resultOfEmptyValue = onlyInstance.decimalToIp("");
        String expResultOfEmptyValue = "IP Decimal cannot be empty";
        assertEquals(expResultOfEmptyValue,resultOfEmptyValue);

        // Ip decimal value is wrong i.e., value doesn't lies in between 0(inclusive) and 4294967295(inclusive).
        String resultOfWrongDecimalValue = onlyInstance.decimalToIp("4294967296");
        String expResultOfWrongDecimalValue = "Invalid IP decimal";
        assertEquals(expResultOfWrongDecimalValue,resultOfWrongDecimalValue);
    }
}