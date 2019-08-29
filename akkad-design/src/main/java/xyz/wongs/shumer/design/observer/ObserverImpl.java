package xyz.wongs.shumer.design.observer;

public class ObserverImpl implements Observer {

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public void see(BaseSubject baseSubject) {
        msg = ((Subject)baseSubject).getMsg();

    }
}