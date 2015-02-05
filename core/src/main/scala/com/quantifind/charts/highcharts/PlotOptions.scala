package com.quantifind.charts.highcharts

/**
 * User: austin
 * Date: 12/12/14
 */
object PlotOptions {
  val name = "plotOptions"
}

object BoxplotPlotOptions {
  def apply(
     allowPointSelect: Option[Boolean] = None,
     color: Option[Color.Type] = None,
     colorByPoint: Option[Boolean] = None,
     colors: Option[Array[Color.Type]] = None,
     cursor: Option[Boolean] = None,
     enableMouseTracking: Option[Boolean] = None,
     events: Option[Events] = None,
     fillColor: Option[Color.Type] = None,
     groupPadding: Option[Double] = None,
     lineWidth: Option[Int] = None,
     linkedTo: Option[String] = None,
     mediaWidth: Option[Int] = None,
     medianColor: Option[Color.Type] = None,
     point: Option[Point] = None,
     pointInterval: Option[Double] = None,
     pointRange: Option[Int] = None,
     pointWidth: Option[Int] = None,
     selected: Option[Boolean] = None,
     showCheckbox: Option[Boolean] = None,
     showInLegend: Option[Boolean] = None,
     stemColor: Option[Color.Type] = None,
     stemDashStyle: Option[String] = None,
     stemWidth: Option[Int] = None,
     stickyTracking: Option[Boolean] = None,
     tooltip: Option[ToolTip] = None,
     visible: Option[Boolean] = None,
     whiskerColor: Option[Color.Type] = None,
     whiskerLength: Option[Double] = None,
     whiskerWidth: Option[Int] = None
  ): PlotOptionKey = {
    new PlotOptionKey(
      allowPointSelect = allowPointSelect,
      color = color,
      colorByPoint = colorByPoint,
      colors = colors,
      cursor = cursor,
      enableMouseTracking = enableMouseTracking,
      events = events,
      fillColor = fillColor,
      groupPadding = groupPadding,
      lineWidth = lineWidth,
      linkedTo = linkedTo,
      mediaWidth = mediaWidth,
      medianColor = medianColor,
      point = point,
      pointInterval = pointInterval,
      pointRange = pointRange,
      pointWidth = pointWidth,
      selected = selected,
      showCheckbox = showCheckbox,
      showInLegend = showInLegend,
      stemColor = stemColor,
      stemDashStyle = stemDashStyle,
      stemWidth = stemWidth,
      stickyTracking = stickyTracking,
      tooltip = tooltip,
      visible = visible,
      whiskerColor = whiskerColor,
      whiskerLength = whiskerLength,
      whiskerWidth = whiskerWidth
    )
  }
}

// These are overlapping options, but are well over 22 options.
case class PlotOptions(
                        area: Option[PlotOptionKey] = None,
                        arearange: Option[PlotOptionKey] = None,
                        areaspline: Option[PlotOptionKey] = None,
                        areasplinerange: Option[PlotOptionKey] = None,
                        bar: Option[PlotOptionKey] = None,
                        boxplot: Option[PlotOptionKey] = None,
                        bubble: Option[PlotOptionKey] = None,
                        column: Option[PlotOptionKey] = None,
                        columnrange: Option[PlotOptionKey] = None,
                        errorbar: Option[PlotOptionKey] = None,
                        funnel: Option[PlotOptionKey] = None,
                        gauge: Option[PlotOptionKey] = None,
                        heatmap: Option[PlotOptionKey] = None,
                        line: Option[PlotOptionKey] = None,
                        pie: Option[PlotOptionKey] = None,
                        pyramid: Option[PlotOptionKey] = None,
                        scatter: Option[PlotOptionKey] = None,
                        series: Option[PlotOptionKey] = None,
                        solidgauge: Option[PlotOptionKey] = None,
                        spline: Option[PlotOptionKey] = None,
                        waterfall: Option[PlotOptionKey] = None,
                        var __name: String = PlotOptions.name
                        ) extends HighchartKey(__name) {

  def toServiceFormat: Map[String, Any] = {
    Map(
      "area" -> area,
      "arearange" -> arearange,
      "areaspline" -> areaspline,
      "areasplinerange" -> areasplinerange,
      "bar" -> bar,
      "boxplot" -> boxplot,
      "bubble" -> bubble,
      "column" -> column,
      "columnrange" -> columnrange,
      "errorbar" -> errorbar,
      "funnel" -> funnel,
      "gauge" -> gauge,
      "heatmap" -> heatmap,
      "line" -> line,
      "pie" -> pie,
      "pyramid" -> pyramid,
      "scatter" -> scatter,
      "series" -> series,
      "solidgauge" -> solidgauge,
      "spline" -> spline,
      "waterfall" -> waterfall
    ).flatMap(HighchartKey.flatten)
  }
}

