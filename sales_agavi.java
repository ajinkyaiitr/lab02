// ORM class for table 'sales_agavi'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Apr 21 18:29:27 UTC 2020
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class sales_agavi extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("widget_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        widget_id = (Integer)value;
      }
    });
    setters.put("qty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        qty = (Integer)value;
      }
    });
    setters.put("street", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        street = (String)value;
      }
    });
    setters.put("city", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        city = (String)value;
      }
    });
    setters.put("state", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        state = (String)value;
      }
    });
    setters.put("zip", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        zip = (Integer)value;
      }
    });
    setters.put("sale_date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        sale_date = (String)value;
      }
    });
  }
  public sales_agavi() {
    init0();
  }
  private Integer widget_id;
  public Integer get_widget_id() {
    return widget_id;
  }
  public void set_widget_id(Integer widget_id) {
    this.widget_id = widget_id;
  }
  public sales_agavi with_widget_id(Integer widget_id) {
    this.widget_id = widget_id;
    return this;
  }
  private Integer qty;
  public Integer get_qty() {
    return qty;
  }
  public void set_qty(Integer qty) {
    this.qty = qty;
  }
  public sales_agavi with_qty(Integer qty) {
    this.qty = qty;
    return this;
  }
  private String street;
  public String get_street() {
    return street;
  }
  public void set_street(String street) {
    this.street = street;
  }
  public sales_agavi with_street(String street) {
    this.street = street;
    return this;
  }
  private String city;
  public String get_city() {
    return city;
  }
  public void set_city(String city) {
    this.city = city;
  }
  public sales_agavi with_city(String city) {
    this.city = city;
    return this;
  }
  private String state;
  public String get_state() {
    return state;
  }
  public void set_state(String state) {
    this.state = state;
  }
  public sales_agavi with_state(String state) {
    this.state = state;
    return this;
  }
  private Integer zip;
  public Integer get_zip() {
    return zip;
  }
  public void set_zip(Integer zip) {
    this.zip = zip;
  }
  public sales_agavi with_zip(Integer zip) {
    this.zip = zip;
    return this;
  }
  private String sale_date;
  public String get_sale_date() {
    return sale_date;
  }
  public void set_sale_date(String sale_date) {
    this.sale_date = sale_date;
  }
  public sales_agavi with_sale_date(String sale_date) {
    this.sale_date = sale_date;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof sales_agavi)) {
      return false;
    }
    sales_agavi that = (sales_agavi) o;
    boolean equal = true;
    equal = equal && (this.widget_id == null ? that.widget_id == null : this.widget_id.equals(that.widget_id));
    equal = equal && (this.qty == null ? that.qty == null : this.qty.equals(that.qty));
    equal = equal && (this.street == null ? that.street == null : this.street.equals(that.street));
    equal = equal && (this.city == null ? that.city == null : this.city.equals(that.city));
    equal = equal && (this.state == null ? that.state == null : this.state.equals(that.state));
    equal = equal && (this.zip == null ? that.zip == null : this.zip.equals(that.zip));
    equal = equal && (this.sale_date == null ? that.sale_date == null : this.sale_date.equals(that.sale_date));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof sales_agavi)) {
      return false;
    }
    sales_agavi that = (sales_agavi) o;
    boolean equal = true;
    equal = equal && (this.widget_id == null ? that.widget_id == null : this.widget_id.equals(that.widget_id));
    equal = equal && (this.qty == null ? that.qty == null : this.qty.equals(that.qty));
    equal = equal && (this.street == null ? that.street == null : this.street.equals(that.street));
    equal = equal && (this.city == null ? that.city == null : this.city.equals(that.city));
    equal = equal && (this.state == null ? that.state == null : this.state.equals(that.state));
    equal = equal && (this.zip == null ? that.zip == null : this.zip.equals(that.zip));
    equal = equal && (this.sale_date == null ? that.sale_date == null : this.sale_date.equals(that.sale_date));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.widget_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.qty = JdbcWritableBridge.readInteger(2, __dbResults);
    this.street = JdbcWritableBridge.readString(3, __dbResults);
    this.city = JdbcWritableBridge.readString(4, __dbResults);
    this.state = JdbcWritableBridge.readString(5, __dbResults);
    this.zip = JdbcWritableBridge.readInteger(6, __dbResults);
    this.sale_date = JdbcWritableBridge.readString(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.widget_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.qty = JdbcWritableBridge.readInteger(2, __dbResults);
    this.street = JdbcWritableBridge.readString(3, __dbResults);
    this.city = JdbcWritableBridge.readString(4, __dbResults);
    this.state = JdbcWritableBridge.readString(5, __dbResults);
    this.zip = JdbcWritableBridge.readInteger(6, __dbResults);
    this.sale_date = JdbcWritableBridge.readString(7, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(widget_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(qty, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(street, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(state, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(zip, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(sale_date, 7 + __off, 12, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(widget_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(qty, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(street, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(state, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(zip, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(sale_date, 7 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.widget_id = null;
    } else {
    this.widget_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.qty = null;
    } else {
    this.qty = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.street = null;
    } else {
    this.street = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.city = null;
    } else {
    this.city = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.state = null;
    } else {
    this.state = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.zip = null;
    } else {
    this.zip = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.sale_date = null;
    } else {
    this.sale_date = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.widget_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.widget_id);
    }
    if (null == this.qty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.qty);
    }
    if (null == this.street) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, street);
    }
    if (null == this.city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city);
    }
    if (null == this.state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, state);
    }
    if (null == this.zip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.zip);
    }
    if (null == this.sale_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sale_date);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.widget_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.widget_id);
    }
    if (null == this.qty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.qty);
    }
    if (null == this.street) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, street);
    }
    if (null == this.city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city);
    }
    if (null == this.state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, state);
    }
    if (null == this.zip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.zip);
    }
    if (null == this.sale_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sale_date);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(widget_id==null?"null":"" + widget_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(qty==null?"null":"" + qty, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(street==null?"null":street, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city==null?"null":city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(state==null?"null":state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(zip==null?"null":"" + zip, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sale_date==null?"null":sale_date, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(widget_id==null?"null":"" + widget_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(qty==null?"null":"" + qty, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(street==null?"null":street, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city==null?"null":city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(state==null?"null":state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(zip==null?"null":"" + zip, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sale_date==null?"null":sale_date, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.widget_id = null; } else {
      this.widget_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.qty = null; } else {
      this.qty = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.street = null; } else {
      this.street = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.city = null; } else {
      this.city = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.state = null; } else {
      this.state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.zip = null; } else {
      this.zip = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sale_date = null; } else {
      this.sale_date = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.widget_id = null; } else {
      this.widget_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.qty = null; } else {
      this.qty = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.street = null; } else {
      this.street = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.city = null; } else {
      this.city = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.state = null; } else {
      this.state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.zip = null; } else {
      this.zip = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sale_date = null; } else {
      this.sale_date = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    sales_agavi o = (sales_agavi) super.clone();
    return o;
  }

  public void clone0(sales_agavi o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("widget_id", this.widget_id);
    __sqoop$field_map.put("qty", this.qty);
    __sqoop$field_map.put("street", this.street);
    __sqoop$field_map.put("city", this.city);
    __sqoop$field_map.put("state", this.state);
    __sqoop$field_map.put("zip", this.zip);
    __sqoop$field_map.put("sale_date", this.sale_date);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("widget_id", this.widget_id);
    __sqoop$field_map.put("qty", this.qty);
    __sqoop$field_map.put("street", this.street);
    __sqoop$field_map.put("city", this.city);
    __sqoop$field_map.put("state", this.state);
    __sqoop$field_map.put("zip", this.zip);
    __sqoop$field_map.put("sale_date", this.sale_date);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
