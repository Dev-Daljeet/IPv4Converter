package com.mycompany.convertipv4todecimal;

public class DecimalToIpConverter {
    private static DecimalToIpConverter onlyDecimalToIpConverter = null;
    private DecimalToIpConverter()
    {}
    public static DecimalToIpConverter getInstance()
    {
        if (onlyDecimalToIpConverter == null)
        {
            onlyDecimalToIpConverter = new DecimalToIpConverter();
        }
        return onlyDecimalToIpConverter;
    }

    /**
     * Returns the 32bit dotted format of the provided long ip.
     *
     * @param ip the long ip
     * @return the 32bit dotted format of <code>ip</code>
     * @throws IllegalArgumentException if <code>ip</code> is invalid
     */
    public String decimalToIp(long ip) {
        // if ip is bigger than 255.255.255.255 or smaller than 0.0.0.0
        if (ip > 4294967295l || ip < 0) {
            return "Invalid IP decimal";
        }
        StringBuilder ipAddress = new StringBuilder();
        for (int i = 3; i >= 0; i--) {
            int shift = i * 8;
            ipAddress.append((ip & (0xff << shift)) >> shift);
            if (i > 0) {
                ipAddress.append(".");
            }
        }
        return "IP Decimal "+ip+" is equal to "+ipAddress.toString();
    }
}
