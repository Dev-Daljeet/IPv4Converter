package com.mycompany.ipv4conversion;

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
