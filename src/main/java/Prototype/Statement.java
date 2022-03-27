package Prototype;

import java.util.List;

public class Statement implements Cloneable {

  private String sql;
  private List<String> parameters;
  private Record record;

  public Statement(String sql, List<String> parameters, Record record) {
    this.sql = sql;
    this.parameters = parameters;
    this.record = record;
  }

  public String getSql() {
    return sql;
  }

  public void setSql(String sql) {
    this.sql = sql;
  }

  public List<String> getParameters() {
    return parameters;
  }

  public void setParameters(List<String> parameters) {
    this.parameters = parameters;
  }

  public Record getRecord() {
    return record;
  }

  public void setRecord(Record record) {
    this.record = record;
  }

  @Override
  public Statement clone() {
    try {
      Statement clone = (Statement) super.clone();
      // TODO: copy mutable state here, so the clone can't change the internals of the original
      return clone;
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }
}
