package com.mycompany.convertipv4todecimal;

public class IpToDecimalConverter {
    private static IpToDecimalConverter onlyIpToDecimalConverter = null;
    private IpToDecimalConverter()
    {}
    public static IpToDecimalConverter getInstance()
    {
        if (onlyIpToDecimalConverter == null)
        {
            onlyIpToDecimalConverter = new IpToDecimalConverter();
        }
        return onlyIpToDecimalConverter;
    }
    /**
     * Returns the long format of the provided IP address.
     *
     * @param ipAddress the IP address
     * @return the long format of <code>ipAddress</code>
     * @throws IllegalArgumentException if <code>ipAddress</code> is invalid
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
            long ip = 0;
            for (int i = 3; i >= 0; i--) {
                long octet = Long.parseLong(octets[3 - i]);
                if (octet > 255 || octet < 0) {
                    return "Invalid IP address";
                }
                ip |= octet << (i * 8);
            }
            return "IP address "+ipAddress+" is equal to "+ip;
        }
    }
}
