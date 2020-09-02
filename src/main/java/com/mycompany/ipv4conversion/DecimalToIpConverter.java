package com.mycompany.ipv4conversion;

/** Represents the IP decimal to IP address converter.
 * (Note: The Singleton pattern has been implemented on this class.)
 * @author Daljeet Singh (Dev-Daljeet)
 * @version 1.0
 */
public class DecimalToIpConverter {

    // the private one and only instance of the class
    private static DecimalToIpConverter onlyDecimalToIpConverter = null;

    /**
     * Private default no-arg constructor which controls the instantiation of the class.
     */
    private DecimalToIpConverter()
    {}

    /** Allocates the memory to the only instance and returns it.
     * @return onlyDecimalToIpConverter An one and only instance of class DecimalToIpConverter.
     */
    public static DecimalToIpConverter getInstance()
    {
        if (onlyDecimalToIpConverter == null)
        {
            onlyDecimalToIpConverter = new DecimalToIpConverter();
        }
        return onlyDecimalToIpConverter;
    }

    /** Returns the 32bit dotted format of the provided IP decimal.
     * @param ipDecimal A String representing the IP decimal.
     * @return A String representing the result of decimal to IP conversion.
     */
    public String decimalToIp(String ipDecimal) {
        if (ipDecimal.isEmpty())
        {
            return "IP Decimal cannot be empty";
        }
        else {
            long ipDecimalLong = Long.parseLong(ipDecimal);
            if (ipDecimalLong > 4294967295L || ipDecimalLong < 0) {
                return "Invalid IP decimal";
            }
            StringBuilder ipAddress = new StringBuilder();
            for (int i = 3; i >= 0; i--) {
                int shift = i * 8;
                ipAddress.append((ipDecimalLong & (0xff << shift)) >> shift);
                if (i > 0) {
                    ipAddress.append(".");
                }
            }
            return "IP Decimal " + ipDecimalLong + " is equal to " + ipAddress.toString();
        }
    }
}
