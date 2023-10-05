import java.util.*;

public class CartApp {
    public static void main(String[] args) {
        // 상품 목록 생성
        Set<Product> productSet = new HashSet<>();
        // TODO : 상품 클래스를 생성하여 상품목록에 넣는다.

        Product product1 = new Product(1, "productA", 10000);
        Product product2 = new Product(2, "productB", 12000);
        Product product3 = new Product(3, "productC", 30000);
        Product product4 = new Product(1, "productA", 10000);

        productSet.add(product1);
        productSet.add(product2);
        productSet.add(product3);
        productSet.add(product4);

        // 상품 목록 확인
        System.out.println("고유한 상품 목록");
        for (Product product : productSet) {
            System.out.println(product.getName() + " : " + product.getPrice());
        }

        // 장바구니 생성
        Cart myCart = new Cart();
        // TODO : 상품을 장바구니에 추가
        // TODO : 상품을 장바구니에서 제거
        // TODO : 장바구니에 현재 담긴 상품들을 출력 (상품이름, 각 상품의 갯수)

        myCart.addProduct("productA", 3);
        myCart.addProduct("productB", 10);
        myCart.addProduct("productC", 1);

        myCart.removeProduct("productB", 5);
        myCart.removeProduct("productC", 5);

        myCart.showItems();
    }

    public static class Product {
        private long code;
        private String name;
        private int price;

        public long getCode() {
            return code;
        }
        public String getName() {
            return name;
        }
        public int getPrice() {
            return price;
        }

        public Product(long code, String name, int price) {
            this.code = code;
            this.name = name;
            this.price = price;
        }

        @Override
        public int hashCode() {
            final int number = 31;
            int hashCode = 1;

            hashCode = number * hashCode + ((name == null) ? 0 : name.hashCode());
            hashCode = number * hashCode + price;

            return hashCode;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;

            //객체가 null || 클래스 값이 다르면 다른 것
            if (o == null || getClass() != o.getClass()) return false;

            Product product = (Product) o;
            return Objects.equals(name, product.name) && price == product.getPrice();
        }
    }

    public static class Cart {
        private Map<String, Integer> cartItems = new HashMap<>();

        public void addProduct(String productName, Integer count) {
            cartItems.put(productName,cartItems.getOrDefault(productName, 0) + count);
        }

        public void removeProduct(String productName, Integer count) {
            if (cartItems.containsKey(productName)) {
                int productCount = cartItems.get(productName);
                if (productCount > count) {
                    cartItems.put(productName, productCount - count);
                } else {
                    cartItems.remove(productName);
                }
            }
        }

        public void showItems() {
            System.out.println("CartItems");

            for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
                String productName = entry.getKey();
                Integer count = entry.getValue();
                System.out.println(productName + " : " + count + "개");
            }
        }
    }
}