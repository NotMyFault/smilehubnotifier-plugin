package jenkins.plugins.smilehubnotifier.model;

public abstract class Identified implements Comparable<Identified> {
  private String _id;

  public String get_id() {
    return this._id;
  }

  public void set_id(String id) {
    this._id = id;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj != null && obj instanceof Identified) {
      return ((Identified) obj)._id.equals(_id);
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return _id.hashCode();
  }

  @Override
  public String toString() {
    return getClass().getName() + "@" + _id;
  }

  @Override
  public int compareTo(Identified o) {
    return toString().compareTo(o.toString());
  }
}
