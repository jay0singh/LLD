package design_patterns.creational.builder;

import java.util.List;

public class OrderRequest {

    // required
    private final String customerId;
    private final String restaurantId;
    private final List<String> items;
    private final String deliveryAddress;

    // optional
    private final String scheduledDeliveryTime;
    private final String specialInstructions;
    private final boolean contactlessDelivery;
    private final boolean cutleryIncluded;
    private final boolean giftWrap;
    private final String couponCode;
    private final double tipAmount;
    private final boolean curbsidePickup;

    OrderRequest(Builder builder) {
        this.customerId = builder.customerId;
        this.restaurantId = builder.restaurantId;
        this.items = builder.items;
        this.deliveryAddress = builder.deliveryAddress;
        this.scheduledDeliveryTime = builder.scheduledDeliveryTime;
        this.specialInstructions = builder.specialInstructions;
        this.contactlessDelivery = builder.contactlessDelivery;
        this.cutleryIncluded = builder.cutleryIncluded;
        this.giftWrap = builder.giftWrap;
        this.couponCode = builder.couponCode;
        this.tipAmount = builder.tipAmount;
        this.curbsidePickup = builder.curbsidePickup;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public List<String> getItems() {
        return items;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getScheduledDeliveryTime() {
        return scheduledDeliveryTime;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }

    public boolean isContactlessDelivery() {
        return contactlessDelivery;
    }

    public boolean isCutleryIncluded() {
        return cutleryIncluded;
    }

    public boolean isGiftWrap() {
        return giftWrap;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public double getTipAmount() {
        return tipAmount;
    }

    public boolean isCurbsidePickup() {
        return curbsidePickup;
    }

    public static class Builder {
        // required
        private final String customerId;
        private final String restaurantId;
        private final List<String> items;
        private final String deliveryAddress;

        // optional
        private String scheduledDeliveryTime;
        private String specialInstructions;
        private boolean contactlessDelivery;
        private boolean cutleryIncluded;
        private boolean giftWrap;
        private String couponCode;
        private double tipAmount;
        private boolean curbsidePickup;

        public Builder(String customerId, String restaurantId, List<String> items, String deliveryAddress) {
            this.customerId = customerId;
            this.restaurantId = restaurantId;
            this.items = items;
            this.deliveryAddress = deliveryAddress;
        }

        public Builder scheduledDeliveryTime(String scheduledDeliveryTime) {
            this.scheduledDeliveryTime = scheduledDeliveryTime;
            return this;
        }

        public Builder specialInstructions(String specialInstructions) {
            this.specialInstructions = specialInstructions;
            return this;
        }

        public Builder contactlessDelivery(boolean contactlessDelivery) {
            this.contactlessDelivery = contactlessDelivery;
            return this;
        }

        public Builder cutleryIncluded(boolean cutleryIncluded) {
            this.cutleryIncluded = cutleryIncluded;
            return this;
        }

        public Builder giftWrap(boolean giftWrap) {
            this.giftWrap = giftWrap;
            return this;
        }

        public Builder couponCode(String couponCode) {
            this.couponCode = couponCode;
            return this;
        }

        public Builder tipAmount(double tipAmount) {
            this.tipAmount = tipAmount;
            return this;
        }

        public Builder curbsidePickup(boolean curbsidePickup) {
            this.curbsidePickup = curbsidePickup;
            return this;
        }

        public OrderRequest build() {
            return new OrderRequest(this);
        }
    }

}
