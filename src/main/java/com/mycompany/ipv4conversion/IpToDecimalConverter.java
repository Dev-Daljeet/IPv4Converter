package com.mycompany.ipv4conversion;

/** Represents the IP address to IP decimal converter.
 * (Note: The Singleton pattern has been implemented on this class.)
 * @author Daljeet Singh (Dev-Daljeet)
 * @version 1.0
 */
public class IpToDecimalConverter {

    // the private one and only instance of the class
    private static IpToDecimalConverter onlyIpToDecimalConverter = null;

    /**
     * Private default no-arg constructor which controls the instantiation of the class.
     */
    private IpToDecimalConverter()
    {}

    /** Allocates the memory to the only instance and returns it.
     * @return onlyIpToDecimalConverter An one and only instance of class IpToDecimalConverter.
     */
    public static IpToDecimalConverter getInstance()
    {
        if (onlyIpToDecimalConverter == null)
        {
            onlyIpToDecimalConverter = new IpToDecimalConverter();
        }
        return onlyIpToDecimalConverter;
    }

    /** Returns the decimal format of the provided IP address.
     * @param ipAddress A String representing the IP address.
     * @return A String representing the result of IP to decimal conversion.
     */
    public String ipToDecimal(String ipAddress) {
        if (ipAddress.isEmpty())
        {
            return "IP address cannot be empty";
        }
        else {
            String[] octets = ipAddress.split(java.util.regex.Pattern.quote("."));
            if (octets.length != 4) {
                return "Invalid IP address";
            }
            long ipDecimal = 0;
            for (int i = 3; i >= 0; i--) {
                long octet = Long.parseLong(octets[3 - i]);
                if (octet > 255 || octet < 0) {
                    return "Invalid IP address";
                }
                ipDecimal |= octet << (i * 8);
            }
            return "IP address "+ipAddress+" is equal to "+ipDecimal;
        }
    }
}
