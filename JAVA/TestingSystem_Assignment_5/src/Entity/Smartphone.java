package Entity;

public class Smartphone extends Phone {
    public void sudung3G() {
        System.out.println("Điện thoại thông minh sử dụng được 3/4/5G LTE");
    }

    public void chuphinh() {
        System.out.println("Điện thoại thông minh chụp hình rất đệp");
    }

    @Override
    public void tanCongkexau() {
        System.out.println("Điện thoại thông minh ném hỏng điện thoại mất thêm tiền");
    }

    @Override
    public void nghe() {
        super.nghe();
    }

    @Override
    public void goi() {
        super.goi();
    }

    @Override
    public void guitinnhan() {
        super.guitinnhan();
    }

    @Override
    public void nhantinnhan() {
        super.nhantinnhan();
    }
}
