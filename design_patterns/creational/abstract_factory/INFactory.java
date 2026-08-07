package design_patterns.creational.abstract_factory;

public class INFactory implements RegionFactory {

    @Override
    public PackagingStandard regionPackaging() {
        return new INPackagingStandard();
    }

    @Override
    public InvoiceFormatter regionInvoice() {
        return new INInvoiceFormatter();
    }

}
