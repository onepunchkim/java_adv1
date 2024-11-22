package thread.executor.test;

public class OldOrderServiceMain {
    public static void main(String[] args) {
        String orderNo = "Order#1234"; //주문 예시 번호
        OldOrderService oldOrderService = new OldOrderService();
        oldOrderService.order(orderNo);
    }
}
