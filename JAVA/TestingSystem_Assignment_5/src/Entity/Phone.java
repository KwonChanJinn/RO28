package Entity;

public class Phone implements IWeapon {

    public void nghe() {
        System.out.println("Điện thoại là để nghe");
    }

    public void goi() {
        System.out.println("Điện thoại dùng để gọi");
    }

    public void guitinnhan() {
        System.out.println("Điện thoại có thể gửi tin nhắn");
    }

    public void nhantinnhan() {
        System.out.println("Điện thoại có thể gửi tin nhắn");
    }

    @Override
    public void tanCongkexau() {

    }
}
