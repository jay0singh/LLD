package design_patterns.creational.abstract_factory;

public class USInvoiceFormatter implements InvoiceFormatter {
    @Override
    public void invoicing() {
        System.out.println("US invoice method");
    }
}
