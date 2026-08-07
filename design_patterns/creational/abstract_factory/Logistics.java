package design_patterns.creational.abstract_factory;

public class Logistics {
    private final PackagingStandard packagingStandard;
    private final InvoiceFormatter invoiceFormatter;

    Logistics(RegionFactory factory) {
        this.invoiceFormatter = factory.regionInvoice();
        this.packagingStandard = factory.regionPackaging();
    }

    void log() {
        invoiceFormatter.invoicing();
        packagingStandard.packaging();
    }
}
