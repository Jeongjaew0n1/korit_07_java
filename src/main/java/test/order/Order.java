package test.order;

public class Order {
    private int orderId;
    private String productName;
    private String consumerName;
    private int price;
    private int stock;

    private Order(Order.Builder builder) {
        this.orderId = builder.orderId;
        this.productName = builder.productName;
        this.consumerName = builder.consumerName;
        this.price = builder.price;
        this.stock = builder.stock;
    }
    public void showOrderInfo() {
        System.out.println("주문번호: " + orderId);
        System.out.println("상품명: " + productName);
        System.out.println("구매자: " + consumerName);
        System.out.println("가격: " + price);
        System.out.println("수량: " + stock);
    }
    public static class Builder {

        private int orderId;
        private String productName;
        private String consumerName;
        private int price;
        private int stock;

        public Order.Builder orderId(int orderId) {
            this.orderId = orderId;
            return this;
        }

        public Order.Builder productName(String productName) {
            this.productName = productName;
            return this;
        }

        public Order.Builder consumerName(String consumerName) {
            this.consumerName = consumerName;
            return this;
        }

        public Order.Builder price(int price) {
            this.price = price;
            return this;
        }

        public Order.Builder stock(int stock) {
            this.stock = stock;
            return this;
        }

        public Order build() {
            return new Order(this); // this는 Builder 클래스의 인스턴스
        }
    }
}