/*
 * Created on Jul 1, 2005
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
public abstract class PortfolioViewIntroduction extends ViewPortfolio {
    public String getIntroduction() {
        return getPreparedText(getTreehouse().getText());
    }
}
