package dependencyInversion.bad;

import dependencyInversion.good.XMLReader;

public class UserReader {
    private XMLReader xmlReader;            // What happens if we decide to use JSON format instead of XML format?

    public UserReader(XMLReader xmlReader) {
        this.xmlReader = xmlReader;
    }

    public String getUsername() {
        return xmlReader.getUsername();
    }

}
