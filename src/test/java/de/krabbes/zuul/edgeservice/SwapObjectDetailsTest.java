package de.krabbes.zuul.edgeservice;

import org.junit.Test;

public class SwapObjectDetailsTest {

    private static final String WRONG_CONTENT = "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
            "   <soap:Body>\n" +
            "      <ns2:outParameter xmlns:ns2=\"http://schemas.optimalsystems.de/OsEcm/Ws/Types/\" xmlns:ns3=\"http://schemas.optimalsystems.de/OsEcm/Ws/\">\n" +
            "         <ns2:job>\n" +
            "            <ns2:name>dms.GetObjectDetails</ns2:name>\n" +
            "            <ns2:returnCode>0</ns2:returnCode>\n" +
            "            <ns2:parameter xsi:type=\"ns2:Base64Parameter\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
            "               <ns2:name>XML</ns2:name>\n" +
            "               <ns2:value>\n" +
            "                  <xop:Include href=\"cid:6a2f6d0f-b2d6-47ce-b990-1633d0306f92-7@schemas.optimalsystems.de\" xmlns:xop=\"http://www.w3.org/2004/08/xop/include\"/>\n" +
            "               </ns2:value>\n" +
            "            </ns2:parameter>\n" +
            "            <ns2:parameter xsi:type=\"ns2:IntegerParameter\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
            "               <ns2:name>Count</ns2:name>\n" +
            "               <ns2:value>1</ns2:value>\n" +
            "            </ns2:parameter>\n" +
            "         </ns2:job>\n" +
            "      </ns2:outParameter>\n" +
            "   </soap:Body>\n" +
            "</soap:Envelope>\n";

    @Test
    public void test() {
        SwapObjectDetails swapObjectDetails = new SwapObjectDetails();
        String doc = swapObjectDetails.swap(WRONG_CONTENT);
        //no test, just for prototyping
    }

}
