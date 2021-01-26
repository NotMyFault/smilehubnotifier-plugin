package jenkins.plugins.smilehubnotifier.model;

import com.google.common.base.Objects;

public class Message {

  private String msg;

  public Message() {
  }

  public Message(String messsage) {
    this.msg = messsage;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  @Override
  public String toString() {
    return Objects.toStringHelper(this)
      .add("msg", msg)
      .toString();
  }
}
