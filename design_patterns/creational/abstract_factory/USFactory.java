package design_patterns.creational.abstract_factory;

public class USFactory implements RegionFactory {

    @Override
    public PackagingStandard regionPackaging() {
        return new USPackagingStandard();
    }

    @Override
    public InvoiceFormatter regionInvoice() {
        return new USInvoiceFormatter();
    }

}
