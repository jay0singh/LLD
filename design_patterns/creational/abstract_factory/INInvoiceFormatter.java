package design_patterns.creational.abstract_factory;

public class INInvoiceFormatter implements InvoiceFormatter {

    @Override
    public void invoicing() {
        System.out.println("Indian invoice method");
    }

}