//class BoxplotPlotOptions(
//                          var color: Option[Color.Type] = None,
//                          var colorByPoint: Option[Boolean] = None,
//                          var colors: Option[Array[Color.Type]] = None,
//                          // depth
//                          // edgeColor
//                          // edgeWidth
//                          var fillColor: Option[Color.Type] = None,
//                          var groupPadding: Option[Double] = None,
//                          // groupZPadding
//                          // grouping
//                          var lineWidth: Option[Int] = None,
//                          var medianColor: Option[Color.Type] = None,
//                          var mediaWidth: Option[Int] = None,
//                          // negativeColor
//                          var pointInterval: Option[Double] = None,
////                          val pointPlacement: Option[Any] = None // can be null, "on", or "between", or numeric
//                          var pointRange: Option[Int] = None,
//                          var pointWidth: Option[Int] = None,
//                          var selected: Option[Boolean] = None,
//                          var showCheckbox: Option[Boolean] = None,
//                          var stemColor: Option[Color.Type] = None,
//                          var stemDashStyle: Option[String] = None, // Solid, ...?
//                          var stemWidth: Option[Int] = None, // can it be a decimal?
//                          // turboThreshold
//                          var whiskerColor: Option[Color.Type] = None,
//                          var whiskerLength: Option[Double] = None, // percentage, can it be a pixel integer?
//                          var whiskerWidth: Option[Int] = None // pixel, can it be a percentage?
//                          ) extends PlotOptionsBase {
//  override def toServiceFormat = {
//    super.toServiceFormat ++ Map()
//  }
//}
//
//trait PlotOptionsBase {
//  var allowPointSelect: Option[Boolean] = None
//  var cursor: Option[Boolean] = None // actually 'pointer'
//  var enableMouseTracking: Option[Boolean] = None
//  var events: Option[Events] = None
//  var linkedTo: Option[String] = None // link to another series by the series id (<-- not the same as name but we can make it name, probably)
//  var point: Option[Point] = None
////  val selected: Option[Boolean] = None // related to showCheckbox for selecting a series, not sure it's a default
//  var showInLegend: Option[Boolean] = None
//  var stickyTracking: Option[Boolean] = None // If events are defined, whether to maintain event after mouse leaves plot area
//  var tooltip: Option[ToolTip] = None // tooltip object
//  var visible: Option[Boolean] = None
//
//  def toServiceFormat: Map[String, Any] = Map(
//    "allowPointSelect" -> allowPointSelect,
//    "cursor" -> cursor,
//    "enableMouseTrackinge" -> enableMouseTracking,
//    "linkedTo" -> linkedTo,
//    "showInLegend" -> showInLegend,
//    "stickyTracking" -> stickyTracking,
//    "visible" -> visible
//  ) ++
//    Seq(events, point, tooltip).flatMap(HighchartKey.optionToServiceFormat)
//}

