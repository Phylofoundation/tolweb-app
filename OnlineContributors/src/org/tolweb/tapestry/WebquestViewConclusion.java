/*
 * Created on Jun 24, 2005
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
public abstract class WebquestViewConclusion extends ViewWebquest {
    public String getConclusion() {
        return getPreparedText(getWebquest().getConclusion());        
    }
}
