package com.project2.AdminBE.Product;

public class ResponseObject {
    private boolean massage;
    private Object data;

    public ResponseObject() {
    }

    public ResponseObject(boolean massage, Object data) {
        this.massage = massage;
        this.data = data;
    }

    public boolean isMassage() {
        return massage;
    }

    public void setMassage(boolean massage) {
        this.massage = massage;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


}
