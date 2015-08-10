
package cn.limc.androidcharts.model;

import cn.limc.androidcharts.component.Axis;

public abstract class AbstractDegree implements Degree {

    public static final boolean DEFAULT_AUTO_FORMAT_DEGREE = true;
    
    protected boolean autoFormatDegree = DEFAULT_AUTO_FORMAT_DEGREE;
    
    protected String sourceFormat;
    protected String targetFormat;
    
    protected Axis axis; 

    /**
     * @return the autoFormatDegree
     */
    public boolean isAutoFormatDegree() {
        return autoFormatDegree;
    }

    /**
     * @param autoFormatDegree the autoFormatDegree to set
     */
    public void setAutoFormatDegree(boolean autoFormatDegree) {
        this.autoFormatDegree = autoFormatDegree;
    }

    /**
     * @return the sourceFormat
     */
    public String getSourceFormat() {
        return sourceFormat;
    }

    /**
     * @param sourceFormat the sourceFormat to set
     */
    public void setSourceFormat(String sourceFormat) {
        this.sourceFormat = sourceFormat;
    }

    /**
     * @return the targetFormat
     */
    public String getTargetFormat() {
        return targetFormat;
    }

    /**
     * @param targetFormat the targetFormat to set
     */
    public void setTargetFormat(String targetFormat) {
        this.targetFormat = targetFormat;
    }

    /**
     * @return the axis
     */
    public Axis getAxis() {
        return axis;
    }

    /**
     * @param axis the axis to set
     */
    public void setAxis(Axis axis) {
        this.axis = axis;
    }
}
