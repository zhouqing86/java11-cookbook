module helloworldxml {
    requires java.xml.bind;
    requires java.activation;
    requires com.sun.xml.bind;
    exports com.packt;
    opens com.packt to java.xml.bind;
}