case class Point(
                  events: Option[Events] = None
                  ) extends HighchartKey("point") {
  def toServiceFormat = HighchartKey.optionToServiceFormat(events)
}

// TODO: these are all javascript functions.
// Can we do better than embedding javascript in a String?
// events and point.events do not have the same options, but
// it is still folded into a single object
case class Events(
                   afterAnimate: Option[String] = None,
                   checkboxClick: Option[String] = None,
                   click: Option[String] = None,
                   hide: Option[String] = None,
                   legendItemClick: Option[String] = None,
                   mouseOut: Option[String] = None,
                   mouseOver: Option[String] = None,
                   remove: Option[String] = None,
                   select: Option[String] = None,
                   show: Option[String] = None,
                   unselect: Option[String] = None,
                   update: Option[String] = None
                   ) extends HighchartKey("events") {
  def toServiceFormat = Map(
    "afterAnimate" -> afterAnimate,
    "checkboxClick" -> checkboxClick,
    "click" -> click,
    "hide" -> hide,
    "legendItemClick" -> legendItemClick,
    "mouseOut" -> mouseOut,
    "mouseOver" -> mouseOver,
    "remove" -> remove,
    "select" -> select,
    "show" -> show,
    "unselect" -> unselect,
    "update" -> update
  ).flatMap(HighchartKey.flatten)
}

class PlotOptionKey( // todo - many more fields
                     // depth
                     // edgeColor
                     // edgeWidth
                     // groupZPadding
                     // grouping
                     // negativeColor
                     // turboThreshold
                     // val pointPlacement: Option[Any] = None // can be null, "on", or "between", or numeric
                     val allowPointSelect: Option[Boolean] = None,
                     val borderWidth: Option[Int] = None,
                     val color: Option[Color.Type] = None,
                     val colorByPoint: Option[Boolean] = None,
                     val colors: Option[Array[Color.Type]] = None,
                     val cursor: Option[Boolean] = None, // actually 'pointer'
                     val enableMouseTracking: Option[Boolean] = None,
                     val events: Option[Events] = None,
                     val fillColor: Option[Color.Type] = None,
                     val groupPadding: Option[Double] = None,
                     val lineWidth: Option[Int] = None,
                     val linkedTo: Option[String] = None, // link to another series by the series id (<-- not the same as name but we can make it name, probably)
                     val mediaWidth: Option[Int] = None,
                     val medianColor: Option[Color.Type] = None,
                     val point: Option[Point] = None,
                     val pointInterval: Option[Double] = None,
                     val pointPadding: Option[Int] = None,
                     val pointRange: Option[Int] = None,
                     val pointWidth: Option[Int] = None,
                     val selected: Option[Boolean] = None, // related to showCheckbox for selecting a series
                     val showCheckbox: Option[Boolean] = None,
                     val showInLegend: Option[Boolean] = None,
                     val stacking: Option[Stacking.Type] = None,
                     val stemColor: Option[Color.Type] = None,
                     val stemDashStyle: Option[String] = None, // Solid, ...? TODO
                     val stemWidth: Option[Int] = None, // can it be a decimal? TODO
                     val stickyTracking: Option[Boolean] = None, // If events are defined, whether to maintain event after mouse leaves plot area
                     val tooltip: Option[ToolTip] = None, // tooltip object
                     val visible: Option[Boolean] = None,
                     val whiskerColor: Option[Color.Type] = None,
                     val whiskerLength: Option[Double] = None, // percentage, can it be a pixel integer? TODO
                     val whiskerWidth: Option[Int] = None // pixel, can it be a percentage? TODO
                     ) {
  
  def toServiceFormat = Map(
    "allowPointSelect" -> allowPointSelect,
    "borderWidth" -> borderWidth,
    "color" -> color,
    "colorByPoint" -> colorByPoint,
    "cursor" -> cursor,
    "enableMouseTracking" -> enableMouseTracking,
    "events" -> events,
    "fillColor" -> fillColor,
    "groupPadding" -> groupPadding,
    "lineWidth" -> lineWidth,
    "linkedTo" -> linkedTo,
    "mediaWidth" -> mediaWidth,
    "medianColor" -> medianColor,
    "point" -> point,
    "pointInterval" -> pointInterval,
    "pointPadding" -> pointPadding,
    "pointWidth" -> pointWidth,
    "selected" -> selected,
    "showCheckbox" -> showCheckbox,
    "showInLegend" -> showInLegend,
    "stacking" -> stacking,
    "stemColor" -> stemColor,
    "stemDashStyle" -> stemDashStyle,
    "stemWidth" -> stemWidth,
    "stickyTracking" -> stickyTracking,
    "tooltip" -> tooltip,
    "visible" -> visible,
    "whiskerColor" -> whiskerColor,
    "whiskerLength" -> whiskerLength,
    "whiskerWidth" -> whiskerWidth
  ).flatMap(HighchartKey.flatten)
}

