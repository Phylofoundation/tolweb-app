/*
 * Created on Jun 20, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.tolweb.tapestry;

/**
 * @author dmandel
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public abstract class WebquestEditConclusion extends
        AbstractTreehouseEditingPage {
    public static final String PROGRESS_PROPERTY = "conclusionProgress";
    
	public String getProgressMethodPropertyName() {
	    return PROGRESS_PROPERTY;
	}
    
    public String getPreviewPageName() {
        return "WebquestViewConclusion";
    }
}
