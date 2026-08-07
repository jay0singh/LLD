package design_patterns.creational.abstract_factory;

public interface RegionFactory {
    PackagingStandard regionPackaging();

    InvoiceFormatter regionInvoice();
}