object PlotOptionKey {
  def apply(
    allowPointSelect: Option[Boolean] = None,
    borderWidth: Option[Int] = None,
    color: Option[Color.Type] = None,
    colorByPoint: Option[Boolean] = None,
    colors: Option[Array[Color.Type]] = None,
    cursor: Option[Boolean] = None, // actually 'pointer'
    enableMouseTracking: Option[Boolean] = None,
    events: Option[Events] = None,
    fillColor: Option[Color.Type] = None,
    groupPadding: Option[Double] = None,
    lineWidth: Option[Int] = None,
    linkedTo: Option[String] = None, // link to another series by the series id (<-- not the same as name but we can make it name, probably)
    mediaWidth: Option[Int] = None,
    medianColor: Option[Color.Type] = None,
    point: Option[Point] = None,
    pointInterval: Option[Double] = None,
    pointPadding: Option[Int] = None,
    pointRange: Option[Int] = None,
    pointWidth: Option[Int] = None,
    selected: Option[Boolean] = None, // related to showCheckbox for selecting a series
    showCheckbox: Option[Boolean] = None,
    showInLegend: Option[Boolean] = None,
    stacking: Option[Stacking.Type] = None,
    stemColor: Option[Color.Type] = None,
    stemDashStyle: Option[String] = None, // Solid, ...? TODO
    stemWidth: Option[Int] = None, // can it be a decimal? TODO
    stickyTracking: Option[Boolean] = None, // If events are defined, whether to maintain event after mouse leaves plot area
    tooltip: Option[ToolTip] = None, // tooltip object
    visible: Option[Boolean] = None,
    whiskerColor: Option[Color.Type] = None,
    whiskerLength: Option[Double] = None, // percentage, can it be a pixel integer? TODO
    whiskerWidth: Option[Int] = None // pixel, can it be a percentage? TODO
  ): PlotOptionKey = new PlotOptionKey(
    allowPointSelect = allowPointSelect,
    borderWidth = borderWidth,
    color = color,
    colorByPoint = colorByPoint,
    cursor = cursor,
    enableMouseTracking = enableMouseTracking,
    events = events,
    fillColor = fillColor,
    groupPadding = groupPadding,
    lineWidth = lineWidth,
    linkedTo = linkedTo,
    mediaWidth = mediaWidth,
    medianColor = medianColor,
    point = point,
    pointInterval = pointInterval,
    pointPadding = pointPadding,
    pointWidth = pointWidth,
    selected = selected,
    showCheckbox = showCheckbox,
    showInLegend = showInLegend,
    stacking = stacking,
    stemColor = stemColor,
    stemDashStyle = stemDashStyle,
    stemWidth = stemWidth,
    stickyTracking = stickyTracking,
    tooltip = tooltip,
    visible = visible,
    whiskerColor = whiskerColor,
    whiskerLength = whiskerLength,
    whiskerWidth = whiskerWidth
  )
}
