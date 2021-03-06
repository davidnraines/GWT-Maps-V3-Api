package com.google.gwt.maps.client.layers;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Specifies the data to retrieve from a Fusion Tables.
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#FusionTablesQuery">FusionTablesQuery API Doc</a>
 */
public class FusionTablesQuery extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected FusionTablesQuery() {}
  
  /**
   * Specifies the data to retrieve from a Fusion Tables.
   * @return {@link FusionTablesQuery}
   */
  public static final FusionTablesQuery newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * setsThe ID of the Fusion Tables table to display. This ID can be found in the tables URL, as the value of the dsrcid parameter.
   * @param from
   */
  public final native void setFrom(String from) /*-{
    this.from = from;
  }-*/;
  
  /**
   * gets The ID of the Fusion Tables table to display. This ID can be found in the tables URL, as the value of the dsrcid parameter.
   */
  public final native String getFrom() /*-{
    return this.from;
  }-*/;
  
  /**
   * sets A column, containing geographic features to be displayed on the map. See Fusion Table Setup in the Maps API documentation for information about valid columns.
   * @param select
   */
  public final native void setSelect(String select) /*-{
    this.select = select;
  }-*/;
  
  /**
   * gets A column, containing geographic features to be displayed on the map. See Fusion Table Setup in the Maps API documentation for information about valid columns.
   */
  public final native String getSelect() /*-{
    return this.select;
  }-*/;
  
  /**
   * sets The SQL predicate to be applied to the layer.
   * @param where
   */
  public final native void setWhere(String where) /*-{
    this.where = where;
  }-*/;
  
  /**
   * gets The SQL predicate to be applied to the layer.
   */
  public final native String getWhere() /*-{
    return this.where;
  }-*/;
  
}
